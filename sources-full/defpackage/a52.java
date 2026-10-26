package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a52 extends i {
    public final y42 a;
    public boolean b;
    public int c;

    public a52(y42 y42Var) {
        this.a = y42Var;
    }

    @Override // defpackage.i
    public final boolean b(kv kvVar) {
        if (!(kvVar instanceof h52)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.g = false;
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.i
    public final kv e() {
        return this.a;
    }

    @Override // defpackage.i
    public final boolean f() {
        return true;
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        if (ix0Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return lv.a(ix0Var.b);
    }
}
