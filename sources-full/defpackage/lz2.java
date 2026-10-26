package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lz2 {
    public static final lz2 c;
    public static final lz2 d;
    public static final lz2 h;
    public static final /* synthetic */ lz2[] l;

    static {
        lz2 lz2Var = new lz2("DEFAULT", 0);
        c = lz2Var;
        lz2 lz2Var2 = new lz2("VERY_LOW", 1);
        d = lz2Var2;
        lz2 lz2Var3 = new lz2("HIGHEST", 2);
        h = lz2Var3;
        l = new lz2[]{lz2Var, lz2Var2, lz2Var3};
    }

    public static lz2 valueOf(String str) {
        return (lz2) Enum.valueOf(lz2.class, str);
    }

    public static lz2[] values() {
        return (lz2[]) l.clone();
    }
}
