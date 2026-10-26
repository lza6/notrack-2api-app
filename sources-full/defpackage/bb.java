package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class bb implements pr2 {
    public final wu0 a;
    public long b = 9205357640488583168L;
    public final g11 c;
    public final ft2 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final ju0 i;

    public bb(Context context, wu0 wu0Var, long j, hs2 hs2Var) {
        this.a = wu0Var;
        g11 g11Var = new g11(context, gb2.X(j));
        this.c = g11Var;
        this.d = new ft2(w84.a, t73.t);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        q qVar = new q(1, this);
        yw2 yw2Var = oq3.a;
        sq3 sq3Var = new sq3(null, null, null, qVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new tf1(sq3Var, this, g11Var) : new tf1(sq3Var, this, g11Var, hs2Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0206  */
    /* JADX WARN: Code duplicated, block: B:102:0x0211  */
    /* JADX WARN: Code duplicated, block: B:104:0x021b  */
    /* JADX WARN: Code duplicated, block: B:105:0x021f  */
    /* JADX WARN: Code duplicated, block: B:108:0x022f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x023c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0240  */
    /* JADX WARN: Code duplicated, block: B:115:0x0243 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0249  */
    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:132:0x028c  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x02be  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0300  */
    /* JADX WARN: Code duplicated, block: B:164:0x0310  */
    /* JADX WARN: Code duplicated, block: B:171:0x032d  */
    /* JADX WARN: Code duplicated, block: B:173:0x033e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0342  */
    /* JADX WARN: Code duplicated, block: B:180:0x0352  */
    /* JADX WARN: Code duplicated, block: B:187:0x035c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x0134 A[PHI: r7
  0x0134: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0162, B:62:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    @Override // defpackage.pr2
    public final long a(long j, int i, pj2 pj2Var) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fI;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jH;
        long jH2;
        boolean z;
        boolean zF;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        sf1 sf1Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        sf1 sf1Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        sf1 sf1Var3;
        float f3;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (bi3.e(this.g)) {
            pj2Var.getClass();
            oc3 oc3Var = (oc3) pj2Var.d;
            return new ln2(oc3.a(oc3Var, oc3Var.j, j, oc3Var.i)).a;
        }
        boolean z4 = this.f;
        boolean z5 = true;
        g11 g11Var = this.c;
        if (!z4) {
            if (g11.g(g11Var.f)) {
                h(0L);
            }
            if (g11.g(g11Var.g)) {
                i(0L);
            }
            if (g11.g(g11Var.d)) {
                j(0L);
            }
            if (g11.g(g11Var.e)) {
                g(0L);
            }
            this.f = true;
        }
        is2 is2Var = ac.b;
        float f4 = i == 2 ? 4.0f : 1.0f;
        long j4 = ln2.j(f4, j);
        int i5 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            if (!g11.g(g11Var.d) || Float.intBitsToFloat(i5) >= 0.0f) {
                j2 = 4294967295L;
                if (g11.g(g11Var.e) && Float.intBitsToFloat(i5) > 0.0f) {
                    float fG = g(j4);
                    if (!g11.g(g11Var.e)) {
                        g11Var.b().finish();
                    }
                    fIntBitsToFloat = fG == Float.intBitsToFloat((int) (j4 & 4294967295L)) ? Float.intBitsToFloat(i5) : fG / f4;
                }
            } else {
                float fJ = j(j4);
                j2 = 4294967295L;
                if (!g11.g(g11Var.d)) {
                    g11Var.e().finish();
                }
                fIntBitsToFloat = fJ == Float.intBitsToFloat((int) (j4 & 4294967295L)) ? Float.intBitsToFloat(i5) : fJ / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!g11.g(g11Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fI = h(j4);
                if (!g11.g(g11Var.f)) {
                    g11Var.c().finish();
                }
                if (fI == Float.intBitsToFloat((int) (j4 >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fI / f4;
                }
            } else if (g11.g(g11Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fI = i(j4);
                if (!g11.g(g11Var.g)) {
                    g11Var.d().finish();
                }
                if (fI == Float.intBitsToFloat((int) (j4 >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fI / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!ln2.c(jFloatToRawIntBits, 0L)) {
                f();
            }
            jH = ln2.h(j, jFloatToRawIntBits);
            pj2Var.getClass();
            oc3 oc3Var2 = (oc3) pj2Var.d;
            long j5 = new ln2(oc3.a(oc3Var2, oc3Var2.j, jH, oc3Var2.i)).a;
            jH2 = ln2.h(jH, j5);
            if ((Float.intBitsToFloat((int) (jH >> 32)) == 0.0f || Float.intBitsToFloat((int) (jH & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j5 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j5 & j2)) != 0.0f) && (g11.g(g11Var.f) || g11.g(g11Var.d) || g11.g(g11Var.g) || g11.g(g11Var.e)))) {
                d();
            }
            if (i == 1) {
                i3 = (int) (jH2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jH2;
                    h(j3);
                } else {
                    j3 = jH2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        i(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        j(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            g(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    j(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        g(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!ln2.c(jH, 0L)) {
                if (g11.f(g11Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = g11Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof sf1) {
                        sf1 sf1Var4 = (sf1) edgeEffectC;
                        float f5 = sf1Var4.b + fIntBitsToFloat6;
                        sf1Var4.b = f5;
                        if (Math.abs(f5) > sf1Var4.a) {
                            sf1Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = g11.f(g11Var.f);
                }
                if (g11.f(g11Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = g11Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof sf1) {
                        sf1Var3 = (sf1) edgeEffectD;
                        f3 = sf1Var3.b + fIntBitsToFloat5;
                        sf1Var3.b = f3;
                        if (Math.abs(f3) > sf1Var3.a) {
                            sf1Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || g11.f(g11Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (g11.f(g11Var.d) && Float.intBitsToFloat(i5) < 0.0f) {
                    edgeEffectE = g11Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i5);
                    if (edgeEffectE instanceof sf1) {
                        sf1Var2 = (sf1) edgeEffectE;
                        f2 = sf1Var2.b + fIntBitsToFloat4;
                        sf1Var2.b = f2;
                        if (Math.abs(f2) > sf1Var2.a) {
                            sf1Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || g11.f(g11Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (g11.f(g11Var.e) && Float.intBitsToFloat(i5) > 0.0f) {
                    edgeEffectB = g11Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i5);
                    if (edgeEffectB instanceof sf1) {
                        sf1Var = (sf1) edgeEffectB;
                        f = sf1Var.b + fIntBitsToFloat3;
                        sf1Var.b = f;
                        if (Math.abs(f) > sf1Var.a) {
                            sf1Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || g11.f(g11Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                f();
            }
            return ln2.i(jFloatToRawIntBits, j5);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!g11.g(g11Var.f)) {
            if (g11.g(g11Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (g11.g(g11Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!ln2.c(jFloatToRawIntBits, 0L)) {
            f();
        }
        jH = ln2.h(j, jFloatToRawIntBits);
        pj2Var.getClass();
        oc3 oc3Var3 = (oc3) pj2Var.d;
        long j6 = new ln2(oc3.a(oc3Var3, oc3Var3.j, jH, oc3Var3.i)).a;
        jH2 = ln2.h(jH, j6);
        if (Float.intBitsToFloat((int) (jH >> 32)) == 0.0f) {
            d();
        } else {
            d();
        }
        if (i == 1) {
            i3 = (int) (jH2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jH2;
                h(j3);
            } else {
                j3 = jH2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    i(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    j(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        g(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                j(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    g(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!ln2.c(jH, 0L)) {
            if (g11.f(g11Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (g11.f(g11Var.g)) {
                edgeEffectD = g11Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof sf1) {
                    sf1Var3 = (sf1) edgeEffectD;
                    f3 = sf1Var3.b + fIntBitsToFloat5;
                    sf1Var3.b = f3;
                    if (Math.abs(f3) > sf1Var3.a) {
                        sf1Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (g11.f(g11Var.d)) {
                edgeEffectE = g11Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i5);
                if (edgeEffectE instanceof sf1) {
                    sf1Var2 = (sf1) edgeEffectE;
                    f2 = sf1Var2.b + fIntBitsToFloat4;
                    sf1Var2.b = f2;
                    if (Math.abs(f2) > sf1Var2.a) {
                        sf1Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (g11.f(g11Var.e)) {
                edgeEffectB = g11Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i5);
                if (edgeEffectB instanceof sf1) {
                    sf1Var = (sf1) edgeEffectB;
                    f = sf1Var.b + fIntBitsToFloat3;
                    sf1Var.b = f;
                    if (Math.abs(f) > sf1Var.a) {
                        sf1Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            f();
        }
        return ln2.i(jFloatToRawIntBits, j6);
    }

    @Override // defpackage.pr2
    public final boolean b() {
        g11 g11Var = this.c;
        EdgeEffect edgeEffect = g11Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? pg.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = g11Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? pg.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = g11Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? pg.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = g11Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? pg.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0140, code lost:
    
        if (r4 == r6) goto L51;
     */
    @Override // defpackage.pr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r20, defpackage.nc3 r22, defpackage.so0 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.c(long, nc3, so0):java.lang.Object");
    }

    public final void d() {
        boolean z;
        g11 g11Var = this.c;
        EdgeEffect edgeEffect = g11Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = g11Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = g11Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = g11Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            f();
        }
    }

    public final long e() {
        long jI = this.b;
        if ((9223372034707292159L & jI) == 9205357640488583168L) {
            jI = vl0.I(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jI & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void f() {
        if (this.e) {
            this.d.setValue(w84.a);
        }
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fD = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = pg.d(edgeEffectB, fD, f);
        } else {
            edgeEffectB.onPull(fD, f);
        }
        return (i2 >= 31 ? pg.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fD) : Float.intBitsToFloat(i);
    }

    @Override // defpackage.pr2
    public final iu0 getNode() {
        return this.i;
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = pg.d(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? pg.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fD = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = pg.d(edgeEffectD, fD, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fD, fIntBitsToFloat);
        }
        return (i2 >= 31 ? pg.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = pg.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? pg.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void k(long j) {
        boolean zA = bi3.a(this.g, 0L);
        boolean zA2 = bi3.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iR = gb2.R(Float.intBitsToFloat((int) (j >> 32)));
            long jR = (((long) gb2.R(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iR) << 32);
            g11 g11Var = this.c;
            g11Var.c = jR;
            EdgeEffect edgeEffect = g11Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect2 = g11Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect3 = g11Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jR & 4294967295L), (int) (jR >> 32));
            }
            EdgeEffect edgeEffect4 = g11Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jR & 4294967295L), (int) (jR >> 32));
            }
            EdgeEffect edgeEffect5 = g11Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect6 = g11Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jR >> 32), (int) (jR & 4294967295L));
            }
            EdgeEffect edgeEffect7 = g11Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jR & 4294967295L), (int) (jR >> 32));
            }
            EdgeEffect edgeEffect8 = g11Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jR), (int) (jR >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        d();
    }
}
