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
public class CitymapperHelper {
    private static final String PKG = "com.citymapper.app.release";

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
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.CitymapperHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if (("getPackageInfo".equals(name) || "getPackageInfoAsUser".equals(name)) && objArr != null && objArr.length > 0 && CitymapperHelper.PKG.equals(objArr[0])) {
                        PackageInfo packageInfo = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo != null) {
                            CitymapperHelper.spoofSignature(packageInfo);
                        }
                        return packageInfo;
                    }
                    if ((!"getApplicationInfo".equals(name) && !"getApplicationInfoAsUser".equals(name)) || objArr == null || objArr.length <= 0 || !CitymapperHelper.PKG.equals(objArr[0])) {
                        try {
                            return method.invoke(obj, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(obj, objArr);
                    if (applicationInfo != null) {
                        CitymapperHelper.spoofApiKey(applicationInfo);
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
                    map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.CitymapperHelper.2
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
        Signature signature = new Signature(hexToBytes("3082034730820304a0030201020204651f7387300b06072a8648ce38040305003075310b3009060355040613024742311730150603550408130e47726561746572204c6f6e646f6e310f300d060355040713064c6f6e646f6e31183016060355040a130f436974796d6170706572204c74642e3110300e060355040b1307416e64726f69643110300e06035504031307556e6b6e6f776e301e170d3133303431313131333133395a170d3334303133313131333133395a3075310b3009060355040613024742311730150603550408130e47726561746572204c6f6e646f6e310f300d060355040713064c6f6e646f6e31183016060355040a130f436974796d6170706572204c74642e3110300e060355040b1307416e64726f69643110300e06035504031307556e6b6e6f776e308201b73082012c06072a8648ce3804013082011f02818100fd7f53811d75122952df4a9c2eece4e7f611b7523cef4400c31e3f80b6512669455d402251fb593d8d58fabfc5f5ba30f6cb9b556cd7813b801d346ff26660b76b9950a5a49f9fe8047b1022c24fbba9d7feb7c61bf83b57e7c6a8a6150f04fb83f6d3c51ec3023554135a169132f675f3ae2b61d72aeff22203199dd14801c70215009760508f15230bccb292b982a2eb840bf0581cf502818100f7e1a085d69b3ddecbbcab5c36b857b97994afbbfa3aea82f9574c0b3d0782675159578ebad4594fe67107108180b449167123e84c281613b7cf09328cc8a6e13c167a8b547c8d28e0a3ae1e2bb3a675916ea37f0bfa213562f1fb627a01243bcca4f1bea8519089a883dfe15ae59f06928b665e807b552564014c3bfecf492a03818400028180034e971556748afdfdef373c376f6336632c7f815bd012cc52e58777f4ee90caf4924085102e4cd1e4d44b3c1a9ffa57fb43b27fae04648f8c5e61dbfedb9cc08241c3e9e40143da347e858fe428a90a69c9d24566e406935731f692e4ed16018373bb62f36c4c4e1f312e3ec0f472085fa365c1d7dd05a59224b8de947b20dba321301f301d0603551d0e041604142c9f87838b29265c1832092666ae2de6961ccf0a300b06072a8648ce3804030500033000302d021466a505216de86bd4cdc0a7b521292c285049da5c02150090b606fd40c50e90e88df8a54558001bbb3846f5"));
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
