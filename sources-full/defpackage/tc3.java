package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tc3 {
    public static final tc3 c;
    public static final tc3 d;
    public static final /* synthetic */ tc3[] h;

    static {
        tc3 tc3Var = new tc3("Inherit", 0);
        c = tc3Var;
        tc3 tc3Var2 = new tc3("SecureOn", 1);
        d = tc3Var2;
        h = new tc3[]{tc3Var, tc3Var2, new tc3("SecureOff", 2)};
    }

    public static tc3 valueOf(String str) {
        return (tc3) Enum.valueOf(tc3.class, str);
    }

    public static tc3[] values() {
        return (tc3[]) h.clone();
    }
}
