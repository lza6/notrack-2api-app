package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h13 {
    public static final h13 c;
    public static final /* synthetic */ h13[] d;

    static {
        h13 h13Var = new h13("DEFAULT", 0);
        c = h13Var;
        d = new h13[]{h13Var, new h13("SIGNED", 1), new h13("FIXED", 2)};
    }

    public static h13 valueOf(String str) {
        return (h13) Enum.valueOf(h13.class, str);
    }

    public static h13[] values() {
        return (h13[]) d.clone();
    }
}
