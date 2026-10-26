package defpackage;

import androidx.compose.ui.Alignment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends ww1 implements le1 {
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ nv2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ nv2 n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec0(nv2 nv2Var, int i, int i2, nv2 nv2Var2, int i3, nv2 nv2Var3, int i4) {
        super(1);
        this.c = nv2Var;
        this.d = i;
        this.h = i2;
        this.l = nv2Var2;
        this.m = i3;
        this.n = nv2Var3;
        this.o = i4;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        mv2 mv2Var = (mv2) obj;
        int i = this.h;
        nv2 nv2Var = this.c;
        if (nv2Var != null) {
            mv2.f(mv2Var, nv2Var, 0, Alignment$Companion.getCenterVertically().a(this.d, i));
        }
        nv2 nv2Var2 = this.l;
        int i2 = this.m;
        mv2.f(mv2Var, nv2Var2, i2, 0);
        nv2 nv2Var3 = this.n;
        if (nv2Var3 != null) {
            mv2.f(mv2Var, nv2Var3, i2 + nv2Var2.c, Alignment$Companion.getCenterVertically().a(this.o, i));
        }
        return w84.a;
    }
}
