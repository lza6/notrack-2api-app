package androidx.compose.ui.platform;

import defpackage.cv0;
import defpackage.je1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class JvmActuals_jvmKt {
    public static /* synthetic */ void AtomicInt$annotations() {
    }

    public static final Object nativeClass(Object obj) {
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        return str + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    @cv0
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m89xa8958514(Object obj, je1 je1Var) {
        R r;
        synchronized (obj) {
            r = (R) je1Var.invoke();
        }
        return r;
    }
}
