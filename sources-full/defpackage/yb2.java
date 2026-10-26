package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 {
    public static final yb2 c;
    public static final yb2 d;
    public static final /* synthetic */ yb2[] h;

    static {
        yb2 yb2Var = new yb2("Min", 0);
        c = yb2Var;
        yb2 yb2Var2 = new yb2("Max", 1);
        d = yb2Var2;
        h = new yb2[]{yb2Var, yb2Var2};
    }

    public static yb2 valueOf(String str) {
        return (yb2) Enum.valueOf(yb2.class, str);
    }

    public static yb2[] values() {
        return (yb2[]) h.clone();
    }
}
