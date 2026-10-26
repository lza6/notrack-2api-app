package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class go3 implements uu0 {
    public final /* synthetic */ int a;

    public /* synthetic */ go3(int i) {
        this.a = i;
    }

    @Override // defpackage.uu0
    public final char a() {
        switch (this.a) {
            case 0:
                return '~';
            default:
                return '=';
        }
    }

    @Override // defpackage.uu0
    public final int b() {
        switch (this.a) {
        }
        return 2;
    }

    @Override // defpackage.uu0
    public final int c(tu0 tu0Var, tu0 tu0Var2) {
        switch (this.a) {
            case 0:
                return (tu0Var.g < 2 || tu0Var2.g < 2) ? 0 : 2;
            default:
                return (tu0Var.g < 2 || tu0Var2.g < 2) ? 0 : 2;
        }
    }

    @Override // defpackage.uu0
    public final void d(it3 it3Var, it3 it3Var2, int i) {
        switch (this.a) {
            case 0:
                fo3 fo3Var = new fo3();
                im0 im0Var = (im0) it3Var.f;
                while (im0Var != null && im0Var != it3Var2) {
                    im0 im0Var2 = (im0) im0Var.f;
                    fo3Var.b(im0Var);
                    im0Var = im0Var2;
                }
                it3Var.d(fo3Var);
                break;
            default:
                it3Var.g.getClass();
                zq3 zq3Var = new zq3();
                im0 im0Var3 = (im0) it3Var.f;
                while (im0Var3 != null && im0Var3 != it3Var2) {
                    im0 im0Var4 = (im0) im0Var3.f;
                    zq3Var.b(im0Var3);
                    im0Var3 = im0Var4;
                }
                it3Var.d(zq3Var);
                break;
        }
    }

    @Override // defpackage.uu0
    public final char e() {
        switch (this.a) {
            case 0:
                return '~';
            default:
                return '=';
        }
    }
}
