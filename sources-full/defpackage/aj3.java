package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class aj3 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ n23 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ gh2 l;
    public final /* synthetic */ gh2 m;
    public final /* synthetic */ oe1 n;
    public final /* synthetic */ oe1 o;
    public final /* synthetic */ oe1 p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj3(c cVar, n23 n23Var, boolean z, gh2 gh2Var, gh2 gh2Var2, oe1 oe1Var, oe1 oe1Var2, oe1 oe1Var3, int i) {
        super(2);
        this.c = cVar;
        this.d = n23Var;
        this.h = z;
        this.l = gh2Var;
        this.m = gh2Var2;
        this.n = oe1Var;
        this.o = oe1Var2;
        this.p = oe1Var3;
        this.q = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rj3.RangeSliderImpl(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, sf3.V(this.q | 1));
        return w84.a;
    }
}
