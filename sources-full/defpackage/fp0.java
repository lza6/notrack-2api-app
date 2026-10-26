package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.relocation.a;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends ww1 implements ne1 {
    public final /* synthetic */ z22 c;
    public final /* synthetic */ uz3 d;
    public final /* synthetic */ int h;
    public final /* synthetic */ int l;
    public final /* synthetic */ rw3 m;
    public final /* synthetic */ ey3 n;
    public final /* synthetic */ de4 o;
    public final /* synthetic */ c p;
    public final /* synthetic */ c q;
    public final /* synthetic */ c r;
    public final /* synthetic */ c s;
    public final /* synthetic */ kx t;
    public final /* synthetic */ xw3 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ le1 x;
    public final /* synthetic */ nn2 y;
    public final /* synthetic */ wu0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(z22 z22Var, uz3 uz3Var, int i, int i2, rw3 rw3Var, ey3 ey3Var, de4 de4Var, c cVar, c cVar2, c cVar3, c cVar4, kx kxVar, xw3 xw3Var, boolean z, boolean z2, le1 le1Var, nn2 nn2Var, wu0 wu0Var) {
        super(2);
        this.c = z22Var;
        this.d = uz3Var;
        this.h = i;
        this.l = i2;
        this.m = rw3Var;
        this.n = ey3Var;
        this.o = de4Var;
        this.p = cVar;
        this.q = cVar2;
        this.r = cVar3;
        this.s = cVar4;
        this.t = kxVar;
        this.u = xw3Var;
        this.v = z;
        this.w = z2;
        this.x = le1Var;
        this.y = nn2Var;
        this.z = wu0Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        c mc4Var;
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        Modifier$Companion modifier$Companion = c.i;
        z22 z22Var = this.c;
        c cVarF = d.f(modifier$Companion, ((rx0) z22Var.g.getValue()).c, 0.0f, 2);
        boolean zIsDebugInspectorInfoEnabled = InspectableValueKt.isDebugInspectorInfoEnabled();
        uz3 uz3Var = this.d;
        int i2 = this.h;
        int i3 = this.l;
        c cVarA = b.a(cVarF, zIsDebugInspectorInfoEnabled ? new yh1(i2, i3, uz3Var) : InspectableValueKt.getNoInspectorInfo(), new zh1(i2, i3, uz3Var));
        ey3 ey3Var = this.n;
        long j = ey3Var.b;
        boolean zJ = kk0Var.j(z22Var);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new j(9, z22Var);
            kk0Var.l0(objP);
        }
        je1 je1Var = (je1) objP;
        rw3 rw3Var = this.m;
        nq2 nq2Var = (nq2) rw3Var.f.getValue();
        int i4 = jz3.c;
        int iF = (int) (j >> 32);
        long j2 = rw3Var.e;
        if (iF == ((int) (j2 >> 32)) && (iF = (int) (j & 4294967295L)) == ((int) (j2 & 4294967295L))) {
            iF = jz3.f(j);
        }
        rw3Var.e = j;
        f54 f54VarA = xa4.a(this.o, ey3Var.a);
        int iOrdinal = nq2Var.ordinal();
        if (iOrdinal == 0) {
            mc4Var = new mc4(rw3Var, iF, f54VarA, je1Var);
        } else {
            if (iOrdinal != 1) {
                u41.e();
                return;
            }
            mc4Var = new vi1(rw3Var, iF, f54VarA, je1Var);
        }
        rh3.SimpleLayout(a.a(b.a(xr0.O(cVarA).then(mc4Var).then(this.p).then(this.q), InspectableValueKt.getNoInspectorInfo(), new zx3(uz3Var)).then(this.r).then(this.s), this.t), zg0.rememberComposableLambda(-1172467467, true, new ep0(this.u, z22Var, this.v, this.w, this.x, ey3Var, this.y, this.z, this.l), kk0Var, 54), kk0Var, 48, 0);
    }
}
