package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k53 {
    public static final k53 c;
    public static final k53 d;
    public static final /* synthetic */ k53[] h;

    static {
        k53 k53Var = new k53("Restart", 0);
        c = k53Var;
        k53 k53Var2 = new k53("Reverse", 1);
        d = k53Var2;
        h = new k53[]{k53Var, k53Var2};
    }

    public static k53 valueOf(String str) {
        return (k53) Enum.valueOf(k53.class, str);
    }

    public static k53[] values() {
        return (k53[]) h.clone();
    }
}
