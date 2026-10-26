package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fg3 implements Runnable {
    public final p32 c;
    public final f32 d;
    public boolean h;

    public fg3(p32 p32Var, f32 f32Var) {
        p32Var.getClass();
        f32Var.getClass();
        this.c = p32Var;
        this.d = f32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            return;
        }
        this.c.e(this.d);
        this.h = true;
    }
}
