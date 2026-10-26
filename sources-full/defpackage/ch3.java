package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ch3 {
    public static final ch3 c;
    public static final ch3 d;
    public static final ch3 h;
    public static final /* synthetic */ ch3[] l;

    static {
        ch3 ch3Var = new ch3("START", 0);
        c = ch3Var;
        ch3 ch3Var2 = new ch3("STOP", 1);
        d = ch3Var2;
        ch3 ch3Var3 = new ch3("STOP_AND_RESET_REPLAY_CACHE", 2);
        h = ch3Var3;
        l = new ch3[]{ch3Var, ch3Var2, ch3Var3};
    }

    public static ch3 valueOf(String str) {
        return (ch3) Enum.valueOf(ch3.class, str);
    }

    public static ch3[] values() {
        return (ch3[]) l.clone();
    }
}
