package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class go2 {
    public final Runnable a;
    public final kl b = new kl();
    public yn2 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public go2(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = do2.a.a(new zn2(this, 0), new zn2(this, 1), new ao2(this, 0), new ao2(this, 1));
            } else {
                onBackInvokedCallbackA = bo2.a.a(new ao2(this, 2));
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(n32 n32Var, yn2 yn2Var) {
        n32Var.getClass();
        yn2Var.getClass();
        p32 p32VarH = n32Var.h();
        if (p32VarH.c == g32.c) {
            return;
        }
        yn2Var.b.add(new eo2(this, p32VarH, yn2Var));
        e();
        yn2Var.c = new ia0(0, this, go2.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 11);
    }

    public final void b() {
        Object objPrevious;
        yn2 yn2Var = this.c;
        if (yn2Var == null) {
            kl klVar = this.b;
            ListIterator<E> listIterator = klVar.listIterator(klVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((yn2) objPrevious).a);
            yn2Var = (yn2) objPrevious;
        }
        this.c = null;
        if (yn2Var != null) {
            yn2Var.a();
        }
    }

    public final void c() {
        Object objPrevious;
        yn2 yn2Var = this.c;
        if (yn2Var == null) {
            kl klVar = this.b;
            ListIterator listIterator = klVar.listIterator(klVar.b());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((yn2) objPrevious).a);
            yn2Var = (yn2) objPrevious;
        }
        this.c = null;
        if (yn2Var != null) {
            yn2Var.b();
        } else {
            this.a.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        bo2 bo2Var = bo2.a;
        if (z && !this.f) {
            bo2Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            bo2Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        boolean z2 = false;
        kl klVar = this.b;
        if (klVar == null || !klVar.isEmpty()) {
            Iterator<E> it = klVar.iterator();
            while (it.hasNext()) {
                if (((yn2) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }
}
