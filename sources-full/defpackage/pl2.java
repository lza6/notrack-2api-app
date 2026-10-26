package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pl2 {
    public of2 a;
    public int b;
    public oi2 c;
    public oi2 d;
    public boolean e;
    public final /* synthetic */ yd f;

    public pl2(yd ydVar, of2 of2Var, int i, oi2 oi2Var, oi2 oi2Var2, boolean z) {
        this.f = ydVar;
        this.a = of2Var;
        this.b = i;
        this.c = oi2Var;
        this.d = oi2Var2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        oi2 oi2Var = this.c;
        int i3 = this.b;
        nf2 nf2Var = (nf2) oi2Var.c[i + i3];
        nf2 nf2Var2 = (nf2) this.d.c[i3 + i2];
        ql2 ql2Var = rl2.a;
        return kr1.n(nf2Var, nf2Var2) || nf2Var.getClass() == nf2Var2.getClass();
    }
}
