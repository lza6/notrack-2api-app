package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lv2 {
    public static final lv2 c;
    public static final lv2 d;
    public static final /* synthetic */ lv2[] h;

    static {
        lv2 lv2Var = new lv2("UNCHANGED", 0);
        c = lv2Var;
        lv2 lv2Var2 = new lv2("TRANSLUCENT", 1);
        lv2 lv2Var3 = new lv2("OPAQUE", 2);
        d = lv2Var3;
        h = new lv2[]{lv2Var, lv2Var2, lv2Var3};
    }

    public static lv2 valueOf(String str) {
        return (lv2) Enum.valueOf(lv2.class, str);
    }

    public static lv2[] values() {
        return (lv2[]) h.clone();
    }
}
