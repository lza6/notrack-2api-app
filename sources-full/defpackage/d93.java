package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d93 implements b93 {
    public static final fp1 e;
    public final Map a;
    public final fi2 b;
    public g93 c;
    public final pj2 d;

    static {
        pe peVar = pe.M;
        xq2 xq2Var = xq2.z;
        fp1 fp1Var = z93.a;
        e = new fp1(peVar, xq2Var);
    }

    public d93(Map map) {
        this.a = map;
        long[] jArr = qa3.a;
        this.b = new fi2();
        this.d = new pj2(9, this);
    }

    @Override // defpackage.b93
    public void SaveableStateProvider(Object obj, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1198538093);
        kk0Var.d0(obj);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            pj2 pj2Var = this.d;
            if (!((Boolean) pj2Var.invoke(obj)).booleanValue()) {
                j93.i(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                return;
            }
            Map map = (Map) this.a.get(obj);
            un3 un3Var = i93.a;
            h93 h93Var = new h93(map, pj2Var);
            kk0Var.l0(h93Var);
            objP = h93Var;
        }
        g93 g93Var = (g93) objP;
        yk0.CompositionLocalProvider(i93.a.c(g93Var), ne1Var, kk0Var, (i & 112) | 8);
        boolean zJ = kk0Var.j(this) | kk0Var.j(obj) | kk0Var.j(g93Var);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new ie(this, obj, g93Var, 21);
            kk0Var.l0(objP2);
        }
        r11.DisposableEffect(w84.a, (le1) objP2, kk0Var, 6);
        kk0Var.w();
        kk0Var.r(false);
    }

    @Override // defpackage.b93
    public final void a(Object obj) {
        if (this.b.j(obj) == null) {
            this.a.remove(obj);
        }
    }
}
