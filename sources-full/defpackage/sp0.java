package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sp0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ tp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp0(tp0 tp0Var, int i) {
        super(1);
        this.c = i;
        this.d = tp0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(tp0 tp0Var, gf3 gf3Var) {
        super(1);
        this.c = 3;
        this.d = tp0Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        w84 w84Var;
        int i = this.c;
        boolean z = false;
        tp0 tp0Var = this.d;
        switch (i) {
            case 0:
                ft2 ft2Var = tp0Var.m.t;
                Boolean bool = Boolean.TRUE;
                ft2Var.setValue(bool);
                tp0Var.m.s.setValue(bool);
                tp0.y0(tp0Var, tp0Var.m, ((hg) obj).d, tp0Var.n, tp0Var.o);
                return bool;
            case 1:
                List list = (List) obj;
                if (tp0Var.m.d() != null) {
                    yy3 yy3VarD = tp0Var.m.d();
                    yy3VarD.getClass();
                    list.add(yy3VarD.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                tp0.y0(tp0Var, tp0Var.m, ((hg) obj).d, tp0Var.n, tp0Var.o);
                return Boolean.TRUE;
            default:
                hg hgVar = (hg) obj;
                if (tp0Var.n || !tp0Var.o) {
                    return Boolean.FALSE;
                }
                py3 py3Var = tp0Var.m.e;
                if (py3Var != null) {
                    List listU = kr1.U(new n71(), new wf0(hgVar, 1));
                    z22 z22Var = tp0Var.m;
                    fp1 fp1Var = z22Var.d;
                    ip0 ip0Var = z22Var.v;
                    ey3 ey3VarB = fp1Var.b(listU);
                    py3Var.a(null, ey3VarB);
                    ip0Var.invoke(ey3VarB);
                    w84Var = w84.a;
                } else {
                    w84Var = null;
                }
                if (w84Var == null) {
                    ey3 ey3Var = tp0Var.l;
                    String str = ey3Var.a.d;
                    long j = ey3Var.b;
                    int i2 = jz3.c;
                    int i3 = (int) (j >> 32);
                    int i4 = (int) (j & 4294967295L);
                    str.getClass();
                    hgVar.getClass();
                    if (i4 < i3) {
                        u41.g(i4, i3, ") is less than start index (", "End index (");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i3);
                    sb.append((CharSequence) hgVar);
                    sb.append((CharSequence) str, i4, str.length());
                    String string = sb.toString();
                    int length = hgVar.d.length() + ((int) (tp0Var.l.b >> 32));
                    tp0Var.m.v.invoke(new ey3(string, p23.d(length, length), 4));
                }
                return Boolean.TRUE;
        }
    }
}
