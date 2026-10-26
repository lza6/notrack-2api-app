package defpackage;

import android.os.Build;
import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class gw3 extends ew3 implements wk0 {
    public c h;
    public wx3 l;
    public az3 m;
    public boolean n;
    public final ft2 o;
    public final ue p;
    public final a92 q;
    public ym3 r;

    public gw3(c cVar, wx3 wx3Var, az3 az3Var, boolean z) {
        this.h = cVar;
        this.l = wx3Var;
        this.m = az3Var;
        this.n = z;
        ft2 ft2VarD = cl3.d(new qq1(0L));
        this.o = ft2VarD;
        this.p = new ue(new ln2(yo4.j(this.h, this.l, this.m, ((qq1) ft2VarD.getValue()).a)), ie3.b, new ln2(ie3.c), 8);
        fw3 fw3Var = new fw3(this, 0);
        fw3 fw3Var2 = new fw3(this, 1);
        if (!b92.a()) {
            j93.k("Magnifier is only supported on API level 28 and higher.");
            throw null;
        }
        a92 a92Var = new a92(fw3Var, fw3Var2, Build.VERSION.SDK_INT == 28 ? cw2.a : ew2.a);
        v0(a92Var);
        this.q = a92Var;
    }

    @Override // defpackage.ew3, defpackage.rz0
    public final void L(wx1 wx1Var) {
        wx1Var.a();
        this.q.L(wx1Var);
    }

    @Override // defpackage.ew3, defpackage.lo2
    public final void a(wl2 wl2Var) {
        this.q.a(wl2Var);
    }

    @Override // defpackage.ew3, defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        this.q.applySemantics(gf3Var);
    }

    @Override // defpackage.of2
    public final void onAttach() {
        z0();
    }

    @Override // defpackage.ew3
    public final void y0(c cVar, wx3 wx3Var, az3 az3Var, boolean z) {
        c cVar2 = this.h;
        wx3 wx3Var2 = this.l;
        az3 az3Var2 = this.m;
        boolean z2 = this.n;
        this.h = cVar;
        this.l = wx3Var;
        this.m = az3Var;
        this.n = z;
        if (kr1.n(cVar, cVar2) && kr1.n(wx3Var, wx3Var2) && kr1.n(az3Var, az3Var2) && z == z2) {
            return;
        }
        z0();
    }

    public final void z0() {
        ym3 ym3Var = this.r;
        so0 so0Var = null;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        this.r = null;
        if (b92.a()) {
            this.r = py.F(getCoroutineScope(), null, null, new hl3(this, so0Var, 5), 3);
        }
    }
}
