package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class fj2 extends ww1 implements oe1 {
    public final /* synthetic */ e c;
    public final /* synthetic */ c d;
    public final /* synthetic */ rg3 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ oe1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj2(e eVar, c cVar, rg3 rg3Var, long j, long j2, float f, oe1 oe1Var) {
        super(3);
        this.c = eVar;
        this.d = cVar;
        this.h = rg3Var;
        this.l = j;
        this.m = j2;
        this.n = f;
        this.o = oe1Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((e01) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(e01 e01Var, ck0 ck0Var, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (((kk0) ck0Var).h(e01Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        uj2.m1821xd59157b8(e01Var, this.c, this.d, this.h, this.l, this.m, this.n, this.o, ck0Var, i2 & 14, 0);
    }
}
