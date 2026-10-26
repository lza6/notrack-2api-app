package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wn4 {
    public static /* synthetic */ boolean a(Unsafe unsafe, un4 un4Var, long j, Object obj, Object obj2) {
        while (!vn4.a(unsafe, un4Var, j, obj, obj2)) {
            if (unsafe.getObject(un4Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
