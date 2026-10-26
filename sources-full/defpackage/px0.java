package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class px0 {
    public static final px0 c;
    public static final px0 d;
    public static final px0 h;
    public static final px0 l;
    public static final /* synthetic */ px0[] m;

    static {
        px0 px0Var = new px0("Up", 0);
        c = px0Var;
        px0 px0Var2 = new px0("Drag", 1);
        d = px0Var2;
        px0 px0Var3 = new px0("Timeout", 2);
        h = px0Var3;
        px0 px0Var4 = new px0("Cancel", 3);
        l = px0Var4;
        m = new px0[]{px0Var, px0Var2, px0Var3, px0Var4};
    }

    public static px0 valueOf(String str) {
        return (px0) Enum.valueOf(px0.class, str);
    }

    public static px0[] values() {
        return (px0[]) m.clone();
    }
}
