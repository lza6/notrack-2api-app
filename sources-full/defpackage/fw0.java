package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fw0 {
    public static final fw0 c;
    public static final fw0 d;
    public static final fw0 h;
    public static final /* synthetic */ fw0[] l;

    static {
        fw0 fw0Var = new fw0("Vertical", 0);
        c = fw0Var;
        fw0 fw0Var2 = new fw0("Horizontal", 1);
        d = fw0Var2;
        fw0 fw0Var3 = new fw0("Both", 2);
        h = fw0Var3;
        l = new fw0[]{fw0Var, fw0Var2, fw0Var3};
    }

    public static fw0 valueOf(String str) {
        return (fw0) Enum.valueOf(fw0.class, str);
    }

    public static fw0[] values() {
        return (fw0[]) l.clone();
    }
}
