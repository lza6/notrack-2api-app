package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class dt3 {
    public final et3 a;
    public final String b;
    public boolean c;
    public ss3 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public dt3(et3 et3Var, String str) {
        this.a = et3Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = ka4.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        ss3 ss3Var = this.d;
        if (ss3Var != null && ss3Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ss3) arrayList.get(size)).b) {
                ss3 ss3Var2 = (ss3) arrayList.get(size);
                et3 et3Var = et3.h;
                if (et3.i.isLoggable(Level.FINE)) {
                    av1.c(ss3Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(ss3 ss3Var, long j) {
        ss3Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(ss3Var, j, false)) {
                    this.a.d(this);
                }
            } else if (ss3Var.b) {
                et3 et3Var = et3.h;
                if (et3.i.isLoggable(Level.FINE)) {
                    av1.c(ss3Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                et3 et3Var2 = et3.h;
                if (et3.i.isLoggable(Level.FINE)) {
                    av1.c(ss3Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:0: B:23:0x0067->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007d A[EDGE_INSN: B:39:0x007d->B:29:0x007d BREAK  A[LOOP:0: B:23:0x0067->B:27:0x0079], SYNTHETIC] */
    public final boolean d(ss3 ss3Var, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        ss3Var.getClass();
        dt3 dt3Var = ss3Var.c;
        if (dt3Var != this) {
            if (dt3Var != null) {
                u41.r("task is in multiple queues");
                return false;
            }
            ss3Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(ss3Var);
        if (iIndexOf == -1) {
            ss3Var.d = j2;
            et3 et3Var = et3.h;
            if (et3.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(av1.u(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(av1.u(j2 - jNanoTime));
                }
                av1.c(ss3Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((ss3) obj).d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ss3Var);
            if (size2 == 0) {
                return true;
            }
        } else if (ss3Var.d <= j2) {
            et3 et3Var2 = et3.h;
            if (et3.i.isLoggable(Level.FINE)) {
                av1.c(ss3Var, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            ss3Var.d = j2;
            et3 et3Var3 = et3.h;
            if (et3.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(av1.u(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(av1.u(j2 - jNanoTime));
                }
                av1.c(ss3Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((ss3) obj).d - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ss3Var);
            if (size2 == 0) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        byte[] bArr = ka4.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
