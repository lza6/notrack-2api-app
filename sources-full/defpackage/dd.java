package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends i73 implements d73 {
    public c73 s;
    public e73 t;

    @Override // defpackage.d73
    public final void i0() {
        this.t = null;
        kr1.O(this);
    }

    @Override // defpackage.of2
    public final void onDetach() {
        c73 c73Var = this.s;
        if (c73Var != null) {
            i0();
            mi4 mi4Var = c73Var.l;
            e73 e73Var = (e73) ((LinkedHashMap) mi4Var.d).get(this);
            if (e73Var != null) {
                e73Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) mi4Var.d;
                e73 e73Var2 = (e73) linkedHashMap.get(this);
                if (e73Var2 != null) {
                }
                linkedHashMap.remove(this);
                c73Var.h.add(e73Var);
            }
        }
    }

    @Override // defpackage.i73
    public final void v0(ry2 ry2Var, long j, float f) {
        c73 c73VarA = this.s;
        if (c73VarA == null) {
            c73VarA = m73.a(m73.b((View) gm4.t(this, AndroidCompositionLocals_androidKt.getLocalView())));
            this.s = c73VarA;
        }
        e73 e73VarA = c73VarA.a(this);
        int iR = gb2.R(f);
        long jA = this.l.a();
        this.m.invoke();
        e73VarA.b(ry2Var, this.d, j, iR, jA, 0.1f, new j(2, this));
        this.t = e73VarA;
        kr1.O(this);
    }

    @Override // defpackage.i73
    public final void w0(wx1 wx1Var) {
        y00 y00VarY = wx1Var.c.d.y();
        e73 e73Var = this.t;
        if (e73Var != null) {
            long j = this.p;
            long jA = this.l.a();
            this.m.invoke();
            e73Var.e(j, jA, 0.1f);
            e73Var.draw(p9.a(y00VarY));
        }
    }

    @Override // defpackage.i73
    public final void y0(ry2 ry2Var) {
        e73 e73Var = this.t;
        if (e73Var != null) {
            e73Var.d();
        }
    }
}
