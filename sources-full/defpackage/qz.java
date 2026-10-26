package defpackage;

import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class qz extends of2 implements jn2, qy, rz0 {
    public final rz c;
    public boolean d;
    public le1 h;

    public qz(rz rzVar, le1 le1Var) {
        this.c = rzVar;
        this.h = le1Var;
        rzVar.c = this;
    }

    @Override // defpackage.jn2
    public final void F() {
        v0();
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        boolean z = this.d;
        rz rzVar = this.c;
        if (!z) {
            rzVar.d = null;
            p23.M(this, new c9(this, 7, rzVar));
            if (rzVar.d == null) {
                throw fq2.i("DrawResult not defined, did you forget to call onDraw?");
            }
            this.d = true;
        }
        sz0 sz0Var = rzVar.d;
        sz0Var.getClass();
        ((le1) sz0Var.c).invoke(wx1Var);
    }

    @Override // defpackage.qy
    public final long b() {
        return y64.W(y64.K(this, Uuid.SIZE_BITS).h);
    }

    @Override // defpackage.qy
    public final wu0 getDensity() {
        return y64.M(this).G;
    }

    @Override // defpackage.qy
    public final dx1 getLayoutDirection() {
        return y64.M(this).H;
    }

    @Override // defpackage.rz0
    public final void o0() {
        v0();
    }

    @Override // defpackage.iu0
    public final void onDensityChange() {
        v0();
    }

    @Override // defpackage.iu0
    public final void onLayoutDirectionChange() {
        v0();
    }

    public final void v0() {
        this.d = false;
        this.c.d = null;
        kr1.O(this);
    }
}
