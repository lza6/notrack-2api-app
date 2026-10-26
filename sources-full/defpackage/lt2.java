package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lt2 {
    public static final lt2 c;
    public static final /* synthetic */ lt2[] d;

    static {
        lt2 lt2Var = new lt2("CounterClockwise", 0);
        c = lt2Var;
        d = new lt2[]{lt2Var, new lt2("Clockwise", 1)};
    }

    public static lt2 valueOf(String str) {
        return (lt2) Enum.valueOf(lt2.class, str);
    }

    public static lt2[] values() {
        return (lt2[]) d.clone();
    }
}
