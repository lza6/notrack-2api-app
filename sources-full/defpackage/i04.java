package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i04 {
    public static final ThreadLocal a = new ThreadLocal();

    public static v41 a() {
        ThreadLocal threadLocal = a;
        v41 v41Var = (v41) threadLocal.get();
        if (v41Var != null) {
            return v41Var;
        }
        uv uvVar = new uv(Thread.currentThread());
        threadLocal.set(uvVar);
        return uvVar;
    }
}
