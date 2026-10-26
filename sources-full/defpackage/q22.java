package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q22 {
    public static final q22 c;
    public static final q22 d;
    public static final /* synthetic */ q22[] h;

    /* JADX INFO: Fake field, exist only in values array */
    q22 EF0;

    static {
        q22 q22Var = new q22("SYNCHRONIZED", 0);
        q22 q22Var2 = new q22("PUBLICATION", 1);
        c = q22Var2;
        q22 q22Var3 = new q22("NONE", 2);
        d = q22Var3;
        h = new q22[]{q22Var, q22Var2, q22Var3};
    }

    public static q22 valueOf(String str) {
        return (q22) Enum.valueOf(q22.class, str);
    }

    public static q22[] values() {
        return (q22[]) h.clone();
    }
}
