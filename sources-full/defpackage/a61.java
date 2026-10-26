package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a61 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
