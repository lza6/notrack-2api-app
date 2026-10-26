package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z33 {
    public static final z33 c;
    public static final z33 d;
    public static final z33 h;
    public static final z33 l;
    public static final z33 m;
    public static final z33 n;
    public static final /* synthetic */ z33[] o;

    static {
        z33 z33Var = new z33("ShutDown", 0);
        c = z33Var;
        z33 z33Var2 = new z33("ShuttingDown", 1);
        d = z33Var2;
        z33 z33Var3 = new z33("Inactive", 2);
        h = z33Var3;
        z33 z33Var4 = new z33("InactivePendingWork", 3);
        l = z33Var4;
        z33 z33Var5 = new z33("Idle", 4);
        m = z33Var5;
        z33 z33Var6 = new z33("PendingWork", 5);
        n = z33Var6;
        o = new z33[]{z33Var, z33Var2, z33Var3, z33Var4, z33Var5, z33Var6};
    }

    public static z33 valueOf(String str) {
        return (z33) Enum.valueOf(z33.class, str);
    }

    public static z33[] values() {
        return (z33[]) o.clone();
    }
}
