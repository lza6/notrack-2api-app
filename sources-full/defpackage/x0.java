package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public int c;
    public int d = -1;
    public Serializable h;
    public Object l;

    public x0(String str, int i, Map map) {
        this.h = str;
        this.c = i;
        this.l = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, y0[]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, y0[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [y0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public y0 d() {
        ?? r0;
        ?? r2;
        mp3 mp3Var;
        synchronized (this) {
            try {
                y0[] y0VarArr = (y0[]) this.h;
                if (y0VarArr == null) {
                    ?? H = h();
                    this.h = H;
                    r0 = H;
                } else if (this.c >= y0VarArr.length) {
                    r0 = y0VarArr;
                    Object[] objArrCopyOf = Arrays.copyOf(y0VarArr, y0VarArr.length * 2);
                    this.h = (y0[]) objArrCopyOf;
                    r0 = (y0[]) objArrCopyOf;
                }
                r0 = y0VarArr;
                int i = this.d;
                do {
                    ?? r3 = r0[i];
                    r2 = r3;
                    if (r3 == 0) {
                        y0 y0VarG = g();
                        r0[i] = y0VarG;
                        r2 = y0VarG;
                    }
                    i++;
                    if (i >= r0.length) {
                        i = 0;
                    }
                } while (!r2.a(this));
                this.d = i;
                this.c++;
                mp3Var = (mp3) this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mp3Var != null) {
            mp3Var.A(1);
        }
        return r2;
    }

    public Map e() {
        return (Map) this.l;
    }

    public abstract y0 g();

    public abstract y0[] h();

    public void i(y0 y0Var) {
        mp3 mp3Var;
        int i;
        so0[] so0VarArrB;
        synchronized (this) {
            try {
                int i2 = this.c - 1;
                this.c = i2;
                mp3Var = (mp3) this.l;
                if (i2 == 0) {
                    this.d = 0;
                }
                y0Var.getClass();
                so0VarArrB = y0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (so0 so0Var : so0VarArrB) {
            if (so0Var != null) {
                so0Var.resumeWith(w84.a);
            }
        }
        if (mp3Var != null) {
            mp3Var.A(-1);
        }
    }

    public abstract rj1 j();

    public mp3 k() {
        mp3 mp3Var;
        synchronized (this) {
            mp3Var = (mp3) this.l;
            if (mp3Var == null) {
                int i = this.c;
                mp3Var = new mp3(1, IntCompanionObject.MAX_VALUE, fy.d);
                mp3Var.f(Integer.valueOf(i));
                this.l = mp3Var;
            }
        }
        return mp3Var;
    }

    public abstract boolean l();

    public boolean m() {
        return this.d > -1;
    }
}
