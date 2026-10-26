package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yf0 extends i73 {
    public final fi2 s;

    public yf0(uq1 uq1Var, boolean z, float f, lu0 lu0Var, mu0 mu0Var) {
        super(uq1Var, z, f, lu0Var, mu0Var);
        this.s = new fi2();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.s.a();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[LOOP:0: B:5:0x0012->B:15:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[EDGE_INSN: B:23:0x005b->B:16:0x005b BREAK  A[LOOP:0: B:5:0x0012->B:15:0x0058], SYNTHETIC] */
    @Override // defpackage.i73
    public final void v0(ry2 ry2Var, long j, float f) {
        fi2 fi2Var = this.s;
        Object[] objArr = fi2Var.b;
        Object[] objArr2 = fi2Var.c;
        long[] jArr = fi2Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            a73 a73Var = (a73) objArr2[i4];
                            a73Var.k.setValue(Boolean.TRUE);
                            a73Var.i.M(w84.a);
                        }
                        j2 >>= 8;
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
        boolean z = this.d;
        a73 a73Var2 = new a73(z ? new ln2(ry2Var.a) : null, f, z);
        fi2Var.l(ry2Var, a73Var2);
        py.F(getCoroutineScope(), null, null, new q8(a73Var2, this, ry2Var, (so0) null, 14), 3);
        kr1.O(this);
    }

    @Override // defpackage.i73
    public final void w0(wx1 wx1Var) throws Throwable {
        int i;
        a10 a10Var;
        Object[] objArr;
        Object[] objArr2;
        int i2;
        int i3;
        int i4;
        long j;
        yf0 yf0Var = this;
        a10 a10Var2 = wx1Var.c;
        yf0Var.m.invoke();
        float f = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        fi2 fi2Var = yf0Var.s;
        Object[] objArr3 = fi2Var.b;
        Object[] objArr4 = fi2Var.c;
        long[] jArr = fi2Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr[i5];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                long j3 = j2;
                int i8 = 0;
                while (i8 < i7) {
                    if ((j3 & 255) < 128) {
                        int i9 = (i5 << 3) + i8;
                        Object obj = objArr3[i9];
                        a73 a73Var = (a73) objArr4[i9];
                        long jB = re0.b(f, yf0Var.l.a());
                        ue ueVar = a73Var.h;
                        if (a73Var.d == null) {
                            long jB2 = a10Var2.b();
                            a73Var.d = Float.valueOf(Math.max(bi3.d(jB2), bi3.b(jB2)) * 0.3f);
                        }
                        if (a73Var.a == null) {
                            a73Var.a = new ln2(a10Var2.W());
                        }
                        if (a73Var.e == null) {
                            a73Var.e = new ln2(y64.b(bi3.d(a10Var2.b()) / 2.0f, bi3.b(a10Var2.b()) / 2.0f));
                        }
                        float fFloatValue = (!((Boolean) a73Var.k.getValue()).booleanValue() || ((Boolean) a73Var.j.getValue()).booleanValue()) ? ((Number) a73Var.f.d()).floatValue() : 1.0f;
                        Float f2 = a73Var.d;
                        f2.getClass();
                        float F = g13.F(f2.floatValue(), a73Var.b, ((Number) a73Var.g.d()).floatValue());
                        ln2 ln2Var = a73Var.a;
                        ln2Var.getClass();
                        float f3 = fFloatValue;
                        float f4 = ln2.f(ln2Var.a);
                        ln2 ln2Var2 = a73Var.e;
                        ln2Var2.getClass();
                        i2 = i5;
                        float F2 = g13.F(f4, ln2.f(ln2Var2.a), ((Number) ueVar.d()).floatValue());
                        ln2 ln2Var3 = a73Var.a;
                        ln2Var3.getClass();
                        float fG = ln2.g(ln2Var3.a);
                        ln2 ln2Var4 = a73Var.e;
                        ln2Var4.getClass();
                        i3 = i8;
                        long jB3 = y64.b(F2, g13.F(fG, ln2.g(ln2Var4.a), ((Number) ueVar.d()).floatValue()));
                        long jB4 = re0.b(re0.d(jB) * f3, jB);
                        if (a73Var.c) {
                            float fD = bi3.d(a10Var2.b());
                            float fB = bi3.b(a10Var2.b());
                            ci4 ci4Var = a10Var2.d;
                            long jC = ci4Var.C();
                            ci4Var.y().l();
                            try {
                                ((jb) ci4Var.d).u(0.0f, 0.0f, fD, fB, 1);
                                j = jC;
                                i4 = 8;
                                try {
                                    tz0.K(wx1Var, jB4, F, jB3, null, 120);
                                    fq2.x(ci4Var, j);
                                } catch (Throwable th) {
                                    th = th;
                                    fq2.x(ci4Var, j);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j = jC;
                            }
                        } else {
                            i4 = 8;
                            tz0.K(wx1Var, jB4, F, jB3, null, 120);
                        }
                    } else {
                        i2 = i5;
                        i3 = i8;
                        i4 = i6;
                    }
                    j3 >>= i4;
                    i8 = i3 + 1;
                    i7 = i7;
                    i6 = i4;
                    i5 = i2;
                    objArr3 = objArr3;
                    objArr4 = objArr4;
                    a10Var2 = a10Var2;
                    f = 0.1f;
                    yf0Var = this;
                }
                i = i5;
                a10Var = a10Var2;
                objArr = objArr3;
                objArr2 = objArr4;
                if (i7 != i6) {
                    return;
                }
            } else {
                i = i5;
                a10Var = a10Var2;
                objArr = objArr3;
                objArr2 = objArr4;
            }
            if (i == length) {
                return;
            }
            i5 = i + 1;
            yf0Var = this;
            objArr3 = objArr;
            objArr4 = objArr2;
            a10Var2 = a10Var;
            f = 0.1f;
        }
    }

    @Override // defpackage.i73
    public final void y0(ry2 ry2Var) {
        a73 a73Var = (a73) this.s.g(ry2Var);
        if (a73Var != null) {
            a73Var.k.setValue(Boolean.TRUE);
            a73Var.i.M(w84.a);
        }
    }
}
