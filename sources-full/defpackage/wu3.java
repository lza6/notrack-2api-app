package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wu3 {
    public static final wu3 c;
    public static final wu3 d;
    public static final /* synthetic */ wu3[] h;

    static {
        wu3 wu3Var = new wu3("MergeIfPossible", 0);
        c = wu3Var;
        wu3 wu3Var2 = new wu3("ClearHistory", 1);
        wu3 wu3Var3 = new wu3("NeverMerge", 2);
        d = wu3Var3;
        h = new wu3[]{wu3Var, wu3Var2, wu3Var3};
    }

    public static wu3 valueOf(String str) {
        return (wu3) Enum.valueOf(wu3.class, str);
    }

    public static wu3[] values() {
        return (wu3[]) h.clone();
    }
}
