package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n74 {
    public static final n74 c;
    public static final n74 d;
    public static final n74 h;
    public static final n74 l;
    public static final n74 m;
    public static final n74 n;
    public static final n74 o;
    public static final /* synthetic */ n74[] p;

    static {
        n74 n74Var = new n74("BodyLarge", 0);
        c = n74Var;
        n74 n74Var2 = new n74("BodyMedium", 1);
        d = n74Var2;
        n74 n74Var3 = new n74("BodySmall", 2);
        n74 n74Var4 = new n74("DisplayLarge", 3);
        n74 n74Var5 = new n74("DisplayMedium", 4);
        n74 n74Var6 = new n74("DisplaySmall", 5);
        n74 n74Var7 = new n74("HeadlineLarge", 6);
        n74 n74Var8 = new n74("HeadlineMedium", 7);
        h = n74Var8;
        n74 n74Var9 = new n74("HeadlineSmall", 8);
        l = n74Var9;
        n74 n74Var10 = new n74("LabelLarge", 9);
        m = n74Var10;
        n74 n74Var11 = new n74("LabelMedium", 10);
        n74 n74Var12 = new n74("LabelSmall", 11);
        n = n74Var12;
        n74 n74Var13 = new n74("TitleLarge", 12);
        o = n74Var13;
        p = new n74[]{n74Var, n74Var2, n74Var3, n74Var4, n74Var5, n74Var6, n74Var7, n74Var8, n74Var9, n74Var10, n74Var11, n74Var12, n74Var13, new n74("TitleMedium", 13), new n74("TitleSmall", 14)};
    }

    public static n74 valueOf(String str) {
        return (n74) Enum.valueOf(n74.class, str);
    }

    public static n74[] values() {
        return (n74[]) p.clone();
    }
}
