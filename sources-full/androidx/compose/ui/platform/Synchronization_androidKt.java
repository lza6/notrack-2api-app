package androidx.compose.ui.platform;

import defpackage.je1;

/* JADX INFO: loaded from: classes.dex */
public final class Synchronization_androidKt {
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }

    public static final Object makeSynchronizedObject(Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m126xa8958514(Object obj, je1 je1Var) {
        R r;
        synchronized (obj) {
            r = (R) je1Var.invoke();
        }
        return r;
    }
}
