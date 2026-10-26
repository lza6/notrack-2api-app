package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vz3 {
    public static final vz3 c;
    public static final vz3 d;
    public static final vz3 h;
    public static final /* synthetic */ vz3[] l;

    static {
        vz3 vz3Var = new vz3("None", 0);
        c = vz3Var;
        vz3 vz3Var2 = new vz3("Cursor", 1);
        d = vz3Var2;
        vz3 vz3Var3 = new vz3("Selection", 2);
        h = vz3Var3;
        l = new vz3[]{vz3Var, vz3Var2, vz3Var3};
    }

    public static vz3 valueOf(String str) {
        return (vz3) Enum.valueOf(vz3.class, str);
    }

    public static vz3[] values() {
        return (vz3[]) l.clone();
    }
}
