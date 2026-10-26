package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rd implements ComponentCallbacks2 {
    public final /* synthetic */ sd c;

    public rd(sd sdVar) {
        this.c = sdVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        sd sdVar = this.c;
        synchronized (sdVar) {
            if (((g33) ((WeakReference) sdVar.b).get()) == null) {
                sdVar.g();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        k33 k33VarC;
        long jF;
        sd sdVar = this.c;
        synchronized (sdVar) {
            try {
                g33 g33Var = (g33) ((WeakReference) sdVar.b).get();
                if (g33Var != null) {
                    d33 d33Var = g33Var.a;
                    if (i >= 40) {
                        k33 k33VarC2 = g33Var.c();
                        if (k33VarC2 != null) {
                            synchronized (k33VarC2.c) {
                                ((p33) k33VarC2.a.c).l(-1L);
                                kn4 kn4Var = k33VarC2.b;
                                kn4Var.b = 0;
                                ((LinkedHashMap) kn4Var.c).clear();
                            }
                        }
                    } else if (i >= 20) {
                        ((qd) sdVar.c).a(d33Var.a);
                    } else if (i >= 10 && (k33VarC = g33Var.c()) != null) {
                        synchronized (k33VarC.c) {
                            jF = ((p33) k33VarC.a.c).f();
                        }
                        long j = jF / 2;
                        synchronized (k33VarC.c) {
                            ((p33) k33VarC.a.c).l(j);
                        }
                    }
                } else {
                    sdVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
