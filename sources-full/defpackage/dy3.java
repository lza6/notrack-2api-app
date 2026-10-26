package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dy3 {
    public static final dy3 c;
    public static final dy3 d;
    public static final /* synthetic */ dy3[] h;

    static {
        dy3 dy3Var = new dy3("Filled", 0);
        c = dy3Var;
        dy3 dy3Var2 = new dy3("Outlined", 1);
        d = dy3Var2;
        h = new dy3[]{dy3Var, dy3Var2};
    }

    public static dy3 valueOf(String str) {
        return (dy3) Enum.valueOf(dy3.class, str);
    }

    public static dy3[] values() {
        return (dy3[]) h.clone();
    }
}
