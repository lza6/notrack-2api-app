package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gs4 implements Runnable {
    public final us3 c;

    public gs4() {
        this.c = null;
    }

    public gs4(us3 us3Var) {
        this.c = us3Var;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            us3 us3Var = this.c;
            if (us3Var != null) {
                us3Var.a(e);
            }
        }
    }
}
