package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class qu3 extends ww1 implements oe1 {
    public final /* synthetic */ uq1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ bu3 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu3(float f, float f2, uq1 uq1Var, bu3 bu3Var, boolean z, boolean z2) {
        super(3);
        this.c = uq1Var;
        this.d = z;
        this.h = z2;
        this.l = bu3Var;
        this.m = f;
        this.n = f2;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-891038934);
        c cVarC = a.c(c.i, new jz0(ov3.m1797x7c0e9112(this.d, this.h, ((Boolean) na1.collectIsFocusedAsState(this.c, kk0Var, 0).getValue()).booleanValue(), this.l, this.m, this.n, kk0Var, 0), 5));
        kk0Var.r(false);
        return cVarC;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
