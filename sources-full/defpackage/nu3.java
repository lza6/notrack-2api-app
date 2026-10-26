package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.autofill.ContentDataType$Companion;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;

/* JADX INFO: loaded from: classes.dex */
public final class nu3 extends ju0 implements rz0, PlatformTextInputModifierNode, xe3, ab1, ga1, nf1, hx2, cv1, wk0, rf2, jn2, ax1 {
    public final ci4 A;
    public final lu3 B;
    public final ku3 C;
    public ym3 D;
    public final hu3 E;
    public final ft2 F;
    public c h;
    public az3 l;
    public wx3 m;
    public boolean n;
    public boolean o;
    public yv1 p;
    public boolean q;
    public gh2 r;
    public boolean s;
    public ki2 t;
    public final sq3 u;
    public xi1 v;
    public final yx0 w;
    public boolean x;
    public WindowInfo y;
    public ym3 z;

    public nu3(c cVar, az3 az3Var, wx3 wx3Var, boolean z, boolean z2, yv1 yv1Var, boolean z3, gh2 gh2Var, boolean z4, ki2 ki2Var) {
        this.h = cVar;
        this.l = az3Var;
        this.m = wx3Var;
        this.n = z;
        this.o = z2;
        this.p = yv1Var;
        this.q = z3;
        this.r = gh2Var;
        this.s = z4;
        this.t = ki2Var;
        wx3Var.l = new hu3(this, 0);
        int i = 4;
        q qVar = new q(i, this);
        yw2 yw2Var = oq3.a;
        sq3 sq3Var = new sq3(null, null, null, qVar);
        v0(sq3Var);
        this.u = sq3Var;
        int i2 = 6;
        hu3 hu3Var = new hu3(this, i2);
        int i3 = 16;
        ea eaVar = new ea(i3, this);
        yx0 yx0Var = new yx0(new rc(new pj2(23, hu3Var), i3, new vu3(new ku3(this, 2), eaVar, new ku3(this, 3), new ku3(this, i), new ku3(this, 5), new ku3(this, i2))), 1);
        v0(yx0Var);
        this.w = yx0Var;
        this.A = new ci4(8);
        this.B = new lu3(this);
        this.C = new ku3(this, 1);
        this.E = new hu3(this, 11);
        this.F = cl3.d(Boolean.FALSE);
    }

    public static final void y0(nu3 nu3Var) {
        xi1 xi1Var = nu3Var.v;
        if (xi1Var != null) {
            ((hh2) nu3Var.r).b(new yi1(xi1Var));
            nu3Var.v = null;
        }
    }

    public final boolean A0() {
        WindowInfo windowInfo = this.y;
        return this.x && (windowInfo != null && windowInfo.isWindowFocused());
    }

    public final void B0() {
        this.m.f = A0();
        so0 so0Var = null;
        if (A0() && this.z == null) {
            this.z = py.F(getCoroutineScope(), null, null, new iu3(this, so0Var, 4), 3);
        } else {
            if (A0()) {
                return;
            }
            ym3 ym3Var = this.z;
            if (ym3Var != null) {
                ym3Var.c(null);
            }
            this.z = null;
        }
    }

