package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz2 {
    public static final String a = v72.h("ProcessUtils");

    public static final boolean a(Context context, jl0 jl0Var) {
        String strF;
        Object next;
        context.getClass();
        jl0Var.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strF = og.f();
        } else {
            strF = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, wh4.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strF = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strF = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                if (v72.f().c <= 3) {
                    Log.d(a, "Unable to check ActivityThread for processName", th);
                }
            }
        }
        return kr1.n(strF, context.getApplicationInfo().processName);
    }
}
