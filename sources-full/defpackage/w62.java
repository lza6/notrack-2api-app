package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w62 {
    public final in2 c;
    public boolean d;
    public int h = -1;
    public final /* synthetic */ ih2 l;

    public w62(ih2 ih2Var, in2 in2Var) {
        this.l = ih2Var;
        this.c = in2Var;
    }

    public final void a(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        int i = z ? 1 : -1;
        ih2 ih2Var = this.l;
        int i2 = ih2Var.c;
        ih2Var.c = i + i2;
        if (!ih2Var.d) {
            ih2Var.d = true;
            while (true) {
                try {
                    int i3 = ih2Var.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    ih2Var.d = false;
                    throw th;
                }
            }
            ih2Var.d = false;
        }
        if (this.d) {
            ih2Var.c(this);
        }
    }

    public void b() {
    }

    public boolean c(xc1 xc1Var) {
        return false;
    }

    public abstract boolean d();
}
