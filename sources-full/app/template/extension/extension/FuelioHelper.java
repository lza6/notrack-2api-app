package app.template.extension.extension;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import app.template.extension.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* JADX INFO: loaded from: classes.dex */
public class FuelioHelper {
    private static byte[] hexToBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static void init() {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("L");
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Field declaredField = cls.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            if (obj == null) {
                Method declaredMethod = cls.getDeclaredMethod("getPackageManager", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, null);
                obj = declaredField.get(null);
            }
            if (obj == null) {
                return;
            }
            Class<?> cls2 = Class.forName("android.content.pm.IPackageManager");
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.FuelioHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if (("getPackageInfo".equals(name) || "getPackageInfoAsUser".equals(name)) && objArr != null && objArr.length > 0 && "com.kajda.fuelio".equals(objArr[0])) {
                        PackageInfo packageInfo = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo != null) {
                            FuelioHelper.spoofSignature(packageInfo);
                        }
                        return packageInfo;
                    }
                    if ((!"getApplicationInfo".equals(name) && !"getApplicationInfoAsUser".equals(name)) || objArr == null || objArr.length <= 0 || !"com.kajda.fuelio".equals(objArr[0])) {
                        try {
                            return method.invoke(obj, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(obj, objArr);
                    if (applicationInfo != null) {
                        FuelioHelper.spoofApiKey(applicationInfo);
                    }
                    return applicationInfo;
                }
            });
            declaredField.set(null, objNewProxyInstance);
            try {
                Class<?> cls3 = Class.forName("android.os.ServiceManager");
                Field declaredField2 = cls3.getDeclaredField("sCache");
                declaredField2.setAccessible(true);
                Map map = (Map) declaredField2.get(null);
                final IBinder iBinder = (IBinder) cls3.getMethod("getService", String.class).invoke(null, "package");
                if (iBinder != null) {
                    map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.FuelioHelper.2
                        @Override // java.lang.reflect.InvocationHandler
                        public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                            if ("queryLocalInterface".equals(method.getName())) {
                                return objNewProxyInstance;
                            }
                            try {
                                return method.invoke(iBinder, objArr);
                            } catch (InvocationTargetException e) {
                                throw e.getTargetException();
                            }
                        }
                    }));
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void spoofApiKey(ApplicationInfo applicationInfo) {
        if (applicationInfo.metaData == null) {
            applicationInfo.metaData = new Bundle();
        }
        applicationInfo.metaData.putString("com.google.android.maps.v2.API_KEY", BuildConfig.SHARED_MAPS_API_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void spoofSignature(PackageInfo packageInfo) {
        SigningInfo signingInfoM;
        Signature signature = new Signature(hexToBytes("308201ef30820158a00302010202044e3a8c4b300d06092a864886f70d0101050500303b310e300c060355040713054f706f6c6531123010060355040a13096b616a64612e636f6d311530130603550403130c41647269616e204b616a64613020170d3131303830343132313035315a180f32303631303732323132313035315a303b310e300c060355040713054f706f6c6531123010060355040a13096b616a64612e636f6d311530130603550403130c41647269616e204b616a646130819f300d06092a864886f70d010101050003818d00308189028181008b2d243d3b538dc972f3700f9ddc47c11a25d4909d2626171926d42437292c6954528fca125be56a1e069ea2bdfd248c0bcccff7901cdbe44adece94ce099f89f876aeeb585f18a41ca67ebb89a3cd9ab05e230d44e3642a610fab435a24e77b47483fb62d3eb3121b3fe0197e4e227dbb0d05fc71f1b111345201b660a45e730203010001300d06092a864886f70d01010505000381810026cb0855e45146a05e4a88c27ea58503852ec08aeb9ad072bdf4583561bcd6bbc0c3ff639539af0e8c1fecbe742c3766bd05035ac4fd0317bf4346dcf51ca3bdf54e0fa9b4bc9aca2c1249634f0b6955c8b315e0a77339a1aedb8711b17149549099174b31cac4e768a03a96a7c01c4bf39969524c73118591efd22f6f60dba7"));
        packageInfo.signatures = new Signature[]{signature};
        try {
            Class<?> cls = Class.forName("android.content.pm.SigningDetails");
            Object objNewInstance = null;
            try {
                Class<?> cls2 = Class.forName("android.content.pm.SigningDetails$Builder");
                Object objNewInstance2 = cls2.getConstructor(null).newInstance(null);
                cls2.getDeclaredMethod("setSignatures", Signature[].class).invoke(objNewInstance2, new Signature[]{signature});
                cls2.getDeclaredMethod("setSignatureSchemeVersion", Integer.TYPE).invoke(objNewInstance2, 1);
                objNewInstance = cls2.getDeclaredMethod("build", null).invoke(objNewInstance2, null);
            } catch (Throwable unused) {
                for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                    constructor.setAccessible(true);
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    try {
                        if (parameterTypes.length == 2 && parameterTypes[0] == Signature[].class && parameterTypes[1] == Integer.TYPE) {
                            objNewInstance = constructor.newInstance(new Signature[]{signature}, 1);
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (objNewInstance != null) {
                try {
                    Constructor declaredConstructor = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m141m().getDeclaredConstructor(cls);
                    declaredConstructor.setAccessible(true);
                    signingInfoM = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m(declaredConstructor.newInstance(objNewInstance));
                } catch (Throwable unused3) {
                    CitymapperHelper$$ExternalSyntheticApiModelOutline0.m142m();
                    SigningInfo signingInfoM2 = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m();
                    Field declaredField = CitymapperHelper$$ExternalSyntheticApiModelOutline0.m141m().getDeclaredField("mSigningDetails");
                    declaredField.setAccessible(true);
                    declaredField.set(signingInfoM2, objNewInstance);
                    signingInfoM = signingInfoM2;
                }
                packageInfo.signingInfo = signingInfoM;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
