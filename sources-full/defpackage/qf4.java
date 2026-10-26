package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qf4 {
    public static final qf4 c;
    public static final qf4 d;
    public static final /* synthetic */ qf4[] h;

    static {
        qf4 qf4Var = new qf4("Start", 0);
        c = qf4Var;
        qf4 qf4Var2 = new qf4("End", 1);
        d = qf4Var2;
        h = new qf4[]{qf4Var, qf4Var2};
    }

    public static qf4 valueOf(String str) {
        return (qf4) Enum.valueOf(qf4.class, str);
    }

    public static qf4[] values() {
        return (qf4[]) h.clone();
    }
}
