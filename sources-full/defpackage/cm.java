package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cm implements uu0 {
    public final char a;

    public cm(char c) {
        this.a = c;
    }

    @Override // defpackage.uu0
    public final char a() {
        return this.a;
    }

    @Override // defpackage.uu0
    public final int b() {
        return 1;
    }

    @Override // defpackage.uu0
    public final int c(tu0 tu0Var, tu0 tu0Var2) {
        if (tu0Var.d || tu0Var2.c) {
            int i = tu0Var2.h;
            if (i % 3 != 0 && (tu0Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (tu0Var.g < 2 || tu0Var2.g < 2) ? 1 : 2;
    }

    @Override // defpackage.uu0
    public final void d(it3 it3Var, it3 it3Var2, int i) {
        String.valueOf(this.a);
        im0 r21Var = i == 1 ? new r21() : new yo3();
        im0 im0Var = (im0) it3Var.f;
        while (im0Var != null && im0Var != it3Var2) {
            im0 im0Var2 = (im0) im0Var.f;
            r21Var.b(im0Var);
            im0Var = im0Var2;
        }
        it3Var.d(r21Var);
    }

    @Override // defpackage.uu0
    public final char e() {
        return this.a;
    }
}
