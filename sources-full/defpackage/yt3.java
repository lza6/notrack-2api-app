package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yt3 {
    public static final yt3 c;
    public static final yt3 d;
    public static final yt3 h;
    public static final /* synthetic */ yt3[] l;

    static {
        yt3 yt3Var = new yt3("Insert", 0);
        c = yt3Var;
        yt3 yt3Var2 = new yt3("Delete", 1);
        d = yt3Var2;
        yt3 yt3Var3 = new yt3("Replace", 2);
        h = yt3Var3;
        l = new yt3[]{yt3Var, yt3Var2, yt3Var3};
    }

    public static yt3 valueOf(String str) {
        return (yt3) Enum.valueOf(yt3.class, str);
    }

    public static yt3[] values() {
        return (yt3[]) l.clone();
    }
}
