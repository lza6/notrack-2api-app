package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class wr implements so0, iq0, Serializable {
    private final so0 completion;

    public wr(so0 so0Var) {
        this.completion = so0Var;
    }

    public so0 create(Object obj, so0 so0Var) {
        so0Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public so0 create(so0 so0Var) {
        so0Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public iq0 getCallerFrame() {
        so0 so0Var = this.completion;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    public final so0 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        vr0 vr0Var = (vr0) getClass().getAnnotation(vr0.class);
        String str = null;
        if (vr0Var == null) {
            return null;
        }
        int iV = vr0Var.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? vr0Var.l()[iIntValue] : -1;
        md0 md0Var = jr1.c;
        md0 md0Var2 = jr1.d;
        if (md0Var2 == null) {
            try {
                md0 md0Var3 = new md0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                jr1.d = md0Var3;
                md0Var2 = md0Var3;
            } catch (Exception unused2) {
                jr1.d = md0Var;
                md0Var2 = md0Var;
            }
        }
        if (md0Var2 != md0Var && (method = md0Var2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = md0Var2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = md0Var2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = vr0Var.c();
        } else {
            strC = str + '/' + vr0Var.c();
        }
        return new StackTraceElement(strC, vr0Var.m(), vr0Var.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            wr wrVar = (wr) r2;
            so0 so0Var = wrVar.completion;
            so0Var.getClass();
            try {
                obj = wrVar.invokeSuspend(obj);
                if (obj == hq0.c) {
                    return;
                }
            } catch (Throwable th) {
                obj = new i63(th);
            }
            wrVar.releaseIntercepted();
            if (!(so0Var instanceof wr)) {
                so0Var.resumeWith(obj);
                return;
            }
            r2 = so0Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
