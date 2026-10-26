package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z84 {
    public static y84 a(Object obj) {
        ef1 ef1Var = (ef1) obj;
        y84 y84Var = ef1Var.unknownFields;
        if (y84Var != y84.f) {
            return y84Var;
        }
        y84 y84VarC = y84.c();
        ef1Var.unknownFields = y84VarC;
        return y84VarC;
    }

    public static boolean b(Object obj, ce0 ce0Var) throws sr1 {
        int i = ce0Var.a;
        be0 be0Var = (be0) ce0Var.d;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ce0Var.x(0);
            ((y84) obj).d(i2 << 3, Long.valueOf(be0Var.z()));
            return true;
        }
        if (i3 == 1) {
            ce0Var.x(1);
            ((y84) obj).d((i2 << 3) | 1, Long.valueOf(be0Var.w()));
            return true;
        }
        if (i3 == 2) {
            ((y84) obj).d((i2 << 3) | 2, ce0Var.g());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw sr1.c();
            }
            ce0Var.x(5);
            ((y84) obj).d((i2 << 3) | 5, Integer.valueOf(be0Var.v()));
            return true;
        }
        y84 y84VarC = y84.c();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (ce0Var.a() != Integer.MAX_VALUE && b(y84VarC, ce0Var)) {
        }
        if (i5 != ce0Var.a) {
            throw new sr1("Protocol message end-group tag did not match expected tag.");
        }
        y84VarC.e = false;
        ((y84) obj).d(i4 | 3, y84VarC);
        return true;
    }
}
