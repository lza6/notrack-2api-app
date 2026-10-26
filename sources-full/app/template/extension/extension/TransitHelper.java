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
public class TransitHelper {
    private static final String PKG = "com.thetransitapp.droid";

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
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.TransitHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if (("getPackageInfo".equals(name) || "getPackageInfoAsUser".equals(name)) && objArr != null && objArr.length > 0 && TransitHelper.PKG.equals(objArr[0])) {
                        PackageInfo packageInfo = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo != null) {
                            TransitHelper.spoofSignature(packageInfo);
                        }
                        return packageInfo;
                    }
                    if ((!"getApplicationInfo".equals(name) && !"getApplicationInfoAsUser".equals(name)) || objArr == null || objArr.length <= 0 || !TransitHelper.PKG.equals(objArr[0])) {
                        try {
                            return method.invoke(obj, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(obj, objArr);
                    if (applicationInfo != null) {
                        TransitHelper.spoofApiKey(applicationInfo);
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
                    map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.TransitHelper.2
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
        Signature signature = new Signature(hexToBytes("3082038130820269a00302010202047a1bd445300d06092a864886f70d01010b05003071310b3009060355040613024341310b30090603550408130251633111300f060355040713084d6f6e747265616c31183016060355040a130f546865205472616e736974204170703110300e060355040b1307556e6b6e6f776e311630140603550403130d53616d75656c2044696f6e6e65301e170d3133303530333232323130345a170d3430303931383232323130345a3071310b3009060355040613024341310b30090603550408130251633111300f060355040713084d6f6e747265616c31183016060355040a130f546865205472616e736974204170703110300e060355040b1307556e6b6e6f776e311630140603550403130d53616d75656c2044696f6e6e6530820122300d06092a864886f70d01010105000382010f003082010a0282010100a3154a31c4e7bcd2eb73679bcea1ccdaadbe6149e2fe879cd2cf890b217ff7ae2600ba789e6f0d8d2f26f007d0ef3071e61039e7ecbac13a55efe4cecf519518cf7b75e0a668a34bee2df523e6fe7f4b0ef8a6609572c90e8d6d857f38bef2257d8ad65a4994a2d0fe0bdb0009fb0c9b6a8046d59e4e479ee30cc7f432c0fd93b076863651e08832828d79c35d747580ce3fe6acdd60f895daff0ce5702008a675a88eb80d27188d656159720ed87f17c69529cfc36caa0314368c4b1c0cfa1b846e00c446278d504dbe160f11cbd8a45cd1c214ea36d208aee3a9e5d8fb7204c531610ade278686b66e4d80b13c3c61bd837f1acd78d5716e0dbdbcffa6d4e70203010001a321301f301d0603551d0e04160414ca6f80b1786e5ba660abf3dc98bc6c42cfc338b3300d06092a864886f70d01010b0500038201010073d17e1fb8b9424d8bd09316a3ef71dbb73d973bbe021000fd7e05226ab16d0bf906f2654c45474997390dded446804d0017444a6a942e8106233031e22f0afb9345987c0194c8834a0ac35c6b4b3485b22a6935ca8c7c46d9ff41c8996b4c1cf8d74669e2dfc7e1b29d8f3248a3ae7a5398135fdf165b97f32abf33997ab59d36ee632fc0fab3bdc8cd78c057a6c4dea84baf547db5e49f0f03c69dd430d136220894d623afa092b34965ec4a369ecdf3d669a600d217e5bc62b09dc92eddf8e94d47785c978220771df853d76b2db5a245a668a240ff12297dc78efe50b58c2c7d119b58e12883a42e38adf28301bce298672a6262fbfac36146f919bb4d0e"));
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
