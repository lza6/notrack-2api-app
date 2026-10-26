package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 {
    public static final jq0 c;
    public static final jq0 d;
    public static final jq0 h;
    public static final jq0 l;
    public static final /* synthetic */ jq0[] m;

    static {
        jq0 jq0Var = new jq0("DEFAULT", 0);
        c = jq0Var;
        jq0 jq0Var2 = new jq0("LAZY", 1);
        d = jq0Var2;
        jq0 jq0Var3 = new jq0("ATOMIC", 2);
        h = jq0Var3;
        jq0 jq0Var4 = new jq0("UNDISPATCHED", 3);
        l = jq0Var4;
        m = new jq0[]{jq0Var, jq0Var2, jq0Var3, jq0Var4};
    }

    public static jq0 valueOf(String str) {
        return (jq0) Enum.valueOf(jq0.class, str);
    }

    public static jq0[] values() {
        return (jq0[]) m.clone();
    }
}
