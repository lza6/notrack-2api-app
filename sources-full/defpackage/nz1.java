package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nz1 {
    public final /* synthetic */ int a;
    public final ct2 b;
    public final ct2 c;
    public boolean d;
    public Object e;
    public final v02 f;

    public nz1(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new ct2(i);
                this.c = new ct2(i2);
                this.f = new v02(i, 30, 100);
                break;
            default:
                this.b = new ct2(i);
                this.c = new ct2(i2);
                this.f = new v02(i, 90, 200);
                break;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        ct2 ct2Var = this.c;
        v02 v02Var = this.f;
        ct2 ct2Var2 = this.b;
        switch (i3) {
            case 0:
                if (i < 0.0f) {
                    so1.a("Index should be non-negative");
                }
                ct2Var2.h(i);
                v02Var.b(i);
                ct2Var.h(i2);
                break;
            default:
                if (i < 0.0f) {
                    so1.a("Index should be non-negative (" + i + ')');
                }
                ct2Var2.h(i);
                v02Var.b(i);
                ct2Var.h(i2);
                break;
        }
    }
}
