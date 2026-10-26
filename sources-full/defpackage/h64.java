package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h64 {
    public static final h64 c;
    public static final h64 d;
    public static final h64 h;
    public static final /* synthetic */ h64[] l;

    static {
        h64 h64Var = new h64("ContinueTraversal", 0);
        c = h64Var;
        h64 h64Var2 = new h64("SkipSubtreeAndContinueTraversal", 1);
        d = h64Var2;
        h64 h64Var3 = new h64("CancelTraversal", 2);
        h = h64Var3;
        l = new h64[]{h64Var, h64Var2, h64Var3};
    }

    public static h64 valueOf(String str) {
        return (h64) Enum.valueOf(h64.class, str);
    }

    public static h64[] values() {
        return (h64[]) l.clone();
    }
}
