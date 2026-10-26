package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vt3 {
    public static final vt3 c;
    public static final vt3 d;
    public static final vt3 h;
    public static final vt3 l;
    public static final /* synthetic */ vt3[] m;

    static {
        vt3 vt3Var = new vt3("Start", 0);
        c = vt3Var;
        vt3 vt3Var2 = new vt3("End", 1);
        d = vt3Var2;
        vt3 vt3Var3 = new vt3("Inner", 2);
        h = vt3Var3;
        vt3 vt3Var4 = new vt3("NotByUser", 3);
        l = vt3Var4;
        m = new vt3[]{vt3Var, vt3Var2, vt3Var3, vt3Var4};
    }

    public static vt3 valueOf(String str) {
        return (vt3) Enum.valueOf(vt3.class, str);
    }

    public static vt3[] values() {
        return (vt3[]) m.clone();
    }
}
