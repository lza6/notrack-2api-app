package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class zz {
    public final tn2 a;

    public /* synthetic */ zz(tn2 tn2Var) {
        this.a = tn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(tn2 tn2Var, cl2 cl2Var, k kVar, uo0 uo0Var) throws Throwable {
        yz yzVar;
        ne1 ne1Var;
        ne1 ne1Var2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (uo0Var instanceof yz) {
            yzVar = (yz) uo0Var;
            int i = yzVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yzVar.l = i - Integer.MIN_VALUE;
            } else {
                yzVar = new yz(uo0Var);
            }
        } else {
            yzVar = new yz(uo0Var);
        }
        Object objH = yzVar.h;
        int i2 = yzVar.l;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(objH);
            yzVar.c = kVar;
            yzVar.d = tn2Var;
            yzVar.l = 1;
            objH = g13.h(cl2Var, yzVar);
            if (objH != hq0Var) {
            }
            ne1Var = kVar;
            return hq0Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) yzVar.d;
                try {
                    g13.O(objH);
                    jr1.i(closeable2, null);
                    return objH;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        jr1.i(closeable2, th);
                        throw th3;
                    }
                }
            }
            ne1 ne1Var3 = yzVar.c;
            g13.O(objH);
            ne1Var2 = ne1Var3;
            closeable = (Closeable) objH;
            try {
                gl2 gl2VarG = g13.g((f63) closeable);
                yzVar.c = null;
                yzVar.d = closeable;
                yzVar.l = 3;
                objH = ne1Var2.invoke(gl2VarG, yzVar);
                if (objH != hq0Var) {
                    closeable2 = closeable;
                    jr1.i(closeable2, null);
                    return objH;
                }
                ne1Var = kVar;
                return hq0Var;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        tn2Var = (tn2) yzVar.d;
        ne1 ne1Var4 = yzVar.c;
        g13.O(objH);
        ne1Var = ne1Var4;
        ne1Var = kVar;
        l53 l53Var = (l53) objH;
        tn2Var.getClass();
        l53Var.getClass();
        y23 y23Var = new y23(tn2Var, l53Var);
        yzVar.c = ne1Var;
        yzVar.d = null;
        yzVar.l = 2;
        t00 t00Var = new t00(1, gm4.G(yzVar));
        t00Var.u();
        to0 to0Var = new to0(y23Var, t00Var);
        y23Var.e(to0Var);
        t00Var.w(to0Var);
        objH = t00Var.s();
        if (objH != hq0Var) {
            ne1Var2 = ne1Var;
            closeable = (Closeable) objH;
            gl2 gl2VarG2 = g13.g((f63) closeable);
            yzVar.c = null;
            yzVar.d = closeable;
            yzVar.l = 3;
            objH = ne1Var2.invoke(gl2VarG2, yzVar);
            if (objH != hq0Var) {
                closeable2 = closeable;
                jr1.i(closeable2, null);
                return objH;
            }
        }
        ne1Var = kVar;
        return hq0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zz) {
            return this.a == ((zz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ')';
    }
}
