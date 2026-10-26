package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qx1 {
    public static final qx1 c;
    public static final qx1 d;
    public static final qx1 h;
    public static final qx1 l;
    public static final qx1 m;
    public static final /* synthetic */ qx1[] n;

    static {
        qx1 qx1Var = new qx1("Measuring", 0);
        c = qx1Var;
        qx1 qx1Var2 = new qx1("LookaheadMeasuring", 1);
        d = qx1Var2;
        qx1 qx1Var3 = new qx1("LayingOut", 2);
        h = qx1Var3;
        qx1 qx1Var4 = new qx1("LookaheadLayingOut", 3);
        l = qx1Var4;
        qx1 qx1Var5 = new qx1("Idle", 4);
        m = qx1Var5;
        n = new qx1[]{qx1Var, qx1Var2, qx1Var3, qx1Var4, qx1Var5};
    }

    public static qx1 valueOf(String str) {
        return (qx1) Enum.valueOf(qx1.class, str);
    }

    public static qx1[] values() {
        return (qx1[]) n.clone();
    }
}
