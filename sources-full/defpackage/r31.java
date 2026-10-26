package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r31 {
    public static final r31 b = new r31(new rn0(5));
    public static final r31 c = new r31(new rn0(7));
    public final q31 a;

    static {
        int i = 8;
        new r31(new rn0(i));
        new r31(new qn0(i));
        new r31(new qn0(6));
        new r31(new qn0(7));
        new r31(new rn0(6));
    }

    public r31(a41 a41Var) {
        if (y04.a()) {
            this.a = new q31(a41Var, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.a = new q31(a41Var, 0);
        } else {
            this.a = new q31(a41Var, 1);
        }
    }
}
