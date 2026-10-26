package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rp4 implements Cloneable {
    public final sp4 c;
    public sp4 d;

    public rp4(sp4 sp4Var) {
        this.c = sp4Var;
        if (sp4Var.h()) {
            u41.k("Default instance must be immutable.");
            throw null;
        }
        this.d = sp4Var.n();
    }

    public final sp4 a() {
        boolean zH = this.d.h();
        sp4 sp4Var = this.d;
        if (zH) {
            sp4Var.getClass();
            fq4.b.a(sp4Var.getClass()).a(sp4Var);
            sp4Var.e();
            sp4Var = this.d;
        }
        sp4Var.getClass();
        if (sp4.i(sp4Var, true)) {
            return sp4Var;
        }
        throw new lq4();
    }

    public final void b() {
        if (this.d.h()) {
            return;
        }
        sp4 sp4VarN = this.c.n();
        fq4.b.a(sp4VarN.getClass()).d(sp4VarN, this.d);
        this.d = sp4VarN;
    }

    public final Object clone() {
        rp4 rp4Var = (rp4) this.c.j(5);
        boolean zH = this.d.h();
        sp4 sp4Var = this.d;
        if (zH) {
            sp4Var.getClass();
            fq4.b.a(sp4Var.getClass()).a(sp4Var);
            sp4Var.e();
            sp4Var = this.d;
        }
        rp4Var.d = sp4Var;
        return rp4Var;
    }
}
