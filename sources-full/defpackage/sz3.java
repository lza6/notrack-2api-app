package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sz3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ tz3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz3(tz3 tz3Var, int i) {
        super(1);
        this.c = i;
        this.d = tz3Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        wu0 wu0Var;
        xy3 xy3Var;
        int i = this.c;
        tz3 tz3Var = this.d;
        switch (i) {
            case 0:
                List list = (List) obj;
                vs2 vs2VarW0 = tz3Var.w0();
                uz3 uz3Var = tz3Var.d;
                xe0 xe0Var = tz3Var.p;
                uz3 uz3VarE = uz3.e(uz3Var, xe0Var != null ? xe0Var.a() : re0.i, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                dx1 dx1Var = vs2VarW0.o;
                xy3 xy3Var2 = null;
                if (dx1Var == null || (wu0Var = vs2VarW0.i) == null) {
                    xy3Var = null;
                } else {
                    hg hgVar = new hg(vs2VarW0.a);
                    if (vs2VarW0.j == null || vs2VarW0.n == null) {
                        xy3Var = null;
                    } else {
                        long j = vs2VarW0.p & (-8589934589L);
                        int i2 = vs2VarW0.f;
                        boolean z = vs2VarW0.e;
                        int i3 = vs2VarW0.d;
                        kb1 kb1Var = vs2VarW0.c;
                        z21 z21Var = z21.c;
                        xy3Var = new xy3(new wy3(hgVar, uz3VarE, z21Var, i2, z, i3, wu0Var, dx1Var, kb1Var, j), new pg2(new vu(hgVar, uz3VarE, z21Var, wu0Var, kb1Var), j, vs2VarW0.f, vs2VarW0.d), vs2VarW0.l);
                    }
                }
                if (xy3Var != null) {
                    list.add(xy3Var);
                    xy3Var2 = xy3Var;
                }
                return Boolean.valueOf(xy3Var2 != null);
            case 1:
                String str = ((hg) obj).d;
                rz3 rz3Var = tz3Var.t;
                if (rz3Var == null) {
                    rz3 rz3Var2 = new rz3(tz3Var.c, str);
                    vs2 vs2Var = new vs2(str, tz3Var.d, tz3Var.h, tz3Var.l, tz3Var.m, tz3Var.n, tz3Var.o);
                    vs2Var.c(tz3Var.w0().i);
                    rz3Var2.d = vs2Var;
                    tz3Var.t = rz3Var2;
                } else if (!kr1.n(str, rz3Var.b)) {
                    rz3Var.b = str;
                    vs2 vs2Var2 = rz3Var.d;
                    if (vs2Var2 != null) {
                        uz3 uz3Var2 = tz3Var.d;
                        kb1 kb1Var2 = tz3Var.h;
                        int i4 = tz3Var.l;
                        boolean z2 = tz3Var.m;
                        int i5 = tz3Var.n;
                        int i6 = tz3Var.o;
                        vs2Var2.a = str;
                        vs2Var2.b = uz3Var2;
                        vs2Var2.c = kb1Var2;
                        vs2Var2.d = i4;
                        vs2Var2.e = z2;
                        vs2Var2.f = i5;
                        vs2Var2.g = i6;
                        vs2Var2.b();
                    }
                }
                tz3.v0(tz3Var);
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rz3 rz3Var3 = tz3Var.t;
                if (rz3Var3 == null) {
                    return Boolean.FALSE;
                }
                rz3Var3.c = zBooleanValue;
                tz3.v0(tz3Var);
                return Boolean.TRUE;
        }
    }
}
