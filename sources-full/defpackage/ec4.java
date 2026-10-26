package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ec4 {
    public static final ec4 c;
    public static final ec4 d;
    public static final /* synthetic */ ec4[] h;

    static {
        ec4 ec4Var = new ec4("Lsq2", 0);
        c = ec4Var;
        ec4 ec4Var2 = new ec4("Impulse", 1);
        d = ec4Var2;
        h = new ec4[]{ec4Var, ec4Var2};
    }

    public static ec4 valueOf(String str) {
        return (ec4) Enum.valueOf(ec4.class, str);
    }

    public static ec4[] values() {
        return (ec4[]) h.clone();
    }
}
