package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ch1 {
    public static final ch1 c;
    public static final ch1 d;
    public static final ch1 h;
    public static final /* synthetic */ ch1[] l;

    static {
        ch1 ch1Var = new ch1("None", 0);
        c = ch1Var;
        ch1 ch1Var2 = new ch1("Selection", 1);
        d = ch1Var2;
        ch1 ch1Var3 = new ch1("Cursor", 2);
        h = ch1Var3;
        l = new ch1[]{ch1Var, ch1Var2, ch1Var3};
    }

    public static ch1 valueOf(String str) {
        return (ch1) Enum.valueOf(ch1.class, str);
    }

    public static ch1[] values() {
        return (ch1[]) l.clone();
    }
}
