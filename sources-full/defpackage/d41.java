package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d41 {
    public static final d41 c;
    public static final d41 d;
    public static final d41 h;
    public static final /* synthetic */ d41[] l;

    static {
        d41 d41Var = new d41("PreEnter", 0);
        c = d41Var;
        d41 d41Var2 = new d41("Visible", 1);
        d = d41Var2;
        d41 d41Var3 = new d41("PostExit", 2);
        h = d41Var3;
        l = new d41[]{d41Var, d41Var2, d41Var3};
    }

    public static d41 valueOf(String str) {
        return (d41) Enum.valueOf(d41.class, str);
    }

    public static d41[] values() {
        return (d41[]) l.clone();
    }
}
