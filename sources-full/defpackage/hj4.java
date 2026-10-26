package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hj4 {
    public static final tf3 a(tf3 tf3Var, zf3 zf3Var) {
        tf3Var.getClass();
        zf3Var.getClass();
        if (!kr1.n(tf3Var.c(), xf3.n)) {
            return tf3Var.isInline() ? a(tf3Var.i(0), zf3Var) : tf3Var;
        }
        xp1.l(tf3Var);
        return tf3Var;
    }

    public static final gj4 b(rs1 rs1Var, tf3 tf3Var) {
        tf3Var.getClass();
        yo4 yo4VarC = tf3Var.c();
        if (yo4VarC instanceof nx2) {
            return gj4.POLY_OBJ;
        }
        if (kr1.n(yo4VarC, zo3.o)) {
            return gj4.LIST;
        }
        if (!kr1.n(yo4VarC, zo3.p)) {
            return gj4.OBJ;
        }
        tf3 tf3VarA = a(tf3Var.i(0), rs1Var.b);
        yo4 yo4VarC2 = tf3VarA.c();
        if ((yo4VarC2 instanceof cz2) || kr1.n(yo4VarC2, yf3.n)) {
            return gj4.MAP;
        }
        throw vl0.c(tf3VarA);
    }

    public static int c(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
