package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 {
    public static final ah1 c;
    public static final ah1 d;
    public static final ah1 h;
    public static final /* synthetic */ ah1[] l;

    static {
        ah1 ah1Var = new ah1("Cursor", 0);
        c = ah1Var;
        ah1 ah1Var2 = new ah1("SelectionStart", 1);
        d = ah1Var2;
        ah1 ah1Var3 = new ah1("SelectionEnd", 2);
        h = ah1Var3;
        l = new ah1[]{ah1Var, ah1Var2, ah1Var3};
    }

    public static ah1 valueOf(String str) {
        return (ah1) Enum.valueOf(ah1.class, str);
    }

    public static ah1[] values() {
        return (ah1[]) l.clone();
    }
}
