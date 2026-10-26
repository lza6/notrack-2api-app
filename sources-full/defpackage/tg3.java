package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tg3 {
    public static final tg3 c;
    public static final tg3 d;
    public static final tg3 h;
    public static final tg3 l;
    public static final tg3 m;
    public static final tg3 n;
    public static final tg3 o;
    public static final tg3 p;
    public static final /* synthetic */ tg3[] q;

    static {
        tg3 tg3Var = new tg3("CornerExtraLarge", 0);
        c = tg3Var;
        tg3 tg3Var2 = new tg3("CornerExtraLargeTop", 1);
        d = tg3Var2;
        tg3 tg3Var3 = new tg3("CornerExtraSmall", 2);
        h = tg3Var3;
        tg3 tg3Var4 = new tg3("CornerExtraSmallTop", 3);
        l = tg3Var4;
        tg3 tg3Var5 = new tg3("CornerFull", 4);
        m = tg3Var5;
        tg3 tg3Var6 = new tg3("CornerLarge", 5);
        tg3 tg3Var7 = new tg3("CornerLargeEnd", 6);
        n = tg3Var7;
        tg3 tg3Var8 = new tg3("CornerLargeTop", 7);
        tg3 tg3Var9 = new tg3("CornerMedium", 8);
        tg3 tg3Var10 = new tg3("CornerNone", 9);
        o = tg3Var10;
        tg3 tg3Var11 = new tg3("CornerSmall", 10);
        p = tg3Var11;
        q = new tg3[]{tg3Var, tg3Var2, tg3Var3, tg3Var4, tg3Var5, tg3Var6, tg3Var7, tg3Var8, tg3Var9, tg3Var10, tg3Var11};
    }

    public static tg3 valueOf(String str) {
        return (tg3) Enum.valueOf(tg3.class, str);
    }

    public static tg3[] values() {
        return (tg3[]) q.clone();
    }
}
