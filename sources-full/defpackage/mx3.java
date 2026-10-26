package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class mx3 extends ww1 implements ne1 {
    public final /* synthetic */ p43 c;
    public final /* synthetic */ wx3 d;
    public final /* synthetic */ ah1 h;
    public final /* synthetic */ p43 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx3(ah1 ah1Var, p43 p43Var, p43 p43Var2, wx3 wx3Var, boolean z) {
        super(2);
        this.c = p43Var;
        this.d = wx3Var;
        this.h = ah1Var;
        this.l = p43Var2;
        this.m = z;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int iG;
        int iG2;
        long j = ((ln2) obj2).a;
        p43 p43Var = this.c;
        p43Var.c = ln2.i(p43Var.c, j);
        wx3 wx3Var = this.d;
        az3 az3Var = wx3Var.b;
        c cVar = wx3Var.a;
        xy3 xy3VarB = az3Var.b();
        if (xy3VarB != null) {
            pg2 pg2Var = xy3VarB.b;
            wx3Var.z(this.h, ln2.i(this.l.c, p43Var.c));
            boolean z = this.m;
            if (z) {
                iG = pg2Var.g(wx3Var.n());
            } else {
                long j2 = cVar.d().h;
                int i = jz3.c;
                iG = (int) (j2 >> 32);
            }
            int i2 = iG;
            if (z) {
                long j3 = cVar.d().h;
                int i3 = jz3.c;
                iG2 = (int) (j3 & 4294967295L);
            } else {
                iG2 = pg2Var.g(wx3Var.n());
            }
            int i4 = iG2;
            long j4 = cVar.d().h;
            long jA = wx3Var.A(cVar.d(), i2, i4, this.m, SelectionAdjustment$Companion.getCharacterWithWordAccelerate(), false, false);
            if (jz3.c(j4) || !jz3.c(jA)) {
                cVar.j(jA);
            }
        }
        return w84.a;
    }
}
