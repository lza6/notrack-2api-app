package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wb1 implements dn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wb1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dn0
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xb1 xb1Var = (xb1) obj;
                if (xb1Var == null) {
                    xb1Var = new xb1(-3);
                }
                ((fy2) this.b).g(xb1Var);
                return;
            case 1:
                xb1 xb1Var2 = (xb1) obj;
                synchronized (yb1.c) {
                    try {
                        ph3 ph3Var = yb1.d;
                        ArrayList arrayList = (ArrayList) ph3Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        ph3Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((dn0) arrayList.get(i)).accept(xb1Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                fu fuVar = (fu) obj;
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                ag0 ag0Var = ((bu) this.b).a;
                fuVar.getClass();
                ag0Var.M(new b03(fuVar, arrayList2));
                return;
        }
    }
}
