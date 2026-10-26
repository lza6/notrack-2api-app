package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hr0 {
    public static final hr0 c;
    public static final hr0 d;
    public static final hr0 h;
    public static final /* synthetic */ hr0[] l;

    static {
        hr0 hr0Var = new hr0("LEFT", 0);
        c = hr0Var;
        hr0 hr0Var2 = new hr0("CENTER", 1);
        d = hr0Var2;
        hr0 hr0Var3 = new hr0("RIGHT", 2);
        h = hr0Var3;
        l = new hr0[]{hr0Var, hr0Var2, hr0Var3};
    }

    public static hr0 valueOf(String str) {
        return (hr0) Enum.valueOf(hr0.class, str);
    }

    public static hr0[] values() {
        return (hr0[]) l.clone();
    }
}
