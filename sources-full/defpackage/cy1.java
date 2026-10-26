package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cy1 implements jp3 {
    public dx1 c = dx1.d;
    public float d;
    public float h;
    public final /* synthetic */ iy1 l;

    public cy1(iy1 iy1Var) {
        this.l = iy1Var;
    }

    @Override // defpackage.jp3
    public final List b0(Object obj, ne1 ne1Var) {
        iy1 iy1Var = this.l;
        iy1Var.b();
        ux1 ux1Var = iy1Var.c;
        qx1 qx1Var = ux1Var.O.d;
        qx1 qx1Var2 = qx1.h;
        qx1 qx1Var3 = qx1.c;
        if (qx1Var != qx1Var3 && qx1Var != qx1Var2 && qx1Var != qx1.d && qx1Var != qx1.l) {
            po1.b("subcompose can only be used inside the measure or layout blocks");
        }
        fi2 fi2Var = iy1Var.o;
        Object objG = fi2Var.g(obj);
        if (objG == null) {
            objG = (ux1) iy1Var.r.j(obj);
            if (objG != null) {
                if (iy1Var.w <= 0) {
                    po1.b("Check failed.");
                }
                iy1Var.w--;
            } else {
                objG = iy1Var.j(obj);
                if (objG == null) {
                    int i = iy1Var.l;
                    ux1 ux1Var2 = new ux1(2);
                    ux1Var.y = true;
                    ux1Var.z(ux1Var2, i);
                    ux1Var.y = false;
                    objG = ux1Var2;
                }
            }
            fi2Var.l(obj, objG);
        }
        ux1 ux1Var3 = (ux1) objG;
        if (ke0.A0(iy1Var.l, ux1Var.o()) != ux1Var3) {
            int iK = ((oi2) ((th2) ux1Var.o()).d).k(ux1Var3);
            if (iK < iy1Var.l) {
                po1.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = iy1Var.l;
            if (i2 != iK) {
                ux1Var.y = true;
                ux1Var.J(iK, i2, 1);
                ux1Var.y = false;
            }
        }
        iy1Var.l++;
        iy1Var.h(ux1Var3, obj, ne1Var);
        return (qx1Var == qx1Var3 || qx1Var == qx1Var2) ? ux1Var3.m() : ux1Var3.l();
    }

    @Override // defpackage.xb2
    public final wb2 g0(int i, int i2, Map map, le1 le1Var) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            po1.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new by1(i, i2, map, this, this.l, le1Var);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.d;
    }

    @Override // defpackage.er1
    public final dx1 getLayoutDirection() {
        return this.c;
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.h;
    }

    @Override // defpackage.er1
    public final boolean r() {
        qx1 qx1Var = this.l.c.O.d;
        return qx1Var == qx1.l || qx1Var == qx1.d;
    }
}
