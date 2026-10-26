package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d61 {
    public static final c61 a = new c61();
    public static final c61 b;

    static {
        c61 c61Var = null;
        try {
            c61Var = (c61) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c61Var;
    }
}
