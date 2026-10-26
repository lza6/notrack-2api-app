package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 {
    public static final dx1 c;
    public static final dx1 d;
    public static final /* synthetic */ dx1[] h;

    static {
        dx1 dx1Var = new dx1("Ltr", 0);
        c = dx1Var;
        dx1 dx1Var2 = new dx1("Rtl", 1);
        d = dx1Var2;
        h = new dx1[]{dx1Var, dx1Var2};
    }

    public static dx1 valueOf(String str) {
        return (dx1) Enum.valueOf(dx1.class, str);
    }

    public static dx1[] values() {
        return (dx1[]) h.clone();
    }
}