    public final SoftwareKeyboardController C0() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) gm4.t(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        u41.r("No software keyboard controller");
        return null;
    }

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        this.u.D(yw2Var, zw2Var, j);
    }

    public final void D0(boolean z) {
        if (!z) {
            Boolean bool = this.p.e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        u33.a(this);
        this.D = py.F(getCoroutineScope(), null, null, new iu3(this, null, 5), 3);
    }

    @Override // defpackage.jn2
    public final void F() {
        p23.M(this, new hu3(this, 9));
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        wx1Var.a();
        if (((Boolean) this.F.getValue()).booleanValue()) {
            tz0.f(wx1Var, ((re0) gm4.t(this, zo.a)).a, 0L, 0L, 0.0f, null, 126);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    @Override // defpackage.cv1
    public final boolean R(KeyEvent keyEvent) {
        boolean z;
        float fIntBitsToFloat;
        boolean z2;
        h43 h43VarG;
        Integer numA;
        c cVar = this.h;
        az3 az3Var = this.l;
        wx3 wx3Var = this.m;
        boolean z3 = this.n && !this.o;
        boolean z4 = this.q;
        hu3 hu3Var = new hu3(this, 8);
        ci4 ci4Var = this.A;
        ci4Var.getClass();
        lw3 lw3Var = (lw3) ci4Var.d;
        if (av1.A(keyEvent) == 2 && keyEvent.isFromSource(257) && !sf3.K(keyEvent)) {
            wx3Var.k.setValue(Boolean.FALSE);
        }
        long jB = g13.b(keyEvent.getKeyCode());
        if (av1.A(keyEvent) == 1) {
            mh2 mh2Var = (mh2) ci4Var.l;
            if (mh2Var != null && mh2Var.a(jB)) {
                mh2 mh2Var2 = (mh2) ci4Var.l;
                if (mh2Var2 != null) {
                    mh2Var2.e(jB);
                }
                return true;
            }
        } else if (av1.A(keyEvent) != 0 || gm4.H(keyEvent)) {
            if (!gm4.H(keyEvent) || (numA = ((ur0) ci4Var.h).a(keyEvent)) == null) {
                uu1 uu1VarS = iv1.a.s(keyEvent);
                if (uu1VarS == null || (uu1VarS.c && !z3)) {
                    z = false;
                } else {
                    boolean zK = sf3.K(keyEvent);
                    xy3 xy3VarB = az3Var.b();
                    cx1 cx1VarD = az3Var.d();
                    if (cx1VarD == null) {
                        fIntBitsToFloat = Float.NaN;
                    } else {
                        cx1 cx1Var = cx1VarD.z() ? cx1VarD : null;
                        if (cx1Var == null) {
                            fIntBitsToFloat = Float.NaN;
                        } else {
                            cx1 cx1Var2 = (cx1) az3Var.f.getValue();
                            if (cx1Var2 == null) {
                                h43VarG = null;
                            } else {
                                if (!cx1Var2.z()) {
                                    cx1Var2 = null;
                                }
                                if (cx1Var2 != null) {
                                    h43VarG = cx1Var2.G(cx1Var, true);
                                } else {
                                    h43VarG = null;
                                }
                            }
                            if (h43VarG != null) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (h43VarG.d() & 4294967295L));
                            } else {
                                fIntBitsToFloat = Float.NaN;
                            }
                        }
                    }
                    kw3 kw3Var = new kw3(cVar, xy3VarB, zK, fIntBitsToFloat, lw3Var);
                    ft2 ft2Var = cVar.d;
                    ay3 ay3Var = cVar.a;
                    int iOrdinal = uu1VarS.ordinal();
                    String str = kw3Var.j;
                    switch (iOrdinal) {
                        case 0:
                            z2 = true;
                            lw3Var.a = Float.NaN;
                            if (str.length() > 0) {
                                if (!jz3.c(kw3Var.h)) {
                                    boolean zB = kw3Var.b();
                                    long j = kw3Var.h;
                                    if (zB) {
                                        int iF = jz3.f(j);
                                        kw3Var.h = p23.d(iF, iF);
                                    } else {
                                        int iE = jz3.e(j);
                                        kw3Var.h = p23.d(iE, iE);
                                    }
                                } else if (kw3Var.b()) {
                                    kw3Var.j();
                                } else {
                                    kw3Var.g();
                                }
                            }
                            z = z2;
                            break;
                        case 1:
                            z2 = true;
                            lw3Var.a = Float.NaN;
                            if (str.length() > 0) {
                                if (!jz3.c(kw3Var.h)) {
                                    boolean zB2 = kw3Var.b();
                                    long j2 = kw3Var.h;
                                    if (zB2) {
                                        int iE2 = jz3.e(j2);
                                        kw3Var.h = p23.d(iE2, iE2);
                                    } else {
                                        int iF2 = jz3.f(j2);
                                        kw3Var.h = p23.d(iF2, iF2);
                                    }
                                } else if (kw3Var.b()) {
                                    kw3Var.g();
                                } else {
                                    kw3Var.j();
                                }
                            }
                            z = z2;
                            break;
                        case 2:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.i();
                            } else {
                                kw3Var.l();
                            }
                            z = z2;
                            break;
                        case 3:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.l();
                            } else {
                                kw3Var.i();
                            }
                            z = z2;
                            break;
                        case 4:
                            z2 = true;
                            kw3Var.h();
                            z = z2;
                            break;
                        case 5:
                            z2 = true;
                            kw3Var.k();
                            z = z2;
                            break;
                        case 6:
                            z2 = true;
                            kw3Var.p();
                            z = z2;
                            break;
                        case 7:
                            z2 = true;
                            kw3Var.o();
                            z = z2;
                            break;
                        case 8:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.p();
                            } else {
                                kw3Var.o();
                            }
                            z = z2;
                            break;
                        case 9:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.o();
                            } else {
                                kw3Var.p();
                            }
                            z = z2;
                            break;
                        case 10:
                            z2 = true;
                            kw3Var.q();
                            z = z2;
                            break;
                        case 11:
                            z2 = true;
                            kw3Var.e();
                            z = z2;
                            break;
                        case 12:
                            z2 = true;
                            kw3Var.r();
                            z = z2;
                            break;
                        case 13:
                            z2 = true;
                            kw3Var.f();
                            z = z2;
                            break;
                        case 14:
                            z2 = true;
                            kw3Var.n();
                            z = z2;
                            break;
                        case 15:
                            z2 = true;
                            kw3Var.m();
                            z = z2;
                            break;
                        case 16:
                        case 17:
                        case 18:
                            z2 = true;
                            this.C.invoke(uu1VarS);
                            z = z2;
                            break;
                        case 19:
                            z2 = true;
                            kw3Var.j();
                            kw3Var.a();
                            z = z2;
                            break;
                        case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                            z2 = true;
                            kw3Var.g();
                            kw3Var.a();
                            z = z2;
                            break;
                        case 21:
                            z2 = true;
                            kw3Var.l();
                            kw3Var.a();
                            z = z2;
                            break;
                        case 22:
                            z2 = true;
                            kw3Var.i();
                            kw3Var.a();
                            z = z2;
                            break;
                        case 23:
                            z2 = true;
                            kw3Var.p();
                            kw3Var.a();
                            z = z2;
                            break;
                        case 24:
                            z2 = true;
                            kw3Var.o();
                            kw3Var.a();
                            z = z2;
                            break;
                        case 25:
                            z2 = true;
                            lw3Var.a = Float.NaN;
                            if (str.length() > 0) {
                                kw3Var.h = p23.d(0, str.length());
                            }
                            z = z2;
                            break;
                        case 26:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.j();
                            } else {
                                kw3Var.g();
                            }
                            kw3Var.s();
                            z = z2;
                            break;
                        case 27:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.g();
                            } else {
                                kw3Var.j();
                            }
                            kw3Var.s();
                            z = z2;
                            break;
                        case 28:
                            z2 = true;
                            kw3Var.q();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 29:
                            z2 = true;
                            kw3Var.e();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 30:
                            z2 = true;
                            kw3Var.r();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 31:
                            z2 = true;
                            kw3Var.f();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 32:
                            z2 = true;
                            kw3Var.n();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 33:
                            z2 = true;
                            kw3Var.m();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 34:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.l();
                            } else {
                                kw3Var.i();
                            }
                            kw3Var.s();
                            z = z2;
                            break;
                        case 35:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.i();
                            } else {
                                kw3Var.l();
                            }
                            kw3Var.s();
                            z = z2;
                            break;
                        case 36:
                            z2 = true;
                            kw3Var.h();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 37:
                            z2 = true;
                            kw3Var.k();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 38:
                            z2 = true;
                            kw3Var.p();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 39:
                            z2 = true;
                            kw3Var.o();
                            kw3Var.s();
                            z = z2;
                            break;
                        case 40:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.p();
                            } else {
                                kw3Var.o();
                            }
                            kw3Var.s();
                            z = z2;
                            break;
                        case 41:
                            z2 = true;
                            if (kw3Var.b()) {
                                kw3Var.o();
                            } else {
                                kw3Var.p();
                            }
                            kw3Var.s();
                            z = z2;
                            break;
                        case 42:
                            z2 = true;
                            lw3Var.a = Float.NaN;
                            if (str.length() > 0) {
                                long j3 = kw3Var.h;
                                int i = jz3.c;
                                int i2 = (int) (j3 & 4294967295L);
                                kw3Var.h = p23.d(i2, i2);
                            }
                            z = z2;
                            break;
                        case 43:
                            z2 = true;
                            if (z4 == 0) {
                                c.h(cVar, "\n", !sf3.K(keyEvent), 4);
                            } else {
                                hu3Var.invoke();
                            }
                            z = z2;
                            break;
                        case 44:
                            z2 = true;
                            if (!z4) {
                                c.h(cVar, "\t", !sf3.K(keyEvent), 4);
                                z = z2;
                            } else {
                                z = false;
                            }
                            break;
                        case 45:
                            ay3 ay3Var2 = (ay3) ay3Var.e.d;
                            fp1 fp1Var = ay3Var2.a;
                            p84 p84Var = (p84) fp1Var.c;
                            ml3 ml3Var = p84Var.b;
                            if (ml3Var.isEmpty() && ((xz3) ((ft2) fp1Var.d).getValue()) == null) {
                                z2 = true;
                            } else {
                                fp1Var.e();
                                if (ml3Var.isEmpty()) {
                                    so1.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                }
                                Object objT0 = pe0.t0(ml3Var);
                                p84Var.c.add(objT0);
                                xz3 xz3Var = (xz3) objT0;
                                ay3Var2.b.a().f();
                                zt3 zt3Var = ay3Var2.b;
                                int i3 = xz3Var.a;
                                zt3Var.c(i3, xz3Var.c.length() + i3, xz3Var.b);
                                long j4 = xz3Var.d;
                                y64.P(zt3Var, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                                z2 = true;
                                ay3Var2.c(ay3Var2.b(), zt3.g(ay3Var2.b, 0L, null, 7), true);
                            }
                            z = z2;
                            break;
                        case 46:
                            ay3 ay3Var3 = (ay3) ay3Var.e.d;
                            fp1 fp1Var2 = ay3Var3.a;
                            p84 p84Var2 = (p84) fp1Var2.c;
                            ml3 ml3Var2 = p84Var2.c;
                            if (!ml3Var2.isEmpty() && ((xz3) ((ft2) fp1Var2.d).getValue()) == null) {
                                if (ml3Var2.isEmpty()) {
                                    so1.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                }
                                Object objT1 = pe0.t0(ml3Var2);
                                p84Var2.b.add(objT1);
                                xz3 xz3Var2 = (xz3) objT1;
                                ay3Var3.b.a().f();
                                zt3 zt3Var2 = ay3Var3.b;
                                int i4 = xz3Var2.a;
                                zt3Var2.c(i4, xz3Var2.b.length() + i4, xz3Var2.c);
                                long j5 = xz3Var2.e;
                                y64.P(zt3Var2, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                                ay3Var3.c(ay3Var3.b(), zt3.g(ay3Var3.b, 0L, null, 7), true);
                            }
                            z2 = true;
                            z = z2;
                            break;
                        default:
                            z2 = true;
                            z = z2;
                            break;
                    }
                    if (!jz3.b(kw3Var.h, kw3Var.f.h)) {
                        cVar.j(kw3Var.h);
                    }
                    qf4 qf4Var = kw3Var.i;
                    if (qf4Var != null) {
                        if (jz3.c(ay3Var.b().h)) {
                            ft2Var.setValue(new se3(qf4Var, qf4Var));
                        } else {
                            ft2Var.setValue(new se3(kw3Var.g.a, qf4Var));
                        }
                    }
                }
            } else {
                String string = new StringBuilder(2).appendCodePoint(numA.intValue()).toString();
                if (z3) {
                    c.h(cVar, string, !sf3.K(keyEvent), 4);
                    lw3Var.a = Float.NaN;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                mh2 mh2Var3 = (mh2) ci4Var.l;
                if (mh2Var3 == null) {
                    mh2Var3 = new mh2(3);
                    ci4Var.l = mh2Var3;
                }
                mh2Var3.d(jB);
            }
            return z;
        }
        return false;
    }

    @Override // defpackage.ga1
    public final void U(cb1 cb1Var) {
        if (this.x == cb1Var.b()) {
            return;
        }
        this.x = cb1Var.b();
        B0();
        boolean z = this.n && !this.o;
        if (cb1Var.b()) {
            if (z) {
                D0(false);
                return;
            }
            return;
        }
        z0();
        c cVar = this.h;
        ay3 ay3Var = cVar.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        zt3Var.e(null);
        cVar.l(zt3Var);
        ay3.a(ay3Var, true, wu3.c);
        this.h.a();
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        this.l.f.setValue(wl2Var);
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        au3 au3VarB = this.h.a.b();
        long j = au3VarB.h;
        hg hgVar = new hg(this.h.a.b().d.toString());
        pu1[] pu1VarArr = ef3.a;
        ff3 ff3Var = cf3.C;
        pu1[] pu1VarArr2 = ef3.a;
        pu1 pu1Var = pu1VarArr2[16];
        ff3Var.a(gf3Var, hgVar);
        hg hgVar2 = new hg(au3VarB.d.toString());
        ff3 ff3Var2 = cf3.D;
        pu1 pu1Var2 = pu1VarArr2[17];
        ff3Var2.a(gf3Var, hgVar2);
        ff3 ff3Var3 = cf3.E;
        pu1 pu1Var3 = pu1VarArr2[18];
        ff3Var3.a(gf3Var, new jz3(j));
        if (!this.n) {
            ef3.c(gf3Var);
        }
        if (this.s) {
            ((ue3) gf3Var).j(cf3.I, w84.a);
        }
        int i = 0;
        int i2 = 1;
        boolean z = this.n && !this.o;
        ff3 ff3Var4 = cf3.L;
        pu1 pu1Var4 = pu1VarArr2[24];
        ff3Var4.a(gf3Var, Boolean.valueOf(z));
        ga text = ContentDataType$Companion.getText();
        ff3 ff3Var5 = cf3.q;
        pu1 pu1Var5 = pu1VarArr2[8];
        ff3Var5.a(gf3Var, text);
        ju3 ju3Var = new ju3(z, this, i);
        ff3 ff3Var6 = te3.g;
        z0 z0Var = new z0(null, ju3Var);
        ue3 ue3Var = (ue3) gf3Var;
        ue3Var.j(ff3Var6, z0Var);
        ef3.d(gf3Var, new ku3(this, i));
        int i3 = 2;
        if (z) {
            ue3Var.j(te3.j, new z0(null, new ju3(z, this, i2)));
            ue3Var.j(te3.n, new z0(null, new ju3(z, this, i3)));
        }
        int i4 = 3;
        ue3Var.j(te3.i, new z0(null, new zg(i4, this)));
        int iA = this.p.a();
        ef3.e(gf3Var, iA, new id3(iA, i2, this));
        ue3Var.j(te3.b, new z0(null, new hu3(this, i4)));
        ue3Var.j(te3.c, new z0(null, new hu3(this, 4)));
        if (!jz3.c(j) && !this.s) {
            ue3Var.j(te3.p, new z0(null, new hu3(this, 5)));
            if (this.n && !this.o) {
                ue3Var.j(te3.q, new z0(null, new hu3(this, i2)));
            }
        }
        if (z) {
            ue3Var.j(te3.r, new z0(null, new hu3(this, i3)));
        }
    }

    @Override // defpackage.xe3
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // defpackage.hx2
    public final void h0() {
        this.u.h0();
    }

    @Override // defpackage.cv1
    public final boolean j(KeyEvent keyEvent) {
        c cVar = this.h;
        wx3 wx3Var = this.m;
        pa1 pa1Var = (pa1) gm4.t(this, CompositionLocalsKt.getLocalFocusManager());
        SoftwareKeyboardController softwareKeyboardControllerC0 = C0();
        this.A.getClass();
        if (!jz3.c(cVar.d().h) && keyEvent.getKeyCode() == 4 && av1.A(keyEvent) == 1) {
            c cVar2 = wx3Var.a;
            if (!jz3.c(cVar2.d().h)) {
                ay3 ay3Var = cVar2.a;
                ay3Var.b.a().f();
                zt3 zt3Var = ay3Var.b;
                int i = (int) (zt3Var.l & 4294967295L);
                y64.P(zt3Var, i, i);
                ay3.a(ay3Var, true, wu3.c);
            }
            wx3Var.w(false);
            wx3Var.x(vz3.c);
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual() && av1.A(keyEvent) == 2 && keyEvent.getSource() != 257) {
            if (sf3.d(19, keyEvent)) {
                return ((va1) pa1Var).f(5);
            }
            if (sf3.d(20, keyEvent)) {
                return ((va1) pa1Var).f(6);
            }
            if (sf3.d(21, keyEvent)) {
                return ((va1) pa1Var).f(3);
            }
            if (sf3.d(22, keyEvent)) {
                return ((va1) pa1Var).f(4);
            }
            if (sf3.d(23, keyEvent)) {
                softwareKeyboardControllerC0.show();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ax1
    public final void n(cx1 cx1Var) {
        this.w.getClass();
    }

    @Override // defpackage.of2
    public final void onAttach() {
        F();
        this.m.m = this.E;
    }

    @Override // defpackage.of2
    public final void onDetach() {
        z0();
        this.m.m = null;
    }

    @Override // defpackage.ax1
    public final void q(long j) {
        this.w.l = j;
    }

    public final void z0() {
        ym3 ym3Var = this.D;
        if (ym3Var != null) {
            ym3Var.c(null);
        }
        this.D = null;
        ki2 ki2Var = this.t;
        if (ki2Var != null) {
            ki2Var.c();
        }
    }
}
