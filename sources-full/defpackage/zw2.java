package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zw2 {
    public static final zw2 c;
    public static final zw2 d;
    public static final zw2 h;
    public static final /* synthetic */ zw2[] l;

    static {
        zw2 zw2Var = new zw2("Initial", 0);
        c = zw2Var;
        zw2 zw2Var2 = new zw2("Main", 1);
        d = zw2Var2;
        zw2 zw2Var3 = new zw2("Final", 2);
        h = zw2Var3;
        l = new zw2[]{zw2Var, zw2Var2, zw2Var3};
    }

    public static zw2 valueOf(String str) {
        return (zw2) Enum.valueOf(zw2.class, str);
    }

    public static zw2[] values() {
        return (zw2[]) l.clone();
    }
}
