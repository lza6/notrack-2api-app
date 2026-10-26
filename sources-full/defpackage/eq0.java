package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eq0 {
    public static final eq0 c;
    public static final eq0 d;
    public static final eq0 h;
    public static final eq0 l;
    public static final eq0 m;
    public static final /* synthetic */ eq0[] n;

    static {
        eq0 eq0Var = new eq0("CPU_ACQUIRED", 0);
        c = eq0Var;
        eq0 eq0Var2 = new eq0("BLOCKING", 1);
        d = eq0Var2;
        eq0 eq0Var3 = new eq0("PARKING", 2);
        h = eq0Var3;
        eq0 eq0Var4 = new eq0("DORMANT", 3);
        l = eq0Var4;
        eq0 eq0Var5 = new eq0("TERMINATED", 4);
        m = eq0Var5;
        n = new eq0[]{eq0Var, eq0Var2, eq0Var3, eq0Var4, eq0Var5};
    }

    public static eq0 valueOf(String str) {
        return (eq0) Enum.valueOf(eq0.class, str);
    }

    public static eq0[] values() {
        return (eq0[]) n.clone();
    }
}
