package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 {
    public static final sx1 c;
    public static final sx1 d;
    public static final sx1 h;
    public static final /* synthetic */ sx1[] l;

    static {
        sx1 sx1Var = new sx1("InMeasureBlock", 0);
        c = sx1Var;
        sx1 sx1Var2 = new sx1("InLayoutBlock", 1);
        d = sx1Var2;
        sx1 sx1Var3 = new sx1("NotUsed", 2);
        h = sx1Var3;
        l = new sx1[]{sx1Var, sx1Var2, sx1Var3};
    }

    public static sx1 valueOf(String str) {
        return (sx1) Enum.valueOf(sx1.class, str);
    }

    public static sx1[] values() {
        return (sx1[]) l.clone();
    }
}
