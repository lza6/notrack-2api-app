package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qr1 implements xb2, er1 {
    public final dx1 c;
    public final /* synthetic */ er1 d;

    public qr1(er1 er1Var, dx1 dx1Var) {
        this.c = dx1Var;
        this.d = er1Var;
    }

    @Override // defpackage.wu0
    public final int C(long j) {
        return this.d.C(j);
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        return this.d.E(j);
    }

    @Override // defpackage.wu0
    public final int O(float f) {
        return this.d.O(f);
    }

    @Override // defpackage.wu0
    public final long c0(long j) {
        return this.d.c0(j);
    }

    @Override // defpackage.wu0
    public final float f0(long j) {
        return this.d.f0(j);
    }

    @Override // defpackage.xb2
    public final wb2 g0(int i, int i2, Map map, le1 le1Var) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            po1.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new pr1(i, i2, map);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.d.getDensity();
    }

    @Override // defpackage.er1
    public final dx1 getLayoutDirection() {
        return this.c;
    }

    @Override // defpackage.wu0
    public final long k0(float f) {
        return this.d.k0(f);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.d.l();
    }

    @Override // defpackage.wu0
    public final float q0(int i) {
        return this.d.q0(i);
    }

    @Override // defpackage.er1
    public final boolean r() {
        return this.d.r();
    }

    @Override // defpackage.wu0
    public final float r0(float f) {
        return this.d.r0(f);
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return this.d.t(f);
    }

    @Override // defpackage.wu0
    public final long u(long j) {
        return this.d.u(j);
    }

    @Override // defpackage.wu0
    public final float w(float f) {
        return this.d.w(f);
    }
}
