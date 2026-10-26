package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hn1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn1(int i, int i2, Object obj, Object obj2) {
        super(1);
        this.c = i2;
        this.h = obj;
        this.d = i;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn1(String str, ArrayList arrayList, int i) {
        super(1);
        this.c = 0;
        this.h = str;
        this.l = arrayList;
        this.d = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        w33 w33Var;
        pk0 pk0Var;
        boolean z;
        w33 w33Var2;
        pk0 pk0Var2;
        boolean z2;
        int i;
        int i2 = this.c;
        w84 w84Var = w84.a;
        boolean z3 = true;
        Object obj2 = this.l;
        int i3 = this.d;
        int i4 = 0;
        Object obj3 = this.h;
        switch (i2) {
            case 0:
                zt3 zt3Var = (zt3) obj;
                List list = (List) obj2;
                String str = (String) obj3;
                jz3 jz3Var = zt3Var.m;
                if (jz3Var != null) {
                    long j = jz3Var.a;
                    int i5 = (int) (j >> 32);
                    xr0.f0(zt3Var, i5, (int) (4294967295L & j), str);
                    if (str.length() > 0) {
                        zt3Var.d(i5, str.length() + i5, list);
                    }
                } else {
                    long j2 = zt3Var.l;
                    int i6 = jz3.c;
                    int i7 = (int) (j2 >> 32);
                    xr0.f0(zt3Var, i7, (int) (4294967295L & j2), str);
                    if (str.length() > 0) {
                        zt3Var.d(i7, str.length() + i7, list);
                    }
                }
                long j3 = zt3Var.l;
                int i8 = jz3.c;
                int i9 = (int) (j3 >> 32);
                int iX = py.x(i3 > 0 ? (i9 + i3) - 1 : (i9 + i3) - str.length(), 0, zt3Var.d.length());
                zt3Var.f(p23.d(iX, iX));
                break;
            case 1:
                pk0 pk0Var3 = (pk0) obj;
                rh2 rh2Var = (rh2) obj2;
                w33 w33Var3 = (w33) obj3;
                if (w33Var3.currentToken == i3 && kr1.n(rh2Var, w33Var3.trackedInstances) && (pk0Var3 instanceof tk0)) {
                    long[] jArr = rh2Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j4 = jArr[i10];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = i4;
                                while (i13 < i12) {
                                    if ((255 & j4) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        z2 = z3;
                                        Object obj4 = rh2Var.b[i14];
                                        boolean z4 = rh2Var.c[i14] != i3 ? z2 : false;
                                        if (z4) {
                                            i = i11;
                                            tk0 tk0Var = (tk0) pk0Var3;
                                            pk0Var2 = pk0Var3;
                                            fi2 fi2Var = tk0Var.o;
                                            xr0.n0(fi2Var, obj4, w33Var3);
                                            w33Var2 = w33Var3;
                                            if (obj4 instanceof gv0) {
                                                gv0 gv0Var = (gv0) obj4;
                                                if (!fi2Var.c(gv0Var)) {
                                                    xr0.o0(tk0Var.r, gv0Var);
                                                }
                                                fi2 fi2Var2 = w33Var2.trackedDependencies;
                                                if (fi2Var2 != null) {
                                                    fi2Var2.j(obj4);
                                                }
                                            }
                                        } else {
                                            w33Var2 = w33Var3;
                                            pk0Var2 = pk0Var3;
                                            i = i11;
                                        }
                                        if (z4) {
                                            rh2Var.g(i14);
                                        }
                                    } else {
                                        w33Var2 = w33Var3;
                                        pk0Var2 = pk0Var3;
                                        z2 = z3;
                                        i = i11;
                                    }
                                    j4 >>= i;
                                    i13++;
                                    i11 = i;
                                    pk0Var3 = pk0Var2;
                                    z3 = z2;
                                    w33Var3 = w33Var2;
                                }
                                w33Var = w33Var3;
                                pk0Var = pk0Var3;
                                z = z3;
                                if (i12 != i11) {
                                    break;
                                }
                            } else {
                                w33Var = w33Var3;
                                pk0Var = pk0Var3;
                                z = z3;
                            }
                            if (i10 != length) {
                                i10++;
                                pk0Var3 = pk0Var;
                                z3 = z;
                                w33Var3 = w33Var;
                                i4 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                mv2 mv2Var = (mv2) obj;
                ob3 ob3Var = (ob3) obj3;
                int iF = ob3Var.c.a.f();
                if (iF < 0) {
                    iF = 0;
                }
                if (iF <= i3) {
                    i3 = iF;
                }
                int i15 = -i3;
                boolean z5 = ob3Var.d;
                int i16 = z5 ? 0 : i15;
                if (!z5) {
                    i15 = 0;
                }
                rp1 rp1Var = new rp1((nv2) obj2, i16, i15, 3);
                mv2Var.a = true;
                rp1Var.invoke(mv2Var);
                mv2Var.a = false;
                break;
        }
        return w84Var;
    }
}
