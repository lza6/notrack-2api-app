package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r43 {
    public static final s43 a;

    static {
        s43 s43Var = null;
        try {
            s43Var = (s43) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (s43Var == null) {
            s43Var = new s43();
        }
        a = s43Var;
    }

    public static vc0 a(Class cls) {
        a.getClass();
        return new vc0(cls);
    }
}
