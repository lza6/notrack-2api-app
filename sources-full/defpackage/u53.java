package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u53 {
    public static final u53 c;
    public static final u53 d;
    public static final /* synthetic */ u53[] h;

    static {
        u53 u53Var = new u53("Ltr", 0);
        c = u53Var;
        u53 u53Var2 = new u53("Rtl", 1);
        d = u53Var2;
        h = new u53[]{u53Var, u53Var2};
    }

    public static u53 valueOf(String str) {
        return (u53) Enum.valueOf(u53.class, str);
    }

    public static u53[] values() {
        return (u53[]) h.clone();
    }
}
