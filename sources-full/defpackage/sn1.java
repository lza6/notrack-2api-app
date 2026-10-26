package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sn1 {
    public static final sn1 c;
    public static final sn1 d;
    public static final sn1 h;
    public static final sn1 l;
    public static final /* synthetic */ sn1[] m;

    static {
        sn1 sn1Var = new sn1("Untransformed", 0);
        c = sn1Var;
        sn1 sn1Var2 = new sn1("Insertion", 1);
        d = sn1Var2;
        sn1 sn1Var3 = new sn1("Replacement", 2);
        h = sn1Var3;
        sn1 sn1Var4 = new sn1("Deletion", 3);
        l = sn1Var4;
        m = new sn1[]{sn1Var, sn1Var2, sn1Var3, sn1Var4};
    }

    public static sn1 valueOf(String str) {
        return (sn1) Enum.valueOf(sn1.class, str);
    }

    public static sn1[] values() {
        return (sn1[]) m.clone();
    }
}
