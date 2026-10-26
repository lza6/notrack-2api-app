package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ma3 {
    public static final ma3 c;
    public static final ma3 d;
    public static final /* synthetic */ ma3[] h;

    static {
        ma3 ma3Var = new ma3("FILL", 0);
        c = ma3Var;
        ma3 ma3Var2 = new ma3("FIT", 1);
        d = ma3Var2;
        h = new ma3[]{ma3Var, ma3Var2};
    }

    public static ma3 valueOf(String str) {
        return (ma3) Enum.valueOf(ma3.class, str);
    }

    public static ma3[] values() {
        return (ma3[]) h.clone();
    }
}
