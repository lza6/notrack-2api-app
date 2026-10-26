package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z73 {
    public static final y73 a;

    static {
        pu2 pu2Var = new pu2(50.0f);
        a = new y73(pu2Var, pu2Var, pu2Var, pu2Var);
    }

    public static final y73 a(float f) {
        sx0 sx0Var = new sx0(f);
        return new y73(sx0Var, sx0Var, sx0Var, sx0Var);
    }

    public static final y73 b() {
        return a;
    }
}
