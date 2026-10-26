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
public class MoovitHelper {
    private static final String PKG = "com.tranzmate";

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
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.MoovitHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if (("getPackageInfo".equals(name) || "getPackageInfoAsUser".equals(name)) && objArr != null && objArr.length > 0 && MoovitHelper.PKG.equals(objArr[0])) {
                        PackageInfo packageInfo = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo != null) {
                            MoovitHelper.spoofSignature(packageInfo);
                        }
                        return packageInfo;
                    }
                    if ((!"getApplicationInfo".equals(name) && !"getApplicationInfoAsUser".equals(name)) || objArr == null || objArr.length <= 0 || !MoovitHelper.PKG.equals(objArr[0])) {
                        try {
                            return method.invoke(obj, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(obj, objArr);
                    if (applicationInfo != null) {
                        MoovitHelper.spoofApiKey(applicationInfo);
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
                    map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.MoovitHelper.2
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
        applicationInfo.metaData.putString("com.google.android.geo.API_KEY", BuildConfig.SHARED_MAPS_API_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void spoofSignature(PackageInfo packageInfo) {
        SigningInfo signingInfoM;
        Signature signature = new Signature(hexToBytes("308202e3308201cba00302010202044466415d300d06092a864886f70d01010b05003021310b300906035504061302494c31123010060355040a13095472616e7a6d6174653020170d3132303332363137343031315a180f32303632303331343137343031315a3021310b300906035504061302494c31123010060355040a13095472616e7a6d61746530820122300d06092a864886f70d01010105000382010f003082010a028201010087bedc6b170764c5bca1ea3e9d1ebb00a2398731e03f83e6c90f75379f9b178e4a27616211955991b7a18279f4b6f6c06e81fbfc440bcefafb63039dcff929bcc461ccaa7dfc04d6489785dae1abca340b404b83a0763950747b48a3239ba5b12968e4713b15272043c127d3df7b2eb692fc39ce7aac1411a82981815e2d2587952b05bcaf8b3b4d7f63e9dd7e4ca39c40b63a65e79a2c9b22b6699d6d1ee8c4bc890cf5c6bc4edc1bc18df450af3ea93be11d9cab8e7c240a29a987a6f1f9bf95ae59bd3d2d4387750788b0611678f3e8374bb8547c1ca3a68918a856d17f934e05c60c233447d2da5fe9dc50e2b0d0c481ea2e066d8531d26c77c5d65873ad0203010001a321301f301d0603551d0e04160414200a489821eac3b85b8905bf305210890a0b5229300d06092a864886f70d01010b050003820101002195db14b98be526c79eb10f2628da6c5f25a9123cdbe3fc1279d485758e6acc0a64bc36370801b6472bc212618481a29462e8890110ffac423195b9978500e0b7cbc3264d83288686659847c8fd701860ea4d23ee77a74b4cf9e18d2a2b1f0b540106c519c0c1a45622f756b8b2925d39fc93ea090858410cf2ceeb14f70571c5c16a3d0ab4b904bbf4efe8abc2322000513fe25863ec1e0f026c24d2986e67053726093b36c966a446768fa988d17a6d87dfe9820aa7b6267ba81f0ef446d93f7079ecbdb0ff0fdf5bca90cf0e3161a5aff941949e666f9b385ae723614f03b7c361c4f56a96ea453e24df932e67249714b1a762f511cde08f7135adcda580"));
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
