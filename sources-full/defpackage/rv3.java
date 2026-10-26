package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.key.a;

/* JADX INFO: loaded from: classes.dex */
public final class rv3 extends ww1 implements oe1 {
    public final /* synthetic */ z22 c;
    public final /* synthetic */ xw3 d;
    public final /* synthetic */ ey3 h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ nn2 n;
    public final /* synthetic */ q84 o;
    public final /* synthetic */ le1 p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv3(z22 z22Var, xw3 xw3Var, ey3 ey3Var, boolean z, boolean z2, nn2 nn2Var, q84 q84Var, le1 le1Var, int i) {
        super(3);
        this.c = z22Var;
        this.d = xw3Var;
        this.h = ey3Var;
        this.l = z;
        this.m = z2;
        this.n = nn2Var;
        this.o = q84Var;
        this.p = le1Var;
        this.q = i;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(851809892);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new iz3();
            kk0Var.l0(objP);
        }
        iz3 iz3Var = (iz3) objP;
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new ur0();
            kk0Var.l0(objP2);
        }
        le1 le1Var = this.p;
        int i2 = this.q;
        qv3 qv3Var = new qv3(this.c, this.d, this.h, this.l, this.m, iz3Var, this.n, this.o, (ur0) objP2, le1Var, i2);
        Modifier$Companion modifier$Companion = c.i;
        boolean zJ = kk0Var.j(qv3Var);
        Object objP3 = kk0Var.P();
        if (zJ || objP3 == Composer$Companion.getEmpty()) {
            l lVar = new l(1, qv3Var, qv3.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 28);
            kk0Var.l0(lVar);
            objP3 = lVar;
        }
        c cVarA = a.a(modifier$Companion, (le1) ((fu1) objP3));
        kk0Var.r(false);
        return cVarA;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
