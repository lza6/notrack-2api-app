package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nq2 {
    public static final nq2 c;
    public static final nq2 d;
    public static final /* synthetic */ nq2[] h;

    static {
        nq2 nq2Var = new nq2("Vertical", 0);
        c = nq2Var;
        nq2 nq2Var2 = new nq2("Horizontal", 1);
        d = nq2Var2;
        h = new nq2[]{nq2Var, nq2Var2};
    }

    public static nq2 valueOf(String str) {
        return (nq2) Enum.valueOf(nq2.class, str);
    }

    public static nq2[] values() {
        return (nq2[]) h.clone();
    }
}
