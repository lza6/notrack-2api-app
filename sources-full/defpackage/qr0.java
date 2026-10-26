package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 {
    public static final qr0 c;
    public static final qr0 d;
    public static final qr0 h;
    public static final qr0 l;
    public static final /* synthetic */ qr0[] m;

    static {
        qr0 qr0Var = new qr0("MEMORY_CACHE", 0);
        c = qr0Var;
        qr0 qr0Var2 = new qr0("MEMORY", 1);
        d = qr0Var2;
        qr0 qr0Var3 = new qr0("DISK", 2);
        h = qr0Var3;
        qr0 qr0Var4 = new qr0("NETWORK", 3);
        l = qr0Var4;
        m = new qr0[]{qr0Var, qr0Var2, qr0Var3, qr0Var4};
    }

    public static qr0 valueOf(String str) {
        return (qr0) Enum.valueOf(qr0.class, str);
    }

    public static qr0[] values() {
        return (qr0[]) m.clone();
    }
}
