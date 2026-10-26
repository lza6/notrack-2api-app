package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 {
    public static final sq0 c;
    public static final sq0 d;
    public static final sq0 h;
    public static final /* synthetic */ sq0[] l;

    static {
        sq0 sq0Var = new sq0("CROSSED", 0);
        c = sq0Var;
        sq0 sq0Var2 = new sq0("NOT_CROSSED", 1);
        d = sq0Var2;
        sq0 sq0Var3 = new sq0("COLLAPSED", 2);
        h = sq0Var3;
        l = new sq0[]{sq0Var, sq0Var2, sq0Var3};
    }

    public static sq0 valueOf(String str) {
        return (sq0) Enum.valueOf(sq0.class, str);
    }

    public static sq0[] values() {
        return (sq0[]) l.clone();
    }
}
