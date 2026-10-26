package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends zp0 implements du0 {
    public final Handler c;
    public final String d;
    public final boolean h;
    public final eh1 l;

    public eh1(Handler handler) {
        this(handler, null, false);
    }

    public eh1(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.h = z;
        this.l = z ? this : new eh1(handler, str, true);
    }

    public final void Q(xp0 xp0Var, Runnable runnable) {
        yo4.k(xp0Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        jt0 jt0Var = sw0.a;
        at0.c.dispatch(xp0Var, runnable);
    }

    @Override // defpackage.zp0
    public final void dispatch(xp0 xp0Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        Q(xp0Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eh1)) {
            return false;
        }
        eh1 eh1Var = (eh1) obj;
        return eh1Var.c == this.c && eh1Var.h == this.h;
    }

    @Override // defpackage.du0
    public final yw0 h(long j, final w04 w04Var, xp0 xp0Var) {
        if (j > DurationKt.MAX_MILLIS) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(w04Var, j)) {
            return new yw0() { // from class: dh1
                @Override // defpackage.yw0
                public final void dispose() {
                    this.c.c.removeCallbacks(w04Var);
                }
            };
        }
        Q(xp0Var, w04Var);
        return dm2.c;
    }

    public final int hashCode() {
        return (this.h ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.zp0
    public final boolean isDispatchNeeded(xp0 xp0Var) {
        return (this.h && kr1.n(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // defpackage.du0
    public final void l(long j, t00 t00Var) {
        ba baVar = new ba(t00Var, 7, this);
        if (j > DurationKt.MAX_MILLIS) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(baVar, j)) {
            t00Var.w(new aq(this, 9, baVar));
        } else {
            Q(t00Var.m, baVar);
        }
    }

    @Override // defpackage.zp0
    public final zp0 limitedParallelism(int i, String str) {
        y64.o(i);
        return str != null ? new aj2(this, str) : this;
    }

    @Override // defpackage.zp0
    public final String toString() {
        eh1 eh1Var;
        String str;
        jt0 jt0Var = sw0.a;
        eh1 eh1Var2 = i92.a;
        if (this == eh1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                eh1Var = eh1Var2.l;
            } catch (UnsupportedOperationException unused) {
                eh1Var = null;
            }
            str = this == eh1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.h ? ud2.p(string, ".immediate") : string;
    }
}
