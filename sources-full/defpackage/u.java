package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements qu1 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // defpackage.qu1
    public Object deserialize(hs0 hs0Var) {
        return e(hs0Var);
    }

    public final Object e(hs0 hs0Var) {
        Object objA = a();
        int iB = b(objA);
        nk0 nk0VarB = hs0Var.B(getDescriptor());
        while (true) {
            int iH = nk0VarB.h(getDescriptor());
            if (iH == -1) {
                nk0VarB.q(getDescriptor());
                return h(objA);
            }
            f(nk0VarB, iH + iB, objA);
        }
    }

    public abstract void f(nk0 nk0Var, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
