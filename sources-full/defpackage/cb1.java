package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cb1 {
    public static final cb1 c;
    public static final cb1 d;
    public static final cb1 h;
    public static final cb1 l;
    public static final /* synthetic */ cb1[] m;

    static {
        cb1 cb1Var = new cb1("Active", 0);
        c = cb1Var;
        cb1 cb1Var2 = new cb1("ActiveParent", 1);
        d = cb1Var2;
        cb1 cb1Var3 = new cb1("Captured", 2);
        h = cb1Var3;
        cb1 cb1Var4 = new cb1("Inactive", 3);
        l = cb1Var4;
        m = new cb1[]{cb1Var, cb1Var2, cb1Var3, cb1Var4};
    }

    public static cb1 valueOf(String str) {
        return (cb1) Enum.valueOf(cb1.class, str);
    }

    public static cb1[] values() {
        return (cb1[]) m.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        u41.e();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                u41.e();
                return false;
            }
        }
        return true;
    }
}
