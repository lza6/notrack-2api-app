package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class tk0 implements m63, y33, cl0, pk0 {
    public final kk0 A;
    public boolean B;
    public final qk0 c;
    public final xk d;
    public final AtomicReference h = new AtomicReference(null);
    public final Object l = new Object();
    public final ji2 m;
    public final yj3 n;
    public final fi2 o;
    public final gi2 p;
    public final gi2 q;
    public final fi2 r;
    public final s20 s;
    public final s20 t;
    public final fi2 u;
    public fi2 v;
    public boolean w;
    public tk0 x;
    public int y;
    public final t73 z;

    public tk0(qk0 qk0Var, h hVar) {
        this.c = qk0Var;
        this.d = hVar;
        ji2 ji2Var = new ji2(new gi2());
        this.m = ji2Var;
        yj3 yj3Var = new yj3();
        if (qk0Var.c()) {
            yj3Var.s = new dh2();
        }
        if (qk0Var.e()) {
            yj3Var.d();
        }
        this.n = yj3Var;
        this.o = xr0.Q();
        this.p = new gi2();
        this.q = new gi2();
        this.r = xr0.Q();
        s20 s20Var = new s20();
        this.s = s20Var;
        s20 s20Var2 = new s20();
        this.t = s20Var2;
        this.u = xr0.Q();
        this.v = xr0.Q();
        this.z = new t73(28);
        kk0 kk0Var = new kk0(hVar, qk0Var, yj3Var, ji2Var, s20Var, s20Var2, this);
        qk0Var.l(kk0Var);
        this.A = kk0Var;
        yg0 yg0Var = ni0.a;
    }

    @Override // defpackage.y33
    public final ur1 a(w33 w33Var, Object obj) {
        tk0 tk0Var;
        if (w33Var.getDefaultsInScope()) {
            w33Var.setDefaultsInvalid(true);
        }
        h8 anchor = w33Var.getAnchor();
        if (anchor == null || !anchor.a()) {
            return ur1.c;
        }
        if (this.n.k(anchor)) {
            return !w33Var.getCanRecompose() ? ur1.c : t(w33Var, anchor, obj);
        }
        synchronized (this.l) {
            tk0Var = this.x;
        }
        if (tk0Var != null) {
            kk0 kk0Var = tk0Var.A;
            if (kk0Var.E && kk0Var.g0(w33Var, obj)) {
                return ur1.l;
            }
        }
        return ur1.c;
    }

    @Override // defpackage.y33
    public final void b() {
        this.w = true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[LOOP:0: B:17:0x0049->B:32:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[EDGE_INSN: B:36:0x009a->B:33:0x009a BREAK  A[LOOP:0: B:17:0x0049->B:32:0x0097], SYNTHETIC] */
    @Override // defpackage.y33
    public final void c(Object obj) {
        w33 w33VarC;
        kk0 kk0Var = this.A;
        if (kk0Var.z <= 0 && (w33VarC = kk0Var.C()) != null) {
            w33VarC.setUsed(true);
            if (w33VarC.recordRead(obj)) {
                return;
            }
            if (obj instanceof mn3) {
                ((mn3) obj).e(1);
            }
            xr0.J(this.o, obj, w33VarC);
            if (obj instanceof gv0) {
                gv0 gv0Var = (gv0) obj;
                dv0 dv0VarH = ((fv0) gv0Var).h();
                fi2 fi2Var = this.r;
                xr0.o0(fi2Var, obj);
                rh2 rh2Var = dv0VarH.e;
                Object[] objArr = rh2Var.b;
                long[] jArr = rh2Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    ln3 ln3Var = (ln3) objArr[(i << 3) + i4];
                                    if (ln3Var instanceof mn3) {
                                        ((mn3) ln3Var).e(1);
                                    }
                                    xr0.J(fi2Var, ln3Var, obj);
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                w33VarC.recordDerivedStateValue(gv0Var, dv0VarH.f);
            }
        }
    }

    public final void d() {
        this.h.set(null);
        this.s.k.O();
        this.t.k.O();
        ji2 ji2Var = this.m;
        if (ji2Var.c.g()) {
            return;
        }
        new ArrayList();
        if (ji2Var.c.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            gf1 gf1Var = new gf1(ji2Var);
            qf3 qf3Var = (qf3) gf1Var.h;
            while (qf3Var.hasNext()) {
                a53 a53Var = (a53) qf3Var.next();
                gf1Var.remove();
                a53Var.b();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.pk0
    public final void dispose() {
        synchronized (this.l) {
            try {
                if (this.A.E) {
                    zx2.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.B) {
                    this.B = true;
                    yg0 yg0Var = ni0.b;
                    s20 s20Var = this.A.K;
                    if (s20Var != null) {
                        h(s20Var);
                    }
                    boolean z = this.n.d > 0;
                    if (z || !this.m.c.g()) {
                        z43 z43Var = new z43(this.m);
                        if (z) {
                            this.d.getClass();
                            bk3 bk3VarJ = this.n.j();
                            try {
                                mk0.g(bk3VarJ, z43Var);
                                bk3VarJ.e(true);
                                this.d.clear();
                                this.d.g();
                                z43Var.b();
                            } catch (Throwable th) {
                                bk3VarJ.e(false);
                                throw th;
                            }
                        }
                        z43Var.a();
                    }
                    kk0 kk0Var = this.A;
                    kk0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        kk0Var.b.o(kk0Var);
                        kk0Var.D.clear();
                        kk0Var.r.clear();
                        kk0Var.e.k.O();
                        kk0Var.u = null;
                        kk0Var.a.clear();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.c.p(this);
    }

    public final void e(Object obj, boolean z) {
        Object objG = this.o.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof gi2;
        ur1 ur1Var = ur1.c;
        gi2 gi2Var = this.p;
        gi2 gi2Var2 = this.q;
        fi2 fi2Var = this.u;
        if (!z2) {
            w33 w33Var = (w33) objG;
            if (xr0.n0(fi2Var, obj, w33Var) || w33Var.invalidateForResult(obj) == ur1Var) {
                return;
            }
            if (!w33Var.isConditional() || z) {
                gi2Var.a(w33Var);
                return;
            } else {
                gi2Var2.a(w33Var);
                return;
            }
        }
        gi2 gi2Var3 = (gi2) objG;
        Object[] objArr = gi2Var3.b;
        long[] jArr = gi2Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w33 w33Var2 = (w33) objArr[(i << 3) + i3];
                        if (!xr0.n0(fi2Var, obj, w33Var2) && w33Var2.invalidateForResult(obj) != ur1Var) {
                            if (!w33Var2.isConditional() || z) {
                                gi2Var.a(w33Var2);
                            } else {
                                gi2Var2.a(w33Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void f(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof ta3;
        fi2 fi2Var = this.r;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            gi2 gi2Var = ((ta3) set).c;
            Object[] objArr = gi2Var.b;
            long[] jArr9 = gi2Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof w33) {
                                    ((w33) obj2).invalidateForResult(obj);
                                } else {
                                    e(obj2, z);
                                    Object objG = fi2Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof gi2) {
                                            gi2 gi2Var2 = (gi2) objG;
                                            Object[] objArr2 = gi2Var2.b;
                                            long[] jArr10 = gi2Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                e((gv0) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            e((gv0) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof w33) {
                    ((w33) obj3).invalidateForResult(null);
                } else {
                    e(obj3, z);
                    Object objG2 = fi2Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof gi2) {
                            gi2 gi2Var3 = (gi2) objG2;
                            Object[] objArr3 = gi2Var3.b;
                            long[] jArr12 = gi2Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                e((gv0) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            e((gv0) objG2, z);
                        }
                    }
                }
            }
        }
        fi2 fi2Var2 = this.o;
        gi2 gi2Var4 = this.p;
        if (z) {
            gi2 gi2Var5 = this.q;
            if (gi2Var5.h()) {
                long[] jArr13 = fi2Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = fi2Var2.b[i18];
                                    Object obj5 = fi2Var2.c[i18];
                                    if (obj5 instanceof gi2) {
                                        gi2 gi2Var6 = (gi2) obj5;
                                        Object[] objArr4 = gi2Var6.b;
                                        long[] jArr14 = gi2Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            w33 w33Var = (w33) objArr5[i22];
                                                            if (gi2Var5.c(w33Var) || gi2Var4.c(w33Var)) {
                                                                gi2Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = gi2Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        w33 w33Var2 = (w33) obj5;
                                        zG = gi2Var5.c(w33Var2) || gi2Var4.c(w33Var2);
                                    }
                                    if (zG) {
                                        fi2Var2.k(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                gi2Var5.b();
                k();
                return;
            }
        }
        if (gi2Var4.h()) {
            long[] jArr16 = fi2Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = fi2Var2.b[i26];
                                Object obj7 = fi2Var2.c[i26];
                                if (obj7 instanceof gi2) {
                                    gi2 gi2Var7 = (gi2) obj7;
                                    Object[] objArr6 = gi2Var7.b;
                                    long[] jArr17 = gi2Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (gi2Var4.c((w33) objArr7[i30])) {
                                                            gi2Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = gi2Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = gi2Var4.c((w33) obj7);
                                }
                                if (zC) {
                                    fi2Var2.k(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            k();
            gi2Var4.b();
        }
    }

    public final void g() {
        synchronized (this.l) {
            try {
                h(this.s);
                p();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.m.c.g()) {
                            ji2 ji2Var = this.m;
                            new ArrayList();
                            if (!ji2Var.c.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    gf1 gf1Var = new gf1(ji2Var);
                                    while (((qf3) gf1Var.h).hasNext()) {
                                        a53 a53Var = (a53) ((qf3) gf1Var.h).next();
                                        gf1Var.remove();
                                        a53Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        d();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.cl0
    public final Object getCompositionService(bl0 bl0Var) {
        if (kr1.n(bl0Var, uk0.b)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.pk0
    public final boolean getHasInvalidations() {
        boolean z;
        synchronized (this.l) {
            z = this.v.e > 0;
        }
        return z;
    }

    public final void h(s20 s20Var) {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        int i3;
        s20 s20Var2 = this.t;
        z43 z43Var = new z43(this.m);
        try {
            if (s20Var.k.Q()) {
                if (s20Var2.k.Q()) {
                    z43Var.a();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                xk xkVar = this.d;
                xkVar.getClass();
                bk3 bk3VarJ = this.n.j();
                int i4 = 0;
                try {
                    s20Var.O(xkVar, bk3VarJ, z43Var);
                    bk3VarJ.e(true);
                    xkVar.g();
                    Trace.endSection();
                    z43Var.b();
                    oi2 oi2Var = z43Var.e;
                    if (oi2Var.h != 0) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            Object[] objArr = oi2Var.c;
                            int i5 = oi2Var.h;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((je1) objArr[i6]).invoke();
                            }
                            oi2Var.i();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (this.w) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.w = false;
                            fi2 fi2Var = this.o;
                            long[] jArr3 = fi2Var.a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j3 = jArr3[i7];
                                    char c2 = 7;
                                    long j4 = -9187201950435737472L;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8;
                                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                                        int i10 = i4;
                                        while (i10 < i9) {
                                            if ((j3 & 255) < 128) {
                                                c = c2;
                                                int i11 = (i7 << 3) + i10;
                                                j2 = j4;
                                                Object obj = fi2Var.b[i11];
                                                Object obj2 = fi2Var.c[i11];
                                                if (obj2 instanceof gi2) {
                                                    gi2 gi2Var = (gi2) obj2;
                                                    Object[] objArr2 = gi2Var.b;
                                                    long[] jArr4 = gi2Var.a;
                                                    int i12 = i8;
                                                    int length2 = jArr4.length - 2;
                                                    if (length2 >= 0) {
                                                        jArr2 = jArr3;
                                                        int i13 = 0;
                                                        while (true) {
                                                            long j5 = jArr4[i13];
                                                            j = j3;
                                                            if ((((~j5) << c) & j5 & j2) != j2) {
                                                                int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                                int i15 = 0;
                                                                while (i15 < i14) {
                                                                    if ((j5 & 255) < 128) {
                                                                        i3 = i10;
                                                                        int i16 = (i13 << 3) + i15;
                                                                        if (!((w33) objArr2[i16]).getValid()) {
                                                                            gi2Var.m(i16);
                                                                        }
                                                                    } else {
                                                                        i3 = i10;
                                                                    }
                                                                    j5 >>= i12;
                                                                    i15++;
                                                                    i10 = i3;
                                                                }
                                                                i = i10;
                                                                if (i14 != i12) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i = i10;
                                                            }
                                                            if (i13 == length2) {
                                                                break;
                                                            }
                                                            i13++;
                                                            j3 = j;
                                                            i10 = i;
                                                            i12 = 8;
                                                        }
                                                    } else {
                                                        i = i10;
                                                        jArr2 = jArr3;
                                                        j = j3;
                                                    }
                                                    zG = gi2Var.g();
                                                } else {
                                                    i = i10;
                                                    jArr2 = jArr3;
                                                    j = j3;
                                                    obj2.getClass();
                                                    zG = !((w33) obj2).getValid();
                                                }
                                                if (zG) {
                                                    fi2Var.k(i11);
                                                }
                                                i2 = 8;
                                            } else {
                                                i = i10;
                                                jArr2 = jArr3;
                                                j = j3;
                                                c = c2;
                                                j2 = j4;
                                                i2 = i8;
                                            }
                                            j3 = j >> i2;
                                            i8 = i2;
                                            c2 = c;
                                            j4 = j2;
                                            jArr3 = jArr2;
                                            i10 = i + 1;
                                        }
                                        jArr = jArr3;
                                        if (i9 != i8) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                    jArr3 = jArr;
                                    i4 = 0;
                                }
                            }
                            k();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (s20Var2.k.Q()) {
                        z43Var.a();
                    }
                } catch (Throwable th3) {
                    bk3VarJ.e(false);
                    throw th3;
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            if (s20Var2.k.Q()) {
                z43Var.a();
            }
            throw th5;
        }
    }

    public final void i() {
        synchronized (this.l) {
            try {
                if (this.t.k.R()) {
                    h(this.t);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.m.c.g()) {
                            ji2 ji2Var = this.m;
                            new ArrayList();
                            if (!ji2Var.c.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    gf1 gf1Var = new gf1(ji2Var);
                                    while (((qf3) gf1Var.h).hasNext()) {
                                        a53 a53Var = (a53) ((qf3) gf1Var.h).next();
                                        gf1Var.remove();
                                        a53Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e) {
                        d();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // defpackage.pk0
    public final boolean isDisposed() {
        return this.B;
    }

    public final void j() {
        synchronized (this.l) {
            try {
                this.A.u = null;
                if (!this.m.c.g()) {
                    ji2 ji2Var = this.m;
                    new ArrayList();
                    if (!ji2Var.c.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            gf1 gf1Var = new gf1(ji2Var);
                            while (((qf3) gf1Var.h).hasNext()) {
                                a53 a53Var = (a53) ((qf3) gf1Var.h).next();
                                gf1Var.remove();
                                a53Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.m.c.g()) {
                            ji2 ji2Var2 = this.m;
                            new ArrayList();
                            if (!ji2Var2.c.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    gf1 gf1Var2 = new gf1(ji2Var2);
                                    while (((qf3) gf1Var2.h).hasNext()) {
                                        a53 a53Var2 = (a53) ((qf3) gf1Var2.h).next();
                                        gf1Var2.remove();
                                        a53Var2.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e) {
                        d();
                        throw e;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        fi2 fi2Var = this.r;
        long[] jArr3 = fi2Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = fi2Var.b[i10];
                            Object obj2 = fi2Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof gi2;
                            j5 = j8;
                            fi2 fi2Var2 = this.o;
                            if (z) {
                                gi2 gi2Var = (gi2) obj2;
                                Object[] objArr = gi2Var.b;
                                long[] jArr4 = gi2Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!fi2Var2.c((gv0) objArr[i15])) {
                                                        gi2Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = gi2Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !fi2Var2.c((gv0) obj2);
                            }
                            if (zG) {
                                fi2Var.k(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        gi2 gi2Var2 = this.q;
        if (!gi2Var2.h()) {
            return;
        }
        Object[] objArr2 = gi2Var2.b;
        long[] jArr5 = gi2Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (!((w33) objArr2[i20]).isConditional()) {
                            gi2Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void l(yg0 yg0Var) throws Exception {
        try {
            synchronized (this.l) {
                o();
                fi2 fi2Var = this.v;
                this.v = xr0.Q();
                try {
                    this.z.getClass();
                    this.c.getClass();
                    kk0 kk0Var = this.A;
                    if (!kk0Var.e.k.Q()) {
                        mk0.c("Expected applyChanges() to have been called");
                    }
                    kk0Var.p(fi2Var, yg0Var);
                } catch (Exception e) {
                    this.v = fi2Var;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.m.c.g()) {
                    ji2 ji2Var = this.m;
                    new ArrayList();
                    if (!ji2Var.c.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            gf1 gf1Var = new gf1(ji2Var);
                            while (((qf3) gf1Var.h).hasNext()) {
                                a53 a53Var = (a53) ((qf3) gf1Var.h).next();
                                gf1Var.remove();
                                a53Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e2) {
                d();
                throw e2;
            }
        }
    }

    public final void m(yg0 yg0Var) {
        if (this.B) {
            zx2.b("The composition is disposed");
        }
        this.c.a(this, yg0Var);
    }

    public final void n() {
        synchronized (this.l) {
            try {
                boolean z = this.n.d > 0;
                if (z || !this.m.c.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        z43 z43Var = new z43(this.m);
                        if (z) {
                            this.d.getClass();
                            bk3 bk3VarJ = this.n.j();
                            try {
                                mk0.e(bk3VarJ, z43Var);
                                bk3VarJ.e(true);
                                this.d.g();
                                z43Var.b();
                            } catch (Throwable th) {
                                bk3VarJ.e(false);
                                throw th;
                            }
                        }
                        z43Var.a();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                this.o.a();
                this.r.a();
                this.v.a();
                this.s.k.O();
                this.t.k.O();
                kk0 kk0Var = this.A;
                kk0Var.D.clear();
                kk0Var.r.clear();
                kk0Var.e.k.O();
                kk0Var.u = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.h;
        Object obj = uk0.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                mk0.d("pending composition has not been applied");
                u41.p();
                return;
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                mk0.d("corrupt pendingModifications drain: " + atomicReference);
                u41.p();
                return;
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void p() {
        AtomicReference atomicReference = this.h;
        Object andSet = atomicReference.getAndSet(null);
        if (kr1.n(andSet, uk0.a)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet == null) {
            mk0.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            u41.p();
        } else {
            mk0.d("corrupt pendingModifications drain: " + atomicReference);
            u41.p();
        }
    }

    public final void q() {
        f31 f31Var = f31.c;
        AtomicReference atomicReference = this.h;
        Object andSet = atomicReference.getAndSet(f31Var);
        if (kr1.n(andSet, uk0.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            mk0.d("corrupt pendingModifications drain: " + atomicReference);
            u41.p();
            return;
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void r(ArrayList arrayList) throws Exception {
        ji2 ji2Var = this.m;
        if (arrayList.size() > 0) {
            ((jg2) ((ps2) arrayList.get(0)).c).getClass();
            mk0.c("Check failed");
        }
        try {
            kk0 kk0Var = this.A;
            kk0Var.getClass();
            try {
                kk0Var.G(arrayList);
                kk0Var.k();
            } catch (Throwable th) {
                kk0Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!ji2Var.c.g()) {
                    new ArrayList();
                    if (!ji2Var.c.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            gf1 gf1Var = new gf1(ji2Var);
                            qf3 qf3Var = (qf3) gf1Var.h;
                            while (qf3Var.hasNext()) {
                                a53 a53Var = (a53) qf3Var.next();
                                gf1Var.remove();
                                a53Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e) {
                d();
                throw e;
            }
        }
    }

    public final void s() {
        synchronized (this.l) {
            try {
                for (Object obj : this.n.h) {
                    w33 w33Var = obj instanceof w33 ? (w33) obj : null;
                    if (w33Var != null) {
                        w33Var.invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pk0
    public final void setContent(ne1 ne1Var) {
        m((yg0) ne1Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4 A[Catch: all -> 0x0042, LOOP:0: B:49:0x0093->B:63:0x00d4, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:41:0x0077, B:42:0x007d, B:44:0x0083, B:46:0x0087, B:49:0x0093, B:51:0x00a3, B:53:0x00af, B:55:0x00b9, B:59:0x00c8, B:63:0x00d4, B:64:0x00d7, B:67:0x00dc), top: B:80:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[Catch: all -> 0x0042, EDGE_INSN: B:67:0x00dc->B:68:0x00e1 BREAK  A[LOOP:0: B:49:0x0093->B:63:0x00d4], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:41:0x0077, B:42:0x007d, B:44:0x0083, B:46:0x0087, B:49:0x0093, B:51:0x00a3, B:53:0x00af, B:55:0x00b9, B:59:0x00c8, B:63:0x00d4, B:64:0x00d7, B:67:0x00dc), top: B:80:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc A[SYNTHETIC] */
    public final ur1 t(w33 w33Var, h8 h8Var, Object obj) {
        synchronized (this.l) {
            try {
                tk0 tk0Var = this.x;
                tk0 tk0Var2 = null;
                if (tk0Var != null) {
                    yj3 yj3Var = this.n;
                    int i = this.y;
                    if (yj3Var.o) {
                        mk0.c("Writer is active");
                    }
                    if (i < 0 || i >= yj3Var.d) {
                        mk0.c("Invalid group index");
                    }
                    if (yj3Var.k(h8Var)) {
                        int i2 = yj3Var.c[(i * 5) + 3] + i;
                        int i3 = h8Var.a;
                        if (i > i3 || i3 >= i2) {
                            tk0Var = null;
                        }
                    } else {
                        tk0Var = null;
                    }
                    tk0Var2 = tk0Var;
                }
                if (tk0Var2 == null) {
                    kk0 kk0Var = this.A;
                    if (!(kk0Var.E && kk0Var.g0(w33Var, obj))) {
                        this.z.getClass();
                        this.c.getClass();
                        if (obj != null) {
                            boolean z = obj instanceof gv0;
                            fi2 fi2Var = this.v;
                            if (z) {
                                Object objG = fi2Var.g(w33Var);
                                if (objG != null) {
                                    if (!(objG instanceof gi2)) {
                                        if (objG != bg1.y) {
                                            xr0.J(this.v, w33Var, obj);
                                            break;
                                        }
                                    } else {
                                        gi2 gi2Var = (gi2) objG;
                                        Object[] objArr = gi2Var.b;
                                        long[] jArr = gi2Var.a;
                                        int length = jArr.length - 2;
                                        if (length < 0) {
                                            xr0.J(this.v, w33Var, obj);
                                            break;
                                        }
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i4 == length) {
                                                    xr0.J(this.v, w33Var, obj);
                                                    break;
                                                }
                                                i4++;
                                            } else {
                                                int i5 = 8;
                                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                int i7 = 0;
                                                while (i7 < i6) {
                                                    if ((j & 255) < 128 && objArr[(i4 << 3) + i7] == bg1.y) {
                                                        break loop0;
                                                    }
                                                    j >>= i5;
                                                    i7++;
                                                    i5 = i5;
                                                }
                                                if (i6 == i5) {
                                                    if (i4 == length) {
                                                        i4++;
                                                    }
                                                }
                                                xr0.J(this.v, w33Var, obj);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    xr0.J(this.v, w33Var, obj);
                                    break;
                                }
                            } else {
                                fi2Var.l(w33Var, bg1.y);
                            }
                        } else {
                            this.v.l(w33Var, bg1.y);
                        }
                    } else {
                        return ur1.l;
                    }
                }
                if (tk0Var2 != null) {
                    return tk0Var2.t(w33Var, h8Var, obj);
                }
                this.c.i(this);
                return this.A.E ? ur1.h : ur1.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.o.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof gi2;
        ur1 ur1Var = ur1.l;
        fi2 fi2Var = this.u;
        if (!z) {
            w33 w33Var = (w33) objG;
            if (w33Var.invalidateForResult(obj) == ur1Var) {
                xr0.J(fi2Var, obj, w33Var);
                return;
            }
            return;
        }
        gi2 gi2Var = (gi2) objG;
        Object[] objArr = gi2Var.b;
        long[] jArr = gi2Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        w33 w33Var2 = (w33) objArr[(i << 3) + i3];
                        if (w33Var2.invalidateForResult(obj) == ur1Var) {
                            xr0.J(fi2Var, obj, w33Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z = set instanceof ta3;
        fi2 fi2Var = this.r;
        fi2 fi2Var2 = this.o;
        if (z) {
            gi2 gi2Var = ((ta3) set).c;
            Object[] objArr = gi2Var.b;
            long[] jArr = gi2Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (fi2Var2.c(obj) || fi2Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (fi2Var2.c(obj2) || fi2Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        boolean zJ;
        synchronized (this.l) {
            try {
                o();
                try {
                    fi2 fi2Var = this.v;
                    this.v = xr0.Q();
                    try {
                        this.z.getClass();
                        this.c.getClass();
                        zJ = this.A.J(fi2Var);
                        if (!zJ) {
                            p();
                        }
                    } catch (Exception e) {
                        this.v = fi2Var;
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.m.c.g()) {
                            ji2 ji2Var = this.m;
                            new ArrayList();
                            if (!ji2Var.c.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    gf1 gf1Var = new gf1(ji2Var);
                                    while (((qf3) gf1Var.h).hasNext()) {
                                        a53 a53Var = (a53) ((qf3) gf1Var.h).next();
                                        gf1Var.remove();
                                        a53Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e2) {
                        d();
                        throw e2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(ta3 ta3Var) {
        Object obj;
        while (true) {
            Object obj2 = this.h.get();
            if (obj2 == null ? true : obj2.equals(uk0.a)) {
                obj = ta3Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, ta3Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.h).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = ta3Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.h;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.l) {
                            p();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void y(Object obj) {
        synchronized (this.l) {
            try {
                u(obj);
                Object objG = this.r.g(obj);
                if (objG != null) {
                    if (objG instanceof gi2) {
                        gi2 gi2Var = (gi2) objG;
                        Object[] objArr = gi2Var.b;
                        long[] jArr = gi2Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((gv0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((gv0) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
