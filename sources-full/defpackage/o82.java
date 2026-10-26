package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o82 extends m82 implements qb2 {
    public final wl2 t;
    public LinkedHashMap v;
    public wb2 x;
    public final rh2 y;
    public long u = 0;
    public final p82 w = new p82(this);

    public o82(wl2 wl2Var) {
        this.t = wl2Var;
        rh2 rh2Var = cn2.a;
        this.y = new rh2();
    }

    public static final void D0(o82 o82Var, wb2 wb2Var) {
        w84 w84Var;
        LinkedHashMap linkedHashMap;
        if (wb2Var != null) {
            o82Var.l0((((long) wb2Var.getHeight()) & 4294967295L) | (((long) wb2Var.getWidth()) << 32));
            w84Var = w84.a;
        } else {
            w84Var = null;
        }
        if (w84Var == null) {
            o82Var.l0(0L);
        }
        if (!kr1.n(o82Var.x, wb2Var) && wb2Var != null && ((((linkedHashMap = o82Var.v) != null && !linkedHashMap.isEmpty()) || !wb2Var.a().isEmpty()) && !kr1.n(wb2Var.a(), o82Var.v))) {
            s82 s82Var = o82Var.t.t.O.q;
            s82Var.getClass();
            s82Var.z.f();
            LinkedHashMap linkedHashMap2 = o82Var.v;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o82Var.v = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(wb2Var.a());
        }
        o82Var.x = wb2Var;
    }

    @Override // defpackage.m82
    public final long A0() {
        return this.u;
    }

    @Override // defpackage.m82
    public final void C0() {
        i0(this.u, 0.0f, null);
    }

    public void E0() {
        y0().b();
    }

    public final void F0(long j) {
        if (!iq1.a(this.u, j)) {
            this.u = j;
            wl2 wl2Var = this.t;
            s82 s82Var = wl2Var.t.O.q;
            if (s82Var != null) {
                s82Var.p0();
            }
            m82.B0(wl2Var);
        }
        if (this.p) {
            return;
        }
        o0(new pv2(y0(), this));
    }

    public final long G0(o82 o82Var, boolean z) {
        long jC = 0;
        while (!this.equals(o82Var)) {
            if (!this.n || !z) {
                jC = iq1.c(jC, this.u);
            }
            wl2 wl2Var = this.t.v;
            wl2Var.getClass();
            this = wl2Var.N0();
            this.getClass();
        }
        return jC;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.t.getDensity();
    }

    @Override // defpackage.er1
    public final dx1 getLayoutDirection() {
        return this.t.t.H;
    }

    @Override // defpackage.nv2, defpackage.qb2
    public final Object i() {
        return this.t.i();
    }

    @Override // defpackage.nv2
    public final void i0(long j, float f, le1 le1Var) {
        F0(j);
        if (this.o) {
            return;
        }
        E0();
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.t.l();
    }

    @Override // defpackage.m82
    public final m82 p0() {
        wl2 wl2Var = this.t.u;
        if (wl2Var != null) {
            return wl2Var.N0();
        }
        return null;
    }

    @Override // defpackage.m82, defpackage.er1
    public final boolean r() {
        return true;
    }

    @Override // defpackage.m82
    public final cx1 v0() {
        return this.w;
    }

    @Override // defpackage.m82
    public final boolean w0() {
        return this.x != null;
    }

    @Override // defpackage.m82
    public final ux1 x0() {
        return this.t.t;
    }

    @Override // defpackage.m82
    public final wb2 y0() {
        wb2 wb2Var = this.x;
        if (wb2Var != null) {
            return wb2Var;
        }
        throw fq2.i("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.m82
    public final m82 z0() {
        wl2 wl2Var = this.t.v;
        if (wl2Var != null) {
            return wl2Var.N0();
        }
        return null;
    }
}
