package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.text.input.a;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class hs extends ww1 implements ne1 {
    public final /* synthetic */ a c;
    public final /* synthetic */ az3 d;
    public final /* synthetic */ uz3 h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ c o;
    public final /* synthetic */ wx3 p;
    public final /* synthetic */ yx q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ rb3 t;
    public final /* synthetic */ nq2 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ ne1 w;
    public final /* synthetic */ yv1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(a aVar, az3 az3Var, uz3 uz3Var, boolean z, boolean z2, boolean z3, c cVar, wx3 wx3Var, yx yxVar, boolean z4, boolean z5, rb3 rb3Var, nq2 nq2Var, boolean z6, ne1 ne1Var, yv1 yv1Var) {
        super(2);
        this.c = aVar;
        this.d = az3Var;
        this.h = uz3Var;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = cVar;
        this.p = wx3Var;
        this.q = yxVar;
        this.r = z4;
        this.s = z5;
        this.t = rb3Var;
        this.u = nq2Var;
        this.v = z6;
        this.w = ne1Var;
        this.x = yv1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        int i2 = this.c instanceof cw3 ? IntCompanionObject.MAX_VALUE : 1;
        Modifier$Companion modifier$Companion = androidx.compose.ui.c.i;
        az3 az3Var = this.d;
        androidx.compose.ui.c cVarF = d.f(modifier$Companion, ((rx0) az3Var.g.getValue()).c, 0.0f, 2);
        boolean zIsDebugInspectorInfoEnabled = InspectableValueKt.isDebugInspectorInfoEnabled();
        uz3 uz3Var = this.h;
        androidx.compose.ui.c cVarO = xr0.O(b.a(b.a(cVarF, zIsDebugInspectorInfoEnabled ? new yh1(1, i2, uz3Var) : InspectableValueKt.getNoInspectorInfo(), new zh1(1, i2, uz3Var)), InspectableValueKt.getNoInspectorInfo(), new zx3(uz3Var)));
        boolean z = this.m;
        boolean z2 = this.l;
        boolean z3 = z2 && z;
        boolean z4 = this.s;
        boolean z5 = this.r;
        androidx.compose.ui.c cVarThen = cVarO.then(new TextFieldCoreModifier(z3, this.n, this.d, this.o, this.p, this.q, z5 && !z4, this.t, this.u));
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
        su2 su2VarN = kk0Var.n();
        androidx.compose.ui.c cVarD = b.d(kk0Var, cVarThen);
        androidx.compose.ui.node.a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        if (kk0Var.a == null) {
            rj0.a();
            throw null;
        }
        kk0Var.e0();
        if (kk0Var.O) {
            kk0Var.m(constructor);
        } else {
            kk0Var.o0();
        }
        pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        vw.Box(androidx.compose.foundation.relocation.a.a(modifier$Companion, az3Var.h).then(new TextFieldTextLayoutModifier(az3Var, this.o, this.h, this.v, this.w, this.x)), kk0Var, 0);
        if (z5 && z2 && z) {
            wx3 wx3Var = this.p;
            if (((Boolean) wx3Var.k.getValue()).booleanValue()) {
                kk0Var.a0(-1320156658);
                us.TextFieldSelectionHandles(wx3Var, kk0Var, 0);
                if (z4) {
                    kk0Var.a0(-1319915168);
                    kk0Var.r(false);
                } else {
                    kk0Var.a0(-1320029527);
                    us.TextFieldCursorHandle(wx3Var, kk0Var, 0);
                    kk0Var.r(false);
                }
                kk0Var.r(false);
            } else {
                kk0Var.a0(-1319893344);
                kk0Var.r(false);
            }
        } else {
            kk0Var.a0(-1319893344);
            kk0Var.r(false);
        }
        kk0Var.r(true);
    }
}
