package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he2 {
    public static he2 h;
    public final dx1 a;
    public final uz3 b;
    public final xu0 c;
    public final kb1 d;
    public final uz3 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public he2(dx1 dx1Var, uz3 uz3Var, xu0 xu0Var, kb1 kb1Var) {
        this.a = dx1Var;
        this.b = uz3Var;
        this.c = xu0Var;
        this.d = kb1Var;
        this.e = yh4.Q(uz3Var, dx1Var);
    }

    public final long a(long j, int i) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = ie2.a;
            long jB = wm0.b(0, 0, 15);
            uz3 uz3Var = this.e;
            xu0 xu0Var = this.c;
            float fB = gb2.g(str, uz3Var, jB, xu0Var, this.d, 1, 96).b();
            float fB2 = gb2.g(ie2.b, this.e, wm0.b(0, 0, 15), xu0Var, this.d, 2, 96).b() - fB;
            this.g = fB;
            this.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = um0.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = um0.i(j);
        }
        return wm0.a(um0.j(j), um0.h(j), i2, um0.g(j));
    }
}
