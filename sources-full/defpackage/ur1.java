package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ur1 {
    public static final ur1 c;
    public static final ur1 d;
    public static final ur1 h;
    public static final ur1 l;
    public static final /* synthetic */ ur1[] m;

    static {
        ur1 ur1Var = new ur1("IGNORED", 0);
        c = ur1Var;
        ur1 ur1Var2 = new ur1("SCHEDULED", 1);
        d = ur1Var2;
        ur1 ur1Var3 = new ur1("DEFERRED", 2);
        h = ur1Var3;
        ur1 ur1Var4 = new ur1("IMMINENT", 3);
        l = ur1Var4;
        m = new ur1[]{ur1Var, ur1Var2, ur1Var3, ur1Var4};
    }

    public static ur1 valueOf(String str) {
        return (ur1) Enum.valueOf(ur1.class, str);
    }

    public static ur1[] values() {
        return (ur1[]) m.clone();
    }
}
