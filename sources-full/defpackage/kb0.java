package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kb0 {
    public static final kb0 a = new kb0();

    public static jb0 a(ye0 ye0Var) {
        jb0 jb0Var = ye0Var.a0;
        if (jb0Var != null) {
            return jb0Var;
        }
        long jB = af0.b(ye0Var, rb0.c);
        long j = re0.h;
        ze0 ze0Var = rb0.a;
        long jB2 = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = rb0.b;
        jb0 jb0Var2 = new jb0(jB, j, jB2, j, re0.b(0.38f, af0.b(ye0Var, ze0Var2)), j, re0.b(0.38f, af0.b(ye0Var, ze0Var2)), af0.b(ye0Var, ze0Var), af0.b(ye0Var, rb0.f), re0.b(0.38f, af0.b(ye0Var, ze0Var2)), re0.b(0.38f, af0.b(ye0Var, rb0.e)), re0.b(0.38f, af0.b(ye0Var, ze0Var2)));
        ye0Var.a0 = jb0Var2;
        return jb0Var2;
    }

    public final jb0 colors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: colors-5tl4gsc, reason: not valid java name */
    public final jb0 m222xf75ebbd3(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7 = (i2 & 1) != 0 ? re0.i : j;
        long j8 = (i2 & 2) != 0 ? re0.i : j2;
        long j9 = (i2 & 4) != 0 ? re0.i : j3;
        long j10 = (i2 & 8) != 0 ? re0.i : j4;
        long j11 = (i2 & 16) != 0 ? re0.i : j5;
        long j12 = (i2 & 32) != 0 ? re0.i : j6;
        jb0 jb0VarA = a(ab2.a.getColorScheme(ck0Var, 6));
        long j13 = re0.h;
        if (j9 == 16) {
            j9 = jb0VarA.a;
        }
        long j14 = j9;
        long j15 = j13 != 16 ? j13 : jb0VarA.b;
        long j16 = j7 != 16 ? j7 : jb0VarA.c;
        long j17 = j13 != 16 ? j13 : jb0VarA.d;
        long j18 = j10 != 16 ? j10 : jb0VarA.e;
        if (j13 == 16) {
            j13 = jb0VarA.f;
        }
        long j19 = j13;
        long j20 = j12 != 16 ? j12 : jb0VarA.g;
        long j21 = j7 != 16 ? j7 : jb0VarA.h;
        if (j8 == 16) {
            j8 = jb0VarA.i;
        }
        long j22 = j8;
        if (j10 == 16) {
            j10 = jb0VarA.j;
        }
        long j23 = j10;
        if (j11 == 16) {
            j11 = jb0VarA.k;
        }
        long j24 = j11;
        if (j12 == 16) {
            j12 = jb0VarA.l;
        }
        return new jb0(j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j12);
    }
}
