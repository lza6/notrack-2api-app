package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class wh3 {
    public static final /* synthetic */ AtomicReference a = new AtomicReference(null);

    public static final im1 a(Context context) {
        im1 im1Var;
        AtomicReference atomicReference = a;
        Object obj = atomicReference.get();
        im1 im1VarA = null;
        im1 im1Var2 = obj instanceof im1 ? (im1) obj : null;
        if (im1Var2 != null) {
            return im1Var2;
        }
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof im1) {
                im1Var = im1VarA;
                im1VarA = (im1) obj2;
            } else {
                if (im1VarA == null) {
                    context.getApplicationContext();
                    f61 f61Var = yh3.a;
                    im1VarA = xh3.a(context);
                }
                im1Var = im1VarA;
            }
            while (!atomicReference.compareAndSet(obj2, im1VarA)) {
                if (atomicReference.get() != obj2) {
                    im1VarA = im1Var;
                }
            }
            return im1VarA;
        }
    }
}
