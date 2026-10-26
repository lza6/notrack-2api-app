package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v91 {
    public static final v91 c;
    public static final v91 d;
    public static final v91 h;
    public static final v91 l;
    public static final /* synthetic */ v91[] m;

    static {
        v91 v91Var = new v91("Visible", 0);
        c = v91Var;
        v91 v91Var2 = new v91("Clip", 1);
        d = v91Var2;
        v91 v91Var3 = new v91("ExpandIndicator", 2);
        h = v91Var3;
        v91 v91Var4 = new v91("ExpandOrCollapseIndicator", 3);
        l = v91Var4;
        m = new v91[]{v91Var, v91Var2, v91Var3, v91Var4};
    }

    public static v91 valueOf(String str) {
        return (v91) Enum.valueOf(v91.class, str);
    }

    public static v91[] values() {
        return (v91[]) m.clone();
    }
}
