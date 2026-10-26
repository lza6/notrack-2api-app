package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mm3 {
    public static final mm3 c;
    public static final mm3 d;
    public static final mm3 h;
    public static final /* synthetic */ mm3[] l;

    static {
        mm3 mm3Var = new mm3("USER", 0);
        c = mm3Var;
        mm3 mm3Var2 = new mm3("AI", 1);
        d = mm3Var2;
        mm3 mm3Var3 = new mm3("SYSTEM", 2);
        h = mm3Var3;
        l = new mm3[]{mm3Var, mm3Var2, mm3Var3};
    }

    public static mm3 valueOf(String str) {
        return (mm3) Enum.valueOf(mm3.class, str);
    }

    public static mm3[] values() {
        return (mm3[]) l.clone();
    }
}
