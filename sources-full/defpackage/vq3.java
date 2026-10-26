package defpackage;

import androidx.compose.material3.b;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class vq3 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ tq3 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ uq1 n;
    public final /* synthetic */ rg3 o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(c cVar, boolean z, boolean z2, tq3 tq3Var, ne1 ne1Var, uq1 uq1Var, rg3 rg3Var, int i) {
        super(2);
        this.c = cVar;
        this.d = z;
        this.h = z2;
        this.l = tq3Var;
        this.m = ne1Var;
        this.n = uq1Var;
        this.o = rg3Var;
        this.p = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b.SwitchImpl(this.c, this.d, this.h, this.l, this.m, this.n, this.o, (ck0) obj, sf3.V(this.p | 1));
        return w84.a;
    }
}
