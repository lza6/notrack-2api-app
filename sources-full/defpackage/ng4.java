package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ng4 {
    public final wg4 a;
    public pp1[] b;

    public ng4() {
        this(new wg4((wg4) null));
    }

    public ng4(wg4 wg4Var) {
        this.a = wg4Var;
    }

    public final void a() {
        pp1[] pp1VarArr = this.b;
        if (pp1VarArr != null) {
            pp1 pp1VarG = pp1VarArr[0];
            pp1 pp1VarG2 = pp1VarArr[1];
            wg4 wg4Var = this.a;
            if (pp1VarG2 == null) {
                pp1VarG2 = wg4Var.a.g(2);
            }
            if (pp1VarG == null) {
                pp1VarG = wg4Var.a.g(1);
            }
            g(pp1.a(pp1VarG, pp1VarG2));
            pp1 pp1Var = this.b[ug4.a(16)];
            if (pp1Var != null) {
                f(pp1Var);
            }
            pp1 pp1Var2 = this.b[ug4.a(32)];
            if (pp1Var2 != null) {
                d(pp1Var2);
            }
            pp1 pp1Var3 = this.b[ug4.a(64)];
            if (pp1Var3 != null) {
                h(pp1Var3);
            }
        }
    }

    public abstract wg4 b();

    public void c(int i, pp1 pp1Var) {
        if (this.b == null) {
            this.b = new pp1[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[ug4.a(i2)] = pp1Var;
            }
        }
    }

    public void d(pp1 pp1Var) {
    }

    public abstract void e(pp1 pp1Var);

    public void f(pp1 pp1Var) {
    }

    public abstract void g(pp1 pp1Var);

    public void h(pp1 pp1Var) {
    }
}
