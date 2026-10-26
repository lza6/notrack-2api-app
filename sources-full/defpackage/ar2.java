package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.c;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ar2 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 A;
    public final /* synthetic */ ne1 B;
    public final /* synthetic */ ne1 C;
    public final /* synthetic */ ne1 D;
    public final /* synthetic */ ne1 E;
    public final /* synthetic */ rg3 F;
    public final /* synthetic */ c c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ wu0 h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ bu3 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ le1 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ uz3 r;
    public final /* synthetic */ yv1 s;
    public final /* synthetic */ wv1 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ de4 x;
    public final /* synthetic */ gh2 y;
    public final /* synthetic */ ne1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar2(c cVar, ne1 ne1Var, wu0 wu0Var, boolean z, bu3 bu3Var, String str, le1 le1Var, boolean z2, boolean z3, uz3 uz3Var, yv1 yv1Var, wv1 wv1Var, boolean z4, int i, int i2, de4 de4Var, gh2 gh2Var, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, ne1 ne1Var6, ne1 ne1Var7, rg3 rg3Var) {
        super(2);
        this.c = cVar;
        this.d = ne1Var;
        this.h = wu0Var;
        this.l = z;
        this.m = bu3Var;
        this.n = str;
        this.o = le1Var;
        this.p = z2;
        this.q = z3;
        this.r = uz3Var;
        this.s = yv1Var;
        this.t = wv1Var;
        this.u = z4;
        this.v = i;
        this.w = i2;
        this.x = de4Var;
        this.y = gh2Var;
        this.z = ne1Var2;
        this.A = ne1Var3;
        this.B = ne1Var4;
        this.C = ne1Var5;
        this.D = ne1Var6;
        this.E = ne1Var7;
        this.F = rg3Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        c cVarThen = this.c.then(this.d != null ? a.o(we3.b(c.i, true, xq2.d), 0.0f, this.h.E(ir2.a), 0.0f, 0.0f, 13) : c.i);
        String strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.default_error_message, ck0Var, 0);
        boolean z = this.l;
        c cVarA = d.a(ov3.c(cVarThen, z, strM1830xa862b2cd), 280.0f, 56.0f);
        bu3 bu3Var = this.m;
        vl3 vl3Var = new vl3(z ? bu3Var.j : bu3Var.i);
        ne1 ne1Var = this.E;
        rg3 rg3Var = this.F;
        ne1 ne1Var2 = this.d;
        ne1 ne1Var3 = this.z;
        ne1 ne1Var4 = this.A;
        ne1 ne1Var5 = this.B;
        ne1 ne1Var6 = this.C;
        ne1 ne1Var7 = this.D;
        gh2 gh2Var = this.y;
        de4 de4Var = this.x;
        String str = this.n;
        boolean z2 = this.p;
        boolean z3 = this.u;
        us.BasicTextField(str, this.o, cVarA, z2, this.q, this.r, this.s, this.t, z3, this.v, this.w, de4Var, (le1) null, gh2Var, vl3Var, zg0.rememberComposableLambda(1474611661, true, new zq2(ne1Var2, ne1Var3, ne1Var4, ne1Var5, ne1Var6, ne1Var7, ne1Var, gh2Var, rg3Var, bu3Var, de4Var, str, z2, z3, this.l), ck0Var, 54), ck0Var, 0, 196608, ConstantsKt.DEFAULT_BLOCK_SIZE);
    }
}
