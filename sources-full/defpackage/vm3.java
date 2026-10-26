package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm3 {
    public static final /* synthetic */ int a = 0;

    static {
        Object i63Var;
        Object i63Var2;
        Exception exc = new Exception();
        String simpleName = sf3.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            i63Var = wr.class.getCanonicalName();
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        if (j63.a(i63Var) != null) {
            i63Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            i63Var2 = vm3.class.getCanonicalName();
        } catch (Throwable th2) {
            i63Var2 = new i63(th2);
        }
        if (j63.a(i63Var2) != null) {
            i63Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
