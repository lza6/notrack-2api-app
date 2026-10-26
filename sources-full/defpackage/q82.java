package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q82 {
    public static final q82 c;
    public static final q82 d;
    public static final q82 h;
    public static final /* synthetic */ q82[] l;

    static {
        q82 q82Var = new q82("IsPlacedInLookahead", 0);
        c = q82Var;
        q82 q82Var2 = new q82("IsPlacedInApproach", 1);
        d = q82Var2;
        q82 q82Var3 = new q82("IsNotPlaced", 2);
        h = q82Var3;
        l = new q82[]{q82Var, q82Var2, q82Var3};
    }

    public static q82 valueOf(String str) {
        return (q82) Enum.valueOf(q82.class, str);
    }

    public static q82[] values() {
        return (q82[]) l.clone();
    }
}
