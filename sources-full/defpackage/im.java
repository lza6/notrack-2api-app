package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class im implements Runnable {
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ im(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public im(bk4 bk4Var, kn4 kn4Var) {
        this.c = 17;
        this.d = kn4Var;
    }

    public ig3 a() throws IOException {
        wr1 wr1Var = (wr1) this.d;
        ig3 ig3Var = new ig3();
        Cursor cursorM = wr1Var.a.m(new d5("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 14));
        while (cursorM.moveToNext()) {
            try {
                ig3Var.add(Integer.valueOf(cursorM.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    jr1.i(cursorM, th);
                    throw th2;
                }
            }
        }
        cursorM.close();
        ig3 ig3VarP = py.p(ig3Var);
        if (ig3VarP.c.isEmpty()) {
            return ig3VarP;
        }
        if (((wr1) this.d).h == null) {
            u41.r("Required value was null.");
            return null;
        }
        he1 he1Var = ((wr1) this.d).h;
        if (he1Var != null) {
            he1Var.a();
            return ig3VarP;
        }
        u41.k("Required value was null.");
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setA;
        Object obj;
        ss3 ss3VarC;
        long jNanoTime;
        g3 g3Var;
        mo4 mo4Var;
        on4 on4Var;
        switch (this.c) {
            case 0:
                TextView textView = (TextView) this.d;
                textView.setText(textView.getText());
                return;
            case 1:
                l62 l62Var = (l62) this.d;
                p01 p01Var = l62Var.h;
                eo eoVar = l62Var.c;
                if (l62Var.w) {
                    if (l62Var.u) {
                        l62Var.u = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        eoVar.e = jCurrentAnimationTimeMillis;
                        eoVar.g = -1L;
                        eoVar.f = jCurrentAnimationTimeMillis;
                        eoVar.h = 0.5f;
                    }
                    if ((eoVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > eoVar.g + ((long) eoVar.i)) || !l62Var.e()) {
                        l62Var.w = false;
                        return;
                    }
                    if (l62Var.v) {
                        l62Var.v = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        p01Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (eoVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = eoVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - eoVar.f;
                    eoVar.f = jCurrentAnimationTimeMillis2;
                    l62Var.y.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * eoVar.d));
                    WeakHashMap weakHashMap = zc4.a;
                    p01Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                sv0 sv0Var = (sv0) this.d;
                sv0Var.f0.onDismiss(sv0Var.n0);
                return;
            case 3:
                p01 p01Var2 = (p01) this.d;
                p01Var2.t = null;
                p01Var2.drawableStateChanged();
                return;
            case 4:
                k71 k71Var = (k71) this.d;
                Context contextJ = k71Var.j();
                if (contextJ == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    k71Var.u0.h(1);
                    k71Var.u0.g(contextJ.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 5:
                xc1 xc1Var = (xc1) this.d;
                if (xc1Var.Q != null) {
                    xc1Var.f().getClass();
                    return;
                }
                return;
            case 6:
                ((nd1) this.d).A(true);
                return;
            case 7:
                ReentrantReadWriteLock.ReadLock lock = ((wr1) this.d).a.h.readLock();
                lock.getClass();
                lock.lock();
                try {
                    try {
                        if (((wr1) this.d).a() && ((wr1) this.d).f.compareAndSet(true, false) && !((wr1) this.d).a.h().J().A()) {
                            be1 be1VarJ = ((wr1) this.d).a.h().J();
                            be1VarJ.c();
                            try {
                                setA = a();
                                be1VarJ.O();
                                be1VarJ.l();
                                lock.unlock();
                                if (setA.isEmpty()) {
                                    return;
                                }
                                wr1 wr1Var = (wr1) this.d;
                                synchronized (wr1Var.j) {
                                    Iterator it = wr1Var.j.iterator();
                                    while (true) {
                                        t83 t83Var = (t83) it;
                                        if (t83Var.hasNext()) {
                                            ((vr1) ((Map.Entry) t83Var.next()).getValue()).a(setA);
                                        }
                                    }
                                }
                                return;
                            } catch (Throwable th) {
                                be1VarJ.l();
                                throw th;
                            }
                        }
                        lock.unlock();
                        return;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (SQLiteException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    setA = f31.c;
                } catch (IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    setA = f31.c;
                }
                break;
            case 8:
                synchronized (((ih2) this.d).a) {
                    obj = ((ih2) this.d).f;
                    ((ih2) this.d).f = ih2.k;
                    break;
                }
                ((ih2) this.d).f(obj);
                return;
            case 9:
                try {
                    ((Runnable) this.d).run();
                    return;
                } catch (Exception e3) {
                    xr0.U("Executor", "Background execution failure.", e3);
                    return;
                }
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.d;
                if (searchView$SearchAutoComplete.n) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.n = false;
                    return;
                }
                return;
            case 11:
                TextView textView2 = (TextView) ((bv0) this.d).h;
                textView2.setText(textView2.getText());
                return;
            case 12:
                break;
            case 13:
                ActionMenuView actionMenuView = ((Toolbar) this.d).c;
                if (actionMenuView == null || (g3Var = actionMenuView.B) == null) {
                    return;
                }
                g3Var.l();
                return;
            case 14:
                ((ek4) this.d).h();
                return;
            case 15:
                mg mgVar = ((ek4) ((sk3) this.d).d).e;
                mgVar.d(mgVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 16:
                ((ok4) this.d).k.a(new ml0(4, null, null));
                return;
            case 17:
                throw null;
            case 18:
                rm4 rm4Var = (rm4) this.d;
                au auVar = rm4Var.d;
                auVar.v(0);
                fu fuVar = jo4.i;
                auVar.u(24, fuVar);
                rm4Var.d(fuVar);
                return;
            default:
                oo4 oo4Var = (oo4) this.d;
                if (oo4Var == null || (mo4Var = oo4Var.p) == null) {
                    return;
                }
                this.d = null;
                if (mo4Var.isDone()) {
                    Object obj2 = oo4Var.c;
                    if (obj2 == null) {
                        if (mo4Var.isDone()) {
                            if (un4.o.g(oo4Var, null, oo4.h(mo4Var))) {
                                oo4.j(oo4Var);
                                return;
                            }
                            return;
                        }
                        mn4 mn4Var = new mn4(oo4Var, mo4Var);
                        if (un4.o.g(oo4Var, null, mn4Var)) {
                            try {
                                mo4Var.b(mn4Var, eo4.c);
                                return;
                            } catch (Throwable th3) {
                                try {
                                    on4Var = new on4(th3);
                                    break;
                                } catch (Error | Exception unused) {
                                    on4Var = on4.b;
                                }
                                un4.o.g(oo4Var, mn4Var, on4Var);
                                return;
                            }
                        }
                        obj2 = oo4Var.c;
                    }
                    if (obj2 instanceof ln4) {
                        mo4Var.cancel(((ln4) obj2).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = oo4Var.q;
                    oo4Var.q = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th4) {
                            if (un4.o.g(oo4Var, null, new on4(new no4(str)))) {
                                oo4.j(oo4Var);
                            }
                            throw th4;
                        }
                    }
                    if (un4.o.g(oo4Var, null, new on4(new no4(str + ": " + mo4Var.toString())))) {
                        oo4.j(oo4Var);
                    }
                    mo4Var.cancel(true);
                    return;
                } catch (Throwable th5) {
                    mo4Var.cancel(true);
                    throw th5;
                }
        }
        while (true) {
            et3 et3Var = (et3) this.d;
            synchronized (et3Var) {
                ss3VarC = et3Var.c();
            }
            if (ss3VarC == null) {
                return;
            }
            dt3 dt3Var = ss3VarC.c;
            dt3Var.getClass();
            et3 et3Var2 = (et3) this.d;
            boolean zIsLoggable = et3.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                av1.c(ss3VarC, dt3Var, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                et3.a(et3Var2, ss3VarC);
                if (zIsLoggable) {
                    av1.c(ss3VarC, dt3Var, "finished run in ".concat(av1.u(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th6) {
                try {
                    ((ThreadPoolExecutor) et3Var2.a.d).execute(this);
                    throw th6;
                } catch (Throwable th7) {
                    if (zIsLoggable) {
                        av1.c(ss3VarC, dt3Var, "failed a run in ".concat(av1.u(System.nanoTime() - jNanoTime)));
                    }
                    throw th7;
                }
            }
        }
    }
}
