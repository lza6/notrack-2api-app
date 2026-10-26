package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q12 extends vl0 {
    public final gj h = new gj();

    public q12(le1 le1Var) {
        le1Var.invoke(this);
    }

    public static void m0(q12 q12Var, String str, yg0 yg0Var, int i) {
        int i2 = 1;
        if ((i & 1) != 0) {
            str = null;
        }
        q12Var.h.c(1, new o12(str != null ? new e8(23, str) : null, new lb4(i2, 24), new yg0(-1010194746, new p12(yg0Var), true)));
    }

    @Override // defpackage.vl0
    public final gj N() {
        return this.h;
    }
}
