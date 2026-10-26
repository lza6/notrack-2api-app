package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ci4;
import defpackage.ko1;
import defpackage.n32;
import defpackage.p32;
import defpackage.tu;
import defpackage.ub1;
import defpackage.y11;
import defpackage.z11;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements ko1 {
    @Override // defpackage.ko1
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.ko1
    public final Object b(Context context) {
        Object objU;
        ub1 ub1Var = new ub1(new tu(context, 2));
        ub1Var.b = 1;
        if (y11.k == null) {
            synchronized (y11.j) {
                try {
                    if (y11.k == null) {
                        y11.k = new y11(ub1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ci4 ci4VarA = ci4.A(context);
        ci4VarA.getClass();
        synchronized (ci4.n) {
            try {
                objU = ((HashMap) ci4VarA.d).get(ProcessLifecycleInitializer.class);
                if (objU == null) {
                    objU = ci4VarA.u(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p32 p32VarH = ((n32) objU).h();
        p32VarH.a(new z11(this, p32VarH));
        return Boolean.TRUE;
    }
}
