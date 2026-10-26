package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l23 {
    public static final l23 c;
    public static final l23 d;
    public static final l23 h;
    public static final /* synthetic */ l23[] l;

    static {
        l23 l23Var = new l23("ENDTHUMB", 0);
        c = l23Var;
        l23 l23Var2 = new l23("STARTTHUMB", 1);
        d = l23Var2;
        l23 l23Var3 = new l23("TRACK", 2);
        h = l23Var3;
        l = new l23[]{l23Var, l23Var2, l23Var3};
    }

    public static l23 valueOf(String str) {
        return (l23) Enum.valueOf(l23.class, str);
    }

    public static l23[] values() {
        return (l23[]) l.clone();
    }
}
