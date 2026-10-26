package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eb3 {
    public static final eb3 c;
    public static final eb3 d;
    public static final eb3 h;
    public static final eb3 l;
    public static final /* synthetic */ eb3[] m;

    static {
        eb3 eb3Var = new eb3("LATIN", 0);
        c = eb3Var;
        eb3 eb3Var2 = new eb3("ARABIC", 1);
        d = eb3Var2;
        eb3 eb3Var3 = new eb3("DEVANAGARI", 2);
        h = eb3Var3;
        eb3 eb3Var4 = new eb3("CJK", 3);
        l = eb3Var4;
        m = new eb3[]{eb3Var, eb3Var2, eb3Var3, eb3Var4};
    }

    public static eb3 valueOf(String str) {
        return (eb3) Enum.valueOf(eb3.class, str);
    }

    public static eb3[] values() {
        return (eb3[]) m.clone();
    }
}
