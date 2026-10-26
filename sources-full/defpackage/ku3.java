package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ku3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nu3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku3(nu3 nu3Var, int i) {
        super(1);
        this.c = i;
        this.d = nu3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        nu3 nu3Var = this.d;
        switch (i) {
            case 0:
                List list = (List) obj;
                xy3 xy3VarB = nu3Var.l.b();
                return Boolean.valueOf(xy3VarB != null ? list.add(xy3VarB) : false);
            case 1:
                py.F(nu3Var.getCoroutineScope(), null, jq0.l, new hl3((uu1) obj, nu3Var, (so0) null, 3), 1);
                return w84Var;
            case 2:
                u33.a(nu3Var);
                return w84Var;
            case 3:
                xi1 xi1Var = new xi1();
                ((hh2) nu3Var.r).b(xi1Var);
                nu3Var.v = xi1Var;
                u33.a(nu3Var);
                return w84Var;
            case 4:
                long jE = ((ln2) obj).a;
                cx1 cx1Var = (cx1) nu3Var.l.f.getValue();
                if (cx1Var != null && cx1Var.z()) {
                    jE = cx1Var.e(jE);
                }
                int iC = nu3Var.l.c(jE, true);
                if (iC >= 0) {
                    nu3Var.h.j(p23.d(iC, iC));
                }
                nu3Var.m.z(ah1.c, jE);
                return w84Var;
            case 5:
                nu3.y0(nu3Var);
                nu3Var.m.e();
                u33.a(nu3Var);
                return w84Var;
            default:
                nu3.y0(nu3Var);
                return w84Var;
        }
    }
}
