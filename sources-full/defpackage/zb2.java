package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 {
    public static final zb2 c;
    public static final zb2 d;
    public static final /* synthetic */ zb2[] h;

    static {
        zb2 zb2Var = new zb2("Width", 0);
        c = zb2Var;
        zb2 zb2Var2 = new zb2("Height", 1);
        d = zb2Var2;
        h = new zb2[]{zb2Var, zb2Var2};
    }

    public static zb2 valueOf(String str) {
        return (zb2) Enum.valueOf(zb2.class, str);
    }

    public static zb2[] values() {
        return (zb2[]) h.clone();
    }
}
