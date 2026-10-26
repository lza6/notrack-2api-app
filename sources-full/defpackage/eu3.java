package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;

/* JADX INFO: loaded from: classes.dex */
public final class eu3 extends ww1 implements oe1 {
    public final /* synthetic */ yx c;
    public final /* synthetic */ z22 d;
    public final /* synthetic */ ey3 h;
    public final /* synthetic */ nn2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu3(yx yxVar, z22 z22Var, ey3 ey3Var, nn2 nn2Var) {
        super(3);
        this.c = yxVar;
        this.d = z22Var;
        this.h = ey3Var;
        this.l = nn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    public final c invoke(c cVar, ck0 ck0Var, int i) {
        c cVarC;
        ey3 ey3Var = this.h;
        long j = ey3Var.b;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-84507373);
        boolean zBooleanValue = ((Boolean) kk0Var.l(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
        boolean zI = kk0Var.i(zBooleanValue);
        Object objP = kk0Var.P();
        if (zI || objP == Composer$Companion.getEmpty()) {
            objP = new dr0(zBooleanValue);
            kk0Var.l0(objP);
        }
        dr0 dr0Var = (dr0) objP;
        yx yxVar = this.c;
        boolean z = ((yxVar instanceof vl3) && ((vl3) yxVar).a == 16) ? false : true;
        if (((WindowInfo) kk0Var.l(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) {
            z22 z22Var = this.d;
            if (z22Var.b() && jz3.c(j) && z) {
                kk0Var.a0(808460990);
                hg hgVar = ey3Var.a;
                jz3 jz3Var = new jz3(j);
                boolean zJ = kk0Var.j(dr0Var);
                Object objP2 = kk0Var.P();
                if (zJ || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new f60(dr0Var, (so0) null, 15);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(hgVar, jz3Var, (ne1) objP2, kk0Var, 0);
                boolean zJ2 = kk0Var.j(dr0Var);
                nn2 nn2Var = this.l;
                boolean zH = kk0Var.h(yxVar) | zJ2 | kk0Var.j(nn2Var) | kk0Var.h(ey3Var) | kk0Var.j(z22Var);
                Object objP3 = kk0Var.P();
                if (zH || objP3 == Composer$Companion.getEmpty()) {
                    objP3 = new h4(dr0Var, nn2Var, ey3Var, z22Var, this.c, 4);
                    kk0Var.l0(objP3);
                }
                cVarC = a.c(cVar, (le1) objP3);
                kk0Var.r(false);
            } else {
                kk0Var.a0(810474750);
                kk0Var.r(false);
                cVarC = c.i;
            }
        } else {
            kk0Var.a0(810474750);
            kk0Var.r(false);
            cVarC = c.i;
        }
        kk0Var.r(false);
        return cVarC;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
