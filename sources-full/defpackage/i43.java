package defpackage;

import android.os.Trace;
import android.view.inputmethod.BaseInputConnection;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class i43 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i43(int i, Object obj) {
        super(0);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.je1
    public final Object invoke() {
        je1 je1Var;
        int i;
        char c;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        char c2;
        le1 le1Var;
        le1 le1Var2;
        long j;
        zv3 zv3Var;
        int i4 = 8;
        long j2 = -9187201950435737472L;
        char c3 = 7;
        boolean z3 = false;
        boolean z4 = true;
        bb bbVar = null;
        switch (this.c) {
            case 0:
                j43 j43Var = (j43) this.d;
                j43Var.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    j43Var.a();
                    return w84.a;
                } finally {
                    Trace.endSection();
                }
            case 1:
                a93 a93Var = (a93) this.d;
                x93 x93Var = a93Var.c;
                Object obj = a93Var.l;
                if (obj != null) {
                    return x93Var.n(a93Var, obj);
                }
                u41.k("Value should be initialized");
                return null;
            case 2:
                return n93.c((nd4) this.d);
            case 3:
                return Boolean.valueOf(((fc3) this.d).isAttached());
            case 4:
                jc3 jc3Var = (jc3) this.d;
                qr2 qr2Var = (qr2) gm4.t(jc3Var, rr2.a);
                jc3Var.u = qr2Var;
                if (qr2Var != null) {
                    cb cbVar = (cb) qr2Var;
                    bbVar = new bb(cbVar.a, cbVar.b, cbVar.c, cbVar.d);
                }
                jc3Var.v = bbVar;
                return w84.a;
            case 5:
                og3 og3Var = (og3) this.d;
                ft2 ft2Var = og3Var.h;
                if (((bi3) ft2Var.getValue()).a == 9205357640488583168L || bi3.e(((bi3) ft2Var.getValue()).a)) {
                    return null;
                }
                return og3Var.c.b(((bi3) ft2Var.getValue()).a);
            case 6:
                sv1 sv1Var = (sv1) this.d;
                String strD = sv1Var.d();
                WorkDatabase workDatabase = (WorkDatabase) sv1Var.a;
                workDatabase.getClass();
                workDatabase.a();
                workDatabase.b();
                return workDatabase.h().J().h(strD);
            case 7:
                return Float.valueOf(((wu0) this.d).w(125.0f));
            case 8:
                uj3 uj3Var = (uj3) this.d;
                if (!((Boolean) uj3Var.k.getValue()).booleanValue() && (je1Var = uj3Var.b) != null) {
                    je1Var.invoke();
                }
                return w84.a;
            case 9:
                while (true) {
                    long j3 = 128;
                    ol3 ol3Var = (ol3) this.d;
                    synchronized (ol3Var.g) {
                        try {
                            if (ol3Var.c) {
                                i = i4;
                                c = c3;
                                z = z3;
                            } else {
                                ol3Var.c = z4;
                                try {
                                    oi2 oi2Var = ol3Var.f;
                                    Object[] objArr = oi2Var.c;
                                    int i5 = oi2Var.h;
                                    for (?? r5 = z3; r5 < i5; r5++) {
                                        try {
                                            nl3 nl3Var = (nl3) objArr[r5];
                                            gi2 gi2Var = nl3Var.g;
                                            le1 le1Var3 = nl3Var.a;
                                            Object[] objArr2 = gi2Var.b;
                                            long[] jArr = gi2Var.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                c2 = c3;
                                                ?? r9 = z3;
                                                while (true) {
                                                    long j4 = jArr[r9];
                                                    int i6 = i4;
                                                    le1 le1Var4 = le1Var3;
                                                    if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8 - ((~(r9 - length)) >>> 31);
                                                        int i8 = 0;
                                                        while (i8 < i7) {
                                                            if ((j4 & 255) < j3) {
                                                                le1Var2 = le1Var4;
                                                                le1Var2.invoke(objArr2[(r9 << 3) + i8]);
                                                            } else {
                                                                le1Var2 = le1Var4;
                                                            }
                                                            j4 >>= i6;
                                                            i8++;
                                                            le1Var4 = le1Var2;
                                                            i5 = i5;
                                                            j3 = 128;
                                                        }
                                                        i2 = i5;
                                                        i3 = i6;
                                                        le1Var = le1Var4;
                                                        if (i7 == i3) {
                                                        }
                                                    } else {
                                                        i2 = i5;
                                                        i3 = i6;
                                                        le1Var = le1Var4;
                                                    }
                                                    if (r9 != length) {
                                                        i4 = i3;
                                                        le1Var3 = le1Var;
                                                        i5 = i2;
                                                        j3 = 128;
                                                        r9++;
                                                    }
                                                }
                                            } else {
                                                i2 = i5;
                                                i3 = i4;
                                                c2 = c3;
                                            }
                                            gi2Var.b();
                                            i4 = i3;
                                            i5 = i2;
                                            c3 = c2;
                                            z3 = false;
                                            j3 = 128;
                                        } catch (Throwable th) {
                                            th = th;
                                            z2 = false;
                                            ol3Var.c = z2;
                                            throw th;
                                        }
                                    }
                                    i = i4;
                                    c = c3;
                                    z = z3;
                                    ol3Var.c = z;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = z3;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!ol3.a((ol3) this.d)) {
                        return w84.a;
                    }
                    z3 = z;
                    i4 = i;
                    c3 = c;
                    z4 = true;
                }
                break;
            case 10:
                iy1 iy1VarA = ((ip3) this.d).a();
                ux1 ux1Var = iy1VarA.c;
                if (iy1VarA.v != ((oi2) ((th2) ux1Var.o()).d).h) {
                    fi2 fi2Var = iy1VarA.n;
                    Object[] objArr3 = fi2Var.c;
                    long[] jArr2 = fi2Var.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j5 = jArr2[i9];
                            if ((((~j5) << 7) & j5 & j2) != j2) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j5 & 255) < 128) {
                                        ((ay1) objArr3[(i9 << 3) + i11]).d = true;
                                    }
                                    j5 >>= 8;
                                    i11++;
                                    j2 = j2;
                                }
                                j = j2;
                                if (i10 == 8) {
                                }
                            } else {
                                j = j2;
                            }
                            if (i9 != length2) {
                                i9++;
                                j2 = j;
                            }
                        }
                    }
                    if (!ux1Var.q()) {
                        ux1.S(ux1Var, false, 7);
                    }
                }
                return w84.a;
            case 11:
                ot3 ot3Var = (ot3) this.d;
                ot3Var.y = null;
                ot3.v0(ot3Var);
                return Boolean.TRUE;
            case 12:
                gw3 gw3Var = (gw3) this.d;
                return new ln2((gw3Var.n || ((dx3) gw3Var.l.q.getValue()) == dx3.d) ? yo4.j(gw3Var.h, gw3Var.l, gw3Var.m, ((qq1) gw3Var.o.getValue()).a) : 9205357640488583168L);
            case 13:
                return new BaseInputConnection(((ny3) this.d).a, false);
            case 14:
                bw3 bw3Var = ((az3) this.d).a;
                aw3 aw3Var = (aw3) bw3Var.c.getValue();
                if (aw3Var == null || (zv3Var = (zv3) bw3Var.d.getValue()) == null) {
                    return null;
                }
                return bw3Var.c(aw3Var, zv3Var);
            case 15:
                return new iq1(((mq1) this.d).c());
            case 16:
                tz3 tz3Var = (tz3) this.d;
                tz3Var.t = null;
                tz3.v0(tz3Var);
                return Boolean.TRUE;
            case 17:
                d14 d14Var = (d14) this.d;
                d14Var.C.invoke(Boolean.valueOf(!d14Var.B));
                return w84.a;
            case 18:
                rb4 rb4Var = (rb4) this.d;
                int i12 = rb4Var.u;
                ct2 ct2Var = rb4Var.r;
                if (i12 == ct2Var.f()) {
                    ct2Var.h(ct2Var.f() + 1);
                }
                return w84.a;
            case 19:
                return new bn0[((k81[]) this.d).length];
            default:
                return ((Worker) this.d).c();
        }
    }
}
