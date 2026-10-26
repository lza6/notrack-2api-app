package defpackage;

import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class ep0 extends ww1 implements ne1 {
    public final /* synthetic */ xw3 c;
    public final /* synthetic */ z22 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ le1 m;
    public final /* synthetic */ ey3 n;
    public final /* synthetic */ nn2 o;
    public final /* synthetic */ wu0 p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(xw3 xw3Var, z22 z22Var, boolean z, boolean z2, le1 le1Var, ey3 ey3Var, nn2 nn2Var, wu0 wu0Var, int i) {
        super(2);
        this.c = xw3Var;
        this.d = z22Var;
        this.h = z;
        this.l = z2;
        this.m = le1Var;
        this.n = ey3Var;
        this.o = nn2Var;
        this.p = wu0Var;
        this.q = i;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    public final void invoke(ck0 ck0Var, int i) {
        boolean z;
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        wu0 wu0Var = this.p;
        int i2 = this.q;
        z22 z22Var = this.d;
        dp0 dp0Var = new dp0(z22Var, this.m, this.n, this.o, wu0Var, i2);
        Modifier$Companion modifier$Companion = c.i;
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
        su2 su2VarN = kk0Var.n();
        c cVarD = b.d(kk0Var, modifier$Companion);
        a.j.getClass();
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
        xp1.E(kk0Var, dp0Var, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
        }
        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        kk0Var.r(true);
        ch1 ch1VarA = z22Var.a();
        ch1 ch1Var = ch1.c;
        boolean z2 = this.h;
        if (ch1VarA != ch1Var && z22Var.c() != null) {
            cx1 cx1VarC = z22Var.c();
            cx1VarC.getClass();
            z = cx1VarC.z() && z2;
        }
        xw3 xw3Var = this.c;
        qp0.SelectionToolbarAndHandles(xw3Var, z, kk0Var, 0);
        if (z22Var.a() != ch1.h || this.l || !z2) {
            kk0Var.a0(-7090978);
            kk0Var.r(false);
        } else {
            kk0Var.a0(-7167858);
            qp0.TextFieldCursorHandle(xw3Var, kk0Var, 0);
            kk0Var.r(false);
        }
    }
}
