package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y52 extends i {
    public final h52 a = new h52();
    public final int b;
    public boolean c;

    public y52(int i) {
        this.b = i;
    }

    @Override // defpackage.i
    public final boolean b(kv kvVar) {
        if (!this.c) {
            return true;
        }
        kv kvVar2 = (kv) ((im0) this.a.b);
        if (!(kvVar2 instanceof y42)) {
            return true;
        }
        ((y42) kvVar2).g = false;
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
            if (((im0) this.a.c) == null) {
                return null;
            }
            kv kvVarE = ix0Var.h().e();
            this.c = (kvVarE instanceof rs2) || (kvVarE instanceof h52);
            return lv.a(ix0Var.e);
        }
        int i = ix0Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new lv(-1, ix0Var.c + i2, false);
        }
        return null;
    }
}
