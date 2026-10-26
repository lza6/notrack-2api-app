package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i01 {
    public static final i01 c;
    public static final i01 d;
    public static final /* synthetic */ i01[] h;

    static {
        i01 i01Var = new i01("Closed", 0);
        c = i01Var;
        i01 i01Var2 = new i01("Open", 1);
        d = i01Var2;
        h = new i01[]{i01Var, i01Var2};
    }

    public static i01 valueOf(String str) {
        return (i01) Enum.valueOf(i01.class, str);
    }

    public static i01[] values() {
        return (i01[]) h.clone();
    }
}
