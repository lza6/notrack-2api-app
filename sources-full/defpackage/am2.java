package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class am2 {
    public static final am2 c;
    public static final am2 d;
    public static final /* synthetic */ am2[] h;

    static {
        am2 am2Var = new am2("Width", 0);
        c = am2Var;
        am2 am2Var2 = new am2("Height", 1);
        d = am2Var2;
        h = new am2[]{am2Var, am2Var2};
    }

    public static am2 valueOf(String str) {
        return (am2) Enum.valueOf(am2.class, str);
    }

    public static am2[] values() {
        return (am2[]) h.clone();
    }
}
