package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class id0 {
    public static final id0 c;
    public static final /* synthetic */ id0[] d;

    /* JADX INFO: Fake field, exist only in values array */
    id0 EF0;

    static {
        id0 id0Var = new id0("UNKNOWN", 0);
        id0 id0Var2 = new id0("ANDROID_FIREBASE", 1);
        c = id0Var2;
        d = new id0[]{id0Var, id0Var2};
    }

    public static id0 valueOf(String str) {
        return (id0) Enum.valueOf(id0.class, str);
    }

    public static id0[] values() {
        return (id0[]) d.clone();
    }
}
