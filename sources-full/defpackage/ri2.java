package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 {
    public static final ri2 c;
    public static final ri2 d;
    public static final /* synthetic */ ri2[] h;

    static {
        ri2 ri2Var = new ri2("Default", 0);
        c = ri2Var;
        ri2 ri2Var2 = new ri2("UserInput", 1);
        d = ri2Var2;
        h = new ri2[]{ri2Var, ri2Var2, new ri2("PreventUserInput", 2)};
    }

    public static ri2 valueOf(String str) {
        return (ri2) Enum.valueOf(ri2.class, str);
    }

    public static ri2[] values() {
        return (ri2[]) h.clone();
    }
}
