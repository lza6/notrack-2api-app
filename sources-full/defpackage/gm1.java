package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class gm1 extends ww1 implements ne1 {
    public final /* synthetic */ ms2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c h;
    public final /* synthetic */ a8 l;
    public final /* synthetic */ sn0 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ te0 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm1(ms2 ms2Var, String str, c cVar, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, int i, int i2) {
        super(2);
        this.c = ms2Var;
        this.d = str;
        this.h = cVar;
        this.l = a8Var;
        this.m = sn0Var;
        this.n = f;
        this.o = te0Var;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hm1.Image(this.c, this.d, this.h, this.l, this.m, this.n, this.o, (ck0) obj, sf3.V(this.p | 1), this.q);
        return w84.a;
    }
}
