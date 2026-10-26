package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w44 {
    public static final fp1 d = yo4.J(bf3.F, pv3.z);
    public final bt2 a;
    public final bt2 b;
    public final bt2 c;

    public w44(float f, float f2, float f3) {
        this.a = new bt2(f);
        this.b = new bt2(f3);
        this.c = new bt2(f2);
    }

    public final float a() {
        bt2 bt2Var = this.a;
        if (bt2Var.f() == 0.0f) {
            return 0.0f;
        }
        return this.c.f() / bt2Var.f();
    }

    public final void b(float f) {
        this.c.h(py.w(f, this.a.f(), 0.0f));
    }
}
