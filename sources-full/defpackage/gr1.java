package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 {
    public static final gr1 c;
    public static final gr1 d;
    public static final /* synthetic */ gr1[] h;

    static {
        gr1 gr1Var = new gr1("Min", 0);
        c = gr1Var;
        gr1 gr1Var2 = new gr1("Max", 1);
        d = gr1Var2;
        h = new gr1[]{gr1Var, gr1Var2};
    }

    public static gr1 valueOf(String str) {
        return (gr1) Enum.valueOf(gr1.class, str);
    }

    public static gr1[] values() {
        return (gr1[]) h.clone();
    }
}
