package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ej4 {
    public static final ej4 b;
    public tu a;

    static {
        ej4 ej4Var = new ej4();
        ej4Var.a = null;
        b = ej4Var;
    }

    public static tu a(Context context) {
        tu tuVar;
        ej4 ej4Var = b;
        synchronized (ej4Var) {
            try {
                if (ej4Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    ej4Var.a = new tu(context, (byte) 0);
                }
                tuVar = ej4Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tuVar;
    }
}
