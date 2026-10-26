package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa4 {
    public le1 a;

    public abstract void a(tz0 tz0Var);

    public le1 b() {
        return this.a;
    }

    public final void c() {
        le1 le1VarB = b();
        if (le1VarB != null) {
            le1VarB.invoke(this);
        }
    }

    public void d(e8 e8Var) {
        this.a = e8Var;
    }
}
