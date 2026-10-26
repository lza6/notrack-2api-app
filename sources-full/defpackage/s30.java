package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s30 implements le1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ String l;
    public final /* synthetic */ float[] m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ dt2 p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ s30(float[] fArr, String str, ArrayList arrayList, float[] fArr2, boolean z, ye1 ye1Var, boolean z2, bm1 bm1Var, dt2 dt2Var) {
        this.d = fArr;
        this.l = str;
        this.h = arrayList;
        this.m = fArr2;
        this.n = z;
        this.q = ye1Var;
        this.o = z2;
        this.r = bm1Var;
        this.p = dt2Var;
    }

    public /* synthetic */ s30(float[] fArr, ArrayList arrayList, ArrayList arrayList2, String str, float[] fArr2, boolean z, boolean z2, ArrayList arrayList3, dt2 dt2Var) {
        this.d = fArr;
        this.h = arrayList;
        this.q = arrayList2;
        this.l = str;
        this.m = fArr2;
        this.n = z;
        this.o = z2;
        this.r = arrayList3;
        this.p = dt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x047f  */
    /* JADX WARN: Code duplicated, block: B:103:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:108:0x0503  */
    /* JADX WARN: Code duplicated, block: B:111:0x0515  */
    /* JADX WARN: Code duplicated, block: B:113:0x051b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0559  */
    /* JADX WARN: Code duplicated, block: B:119:0x0569  */
    /* JADX WARN: Code duplicated, block: B:122:0x0573  */
    /* JADX WARN: Code duplicated, block: B:125:0x0580  */
    /* JADX WARN: Code duplicated, block: B:128:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:129:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x0651  */
    /* JADX WARN: Code duplicated, block: B:143:0x065e A[DONT_INVERT, PHI: r0 r23 r32
  0x065e: PHI (r0v102 float) = (r0v16 float), (r0v41 float), (r0v103 float) binds: [B:142:0x065c, B:110:0x0511, B:91:0x043d] A[DONT_GENERATE, DONT_INLINE]
  0x065e: PHI (r23v7 float) = (r23v2 float), (r23v4 float), (r23v8 float) binds: [B:142:0x065c, B:110:0x0511, B:91:0x043d] A[DONT_GENERATE, DONT_INLINE]
  0x065e: PHI (r32v12 boolean) = (r32v1 boolean), (r32v3 boolean), (r32v13 boolean) binds: [B:142:0x065c, B:110:0x0511, B:91:0x043d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x0662  */
    /* JADX WARN: Code duplicated, block: B:147:0x0694  */
    /* JADX WARN: Code duplicated, block: B:149:0x069f  */
    /* JADX WARN: Code duplicated, block: B:150:0x06be  */
    /* JADX WARN: Code duplicated, block: B:152:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:153:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:172:0x075c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0408  */
    /* JADX WARN: Code duplicated, block: B:91:0x043d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:92:0x0444  */
    /* JADX WARN: Code duplicated, block: B:95:0x044d  */
    /* JADX WARN: Code duplicated, block: B:97:0x045a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0467  */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x043a. Please report as an issue. */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int size;
        int i;
        bm3 bm3Var;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        boolean z;
        float f12;
        double d;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float fSin;
        float f22;
        float f23;
        float f24;
        float f25;
        int i3 = this.c;
        dt2 dt2Var = this.p;
        Object obj2 = this.r;
        boolean z2 = this.o;
        boolean z3 = this.n;
        float[] fArr = this.m;
        String str = this.l;
        Object obj3 = this.q;
        ArrayList arrayList = this.h;
        float[] fArr2 = this.d;
        switch (i3) {
            case 0:
                float f26 = 0.4f;
                float f27 = 0.55f;
                ye1 ye1Var = (ye1) obj3;
                bm1 bm1Var = (bm1) obj2;
                tz0 tz0Var = (tz0) obj;
                tz0Var.getClass();
                dt2Var.f();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tz0Var.b() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L));
                float density = tz0Var.getDensity();
                char c = 0;
                if (fArr2[0] != fIntBitsToFloat || fArr2[1] != fIntBitsToFloat2) {
                    fArr2[0] = fIntBitsToFloat;
                    fArr2[1] = fIntBitsToFloat2;
                    r64 r64Var = (r64) v30.b.get(str);
                    if (r64Var != null) {
                        int iIntValue = ((Number) r64Var.c).intValue();
                        int iIntValue2 = r64Var.d.intValue();
                        float fFloatValue = ((Number) r64Var.h).floatValue();
                        arrayList.clear();
                        int iX = py.x(gb2.R(((fIntBitsToFloat2 / density) * (fIntBitsToFloat / density)) / fFloatValue), iIntValue, iIntValue2);
                        for (int i4 = 0; i4 < iX; i4++) {
                            arrayList.add(v30.a(str, fIntBitsToFloat, fIntBitsToFloat2, density, true));
                        }
                        c = 0;
                        f = fArr[c];
                        if (z3) {
                            f2 = 0.0f;
                        } else {
                            f2 = fArr[1];
                        }
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            bm3Var = (bm3) obj4;
                            i2 = bm3Var.o;
                            f3 = bm3Var.i;
                            f4 = bm3Var.c;
                            f5 = bm3Var.g;
                            f6 = f;
                            f7 = bm3Var.e;
                            f8 = bm3Var.d;
                            f9 = bm3Var.f;
                            switch (str.hashCode()) {
                                case -1221256979:
                                    f10 = f9;
                                    f11 = fIntBitsToFloat;
                                    z = z2;
                                    if (!str.equals("hearts")) {
                                        if (bm1Var == null) {
                                            bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                            f12 = f2;
                                            fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                            bm3Var.a = fSin;
                                            f22 = (f3 * f12) + bm3Var.h;
                                            bm3Var.h = f22;
                                            f23 = bm3Var.b;
                                            if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                                arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                            } else {
                                                v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                            }
                                            f14 = f26;
                                            f15 = f27;
                                        }
                                        break;
                                    } else {
                                        f12 = f2;
                                        size = size;
                                        bm3Var.b -= (f7 * f12) * density;
                                        d = (f6 * 0.02f) + f10;
                                        bm3Var.a = (((float) Math.sin(d)) * f5 * 0.5f * f12 * density) + bm3Var.a;
                                        f13 = bm3Var.b;
                                        if (f13 < (-40.0f) * density) {
                                            arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                            density = density;
                                            f14 = f26;
                                            f15 = f27;
                                        } else {
                                            float fMin = Math.min(1.0f, Math.min((((20.0f * density) + fIntBitsToFloat2) - f13) / (120.0f * density), Math.max(0.0f, f13) / (0.35f * fIntBitsToFloat2)));
                                            bm1 bm1Var2 = (bm1) ye1Var.a.get(i2);
                                            float f28 = bm3Var.a;
                                            float f29 = bm3Var.b;
                                            float f30 = f8 * density;
                                            density = density;
                                            float fSin2 = (((float) Math.sin(d)) * 0.15f) + bm3Var.h;
                                            f14 = f26;
                                            f15 = f27;
                                            v30.b(tz0Var, bm1Var2, f28, f29, f30, fSin2, 1.0f, fq2.c(f4, f14, f15, Math.max(0.0f, fMin)));
                                        }
                                    }
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                    break;
                                case -991674327:
                                    f10 = f9;
                                    f16 = fIntBitsToFloat;
                                    z = z2;
                                    if (str.equals("petals")) {
                                        bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                        float fSin3 = (((((float) Math.sin((0.022f * f6) + f10)) * f5) + 0.35f) * 0.5f * f2 * density) + bm3Var.a;
                                        bm3Var.a = fSin3;
                                        bm3Var.h = (f3 * f2) + bm3Var.h;
                                        if (bm3Var.b <= (30.0f * density) + fIntBitsToFloat2 || fSin3 > (40.0f * density) + f16) {
                                            f11 = f16;
                                            arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                        } else {
                                            v30.b(tz0Var, (bm1) ye1Var.c.get(i2), bm3Var.a, bm3Var.b, f8 * density, bm3Var.h, (Math.abs((float) Math.sin((f6 * 0.03f) + f10)) * 0.65f) + 0.35f, (f4 * 0.3f) + 0.65f);
                                            f11 = f16;
                                        }
                                        f12 = f2;
                                        f14 = f26;
                                        f15 = f27;
                                        i++;
                                        f2 = f12;
                                        fIntBitsToFloat = f11;
                                        f26 = f14;
                                        f27 = f15;
                                        density = density;
                                        z2 = z;
                                        size = size;
                                        f = f6;
                                    }
                                    f11 = f16;
                                    if (bm1Var == null) {
                                        bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                        f12 = f2;
                                        fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                        bm3Var.a = fSin;
                                        f22 = (f3 * f12) + bm3Var.h;
                                        bm3Var.h = f22;
                                        f23 = bm3Var.b;
                                        if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                            arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                        } else {
                                            v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                        }
                                        f14 = f26;
                                        f15 = f27;
                                        i++;
                                        f2 = f12;
                                        fIntBitsToFloat = f11;
                                        f26 = f14;
                                        f27 = f15;
                                        density = density;
                                        z2 = z;
                                        size = size;
                                        f = f6;
                                    }
                                    break;
                                case -280000549:
                                    f10 = f9;
                                    f16 = fIntBitsToFloat;
                                    z = z2;
                                    if (str.equals("fireflies")) {
                                        if (f2 > 0.0f) {
                                            float f31 = bm3Var.m;
                                            i23 i23Var = j23.c;
                                            bm3Var.m = ((i23Var.f() - 0.5f) * 0.04f * f2) + f31;
                                            float f32 = ((i23Var.f() - 0.5f) * 0.04f * f2) + bm3Var.n;
                                            float f33 = bm3Var.m * 0.98f;
                                            bm3Var.m = f33;
                                            float f34 = f32 * 0.98f;
                                            bm3Var.n = f34;
                                            bm3Var.a = (f33 * f2 * density) + bm3Var.a;
                                            bm3Var.b = (f34 * f2 * density) + bm3Var.b;
                                        }
                                        f17 = (-20.0f) * density;
                                        if (bm3Var.a < f17) {
                                            bm3Var.a = (20.0f * density) + f16;
                                        }
                                        if (bm3Var.a > (20.0f * density) + f16) {
                                            bm3Var.a = f17;
                                        }
                                        f18 = bm3Var.b;
                                        if (f18 < 0.15f * fIntBitsToFloat2) {
                                            bm3Var.n += 0.02f;
                                        }
                                        if (f18 > (10.0f * density) + fIntBitsToFloat2) {
                                            bm3Var.n -= 0.04f;
                                        }
                                        float fMax = (Math.max(0.0f, (float) Math.sin((0.035f * f6 * bm3Var.l) + f10)) * 0.75f) + 0.25f;
                                        ib ibVar = ye1Var.d;
                                        float f35 = bm3Var.a;
                                        float f36 = bm3Var.b;
                                        float f37 = f8 * density;
                                        if (z) {
                                            f19 = 1.0f;
                                        } else {
                                            f19 = 0.8f;
                                        }
                                        v30.b(tz0Var, ibVar, f35, f36, f37, 0.0f, 1.0f, fMax * f19);
                                        f11 = f16;
                                        f12 = f2;
                                        f14 = f26;
                                        f15 = f27;
                                        i++;
                                        f2 = f12;
                                        fIntBitsToFloat = f11;
                                        f26 = f14;
                                        f27 = f15;
                                        density = density;
                                        z2 = z;
                                        size = size;
                                        f = f6;
                                    }
                                    f11 = f16;
                                    if (bm1Var == null) {
                                        bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                        f12 = f2;
                                        fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                        bm3Var.a = fSin;
                                        f22 = (f3 * f12) + bm3Var.h;
                                        bm3Var.h = f22;
                                        f23 = bm3Var.b;
                                        if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                            arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                        } else {
                                            v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                        }
                                        f14 = f26;
                                        f15 = f27;
                                        i++;
                                        f2 = f12;
                                        fIntBitsToFloat = f11;
                                        f26 = f14;
                                        f27 = f15;
                                        density = density;
                                        z2 = z;
                                        size = size;
                                        f = f6;
                                    }
                                    break;
                                case 224189799:
                                    if (str.equals("bubbles")) {
                                        f20 = bm3Var.k;
                                        if (f20 > 0.0f) {
                                            f21 = (0.08f * f2) + f20;
                                            bm3Var.k = f21;
                                            if (f21 > 1.0f) {
                                                arrayList.set(i, v30.a(str, fIntBitsToFloat, fIntBitsToFloat2, density, false));
                                                f11 = fIntBitsToFloat;
                                                z = z2;
                                            } else {
                                                z = z2;
                                                v30.b(tz0Var, ye1Var.b, bm3Var.a, bm3Var.b, fq2.c(f21, 0.6f, 1.0f, f8 * density), 0.0f, 1.0f, (1.0f - f21) * 0.7f);
                                                f11 = fIntBitsToFloat;
                                            }
                                        } else {
                                            z = z2;
                                            bm3Var.b -= (f7 * f2) * density;
                                            f16 = fIntBitsToFloat;
                                            bm3Var.a = (((float) Math.sin((f6 * 0.03f) + f9)) * f5 * 0.45f * f2 * density) + bm3Var.a;
                                            if (bm3Var.b < bm3Var.j) {
                                                bm3Var.k = 0.001f;
                                            }
                                            float fSin4 = (((float) Math.sin((0.06f * f6) + f9)) * 0.04f) + 1.0f;
                                            v30.b(tz0Var, ye1Var.b, bm3Var.a, bm3Var.b, f8 * density * fSin4, 0.0f, 1.0f / fSin4, (f4 * 0.35f) + 0.6f);
                                            f11 = f16;
                                        }
                                        f12 = f2;
                                        f14 = f26;
                                        f15 = f27;
                                        i++;
                                        f2 = f12;
                                        fIntBitsToFloat = f11;
                                        f26 = f14;
                                        f27 = f15;
                                        density = density;
                                        z2 = z;
                                        size = size;
                                        f = f6;
                                        break;
                                    }
                                default:
                                    f10 = f9;
                                    f11 = fIntBitsToFloat;
                                    z = z2;
                                    if (bm1Var == null) {
                                        bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                        f12 = f2;
                                        fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                        bm3Var.a = fSin;
                                        f22 = (f3 * f12) + bm3Var.h;
                                        bm3Var.h = f22;
                                        f23 = bm3Var.b;
                                        if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                            arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                        } else {
                                            v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                        }
                                        f14 = f26;
                                        f15 = f27;
                                        i++;
                                        f2 = f12;
                                        fIntBitsToFloat = f11;
                                        f26 = f14;
                                        f27 = f15;
                                        density = density;
                                        z2 = z;
                                        size = size;
                                        f = f6;
                                    }
                                    break;
                            }
                        }
                    }
                } else {
                    f = fArr[c];
                    if (z3) {
                        f2 = 0.0f;
                    } else {
                        f2 = fArr[1];
                    }
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj5 = arrayList.get(i);
                        obj5.getClass();
                        bm3Var = (bm3) obj5;
                        i2 = bm3Var.o;
                        f3 = bm3Var.i;
                        f4 = bm3Var.c;
                        f5 = bm3Var.g;
                        f6 = f;
                        f7 = bm3Var.e;
                        f8 = bm3Var.d;
                        f9 = bm3Var.f;
                        switch (str.hashCode()) {
                            case -1221256979:
                                f10 = f9;
                                f11 = fIntBitsToFloat;
                                z = z2;
                                if (!str.equals("hearts")) {
                                    if (bm1Var == null) {
                                        bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                        f12 = f2;
                                        fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                        bm3Var.a = fSin;
                                        f22 = (f3 * f12) + bm3Var.h;
                                        bm3Var.h = f22;
                                        f23 = bm3Var.b;
                                        if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                            arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                        } else {
                                            v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                        }
                                        f14 = f26;
                                        f15 = f27;
                                    }
                                    break;
                                } else {
                                    f12 = f2;
                                    size = size;
                                    bm3Var.b -= (f7 * f12) * density;
                                    d = (f6 * 0.02f) + f10;
                                    bm3Var.a = (((float) Math.sin(d)) * f5 * 0.5f * f12 * density) + bm3Var.a;
                                    f13 = bm3Var.b;
                                    if (f13 < (-40.0f) * density) {
                                        arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                        density = density;
                                        f14 = f26;
                                        f15 = f27;
                                    } else {
                                        float fMin2 = Math.min(1.0f, Math.min((((20.0f * density) + fIntBitsToFloat2) - f13) / (120.0f * density), Math.max(0.0f, f13) / (0.35f * fIntBitsToFloat2)));
                                        bm1 bm1Var3 = (bm1) ye1Var.a.get(i2);
                                        float f210 = bm3Var.a;
                                        float f211 = bm3Var.b;
                                        float f38 = f8 * density;
                                        density = density;
                                        float fSin5 = (((float) Math.sin(d)) * 0.15f) + bm3Var.h;
                                        f14 = f26;
                                        f15 = f27;
                                        v30.b(tz0Var, bm1Var3, f210, f211, f38, fSin5, 1.0f, fq2.c(f4, f14, f15, Math.max(0.0f, fMin2)));
                                    }
                                }
                                i++;
                                f2 = f12;
                                fIntBitsToFloat = f11;
                                f26 = f14;
                                f27 = f15;
                                density = density;
                                z2 = z;
                                size = size;
                                f = f6;
                                break;
                            case -991674327:
                                f10 = f9;
                                f16 = fIntBitsToFloat;
                                z = z2;
                                if (str.equals("petals")) {
                                    bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                    float fSin6 = (((((float) Math.sin((0.022f * f6) + f10)) * f5) + 0.35f) * 0.5f * f2 * density) + bm3Var.a;
                                    bm3Var.a = fSin6;
                                    bm3Var.h = (f3 * f2) + bm3Var.h;
                                    if (bm3Var.b <= (30.0f * density) + fIntBitsToFloat2) {
                                    }
                                    f11 = f16;
                                    arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                    f12 = f2;
                                    f14 = f26;
                                    f15 = f27;
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                }
                                f11 = f16;
                                if (bm1Var == null) {
                                    bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                    f12 = f2;
                                    fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                    bm3Var.a = fSin;
                                    f22 = (f3 * f12) + bm3Var.h;
                                    bm3Var.h = f22;
                                    f23 = bm3Var.b;
                                    if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                        arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                    } else {
                                        v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                    }
                                    f14 = f26;
                                    f15 = f27;
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                }
                                break;
                            case -280000549:
                                f10 = f9;
                                f16 = fIntBitsToFloat;
                                z = z2;
                                if (str.equals("fireflies")) {
                                    if (f2 > 0.0f) {
                                        float f39 = bm3Var.m;
                                        i23 i23Var2 = j23.c;
                                        bm3Var.m = ((i23Var2.f() - 0.5f) * 0.04f * f2) + f39;
                                        float f310 = ((i23Var2.f() - 0.5f) * 0.04f * f2) + bm3Var.n;
                                        float f311 = bm3Var.m * 0.98f;
                                        bm3Var.m = f311;
                                        float f312 = f310 * 0.98f;
                                        bm3Var.n = f312;
                                        bm3Var.a = (f311 * f2 * density) + bm3Var.a;
                                        bm3Var.b = (f312 * f2 * density) + bm3Var.b;
                                    }
                                    f17 = (-20.0f) * density;
                                    if (bm3Var.a < f17) {
                                        bm3Var.a = (20.0f * density) + f16;
                                    }
                                    if (bm3Var.a > (20.0f * density) + f16) {
                                        bm3Var.a = f17;
                                    }
                                    f18 = bm3Var.b;
                                    if (f18 < 0.15f * fIntBitsToFloat2) {
                                        bm3Var.n += 0.02f;
                                    }
                                    if (f18 > (10.0f * density) + fIntBitsToFloat2) {
                                        bm3Var.n -= 0.04f;
                                    }
                                    float fMax2 = (Math.max(0.0f, (float) Math.sin((0.035f * f6 * bm3Var.l) + f10)) * 0.75f) + 0.25f;
                                    ib ibVar2 = ye1Var.d;
                                    float f313 = bm3Var.a;
                                    float f314 = bm3Var.b;
                                    float f315 = f8 * density;
                                    if (z) {
                                        f19 = 1.0f;
                                    } else {
                                        f19 = 0.8f;
                                    }
                                    v30.b(tz0Var, ibVar2, f313, f314, f315, 0.0f, 1.0f, fMax2 * f19);
                                    f11 = f16;
                                    f12 = f2;
                                    f14 = f26;
                                    f15 = f27;
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                }
                                f11 = f16;
                                if (bm1Var == null) {
                                    bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                    f12 = f2;
                                    fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                    bm3Var.a = fSin;
                                    f22 = (f3 * f12) + bm3Var.h;
                                    bm3Var.h = f22;
                                    f23 = bm3Var.b;
                                    if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                        arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                    } else {
                                        v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                    }
                                    f14 = f26;
                                    f15 = f27;
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                }
                                break;
                            case 224189799:
                                if (str.equals("bubbles")) {
                                    f20 = bm3Var.k;
                                    if (f20 > 0.0f) {
                                        f21 = (0.08f * f2) + f20;
                                        bm3Var.k = f21;
                                        if (f21 > 1.0f) {
                                            arrayList.set(i, v30.a(str, fIntBitsToFloat, fIntBitsToFloat2, density, false));
                                            f11 = fIntBitsToFloat;
                                            z = z2;
                                        } else {
                                            z = z2;
                                            v30.b(tz0Var, ye1Var.b, bm3Var.a, bm3Var.b, fq2.c(f21, 0.6f, 1.0f, f8 * density), 0.0f, 1.0f, (1.0f - f21) * 0.7f);
                                            f11 = fIntBitsToFloat;
                                        }
                                    } else {
                                        z = z2;
                                        bm3Var.b -= (f7 * f2) * density;
                                        f16 = fIntBitsToFloat;
                                        bm3Var.a = (((float) Math.sin((f6 * 0.03f) + f9)) * f5 * 0.45f * f2 * density) + bm3Var.a;
                                        if (bm3Var.b < bm3Var.j) {
                                            bm3Var.k = 0.001f;
                                        }
                                        float fSin7 = (((float) Math.sin((0.06f * f6) + f9)) * 0.04f) + 1.0f;
                                        v30.b(tz0Var, ye1Var.b, bm3Var.a, bm3Var.b, f8 * density * fSin7, 0.0f, 1.0f / fSin7, (f4 * 0.35f) + 0.6f);
                                        f11 = f16;
                                    }
                                    f12 = f2;
                                    f14 = f26;
                                    f15 = f27;
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                    break;
                                }
                            default:
                                f10 = f9;
                                f11 = fIntBitsToFloat;
                                z = z2;
                                if (bm1Var == null) {
                                    bm3Var.b = (f7 * f2 * density) + bm3Var.b;
                                    f12 = f2;
                                    fSin = (((float) Math.sin((f6 * 0.02f) + f10)) * f5 * 0.45f * f12 * density) + bm3Var.a;
                                    bm3Var.a = fSin;
                                    f22 = (f3 * f12) + bm3Var.h;
                                    bm3Var.h = f22;
                                    f23 = bm3Var.b;
                                    if (f23 > (50.0f * density) + fIntBitsToFloat2) {
                                        arrayList.set(i, v30.a(str, f11, fIntBitsToFloat2, density, false));
                                    } else {
                                        v30.b(tz0Var, bm1Var, fSin, f23, f8 * density, (((float) Math.sin((f6 * 0.018f) + f10)) * 0.12f) + f22, 1.0f, 0.92f);
                                    }
                                    f14 = f26;
                                    f15 = f27;
                                    i++;
                                    f2 = f12;
                                    fIntBitsToFloat = f11;
                                    f26 = f14;
                                    f27 = f15;
                                    density = density;
                                    z2 = z;
                                    size = size;
                                    f = f6;
                                }
                                break;
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj3;
                tz0 tz0Var2 = (tz0) obj;
                tz0Var2.getClass();
                dt2Var.f();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tz0Var2.b() >> 32));
                ArrayList arrayList3 = (ArrayList) obj2;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (tz0Var2.b() & 4294967295L));
                float density2 = tz0Var2.getDensity();
                int i5 = 110;
                if (fArr2[0] == fIntBitsToFloat3 && fArr2[1] == fIntBitsToFloat4) {
                    f24 = 0.0f;
                } else {
                    fArr2[0] = fIntBitsToFloat3;
                    fArr2[1] = fIntBitsToFloat4;
                    float f40 = (fIntBitsToFloat4 / density2) * (fIntBitsToFloat3 / density2);
                    arrayList.clear();
                    arrayList2.clear();
                    if (kr1.n(str, "rain")) {
                        int iX2 = py.x(gb2.R(f40 / 4200.0f), 110, 340);
                        for (int i6 = 0; i6 < iX2; i6++) {
                            arrayList.add(z30.e(fIntBitsToFloat3, fIntBitsToFloat4, density2, true));
                        }
                        f24 = 0.0f;
                    } else {
                        f24 = 0.0f;
                        int iX3 = py.x(gb2.R(f40 / 5000.0f), 80, 300);
                        for (int i7 = 0; i7 < iX3; i7++) {
                            arrayList2.add(z30.f(fIntBitsToFloat3, fIntBitsToFloat4, density2, true));
                        }
                    }
                }
                float f41 = fArr[0];
                float f42 = fArr[1];
                if (kr1.n(str, "rain")) {
                    float fSin8 = (((float) Math.sin(f41 / 57.0f)) * 0.02f) + ((((float) Math.sin(f41 / 240.0f)) * 0.07f) - 0.17f);
                    long jC = z3 ? gb2.c(205, 222, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE) : gb2.c(62, 90, 132, KotlinVersion.MAX_COMPONENT_VALUE);
                    int size2 = arrayList.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj6 = arrayList.get(i8);
                        obj6.getClass();
                        j01 j01Var = (j01) obj6;
                        if (!z2) {
                            float f43 = j01Var.b;
                            float f44 = j01Var.e;
                            j01Var.b = (f44 * f42 * density2) + f43;
                            j01Var.a = (f44 * fSin8 * f42 * density2) + j01Var.a;
                        }
                        long jB = re0.b(j01Var.g, jC);
                        float f45 = f42;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j01Var.a)) << 32) | (((long) Float.floatToRawIntBits(j01Var.b)) & 4294967295L);
                        float f46 = j01Var.a;
                        float f47 = j01Var.d;
                        tz0Var2.S(jB, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f46 - (f47 * fSin8))) << 32) | (((long) Float.floatToRawIntBits(j01Var.b - f47)) & 4294967295L), j01Var.f, (480 & 16) != 0 ? 0 : 1);
                        float f48 = j01Var.b;
                        float f49 = j01Var.c;
                        if (f48 > fq2.c(f49, 0.16f, 0.84f, fIntBitsToFloat4)) {
                            if (f49 > 0.72f && arrayList3.size() < 90) {
                                int i9 = 0;
                                while (i9 < 3) {
                                    float f50 = j01Var.a;
                                    float f51 = j01Var.b;
                                    i23 i23Var3 = j23.c;
                                    float f52 = (i23Var3.f() - 0.5f) * 2.4f;
                                    float f53 = fSin8;
                                    float f54 = (-1.1f) - (i23Var3.f() * 1.7f);
                                    qm3 qm3Var = new qm3();
                                    qm3Var.a = f50;
                                    qm3Var.b = f51;
                                    qm3Var.c = f52;
                                    qm3Var.d = f54;
                                    qm3Var.e = 1.0f;
                                    arrayList3.add(qm3Var);
                                    i9++;
                                    fSin8 = f53;
                                }
                            }
                            f25 = fSin8;
                            arrayList.set(i8, z30.e(fIntBitsToFloat3, fIntBitsToFloat4, density2, false));
                        } else {
                            f25 = fSin8;
                        }
                        i8++;
                        f42 = f45;
                        arrayList3 = arrayList3;
                        fSin8 = f25;
                    }
                    float f55 = f42;
                    Iterator it = arrayList3.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        qm3 qm3Var2 = (qm3) next;
                        if (!z2) {
                            float f56 = (f55 * 0.17f) + qm3Var2.d;
                            qm3Var2.d = f56;
                            qm3Var2.a = (qm3Var2.c * f55 * density2) + qm3Var2.a;
                            qm3Var2.b = (f56 * f55 * density2) + qm3Var2.b;
                            qm3Var2.e -= f55 * 0.045f;
                        }
                        float f57 = qm3Var2.e;
                        if (f57 <= f24) {
                            it.remove();
                        } else {
                            long jB2 = re0.b(f57 * 0.55f, jC);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(qm3Var2.a)) << 32) | (((long) Float.floatToRawIntBits(qm3Var2.b)) & 4294967295L);
                            float f58 = 1.5f * density2;
                            tz0.f(tz0Var2, jB2, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f58)) << 32) | (((long) Float.floatToRawIntBits(f58)) & 4294967295L), 0.0f, null, 120);
                        }
                    }
                } else {
                    int size3 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj7 = arrayList2.get(i10);
                        obj7.getClass();
                        v71 v71Var = (v71) obj7;
                        float f59 = v71Var.d;
                        if (!z2) {
                            v71Var.b = (v71Var.e * f42 * density2) + v71Var.b;
                            v71Var.a = (((v71Var.c * 0.1f) + (((float) Math.sin((f41 * 0.018f * v71Var.h) + v71Var.f)) * v71Var.g * 0.4f) + 0.12f) * f42 * density2) + v71Var.a;
                        }
                        float f60 = 10.0f * density2;
                        if (v71Var.b > fIntBitsToFloat4 + f60 || v71Var.a > f60 + fIntBitsToFloat3) {
                            boolean z4 = false;
                            arrayList2.set(i10, z30.f(fIntBitsToFloat3, fIntBitsToFloat4, density2, z4));
                        } else {
                            if (!z3) {
                                tz0.K(tz0Var2, gb2.c(90, i5, 145, 60), (2.5f * density2) + f59, (((long) Float.floatToRawIntBits(v71Var.a)) << 32) | (((long) Float.floatToRawIntBits(v71Var.b)) & 4294967295L), null, 120);
                            }
                            tz0Var2 = tz0Var2;
                            long j = re0.e;
                            float f61 = f59 + density2;
                            tz0Var2.I(new h23(kr1.U(new re0(re0.b(v71Var.i, j)), new re0(re0.b(f24, j))), (((long) Float.floatToRawIntBits(v71Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(v71Var.a)) << 32), f61), f61, (((long) Float.floatToRawIntBits(v71Var.a)) << 32) | (((long) Float.floatToRawIntBits(v71Var.b)) & 4294967295L));
                        }
                        i10++;
                        tz0Var2 = tz0Var2;
                        size3 = size3;
                        i5 = 110;
                        f24 = 0.0f;
                    }
                }
                break;
        }
        return w84.a;
    }
}
