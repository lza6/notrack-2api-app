package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 {
    public static final cs1 c;
    public static final cs1 d;
    public static final cs1 h;
    public static final cs1 l;
    public static final cs1 m;
    public static final cs1 n;
    public static final cs1 o;
    public static final cs1 p;
    public static final cs1 q;
    public static final cs1 r;
    public static final /* synthetic */ cs1[] s;

    static {
        cs1 cs1Var = new cs1("VOID", 0);
        c = cs1Var;
        cs1 cs1Var2 = new cs1("INT", 1);
        d = cs1Var2;
        cs1 cs1Var3 = new cs1("LONG", 2);
        h = cs1Var3;
        cs1 cs1Var4 = new cs1("FLOAT", 3);
        l = cs1Var4;
        cs1 cs1Var5 = new cs1("DOUBLE", 4);
        m = cs1Var5;
        cs1 cs1Var6 = new cs1("BOOLEAN", 5);
        n = cs1Var6;
        cs1 cs1Var7 = new cs1("STRING", 6);
        o = cs1Var7;
        kz kzVar = mz.d;
        cs1 cs1Var8 = new cs1("BYTE_STRING", 7);
        p = cs1Var8;
        cs1 cs1Var9 = new cs1("ENUM", 8);
        q = cs1Var9;
        cs1 cs1Var10 = new cs1("MESSAGE", 9);
        r = cs1Var10;
        s = new cs1[]{cs1Var, cs1Var2, cs1Var3, cs1Var4, cs1Var5, cs1Var6, cs1Var7, cs1Var8, cs1Var9, cs1Var10};
    }

    public static cs1 valueOf(String str) {
        return (cs1) Enum.valueOf(cs1.class, str);
    }

    public static cs1[] values() {
        return (cs1[]) s.clone();
    }
}
