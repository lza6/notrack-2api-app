package defpackage;

import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public final class sd3 implements a53 {
    public final long c;
    public final qe3 d;
    public final long h;
    public fp1 l = fp1.h;
    public vg2 m;
    public final c n;

    public sd3(long j, qe3 qe3Var, long j2) {
        this.c = j;
        this.d = qe3Var;
        this.h = j2;
        rd3 rd3Var = new rd3(this, 0);
        td3 td3Var = new td3(rd3Var, qe3Var, j);
        p33 p33Var = new p33(rd3Var, qe3Var, j);
        Modifier$Companion modifier$Companion = c.i;
        pp0 pp0Var = new pp0(p33Var, td3Var);
        yw2 yw2Var = oq3.a;
        this.n = vl0.Y(new SuspendPointerInputElement(p33Var, td3Var, null, pp0Var, 4), y64.j);
    }

    @Override // defpackage.a53
    public final void a() {
        rd3 rd3Var = new rd3(this, 1);
        rd3 rd3Var2 = new rd3(this, 2);
        long j = this.c;
        vg2 vg2Var = new vg2(j, rd3Var, rd3Var2);
        qe3 qe3Var = this.d;
        lh2 lh2Var = qe3Var.c;
        if (j == 0) {
            so1.a("The selectable contains an invalid id: " + j);
        }
        if (lh2Var.b(j)) {
            so1.a("Another selectable with the id: " + vg2Var + ".selectableId has already subscribed.");
        }
        lh2Var.h(vg2Var, j);
        qe3Var.b.add(vg2Var);
        qe3Var.a = false;
        this.m = vg2Var;
    }

    @Override // defpackage.a53
    public final void b() {
        vg2 vg2Var = this.m;
        if (vg2Var != null) {
            this.d.d(vg2Var);
            this.m = null;
        }
    }

    @Override // defpackage.a53
    public final void d() {
        vg2 vg2Var = this.m;
        if (vg2Var != null) {
            this.d.d(vg2Var);
            this.m = null;
        }
    }
}
