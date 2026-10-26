package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pr3 {
    public static final pr3 c;
    public static final pr3 d;
    public static final pr3 h;
    public static final /* synthetic */ pr3[] l;

    static {
        pr3 pr3Var = new pr3("LEFT", 0);
        c = pr3Var;
        pr3 pr3Var2 = new pr3("CENTER", 1);
        d = pr3Var2;
        pr3 pr3Var3 = new pr3("RIGHT", 2);
        h = pr3Var3;
        l = new pr3[]{pr3Var, pr3Var2, pr3Var3};
    }

    public static pr3 valueOf(String str) {
        return (pr3) Enum.valueOf(pr3.class, str);
    }

    public static pr3[] values() {
        return (pr3[]) l.clone();
    }
}
