package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class vg2 {
    public final long a;
    public final rd3 b;
    public final rd3 c;
    public xy3 e;
    public final vg2 d = this;
    public int f = -1;

    public vg2(long j, rd3 rd3Var, rd3 rd3Var2) {
        this.a = j;
        this.b = rd3Var;
        this.c = rd3Var2;
    }

    public final long a(fd3 fd3Var, boolean z) {
        xy3 xy3Var;
        ed3 ed3Var = fd3Var.b;
        ed3 ed3Var2 = fd3Var.a;
        long j = this.a;
        if (z && ed3Var2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && ed3Var.c != j) || c() == null || (xy3Var = (xy3) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return y64.C(xy3Var, py.x(z ? ed3Var2.b : ed3Var.b, 0, b(xy3Var)), z, fd3Var.c);
    }

    public final int b(xy3 xy3Var) {
        int i;
        synchronized (this.d) {
            try {
                if (this.e != xy3Var) {
                    pg2 pg2Var = xy3Var.b;
                    boolean z = pg2Var.c;
                    int i2 = 0;
                    if (!(z || ((float) ((int) (xy3Var.c & 4294967295L))) < pg2Var.e) || z) {
                        i2 = pg2Var.f - 1;
                    } else {
                        int iE = pg2Var.e((int) (xy3Var.c & 4294967295L));
                        int i3 = xy3Var.b.f - 1;
                        if (iE > i3) {
                            iE = i3;
                        }
                        while (iE >= 0 && xy3Var.b.f(iE) >= ((int) (xy3Var.c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i2 = iE;
                        }
                    }
                    this.f = xy3Var.b.c(i2, true);
                    this.e = xy3Var;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final cx1 c() {
        cx1 cx1Var = (cx1) this.b.invoke();
        if (cx1Var == null || !cx1Var.z()) {
            return null;
        }
        return cx1Var;
    }

    public final hg d() {
        xy3 xy3Var = (xy3) this.c.invoke();
        return xy3Var == null ? new hg(BuildConfig.VERSION_NAME) : xy3Var.a.a;
    }
}
