package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jp1 {
    public static final jp1 c;
    public static final jp1 d;
    public static final jp1 h;
    public static final /* synthetic */ jp1[] l;

    static {
        jp1 jp1Var = new jp1("Focused", 0);
        c = jp1Var;
        jp1 jp1Var2 = new jp1("UnfocusedEmpty", 1);
        d = jp1Var2;
        jp1 jp1Var3 = new jp1("UnfocusedNotEmpty", 2);
        h = jp1Var3;
        l = new jp1[]{jp1Var, jp1Var2, jp1Var3};
    }

    public static jp1 valueOf(String str) {
        return (jp1) Enum.valueOf(jp1.class, str);
    }

    public static jp1[] values() {
        return (jp1[]) l.clone();
    }
}
