package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jx2 {
    public static final jx2 c;
    public static final jx2 d;
    public static final jx2 h;
    public static final /* synthetic */ jx2[] l;

    static {
        jx2 jx2Var = new jx2("Unknown", 0);
        c = jx2Var;
        jx2 jx2Var2 = new jx2("Dispatching", 1);
        d = jx2Var2;
        jx2 jx2Var3 = new jx2("NotDispatching", 2);
        h = jx2Var3;
        l = new jx2[]{jx2Var, jx2Var2, jx2Var3};
    }

    public static jx2 valueOf(String str) {
        return (jx2) Enum.valueOf(jx2.class, str);
    }

    public static jx2[] values() {
        return (jx2[]) l.clone();
    }
}
