package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class la3 {
    public static final la3 c;
    public static final la3 d;
    public static final la3 h;
    public static final la3 l;
    public static final la3 m;
    public static final /* synthetic */ la3[] n;

    static {
        la3 la3Var = new la3("TopBar", 0);
        c = la3Var;
        la3 la3Var2 = new la3("MainContent", 1);
        d = la3Var2;
        la3 la3Var3 = new la3("Snackbar", 2);
        h = la3Var3;
        la3 la3Var4 = new la3("Fab", 3);
        l = la3Var4;
        la3 la3Var5 = new la3("BottomBar", 4);
        m = la3Var5;
        n = new la3[]{la3Var, la3Var2, la3Var3, la3Var4, la3Var5};
    }

    public static la3 valueOf(String str) {
        return (la3) Enum.valueOf(la3.class, str);
    }

    public static la3[] values() {
        return (la3[]) n.clone();
    }
}
