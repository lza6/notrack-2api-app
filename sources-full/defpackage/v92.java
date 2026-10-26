package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v92 {
    public static final u92 a;
    public static final u92 b;

    static {
        u92 u92Var = null;
        try {
            u92Var = (u92) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = u92Var;
        b = new u92();
    }
}
