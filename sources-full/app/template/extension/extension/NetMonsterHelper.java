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
public class NetMonsterHelper {
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
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.NetMonsterHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if (("getPackageInfo".equals(name) || "getPackageInfoAsUser".equals(name)) && objArr != null && objArr.length > 0 && "cz.mroczis.netmonster".equals(objArr[0])) {
                        PackageInfo packageInfo = (PackageInfo) method.invoke(obj, objArr);
                        if (packageInfo != null) {
                            NetMonsterHelper.spoofSignature(packageInfo);
                        }
                        return packageInfo;
                    }
                    if ((!"getApplicationInfo".equals(name) && !"getApplicationInfoAsUser".equals(name)) || objArr == null || objArr.length <= 0 || !"cz.mroczis.netmonster".equals(objArr[0])) {
                        try {
                            return method.invoke(obj, objArr);
                        } catch (InvocationTargetException e) {
                            throw e.getTargetException();
                        }
                    }
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(obj, objArr);
                    if (applicationInfo != null) {
                        NetMonsterHelper.spoofApiKey(applicationInfo);
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
                    map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.NetMonsterHelper.2
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
        Signature signature = new Signature(hexToBytes("3082030f308201f7a00302010202040dca795a300d06092a864886f70d01010b05003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f69642044656275673020170d3234303831323030353234305a180f32303531313232393030353234305a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730820122300d06092a864886f70d01010105000382010f003082010a0282010100b0f132f7ccfefb7ea35ec2b776d3ae5dd1ebb8c3add7357e9b037b6476f22d0bbae248c8f6440a6ecdb9b88ba0a63777a5707d855c4575b7da2b3267a4c2f14426690f1a3a681c7b6118a31098308c2e27421942247ed563aa10785e7ac7ad991a15f421b073a46cde25e5e6acdbfa0319ea4a6d0ca2384f1316dc117b589e64e08d04666719961415052e10cde5ed24a11cbf1ad7463be3e54f2e7df505e89af999fc768a7109cbdcd041e2f400345ff31a9e1a71c87cfec7a74be1f32c72a302b7b01cb76dd8455ce205f0661aa539d06c007125d9a04b62c9afea2be0e6e57c5c4b28f882fef9a1f110fd0364708161f39f19f5fa61d9456e45463d84b16d0203010001a321301f301d0603551d0e041604142e4f0b90dd1419decfbf7555d9ef1b6ba99942d3300d06092a864886f70d01010b0500038201010046703d7b5d60371fccb06c02965b54b339970c5b58e272112fe81585f675af1905f58070c1e866cc722f528b33ad4470eb3177e92c0e782d59dc92445e17d66145148c34f16349e88db50654ec643e19972ccfb043721bd407df6e69bbca04d940ac12a84aa4b07f4f53ded00fc082d7ded667a95f47874361c2d122b9e5bf3ba64117b289b02bdd475baf268dc687a69168c435d1164fe5f5a3b507fa7af364b53a5bd3aa5c2694b40fbc6c5229dd1ea5f4ceba6d7f1ba5895d03d12a4554112b6f7160c7506c13811ccd5f5d69b2ea6f8e0fd605a7fd471b43b08a8b3ee46cd15451d043dd7a81e4dba8f5c14b688c5dd8f45da6337bf7dba4a381b2c1c19f"));
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
