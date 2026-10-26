package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class my3 {
    public static final my3 c;
    public static final my3 d;
    public static final my3 h;
    public static final my3 l;
    public static final /* synthetic */ my3[] m;

    static {
        my3 my3Var = new my3("StartInput", 0);
        c = my3Var;
        my3 my3Var2 = new my3("StopInput", 1);
        d = my3Var2;
        my3 my3Var3 = new my3("ShowKeyboard", 2);
        h = my3Var3;
        my3 my3Var4 = new my3("HideKeyboard", 3);
        l = my3Var4;
        m = new my3[]{my3Var, my3Var2, my3Var3, my3Var4};
    }

    public static my3 valueOf(String str) {
        return (my3) Enum.valueOf(my3.class, str);
    }

    public static my3[] values() {
        return (my3[]) m.clone();
    }
}
