package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 {
    public static final hq0 c;
    public static final hq0 d;
    public static final hq0 h;
    public static final /* synthetic */ hq0[] l;

    static {
        hq0 hq0Var = new hq0("COROUTINE_SUSPENDED", 0);
        c = hq0Var;
        hq0 hq0Var2 = new hq0("UNDECIDED", 1);
        d = hq0Var2;
        hq0 hq0Var3 = new hq0("RESUMED", 2);
        h = hq0Var3;
        l = new hq0[]{hq0Var, hq0Var2, hq0Var3};
    }

    public static hq0 valueOf(String str) {
        return (hq0) Enum.valueOf(hq0.class, str);
    }

    public static hq0[] values() {
        return (hq0[]) l.clone();
    }
}
