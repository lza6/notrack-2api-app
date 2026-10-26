package defpackage;

import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class eu implements xk, nn2, zb4 {
    public int c;
    public int d;
    public Object h;

    public eu() {
        this.h = new eu[FontInfo.NUMBER_OF_CHAR_CODES];
        this.c = 0;
        this.d = 0;
    }

    public eu(int i, int i2, b11 b11Var) {
        this.c = i;
        this.d = i2;
        this.h = new ir3((c81) new j81(i, i2, b11Var));
    }

    public eu(int i, int i2, je1 je1Var) {
        this.c = i;
        this.d = i2;
        this.h = je1Var;
    }

    public eu(nn2 nn2Var, int i, int i2) {
        this.h = nn2Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.xk
    public void c(int i, Object obj) {
        ((xk) this.h).c(i + (this.d == 0 ? this.c : 0), obj);
    }

    @Override // defpackage.xk
    public void clear() {
        mk0.c("Clear is not valid on OffsetApplier");
    }

    @Override // defpackage.xk
    public void d(Object obj) {
        this.d++;
        ((xk) this.h).d(obj);
    }

    @Override // defpackage.xk
    public void f(int i, Object obj) {
        ((xk) this.h).f(i + (this.d == 0 ? this.c : 0), obj);
    }

    @Override // defpackage.xk
    public void h(int i, int i2, int i3) {
        int i4 = this.d == 0 ? this.c : 0;
        ((xk) this.h).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.xk
    public Object i() {
        return ((xk) this.h).i();
    }

    @Override // defpackage.xk
    public void j(int i, int i2) {
        ((xk) this.h).j(i + (this.d == 0 ? this.c : 0), i2);
    }

    @Override // defpackage.zb4
    public int k() {
        return this.d;
    }

    @Override // defpackage.xk
    public void l() {
        if (!(this.d > 0)) {
            mk0.c("OffsetApplier up called with no corresponding down");
        }
        this.d--;
        ((xk) this.h).l();
    }

    public fu m() {
        fu fuVar = new fu();
        fuVar.a = this.c;
        fuVar.b = this.d;
        fuVar.c = (String) this.h;
        return fuVar;
    }

    @Override // defpackage.nn2
    public int n(int i) {
        int iN = ((nn2) this.h).n(i);
        if (i >= 0 && i <= this.d) {
            xa4.c(iN, this.c, i);
        }
        return iN;
    }

    @Override // defpackage.nn2
    public int o(int i) {
        int iO = ((nn2) this.h).o(i);
        if (i >= 0 && i <= this.c) {
            xa4.b(iO, this.d, i);
        }
        return iO;
    }

    @Override // defpackage.xb4
    public cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return ((ir3) this.h).s(j, cgVar, cgVar2, cgVar3);
    }

    @Override // defpackage.zb4
    public int t() {
        return this.c;
    }

    @Override // defpackage.xb4
    public cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return ((ir3) this.h).u(j, cgVar, cgVar2, cgVar3);
    }
}
