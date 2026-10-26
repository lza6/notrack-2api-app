package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wx2 {
    public static final wx2 c;
    public static final wx2 d;
    public static final /* synthetic */ wx2[] h;

    static {
        wx2 wx2Var = new wx2("EXACT", 0);
        c = wx2Var;
        wx2 wx2Var2 = new wx2("INEXACT", 1);
        d = wx2Var2;
        h = new wx2[]{wx2Var, wx2Var2};
    }

    public static wx2 valueOf(String str) {
        return (wx2) Enum.valueOf(wx2.class, str);
    }

    public static wx2[] values() {
        return (wx2[]) h.clone();
    }
}
