package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends ww1 implements oe1 {
    public static final u1 d;
    public static final u1 h;
    public static final u1 l;
    public static final u1 m;
    public final /* synthetic */ int c;

    static {
        int i = 3;
        d = new u1(i, 0);
        h = new u1(i, 1);
        l = new u1(i, 2);
        m = new u1(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        w84 w84Var = w84.a;
        a31 a31Var = a31.c;
        switch (i) {
            case 0:
                xb2 xb2Var = (xb2) obj;
                long j = ((um0) obj3).a;
                c cVar = w1.a;
                int iO = xb2Var.O(10.0f);
                int i2 = iO * 2;
                nv2 nv2VarC = ((qb2) obj2).c(wm0.i(i2, 0, j));
                return xb2Var.s(nv2VarC.c - i2, nv2VarC.d, a31Var, new t1(iO, 0, nv2VarC));
            case 1:
                xb2 xb2Var2 = (xb2) obj;
                long j2 = ((um0) obj3).a;
                c cVar2 = z03.a;
                int iO2 = xb2Var2.O(10.0f);
                int i3 = iO2 * 2;
                nv2 nv2VarC2 = ((qb2) obj2).c(wm0.i(0, i3, j2));
                return xb2Var2.s(nv2VarC2.c, nv2VarC2.d - i3, a31Var, new t1(iO2, 1, nv2VarC2));
            case 2:
                long j3 = ((ln2) obj2).a;
                long j4 = ((re0) obj3).a;
                ni3 ni3Var = ni3.a;
                ni3.a((tz0) obj, j3, j4);
                return w84Var;
            case 3:
                long j5 = ((ln2) obj2).a;
                long j6 = ((re0) obj3).a;
                ni3 ni3Var2 = ni3.a;
                ni3.a((tz0) obj, j5, j6);
                return w84Var;
            default:
                xb2 xb2Var3 = (xb2) obj;
                nv2 nv2VarC3 = ((qb2) obj2).c(((um0) obj3).a);
                boolean zR = xb2Var3.r();
                int i4 = nv2VarC3.c;
                if (zR) {
                    throw null;
                }
                return xb2Var3.s(i4, nv2VarC3.d, a31Var, new xc(nv2VarC3, 1));
        }
    }
}
