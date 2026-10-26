package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.foundation.gestures.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fc3 extends bz0 implements cv1, xe3, wk0 {
    public ea A;
    public cc3 B;
    public lv0 C;
    public pr2 s;
    public w71 t;
    public final fk2 u;
    public final tb3 v;
    public final vs0 w;
    public final oc3 x;
    public final bc3 y;
    public final jn0 z;

    public fc3(w71 w71Var, gh2 gh2Var, nq2 nq2Var, pr2 pr2Var, gc3 gc3Var, boolean z, boolean z2) {
        super(ba3.A, z, gh2Var, nq2Var);
        this.s = pr2Var;
        this.t = w71Var;
        fk2 fk2Var = new fk2();
        this.u = fk2Var;
        tb3 tb3Var = new tb3();
        tb3Var.c = z;
        v0(tb3Var);
        this.v = tb3Var;
        vs0 vs0Var = new vs0(new as0(new sk3(b.c)));
        this.w = vs0Var;
        pr2 pr2Var2 = this.s;
        w71 w71Var2 = this.t;
        oc3 oc3Var = new oc3(gc3Var, pr2Var2, w71Var2 == null ? vs0Var : w71Var2, nq2Var, z2, fk2Var, new i43(3, this));
        this.x = oc3Var;
        bc3 bc3Var = new bc3(oc3Var, z);
        this.y = bc3Var;
        jn0 jn0Var = new jn0(nq2Var, oc3Var, z2);
        v0(jn0Var);
        this.z = jn0Var;
        v0(new ik2(bc3Var, fk2Var));
        v0(new db1(2, 4, null));
        qx qxVar = new qx();
        qxVar.c = jn0Var;
        v0(qxVar);
        pj2 pj2Var = new pj2(11, this);
        hb1 hb1Var = new hb1();
        hb1Var.c = pj2Var;
        v0(hb1Var);
    }

    @Override // defpackage.bz0
    public final Object C0(az0 az0Var, az0 az0Var2) {
        oc3 oc3Var = this.x;
        Object objF = oc3Var.f(ri2.d, new q8(az0Var, oc3Var, (so0) null, 26), az0Var2);
        return objF == hq0.c ? objF : w84.a;
    }

    @Override // defpackage.bz0, defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        fc3 fc3Var;
        long j2;
        boolean zC;
        List list = yw2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) this.l.invoke((dx2) list.get(i))).booleanValue()) {
                super.D(yw2Var, zw2Var, j);
                break;
            }
        }
        if (this.m) {
            if (zw2Var == zw2.c && yw2Var.d == 6) {
                if (this.C == null) {
                    fc3Var = this;
                    fc3Var.C = new lv0(fc3Var.x, new jb(6, ViewConfiguration.get(yh4.P(this).getContext())), new xg0(2, fc3Var, fc3.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), y64.M(fc3Var).G);
                } else {
                    fc3Var = this;
                }
                lv0 lv0Var = fc3Var.C;
                if (lv0Var != null) {
                    gq0 coroutineScope = fc3Var.getCoroutineScope();
                    if (((ym3) lv0Var.g) == null) {
                        lv0Var.g = py.F(coroutineScope, null, null, new k(lv0Var, null, 20), 3);
                    }
                }
            } else {
                fc3Var = this;
            }
            lv0 lv0Var2 = fc3Var.C;
            if (lv0Var2 == null || zw2Var != zw2.d) {
                return;
            }
            int i2 = yw2Var.d;
            List list2 = yw2Var.a;
            if (i2 == 6) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (((dx2) list2.get(i3)).b()) {
                        return;
                    }
                }
                jb jbVar = (jb) lv0Var2.c;
                wu0 wu0Var = (wu0) lv0Var2.e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) jbVar.d;
                int i4 = Build.VERSION.SDK_INT;
                float f = -(i4 > 26 ? df0.g(viewConfiguration) : wu0Var.w(64.0f));
                float f2 = -(i4 > 26 ? df0.d(viewConfiguration) : wu0Var.w(64.0f));
                ln2 ln2Var = new ln2(0L);
                int size3 = list2.size();
                int i5 = 0;
                while (true) {
                    j2 = ln2Var.a;
                    if (i5 >= size3) {
                        break;
                    }
                    ln2Var = new ln2(ln2.i(j2, ((dx2) list2.get(i5)).j));
                    i5++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f)));
                oc3 oc3Var = (oc3) lv0Var2.b;
                float fG = oc3Var.g(oc3Var.e(jFloatToRawIntBits));
                if (fG == 0.0f) {
                    zC = false;
                } else {
                    gc3 gc3Var = oc3Var.a;
                    zC = fG > 0.0f ? gc3Var.c() : gc3Var.a();
                }
                if (zC ? !(((jy) lv0Var2.f).i(new dg2(jFloatToRawIntBits, ((dx2) ke0.y0(list2)).b, false)) instanceof g30) : lv0Var2.a) {
                    int size4 = list2.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        ((dx2) list2.get(i6)).a();
                    }
                }
            }
        }
    }

    @Override // defpackage.bz0
    public final void D0(long j) {
    }

    @Override // defpackage.bz0
    public final void E0(long j) {
        py.F(this.u.c(), null, null, new cc3(this, j, null, 0), 3);
    }

    @Override // defpackage.bz0
    public final boolean F0() {
        oc3 oc3Var = this.x;
        if (oc3Var.a.b()) {
            return true;
        }
        pr2 pr2Var = oc3Var.b;
        return pr2Var != null ? pr2Var.b() : false;
    }

    public final void H0(w71 w71Var, gh2 gh2Var, nq2 nq2Var, pr2 pr2Var, gc3 gc3Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.m != z) {
            this.y.d = z;
            this.v.c = z;
            z3 = true;
        } else {
            z3 = false;
        }
        w71 w71Var2 = w71Var == null ? this.w : w71Var;
        oc3 oc3Var = this.x;
        if (!kr1.n(oc3Var.a, gc3Var)) {
            oc3Var.a = gc3Var;
            z5 = true;
        }
        oc3Var.b = pr2Var;
        if (oc3Var.d != nq2Var) {
            oc3Var.d = nq2Var;
            z5 = true;
        }
        if (oc3Var.e != z2) {
            oc3Var.e = z2;
        } else {
            z4 = z5;
        }
        oc3Var.c = w71Var2;
        oc3Var.f = this.u;
        jn0 jn0Var = this.z;
        jn0Var.c = nq2Var;
        jn0Var.h = z2;
        this.s = pr2Var;
        this.t = w71Var;
        ba3 ba3Var = ba3.A;
        nq2 nq2Var2 = oc3Var.d;
        nq2 nq2Var3 = nq2.c;
        if (nq2Var2 != nq2Var3) {
            nq2Var3 = nq2.d;
        }
        G0(ba3Var, z, gh2Var, nq2Var3, z4);
        if (z3) {
            this.A = null;
            this.B = null;
            y64.M(this).D();
        }
    }

    @Override // defpackage.cv1
    public final boolean R(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.m || ((!tu1.a(av1.y(keyEvent), tu1.l) && !tu1.a(g13.b(keyEvent.getKeyCode()), tu1.k)) || av1.A(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.x.d == nq2.c;
        jn0 jn0Var = this.z;
        if (z) {
            int i = (int) (jn0Var.p & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(tu1.a(g13.b(keyEvent.getKeyCode()), tu1.k) ? i : -i)));
        } else {
            int i2 = (int) (jn0Var.p >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(tu1.a(g13.b(keyEvent.getKeyCode()), tu1.k) ? i2 : -i2)) << 32);
        }
        py.F(getCoroutineScope(), null, null, new cc3(this, jFloatToRawIntBits, null, 1), 3);
        return true;
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        if (this.m && (this.A == null || this.B == null)) {
            this.A = new ea(11, this);
            this.B = new cc3(this, null);
        }
        ea eaVar = this.A;
        if (eaVar != null) {
            pu1[] pu1VarArr = ef3.a;
            ((ue3) gf3Var).j(te3.d, new z0(null, eaVar));
        }
        cc3 cc3Var = this.B;
        if (cc3Var != null) {
            pu1[] pu1VarArr2 = ef3.a;
            ((ue3) gf3Var).j(te3.e, cc3Var);
        }
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.cv1
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        if (isAttached()) {
            wu0 wu0Var = y64.M(this).G;
            vs0 vs0Var = this.w;
            vs0Var.getClass();
            vs0Var.a = new as0(new sk3(wu0Var));
        }
        lv0 lv0Var = this.C;
        if (lv0Var != null) {
            lv0Var.e = y64.M(this).G;
        }
    }

    @Override // defpackage.iu0
    public final void onDensityChange() {
        h0();
        if (isAttached()) {
            wu0 wu0Var = y64.M(this).G;
            vs0 vs0Var = this.w;
            vs0Var.getClass();
            vs0Var.a = new as0(new sk3(wu0Var));
        }
        lv0 lv0Var = this.C;
        if (lv0Var != null) {
            lv0Var.e = y64.M(this).G;
        }
    }
}
