package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cf1 implements sd2, Cloneable {
    public final ef1 c;
    public ef1 d;

    public cf1(ef1 ef1Var) {
        this.c = ef1Var;
        if (ef1Var.n()) {
            u41.k("Default instance must be immutable.");
            throw null;
        }
        this.d = ef1Var.q();
    }

    public static void f(Object obj, Object obj2) {
        j13 j13Var = j13.c;
        j13Var.getClass();
        j13Var.a(obj.getClass()).c(obj, obj2);
    }

    public final ef1 b() {
        ef1 ef1VarC = c();
        ef1VarC.getClass();
        if (ef1.m(ef1VarC, true)) {
            return ef1VarC;
        }
        throw new u84();
    }

    public final ef1 c() {
        boolean zN = this.d.n();
        ef1 ef1Var = this.d;
        if (!zN) {
            return ef1Var;
        }
        ef1Var.getClass();
        j13 j13Var = j13.c;
        j13Var.getClass();
        j13Var.a(ef1Var.getClass()).d(ef1Var);
        ef1Var.o();
        return this.d;
    }

    public final cf1 d() {
        cf1 cf1VarP = this.c.d();
        cf1VarP.d = c();
        return cf1VarP;
    }

    public final void e() {
        if (this.d.n()) {
            return;
        }
        ef1 ef1VarQ = this.c.q();
        f(ef1VarQ, this.d);
        this.d = ef1VarQ;
    }
}
