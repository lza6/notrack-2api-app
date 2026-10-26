package defpackage;

import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class cy3 extends of2 implements lx1, nf1, wk0 {
    public az3 c;
    public boolean d;
    public Map h;

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        this.c.d.setValue(wl2Var);
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        az3 az3Var = this.c;
        dx1 layoutDirection = xb2Var.getLayoutDirection();
        kb1 kb1Var = (kb1) gm4.t(this, CompositionLocalsKt.getLocalFontFamilyResolver());
        bw3 bw3Var = az3Var.a;
        bw3Var.getClass();
        zv3 zv3Var = new zv3(xb2Var, layoutDirection, kb1Var, j);
        bw3Var.d.setValue(zv3Var);
        aw3 aw3Var = (aw3) bw3Var.c.getValue();
        if (aw3Var == null) {
            so1.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            u41.p();
            return null;
        }
        xy3 xy3VarC = bw3Var.c(aw3Var, zv3Var);
        long j2 = xy3VarC.c;
        ne1 ne1Var = az3Var.b;
        if (ne1Var != null) {
            ne1Var.invoke(xb2Var, new i43(14, az3Var));
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        nv2 nv2VarC = qb2Var.c(Protocol$Companion.m1784x4c29bdda(i, i, i2, i2));
        this.c.g.setValue(new rx0(this.d ? xb2Var.q0(g13.q(xy3VarC.b.b(0))) : 0.0f));
        Map linkedHashMap = this.h;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(d8.a, Integer.valueOf(Math.round(xy3VarC.d)));
        linkedHashMap.put(d8.b, Integer.valueOf(Math.round(xy3VarC.e)));
        this.h = linkedHashMap;
        return xb2Var.s(i, i2, linkedHashMap, new xc(nv2VarC, 16));
    }
}
