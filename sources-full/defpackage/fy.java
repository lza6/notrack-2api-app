package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fy {
    public static final fy c;
    public static final fy d;
    public static final fy h;
    public static final /* synthetic */ fy[] l;

    static {
        fy fyVar = new fy("SUSPEND", 0);
        c = fyVar;
        fy fyVar2 = new fy("DROP_OLDEST", 1);
        d = fyVar2;
        fy fyVar3 = new fy("DROP_LATEST", 2);
        h = fyVar3;
        l = new fy[]{fyVar, fyVar2, fyVar3};
    }

    public static fy valueOf(String str) {
        return (fy) Enum.valueOf(fy.class, str);
    }

    public static fy[] values() {
        return (fy[]) l.clone();
    }
}
