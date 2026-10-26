package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ih3 {
    public static final ih3 c;
    public static final ih3 d;
    public static final ih3 h;
    public static final /* synthetic */ ih3[] l;

    static {
        ih3 ih3Var = new ih3("Hidden", 0);
        c = ih3Var;
        ih3 ih3Var2 = new ih3("Expanded", 1);
        d = ih3Var2;
        ih3 ih3Var3 = new ih3("PartiallyExpanded", 2);
        h = ih3Var3;
        l = new ih3[]{ih3Var, ih3Var2, ih3Var3};
    }

    public static ih3 valueOf(String str) {
        return (ih3) Enum.valueOf(ih3.class, str);
    }

    public static ih3[] values() {
        return (ih3[]) l.clone();
    }
}
