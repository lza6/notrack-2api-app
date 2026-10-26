package defpackage;

import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sd {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public sd() {
        this.b = new Object();
        this.c = new cr1();
    }

    public sd(je1 je1Var, boolean z) {
        this.a = z;
        this.b = je1Var;
        this.c = kr1.a(0.0f);
        this.d = new ArrayList();
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        y23 y23Var = (y23) this.b;
        if (iOException != null) {
            h(iOException);
        }
        return y23Var.i(this, z2, z, iOException);
    }

    public void b(wx1 wx1Var, float f, long j) {
        a10 a10Var = wx1Var.c;
        float fFloatValue = ((Number) ((ue) this.c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = re0.b(fFloatValue, j);
            if (!this.a) {
                tz0.K(wx1Var, jB, f, 0L, null, 124);
                return;
            }
            float fD = bi3.d(a10Var.b());
            float fB = bi3.b(a10Var.b());
            ci4 ci4Var = a10Var.d;
            long jC = ci4Var.C();
            ci4Var.y().l();
            try {
                ((jb) ci4Var.d).u(0.0f, 0.0f, fD, fB, 1);
                tz0.K(wx1Var, jB, f, 0L, null, 124);
            } finally {
                fq2.x(ci4Var, jC);
            }
        }
    }

    public Object c() {
        Object obj;
        synchronized (this.b) {
            try {
                if (!this.a) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                Exception exc = (Exception) this.e;
                if (exc != null) {
                    throw new eg0(exc);
                }
                obj = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void d(tq1 tq1Var, gq0 gq0Var) {
        sd sdVar;
        float f;
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = tq1Var instanceof xi1;
        if (z) {
            arrayList.add(tq1Var);
        } else if (tq1Var instanceof yi1) {
            arrayList.remove(((yi1) tq1Var).a);
        } else if (tq1Var instanceof ja1) {
            arrayList.add(tq1Var);
        } else if (tq1Var instanceof ka1) {
            arrayList.remove(((ka1) tq1Var).a);
        } else if (tq1Var instanceof dz0) {
            arrayList.add(tq1Var);
        } else if (tq1Var instanceof ez0) {
            arrayList.remove(((ez0) tq1Var).a);
        } else if (!(tq1Var instanceof cz0)) {
            return;
        } else {
            arrayList.remove(((cz0) tq1Var).a);
        }
        tq1 tq1Var2 = (tq1) ke0.F0(arrayList);
        if (kr1.n((tq1) this.e, tq1Var2)) {
            return;
        }
        so0 so0Var = null;
        if (tq1Var2 != null) {
            w63 w63Var = (w63) ((je1) this.b).invoke();
            if (z) {
                f = w63Var.c;
            } else if (tq1Var instanceof ja1) {
                f = w63Var.b;
            } else {
                f = tq1Var instanceof dz0 ? w63Var.a : 0.0f;
            }
            float f2 = f;
            t64 t64Var = h73.a;
            if (!(tq1Var2 instanceof xi1) && ((tq1Var2 instanceof ja1) || (tq1Var2 instanceof dz0))) {
                t64Var = new t64(45, c11.d, 2);
            }
            sdVar = this;
            py.F(gq0Var, null, null, new u90(sdVar, f2, t64Var, so0Var, 1), 3);
        } else {
            sdVar = this;
            tq1 tq1Var3 = (tq1) sdVar.e;
            t64 t64Var2 = h73.a;
            if (!(tq1Var3 instanceof xi1) && !(tq1Var3 instanceof ja1) && (tq1Var3 instanceof dz0)) {
                t64Var2 = new t64(150, c11.d, 2);
            }
            py.F(gq0Var, null, null, new hl3(sdVar, t64Var2, so0Var, 1), 3);
        }
        sdVar.e = tq1Var2;
    }

    public boolean e() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.a && ((Exception) this.e) == null) {
                z = true;
            }
        }
        return z;
    }

    public e63 f(boolean z) throws IOException {
        try {
            e63 e63VarG = ((e51) this.d).g(z);
            if (e63VarG == null) {
                return e63VarG;
            }
            e63VarG.m = this;
            return e63VarG;
        } catch (IOException e) {
            h(e);
            throw e;
        }
    }

    public synchronized void g() {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((qd) this.c).b(context);
                context.unregisterComponentCallbacks((rd) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void h(IOException iOException) {
        this.a = true;
        ((f51) this.c).b(iOException);
        a33 a33VarH = ((e51) this.d).h();
        y23 y23Var = (y23) this.b;
        synchronized (a33VarH) {
            try {
                if (!(iOException instanceof bo3)) {
                    if (!(a33VarH.g != null) || (iOException instanceof nl0)) {
                        a33VarH.j = true;
                        if (a33VarH.m == 0) {
                            a33.d(y23Var.c, a33VarH.b, iOException);
                            a33VarH.l++;
                        }
                    }
                } else if (((bo3) iOException).c == 8) {
                    int i = a33VarH.n + 1;
                    a33VarH.n = i;
                    if (i > 1) {
                        a33VarH.j = true;
                        a33VarH.l++;
                    }
                } else if (((bo3) iOException).c != 9 || !y23Var.u) {
                    a33VarH.j = true;
                    a33VarH.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        boolean z;
        Exception exc;
        String strConcat;
        if (this.a) {
            synchronized (this.b) {
                z = this.a;
            }
            if (!z) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.b) {
                exc = (Exception) this.e;
            }
            if (exc == null) {
                strConcat = e() ? "result ".concat(String.valueOf(c())) : "unknown issue";
            } else {
                strConcat = "failure";
            }
        }
    }

    public void j() {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((cr1) this.c).h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
