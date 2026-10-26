package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nt3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ot3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt3(ot3 ot3Var, int i) {
        super(1);
        this.c = i;
        this.d = ot3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        xy3 xy3Var;
        int i = this.c;
        ot3 ot3Var = this.d;
        switch (i) {
            case 0:
                List list = (List) obj;
                xy3 xy3Var2 = ot3Var.x0().n;
                if (xy3Var2 != null) {
                    wy3 wy3Var = xy3Var2.a;
                    hg hgVar = wy3Var.a;
                    uz3 uz3Var = ot3Var.d;
                    xe0 xe0Var = ot3Var.t;
                    xy3Var = new xy3(new wy3(hgVar, uz3.e(uz3Var, xe0Var != null ? xe0Var.a() : re0.i, 0L, null, null, null, 0L, null, 0, 0L, 16777214), wy3Var.c, wy3Var.d, wy3Var.e, wy3Var.f, wy3Var.g, wy3Var.h, wy3Var.i, wy3Var.j), xy3Var2.b, xy3Var2.c);
                    list.add(xy3Var);
                } else {
                    xy3Var = null;
                }
                return Boolean.valueOf(xy3Var != null);
            case 1:
                hg hgVar2 = (hg) obj;
                mt3 mt3Var = ot3Var.y;
                z21 z21Var = z21.c;
                if (mt3Var == null) {
                    mt3 mt3Var2 = new mt3(ot3Var.c, hgVar2);
                    rg2 rg2Var = new rg2(hgVar2, ot3Var.d, ot3Var.h, ot3Var.m, ot3Var.n, ot3Var.o, ot3Var.p, z21Var);
                    rg2Var.c(ot3Var.x0().j);
                    mt3Var2.d = rg2Var;
                    ot3Var.y = mt3Var2;
                } else if (!kr1.n(hgVar2, mt3Var.b)) {
                    mt3Var.b = hgVar2;
                    rg2 rg2Var2 = mt3Var.d;
                    if (rg2Var2 != null) {
                        rg2Var2.f(hgVar2, ot3Var.d, ot3Var.h, ot3Var.m, ot3Var.n, ot3Var.o, ot3Var.p, z21Var);
                    }
                }
                ot3.v0(ot3Var);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mt3 mt3Var3 = ot3Var.y;
                if (mt3Var3 == null) {
                    return Boolean.FALSE;
                }
                le1 le1Var = ot3Var.u;
                if (le1Var != null) {
                    le1Var.invoke(mt3Var3);
                }
                mt3 mt3Var4 = ot3Var.y;
                if (mt3Var4 != null) {
                    mt3Var4.c = zBooleanValue;
                }
                ot3.v0(ot3Var);
                return Boolean.TRUE;
        }
    }
}
