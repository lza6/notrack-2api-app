package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g04 {
    public static final g04 c;
    public static final g04 d;
    public static final /* synthetic */ g04[] h;

    static {
        g04 g04Var = new g04("LIGHT", 0);
        c = g04Var;
        g04 g04Var2 = new g04("DARK", 1);
        d = g04Var2;
        h = new g04[]{g04Var, g04Var2};
    }

    public static g04 valueOf(String str) {
        return (g04) Enum.valueOf(g04.class, str);
    }

    public static g04[] values() {
        return (g04[]) h.clone();
    }
}
