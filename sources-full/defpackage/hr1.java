package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 {
    public static final hr1 c;
    public static final hr1 d;
    public static final /* synthetic */ hr1[] h;

    static {
        hr1 hr1Var = new hr1("Width", 0);
        c = hr1Var;
        hr1 hr1Var2 = new hr1("Height", 1);
        d = hr1Var2;
        h = new hr1[]{hr1Var, hr1Var2};
    }

    public static hr1 valueOf(String str) {
        return (hr1) Enum.valueOf(hr1.class, str);
    }

    public static hr1[] values() {
        return (hr1[]) h.clone();
    }
}
