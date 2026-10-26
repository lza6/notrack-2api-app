package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zl2 {
    public static final zl2 c;
    public static final zl2 d;
    public static final /* synthetic */ zl2[] h;

    static {
        zl2 zl2Var = new zl2("Min", 0);
        c = zl2Var;
        zl2 zl2Var2 = new zl2("Max", 1);
        d = zl2Var2;
        h = new zl2[]{zl2Var, zl2Var2};
    }

    public static zl2 valueOf(String str) {
        return (zl2) Enum.valueOf(zl2.class, str);
    }

    public static zl2[] values() {
        return (zl2[]) h.clone();
    }
}
