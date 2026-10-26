package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class y41 implements Runnable, Comparable, yw0 {
    private volatile Object _heap;
    public long c;
    public int d = -1;

    public y41(long j) {
        this.c = j;
    }

    public final int a(long j, z41 z41Var, a51 a51Var) {
        synchronized (this) {
            if (this._heap == gb2.b) {
                return 2;
            }
            synchronized (z41Var) {
                try {
                    y41[] y41VarArr = z41Var.a;
                    y41 y41Var = y41VarArr != null ? y41VarArr[0] : null;
                    if (a51.o.get(a51Var) == 1) {
                        return 1;
                    }
                    if (y41Var == null) {
                        z41Var.c = j;
                    } else {
                        long j2 = y41Var.c;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - z41Var.c > 0) {
                            z41Var.c = j;
                        }
                    }
                    long j3 = this.c;
                    long j4 = z41Var.c;
                    if (j3 - j4 < 0) {
                        this.c = j4;
                    }
                    z41Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(z41 z41Var) {
        if (this._heap != gb2.b) {
            this._heap = z41Var;
        } else {
            u41.k("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.c - ((y41) obj).c;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.yw0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                d5 d5Var = gb2.b;
                if (obj == d5Var) {
                    return;
                }
                z41 z41Var = obj instanceof z41 ? (z41) obj : null;
                if (z41Var != null) {
                    synchronized (z41Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof k04 ? (k04) obj2 : null) != null) {
                            z41Var.b(this.d);
                        }
                    }
                }
                this._heap = d5Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.c + ']';
    }
}
