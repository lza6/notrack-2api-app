package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g32 {
    public static final g32 c;
    public static final g32 d;
    public static final g32 h;
    public static final g32 l;
    public static final g32 m;
    public static final /* synthetic */ g32[] n;

    static {
        g32 g32Var = new g32("DESTROYED", 0);
        c = g32Var;
        g32 g32Var2 = new g32("INITIALIZED", 1);
        d = g32Var2;
        g32 g32Var3 = new g32("CREATED", 2);
        h = g32Var3;
        g32 g32Var4 = new g32("STARTED", 3);
        l = g32Var4;
        g32 g32Var5 = new g32("RESUMED", 4);
        m = g32Var5;
        n = new g32[]{g32Var, g32Var2, g32Var3, g32Var4, g32Var5};
    }

    public static g32 valueOf(String str) {
        return (g32) Enum.valueOf(g32.class, str);
    }

    public static g32[] values() {
        return (g32[]) n.clone();
    }
}
