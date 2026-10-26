package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class mh4 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;
    public static final int f = 48;

    public static final void a(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static /* synthetic */ boolean b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, un4 un4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(un4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(un4Var) != obj && atomicReferenceFieldUpdater.get(un4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
