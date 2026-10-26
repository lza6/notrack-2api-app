package app.template.extension.extension;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class InstallSourceHelper {
    private static volatile boolean initialized = false;
    private static volatile String targetInstaller = "com.android.vending";

    public static void init(String str) {
        if (initialized) {
            return;
        }
        initialized = true;
        if (str != null && !str.isEmpty()) {
            targetInstaller = str;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Class.forName("org.lsposed.hiddenapibypass.HiddenApiBypass").getMethod("addHiddenApiExemptions", String[].class).invoke(null, new String[]{"L"});
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
            final Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: app.template.extension.extension.InstallSourceHelper.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj2, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    if ("getInstallerPackageName".equals(name)) {
                        return InstallSourceHelper.targetInstaller;
                    }
                    boolean zEquals = "getInstallSourceInfo".equals(name);
                    Object obj3 = obj;
                    if (zEquals) {
                        Object objInvoke = method.invoke(obj3, objArr);
                        InstallSourceHelper.spoofInstallSourceInfo(objInvoke);
                        return objInvoke;
                    }
                    try {
                        return method.invoke(obj3, objArr);
                    } catch (InvocationTargetException e) {
                        throw e.getTargetException();
                    }
                }
            });
            declaredField.set(null, objNewProxyInstance);
            try {
                Class<?> cls3 = Class.forName("android.app.ApplicationPackageManager");
                Field declaredField2 = cls3.getDeclaredField("mPM");
                declaredField2.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("currentActivityThread", null);
                declaredMethod2.setAccessible(true);
                Object objInvoke = declaredMethod2.invoke(null, null);
                if (objInvoke != null) {
                    Method declaredMethod3 = cls.getDeclaredMethod("getApplication", null);
                    declaredMethod3.setAccessible(true);
                    Context context = (Context) declaredMethod3.invoke(objInvoke, null);
                    if (context != null) {
                        PackageManager packageManager = context.getPackageManager();
                        if (cls3.isInstance(packageManager)) {
                            declaredField2.set(packageManager, objNewProxyInstance);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Class<?> cls4 = Class.forName("android.os.ServiceManager");
            Field declaredField3 = cls4.getDeclaredField("sCache");
            declaredField3.setAccessible(true);
            Map map = (Map) declaredField3.get(null);
            final IBinder iBinder = (IBinder) cls4.getMethod("getService", String.class).invoke(null, "package");
            if (iBinder == null || map == null) {
                return;
            }
            map.put("package", (IBinder) Proxy.newProxyInstance(IBinder.class.getClassLoader(), new Class[]{IBinder.class}, new InvocationHandler() { // from class: app.template.extension.extension.InstallSourceHelper.2
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
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void spoofInstallSourceInfo(Object obj) {
        if (obj == null) {
            return;
        }
        String[] strArr = {"mInitiatingPackageName", "mInstallingPackageName", "mOriginatingPackageName", "mUpdateOwnerPackageName", "initiatingPackageName", "installingPackageName", "originatingPackageName", "updateOwnerPackageName"};
        for (int i = 0; i < 8; i++) {
            try {
                Field declaredField = obj.getClass().getDeclaredField(strArr[i]);
                declaredField.setAccessible(true);
                declaredField.set(obj, targetInstaller);
            } catch (Throwable unused) {
            }
        }
    }
}
