package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ce3 {
    public static final ce3 c;
    public static final ce3 d;
    public static final ce3 h;
    public static final /* synthetic */ ce3[] l;

    static {
        ce3 ce3Var = new ce3("Left", 0);
        c = ce3Var;
        ce3 ce3Var2 = new ce3("Middle", 1);
        d = ce3Var2;
        ce3 ce3Var3 = new ce3("Right", 2);
        h = ce3Var3;
        l = new ce3[]{ce3Var, ce3Var2, ce3Var3};
    }

    public static ce3 valueOf(String str) {
        return (ce3) Enum.valueOf(ce3.class, str);
    }

    public static ce3[] values() {
        return (ce3[]) l.clone();
    }
}
