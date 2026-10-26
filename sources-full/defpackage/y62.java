package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class y62 extends gd4 {
    public static final pd1 c = new pd1(1);
    public final lm3 b = new lm3(0);

    @Override // defpackage.gd4
    public final void d() {
        lm3 lm3Var = this.b;
        int i = lm3Var.h;
        if (i > 0) {
            lm3Var.d(0).getClass();
            m51.t();
            return;
        }
        Object[] objArr = lm3Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lm3Var.h = 0;
    }
}
