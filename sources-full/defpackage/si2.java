package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class si2 {
    public static final si2 c;
    public static final /* synthetic */ si2[] d;

    static {
        si2 si2Var = new si2("Default", 0);
        c = si2Var;
        d = new si2[]{si2Var, new si2("UserInput", 1), new si2("PreventUserInput", 2)};
    }

    public static si2 valueOf(String str) {
        return (si2) Enum.valueOf(si2.class, str);
    }

    public static si2[] values() {
        return (si2[]) d.clone();
    }
}
