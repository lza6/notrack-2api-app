package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class lj3 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ uj3 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ gh2 l;
    public final /* synthetic */ oe1 m;
    public final /* synthetic */ oe1 n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj3(c cVar, uj3 uj3Var, boolean z, gh2 gh2Var, oe1 oe1Var, oe1 oe1Var2, int i) {
        super(2);
        this.c = cVar;
        this.d = uj3Var;
        this.h = z;
        this.l = gh2Var;
        this.m = oe1Var;
        this.n = oe1Var2;
        this.o = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rj3.SliderImpl(this.c, this.d, this.h, this.l, this.m, this.n, (ck0) obj, sf3.V(this.o | 1));
        return w84.a;
    }
}
