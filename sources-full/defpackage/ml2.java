package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml2 {
    public static final ll2 a;
    public static final ll2 b;

    static {
        ll2 ll2Var = null;
        try {
            ll2Var = (ll2) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ll2Var;
        b = new ll2();
    }
}
