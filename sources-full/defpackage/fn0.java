package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 {
    public static final fn0 c;
    public static final fn0 d;
    public static final /* synthetic */ fn0[] h;

    static {
        fn0 fn0Var = new fn0("VIEW_APPEAR", 0);
        c = fn0Var;
        fn0 fn0Var2 = new fn0("VIEW_DISAPPEAR", 1);
        d = fn0Var2;
        h = new fn0[]{fn0Var, fn0Var2};
    }

    public static fn0 valueOf(String str) {
        return (fn0) Enum.valueOf(fn0.class, str);
    }

    public static fn0[] values() {
        return (fn0[]) h.clone();
    }
}
