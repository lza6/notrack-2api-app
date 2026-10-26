package defpackage;

import androidx.compose.material3.b;

/* JADX INFO: loaded from: classes.dex */
public final class r04 extends of2 implements lx1 {
    public uq1 c;
    public boolean d;
    public boolean h;
    public ue l;
    public ue m;
    public float n;
    public float o;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        float f;
        int i = 0;
        int i2 = 1;
        boolean z = (qb2Var.d(um0.h(j)) == 0 || qb2Var.Q(um0.g(j)) == 0) ? false : true;
        if (this.h) {
            f = 28.0f;
        } else if (z || this.d) {
            float f2 = b.a;
            f = 24.0f;
        } else {
            float f3 = b.a;
            f = 16.0f;
        }
        float fW = xb2Var.w(f);
        ue ueVar = this.m;
        int iFloatValue = (int) (ueVar != null ? ((Number) ueVar.d()).floatValue() : fW);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            ro1.a("width and height must be >= 0");
        }
        nv2 nv2VarC = qb2Var.c(wm0.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float f4 = b.a;
        float fW2 = xb2Var.w((32.0f - xb2Var.r0(fW)) / 2.0f);
        float f5 = b.a;
        float fW3 = xb2Var.w(28.0f - 4.0f);
        boolean z2 = this.h;
        if (z2 && this.d) {
            fW2 = fW3 - xb2Var.w(2.0f);
        } else if (z2 && !this.d) {
            fW2 = xb2Var.w(2.0f);
        } else if (this.d) {
            fW2 = fW3;
        }
        ue ueVar2 = this.m;
        so0 so0Var = null;
        if (!kr1.m(ueVar2 != null ? (Float) ueVar2.e.getValue() : null, fW)) {
            py.F(getCoroutineScope(), null, null, new q04(this, fW, so0Var, i), 3);
        }
        ue ueVar3 = this.l;
        if (!kr1.m(ueVar3 != null ? (Float) ueVar3.e.getValue() : null, fW2)) {
            py.F(getCoroutineScope(), null, null, new q04(this, fW2, so0Var, i2), 3);
        }
        if (Float.isNaN(this.o) && Float.isNaN(this.n)) {
            this.o = fW;
            this.n = fW2;
        }
        return xb2Var.s(iFloatValue, iFloatValue, a31.c, new la(nv2VarC, this, fW2));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        py.F(getCoroutineScope(), null, null, new f60(this, (so0) null, 17), 3);
    }
}
