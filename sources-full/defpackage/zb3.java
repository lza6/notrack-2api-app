package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class zb3 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb3(Serializable serializable, Object obj, Object obj2, int i) {
        super(2);
        this.c = i;
        this.d = serializable;
        this.h = obj;
        this.l = obj2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj3 = this.l;
        Object obj4 = this.h;
        Serializable serializable = this.d;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                n43 n43Var = (n43) serializable;
                oc3 oc3Var = (oc3) obj4;
                long jH = oc3Var.h(oc3Var.d(fFloatValue - n43Var.c));
                oc3 oc3Var2 = ((mc3) obj3).a;
                n43Var.c += oc3Var.d(oc3Var.g(oc3.a(oc3Var2, oc3Var2.j, jH, 1)));
                break;
            default:
                dx2 dx2Var = (dx2) obj;
                p43 p43Var = (p43) serializable;
                long jI = ln2.i(p43Var.c, ((ln2) obj2).a);
                p43Var.c = jI;
                wx3 wx3Var = (wx3) obj4;
                wx3Var.z(ah1.c, ln2.i(((p43) obj3).c, jI));
                if (wx3.c(wx3Var, wx3Var.n())) {
                    dx2Var.a();
                    lh1 lh1Var = wx3Var.h;
                    if (lh1Var != null) {
                        lh1Var.mo63x70bb4fce(9);
                    }
                }
                break;
        }
        return w84Var;
    }
}
