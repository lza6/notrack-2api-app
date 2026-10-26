package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class vi3 extends ww1 implements ne1 {
    public final /* synthetic */ pd0 c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ pd0 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ je1 o;
    public final /* synthetic */ ii3 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi3(pd0 pd0Var, le1 le1Var, c cVar, boolean z, pd0 pd0Var2, int i, je1 je1Var, ii3 ii3Var, int i2, int i3) {
        super(2);
        this.c = pd0Var;
        this.d = le1Var;
        this.h = cVar;
        this.l = z;
        this.m = pd0Var2;
        this.n = i;
        this.o = je1Var;
        this.p = ii3Var;
        this.q = i2;
        this.r = i3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rj3.RangeSlider(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, sf3.V(this.q | 1), this.r);
        return w84.a;
    }
}
