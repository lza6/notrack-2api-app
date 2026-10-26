package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class bd2 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ kc2 o;
    public final /* synthetic */ hs2 p;
    public final /* synthetic */ gh2 q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd2(ne1 ne1Var, je1 je1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, boolean z, kc2 kc2Var, hs2 hs2Var, gh2 gh2Var, int i) {
        super(2);
        this.c = ne1Var;
        this.d = je1Var;
        this.h = cVar;
        this.l = ne1Var2;
        this.m = ne1Var3;
        this.n = z;
        this.o = kc2Var;
        this.p = hs2Var;
        this.q = gh2Var;
        this.r = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cd2.DropdownMenuItemContent(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, sf3.V(this.r | 1));
        return w84.a;
    }
}
