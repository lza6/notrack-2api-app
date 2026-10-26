package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class io4 implements Runnable {
    public final /* synthetic */ int c;
    public Object d;
    public final Object h;

    public /* synthetic */ io4(int i, Object obj, Object obj2, boolean z) {
        this.c = i;
        this.h = obj;
        this.d = obj2;
    }

    public /* synthetic */ io4(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    private final void a() {
        hi4 hi4Var;
        tz2 tz2Var = ((fr3) this.h).c.f;
        String str = (String) this.d;
        synchronized (tz2Var.k) {
            try {
                aj4 aj4VarC = tz2Var.c(str);
                hi4Var = aj4VarC != null ? aj4VarC.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hi4Var == null || !hi4Var.c()) {
            return;
        }
        synchronized (((fr3) this.h).h) {
            ((fr3) this.h).n.put(ki4.a(hi4Var), hi4Var);
            fr3 fr3Var = (fr3) this.h;
            ((fr3) this.h).o.put(ki4.a(hi4Var), ph4.a(fr3Var.p, hi4Var, fr3Var.d.b, fr3Var));
        }
    }

    private final void b() {
        synchronized (((uq4) this.h).c) {
            ((io2) ((uq4) this.h).d).a((sd) this.d);
        }
    }

    private final void c() {
        Exception exc;
        synchronized (((vr4) this.h).b) {
            sd sdVar = (sd) this.d;
            synchronized (sdVar.b) {
                exc = (Exception) sdVar.e;
            }
            g13.s(exc);
            Log.w("PlayUpdateGate", "appUpdateInfo check failed", exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thD;
        fc2 fc2Var;
        wk1 wk1Var;
        wk1 zs4Var;
        int i = 0;
        switch (this.c) {
            case 0:
                iy2 iy2Var = (iy2) this.h;
                mo4 mo4Var = (mo4) this.d;
                if ((mo4Var instanceof un4) && (thD = ((un4) mo4Var).d()) != null) {
                    iy2Var.r(thD);
                    return;
                }
                try {
                    if (!mo4Var.isDone()) {
                        throw new IllegalStateException(wd4.b("Future was expected to be done: %s", mo4Var));
                    }
                    while (true) {
                        try {
                            Object obj = mo4Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            fo4 fo4Var = (fo4) iy2Var.l;
                            if (iIntValue <= 0) {
                                ((hm0) iy2Var.h).run();
                                return;
                            }
                            int iIntValue2 = num.intValue();
                            fo4Var.getClass();
                            fu fuVarA = jo4.a(iIntValue2, "Billing override value was set by a license tester.");
                            fo4Var.E(93, 7, fuVarA);
                            ((wb1) iy2Var.d).accept(fuVarA);
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    iy2Var.r(e.getCause());
                    return;
                } catch (Throwable th2) {
                    iy2Var.r(th2);
                    return;
                }
                break;
            case 1:
                d3 d3Var = (d3) this.d;
                g3 g3Var = (g3) this.h;
                hc2 hc2Var = g3Var.h;
                if (hc2Var != null && (fc2Var = hc2Var.e) != null) {
                    fc2Var.l(hc2Var);
                }
                View view = (View) g3Var.p;
                if (view != null && view.getWindowToken() != null) {
                    if (d3Var.b()) {
                        g3Var.A = d3Var;
                    } else if (d3Var.e != null) {
                        d3Var.d(0, 0, false, false);
                        g3Var.A = d3Var;
                    }
                }
                g3Var.C = null;
                return;
            case 2:
                ((n3) this.d).c = this.h;
                return;
            case 3:
                ((Application) this.d).unregisterActivityLifecycleCallbacks((n3) this.h);
                return;
            case 4:
                Object obj2 = this.h;
                Object obj3 = this.d;
                try {
                    Method method = o3.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        o3.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 5:
                ((hm) this.h).invalidateDrawable((Drawable) this.d);
                return;
            case 6:
                sk3 sk3Var = (sk3) this.d;
                Typeface typeface = (Typeface) this.h;
                bk bkVar = (bk) sk3Var.d;
                if (bkVar != null) {
                    bkVar.p(typeface);
                    return;
                }
                return;
            case 7:
                v72 v72VarF = v72.f();
                String str = hu0.e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                hi4 hi4Var = (hi4) this.d;
                sb.append(hi4Var.a);
                v72VarF.c(str, sb.toString());
                ((hu0) this.h).a.c(hi4Var);
                return;
            case 8:
                break;
            case 9:
                ((wb1) this.d).accept(this.h);
                return;
            case 10:
                ((t00) this.h).E((k51) this.d);
                return;
            case 11:
                try {
                    ((Runnable) this.h).run();
                    synchronized (((wf3) this.d).m) {
                        ((wf3) this.d).a();
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    synchronized (((wf3) this.d).m) {
                        ((wf3) this.d).a();
                        throw th4;
                    }
                }
            case 12:
                a();
                return;
            case 13:
                ml0 ml0Var = (ml0) this.d;
                gk4 gk4Var = (gk4) this.h;
                mg mgVar = gk4Var.c;
                ek4 ek4Var = (ek4) gk4Var.n.j.get(gk4Var.d);
                if (ek4Var == null) {
                    return;
                }
                if (ml0Var.d != 0) {
                    ek4Var.o(ml0Var, null);
                    return;
                }
                gk4Var.m = true;
                if (mgVar.k()) {
                    if (!gk4Var.m || (wk1Var = gk4Var.h) == null) {
                        return;
                    }
                    mgVar.l(wk1Var, gk4Var.l);
                    return;
                }
                try {
                    mgVar.l(null, mgVar.c());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    mgVar.d("Failed to get service from broker.");
                    ek4Var.o(new ml0(10, null, null), null);
                    return;
                }
            case 14:
                ok4 ok4Var = (ok4) this.h;
                zk4 zk4Var = (zk4) this.d;
                ml0 ml0Var2 = zk4Var.d;
                if (ml0Var2.d == 0) {
                    fl4 fl4Var = zk4Var.h;
                    g13.s(fl4Var);
                    ml0 ml0Var3 = fl4Var.h;
                    if (ml0Var3.d != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ml0Var3)), new Exception());
                        ok4Var.k.a(ml0Var3);
                        ok4Var.j.n();
                        return;
                    }
                    gk4 gk4Var2 = ok4Var.k;
                    IBinder iBinder = fl4Var.d;
                    if (iBinder == null) {
                        zs4Var = null;
                    } else {
                        int i2 = e2.e;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        zs4Var = iInterfaceQueryLocalInterface instanceof wk1 ? (wk1) iInterfaceQueryLocalInterface : new zs4(iBinder);
                    }
                    Set set = ok4Var.h;
                    gk4Var2.getClass();
                    if (zs4Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        gk4Var2.a(new ml0(4, null, null));
                    } else {
                        gk4Var2.h = zs4Var;
                        gk4Var2.l = set;
                        if (gk4Var2.m) {
                            gk4Var2.c.l(zs4Var, set);
                        }
                    }
                } else {
                    ok4Var.k.a(ml0Var2);
                }
                ok4Var.j.n();
                return;
            case 15:
                au auVar = (au) this.d;
                bu buVar = (bu) this.h;
                fu fuVar = jo4.i;
                auVar.o(24, 9, fuVar);
                pm4 pm4Var = xm4.d;
                buVar.a(fuVar, cn4.m);
                return;
            case 16:
                au auVar2 = (au) this.d;
                fu fuVar2 = (fu) this.h;
                tw2 tw2Var = auVar2.f.b;
                ft4 ft4Var = auVar2.f;
                if (tw2Var != null) {
                    ft4Var.b.d(fuVar2, null);
                    return;
                } else {
                    tm4.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 17:
                Future future = (Future) this.d;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.h;
                future.cancel(true);
                tm4.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 18:
                au auVar3 = (au) this.d;
                bu buVar2 = (bu) this.h;
                fu fuVar3 = jo4.i;
                auVar3.o(24, 7, fuVar3);
                pm4 pm4Var2 = xm4.d;
                cn4 cn4Var = cn4.m;
                ag0 ag0Var = buVar2.a;
                fuVar3.getClass();
                ag0Var.M(new b03(fuVar3, cn4Var));
                return;
            case 19:
                b();
                return;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                c();
                return;
            default:
                synchronized (((uq4) this.h).c) {
                    f4 f4Var = (f4) ((uq4) this.h).d;
                    Object objC = ((sd) this.d).c();
                    switch (f4Var.c) {
                        case 5:
                            ((jq) f4Var.d).invoke(objC);
                            break;
                        default:
                            ((s) f4Var.d).invoke(objC);
                            break;
                    }
                    break;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.d).run();
            } catch (Throwable th5) {
                gm4.E(x21.c, th5);
            }
            try {
                Runnable runnableQ = ((w32) this.h).Q();
                if (runnableQ == null) {
                    return;
                }
                this.d = runnableQ;
                i++;
                if (i >= 16) {
                    w32 w32Var = (w32) this.h;
                    if (xp1.D(w32Var.d, w32Var)) {
                        w32 w32Var2 = (w32) this.h;
                        xp1.C(w32Var2.d, w32Var2, this);
                        return;
                    }
                }
            } catch (Throwable th6) {
                w32 w32Var3 = (w32) this.h;
                synchronized (w32Var3.n) {
                    w32.o.decrementAndGet(w32Var3);
                    throw th6;
                }
            }
        }
    }

    public String toString() {
        switch (this.c) {
            case 0:
                iy2 iy2Var = new iy2(io4.class.getSimpleName());
                iy2 iy2Var2 = (iy2) this.h;
                fp1 fp1Var = new fp1();
                ((fp1) iy2Var.l).d = fp1Var;
                iy2Var.l = fp1Var;
                fp1Var.c = iy2Var2;
                return iy2Var.toString();
            default:
                return super.toString();
        }
    }
}
