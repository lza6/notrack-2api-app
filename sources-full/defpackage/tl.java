package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tl {
    public static final int a;

    static {
        Object i63Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            property.getClass();
            i63Var = to3.s0(property);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        if (i63Var instanceof i63) {
            i63Var = null;
        }
        Integer num = (Integer) i63Var;
        a = num != null ? num.intValue() : 2097152;
    }
}
