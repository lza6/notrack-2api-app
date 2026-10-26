package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vr implements fm0 {
    public final im0 a;

    public vr(im0 im0Var) {
        im0Var.getClass();
        this.a = im0Var;
    }

    @Override // defpackage.fm0
    public final boolean b(hi4 hi4Var) {
        return a(hi4Var) && e(this.a.e());
    }

    @Override // defpackage.fm0
    public final e00 c(tm0 tm0Var) {
        tm0Var.getClass();
        return new e00(new k(this, null, 6), x21.c, -2, fy.c);
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
