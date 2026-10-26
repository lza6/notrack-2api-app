package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class va3 {
    public static final va3 c;
    public static final va3 d;
    public static final va3 h;
    public static final /* synthetic */ va3[] l;

    static {
        va3 va3Var = new va3("NETWORK_UNMETERED", 0);
        c = va3Var;
        va3 va3Var2 = new va3("DEVICE_IDLE", 1);
        d = va3Var2;
        va3 va3Var3 = new va3("DEVICE_CHARGING", 2);
        h = va3Var3;
        l = new va3[]{va3Var, va3Var2, va3Var3};
    }

    public static va3 valueOf(String str) {
        return (va3) Enum.valueOf(va3.class, str);
    }

    public static va3[] values() {
        return (va3[]) l.clone();
    }
}
