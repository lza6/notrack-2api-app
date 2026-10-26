package androidx.compose.foundation.gestures;

import androidx.compose.ui.c;
import defpackage.g13;
import defpackage.gc3;
import defpackage.gh2;
import defpackage.gw0;
import defpackage.hq0;
import defpackage.ln2;
import defpackage.m;
import defpackage.n43;
import defpackage.nq2;
import defpackage.oc3;
import defpackage.ri2;
import defpackage.u41;
import defpackage.uo0;
import defpackage.wb3;
import defpackage.xb3;
import defpackage.yb3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final wb3 a = new wb3();
    public static final gw0 b = new gw0(1);
    public static final xb3 c = new xb3();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(oc3 oc3Var, long j, uo0 uo0Var) throws Throwable {
        yb3 yb3Var;
        n43 n43Var;
        oc3 oc3Var2;
        if (uo0Var instanceof yb3) {
            yb3Var = (yb3) uo0Var;
            int i = yb3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yb3Var.l = i - Integer.MIN_VALUE;
            } else {
                yb3Var = new yb3(uo0Var);
            }
        } else {
            yb3Var = new yb3(uo0Var);
        }
        Object obj = yb3Var.h;
        int i2 = yb3Var.l;
        if (i2 == 0) {
            g13.O(obj);
            n43Var = new n43();
            m mVar = new m(oc3Var, j, n43Var, null, 1);
            yb3Var.c = oc3Var;
            yb3Var.d = n43Var;
            yb3Var.l = 1;
            Object objF = oc3Var.f(ri2.c, mVar, yb3Var);
            hq0 hq0Var = hq0.c;
            if (objF == hq0Var) {
                return hq0Var;
            }
            oc3Var2 = oc3Var;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n43 n43Var2 = yb3Var.d;
            oc3 oc3Var3 = yb3Var.c;
            g13.O(obj);
            n43Var = n43Var2;
            oc3Var2 = oc3Var3;
        }
        return new ln2(oc3Var2.h(n43Var.c));
    }

    public static c b(c cVar, gc3 gc3Var, nq2 nq2Var, boolean z, boolean z2, gh2 gh2Var) {
        return cVar.then(new ScrollableElement(gc3Var, nq2Var, z, z2, gh2Var));
    }
}
