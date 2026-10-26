package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w02 {
    public final Object a;
    public final y02 b;
    public int d;
    public w02 e;
    public boolean f;
    public int c = -1;
    public final ft2 g = cl3.d(null);

    public w02(Object obj, y02 y02Var) {
        this.a = obj;
        this.b = y02Var;
    }

    public final w02 a() {
        if (this.f) {
            so1.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.c.add(this);
            w02 w02Var = (w02) this.g.getValue();
            if (w02Var != null) {
                w02Var.a();
            } else {
                w02Var = null;
            }
            this.e = w02Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            so1.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.c.remove(this);
            w02 w02Var = this.e;
            if (w02Var != null) {
                w02Var.b();
            }
            this.e = null;
        }
    }
}
