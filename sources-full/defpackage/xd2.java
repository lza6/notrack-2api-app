package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xd2 {
    public static final xd2 c;
    public static final xd2 d;
    public static final xd2 h;
    public static final xd2 l;
    public static final xd2 m;
    public static final /* synthetic */ xd2[] n;

    static {
        xd2 xd2Var = new xd2("TEXT", 0);
        c = xd2Var;
        xd2 xd2Var2 = new xd2("ERROR", 1);
        d = xd2Var2;
        xd2 xd2Var3 = new xd2("PROMO", 2);
        h = xd2Var3;
        xd2 xd2Var4 = new xd2("OWN", 3);
        l = xd2Var4;
        xd2 xd2Var5 = new xd2("NOTE", 4);
        m = xd2Var5;
        n = new xd2[]{xd2Var, xd2Var2, xd2Var3, xd2Var4, xd2Var5};
    }

    public static xd2 valueOf(String str) {
        return (xd2) Enum.valueOf(xd2.class, str);
    }

    public static xd2[] values() {
        return (xd2[]) n.clone();
    }
}
