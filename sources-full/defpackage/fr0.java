package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 {
    public static final fr0 c;
    public static final fr0 d;
    public static final fr0 h;
    public static final /* synthetic */ fr0[] l;

    static {
        fr0 fr0Var = new fr0("None", 0);
        c = fr0Var;
        fr0 fr0Var2 = new fr0("Cancelled", 1);
        d = fr0Var2;
        fr0 fr0Var3 = new fr0("Redirected", 2);
        h = fr0Var3;
        l = new fr0[]{fr0Var, fr0Var2, fr0Var3, new fr0("RedirectCancelled", 3)};
    }

    public static fr0 valueOf(String str) {
        return (fr0) Enum.valueOf(fr0.class, str);
    }

    public static fr0[] values() {
        return (fr0[]) l.clone();
    }
}
