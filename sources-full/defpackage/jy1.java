package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jy1 {
    public static final jy1 c;
    public static final jy1 d;
    public static final /* synthetic */ jy1[] h;

    static {
        jy1 jy1Var = new jy1("Horizontal", 0);
        c = jy1Var;
        jy1 jy1Var2 = new jy1("Vertical", 1);
        d = jy1Var2;
        h = new jy1[]{jy1Var, jy1Var2};
    }

    public static jy1 valueOf(String str) {
        return (jy1) Enum.valueOf(jy1.class, str);
    }

    public static jy1[] values() {
        return (jy1[]) h.clone();
    }
}
