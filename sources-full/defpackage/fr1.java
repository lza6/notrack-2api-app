package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 {
    public static final fr1 c;
    public static final fr1 d;
    public static final /* synthetic */ fr1[] h;

    static {
        fr1 fr1Var = new fr1("Min", 0);
        c = fr1Var;
        fr1 fr1Var2 = new fr1("Max", 1);
        d = fr1Var2;
        h = new fr1[]{fr1Var, fr1Var2};
    }

    public static fr1 valueOf(String str) {
        return (fr1) Enum.valueOf(fr1.class, str);
    }

    public static fr1[] values() {
        return (fr1[]) h.clone();
    }
}
