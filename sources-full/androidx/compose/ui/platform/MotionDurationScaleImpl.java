package androidx.compose.ui.platform;

import defpackage.ah2;
import defpackage.bt2;
import defpackage.ne1;
import defpackage.t73;
import defpackage.vp0;
import defpackage.wp0;
import defpackage.xp0;
import defpackage.y64;
import defpackage.zf2;

/* JADX INFO: loaded from: classes.dex */
final class MotionDurationScaleImpl implements zf2 {
    private final ah2 scaleFactor$delegate = new bt2(1.0f);

    @Override // defpackage.xp0
    public <R> R fold(R r, ne1 ne1Var) {
        return (R) y64.v(this, r, ne1Var);
    }

    @Override // defpackage.xp0
    public <E extends vp0> E get(wp0 wp0Var) {
        return (E) y64.w(this, wp0Var);
    }

    @Override // defpackage.zf2, defpackage.vp0
    public /* bridge */ /* synthetic */ wp0 getKey() {
        return t73.s;
    }

    @Override // defpackage.zf2
    public float getScaleFactor() {
        return ((bt2) this.scaleFactor$delegate).f();
    }

    @Override // defpackage.xp0
    public xp0 minusKey(wp0 wp0Var) {
        return y64.H(this, wp0Var);
    }

    @Override // defpackage.xp0
    public xp0 plus(xp0 xp0Var) {
        return y64.I(this, xp0Var);
    }

    public void setScaleFactor(float f) {
        ((bt2) this.scaleFactor$delegate).h(f);
    }
}
