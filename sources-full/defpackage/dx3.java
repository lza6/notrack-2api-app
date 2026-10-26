package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dx3 {
    public static final dx3 c;
    public static final dx3 d;
    public static final dx3 h;
    public static final /* synthetic */ dx3[] l;

    static {
        dx3 dx3Var = new dx3("None", 0);
        c = dx3Var;
        dx3 dx3Var2 = new dx3("Touch", 1);
        d = dx3Var2;
        dx3 dx3Var3 = new dx3("Mouse", 2);
        h = dx3Var3;
        l = new dx3[]{dx3Var, dx3Var2, dx3Var3};
    }

    public static dx3 valueOf(String str) {
        return (dx3) Enum.valueOf(dx3.class, str);
    }

    public static dx3[] values() {
        return (dx3[]) l.clone();
    }
}
