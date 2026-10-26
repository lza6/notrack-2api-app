package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uc0 {
    public static final uc0 c;
    public static final uc0 d;
    public static final /* synthetic */ uc0[] h;

    static {
        uc0 uc0Var = new uc0("NONE", 0);
        c = uc0Var;
        uc0 uc0Var2 = new uc0("ALL_JSON_OBJECTS", 1);
        uc0 uc0Var3 = new uc0("POLYMORPHIC", 2);
        d = uc0Var3;
        h = new uc0[]{uc0Var, uc0Var2, uc0Var3};
    }

    public static uc0 valueOf(String str) {
        return (uc0) Enum.valueOf(uc0.class, str);
    }

    public static uc0[] values() {
        return (uc0[]) h.clone();
    }
}
