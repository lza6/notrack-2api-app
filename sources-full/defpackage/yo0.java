package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 {
    public static final yo0 c;
    public static final yo0 d;
    public static final /* synthetic */ yo0[] h;

    static {
        yo0 yo0Var = new yo0("BULLET", 0);
        c = yo0Var;
        yo0 yo0Var2 = new yo0("ORDERED", 1);
        d = yo0Var2;
        h = new yo0[]{yo0Var, yo0Var2};
    }

    public static yo0 valueOf(String str) {
        return (yo0) Enum.valueOf(yo0.class, str);
    }

    public static yo0[] values() {
        return (yo0[]) h.clone();
    }
}
