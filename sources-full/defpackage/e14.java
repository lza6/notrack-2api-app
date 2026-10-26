package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e14 {
    public static final e14 c;
    public static final e14 d;
    public static final /* synthetic */ e14[] h;

    static {
        e14 e14Var = new e14("On", 0);
        c = e14Var;
        e14 e14Var2 = new e14("Off", 1);
        d = e14Var2;
        h = new e14[]{e14Var, e14Var2, new e14("Indeterminate", 2)};
    }

    public static e14 valueOf(String str) {
        return (e14) Enum.valueOf(e14.class, str);
    }

    public static e14[] values() {
        return (e14[]) h.clone();
    }
}
