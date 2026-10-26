package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 {
    public static final ew0 c;
    public static final ew0 d;
    public static final ew0 h;
    public static final /* synthetic */ ew0[] l;

    static {
        ew0 ew0Var = new ew0("BEFORE", 0);
        c = ew0Var;
        ew0 ew0Var2 = new ew0("ON", 1);
        d = ew0Var2;
        ew0 ew0Var3 = new ew0("AFTER", 2);
        h = ew0Var3;
        l = new ew0[]{ew0Var, ew0Var2, ew0Var3};
    }

    public static ew0 valueOf(String str) {
        return (ew0) Enum.valueOf(ew0.class, str);
    }

    public static ew0[] values() {
        return (ew0[]) l.clone();
    }
}
