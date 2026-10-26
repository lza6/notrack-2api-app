package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ji3 {
    public static final ji3 c;
    public static final ji3 d;
    public static final /* synthetic */ ji3[] h;

    static {
        ji3 ji3Var = new ji3("THUMB", 0);
        c = ji3Var;
        ji3 ji3Var2 = new ji3("TRACK", 1);
        d = ji3Var2;
        h = new ji3[]{ji3Var, ji3Var2};
    }

    public static ji3 valueOf(String str) {
        return (ji3) Enum.valueOf(ji3.class, str);
    }

    public static ji3[] values() {
        return (ji3[]) h.clone();
    }
}
