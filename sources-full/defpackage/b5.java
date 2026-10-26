package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b5 extends qq4 {
    public final /* synthetic */ int b = 1;

    public b5(c5 c5Var) {
        super(l5.class);
    }

    public b5(c5 c5Var, byte b) {
        super(z5.class);
    }

    public b5(c5 c5Var, byte b, byte b2) {
        super(ni1.class);
    }

    public b5(c5 c5Var, byte b, char c) {
        super(ow1.class);
    }

    public b5(c5 c5Var, byte b, int i) {
        super(tw1.class);
    }

    public b5(c5 c5Var, byte b, short s) {
        super(lj4.class);
    }

    public b5(c5 c5Var, byte b, boolean z) {
        super(o20.class);
    }

    public b5(c5 c5Var, char c) {
        super(j6.class);
    }

    public b5(c5 c5Var, int i) {
        super(r6.class);
    }

    public b5(c5 c5Var, short s) {
        super(y6.class);
    }

    public /* synthetic */ b5(Class cls) {
        super(cls);
    }

    @Override // defpackage.qq4
    public final g0 a(g0 g0Var) {
        switch (this.b) {
            case 0:
                z4 z4Var = (z4) g0Var;
                v4 v4VarC = w4.C();
                v4VarC.e();
                w4.w((w4) v4VarC.d);
                byte[] bArrA = k23.a(z4Var.y());
                kz kzVarG = mz.g(bArrA, 0, bArrA.length);
                v4VarC.e();
                w4.x((w4) v4VarC.d, kzVarG);
                g5 g5VarZ = z4Var.z();
                v4VarC.e();
                w4.y((w4) v4VarC.d, g5VarZ);
                return (w4) v4VarC.b();
            case 1:
                l5 l5Var = (l5) g0Var;
                a5[] a5VarArr = {new a5(n5.class, 2)};
                HashMap map = new HashMap();
                for (a5 a5Var : a5VarArr) {
                    boolean zContainsKey = map.containsKey(a5Var.a);
                    Class cls = a5Var.a;
                    if (zContainsKey) {
                        u41.k(ud2.n(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, a5Var);
                }
                if (a5VarArr.length > 0) {
                    Class cls2 = a5VarArr[0].a;
                }
                Collections.unmodifiableMap(map);
                r5 r5VarY = l5Var.y();
                o5 o5VarD = p5.D();
                t5 t5VarA = r5VarY.A();
                o5VarD.e();
                p5.x((p5) o5VarD.d, t5VarA);
                byte[] bArrA2 = k23.a(r5VarY.z());
                kz kzVarG2 = mz.g(bArrA2, 0, bArrA2.length);
                o5VarD.e();
                p5.y((p5) o5VarD.d, kzVarG2);
                o5VarD.e();
                p5.w((p5) o5VarD.d);
                p5 p5Var = (p5) o5VarD.b();
                a5[] a5VarArr2 = {new a5(u82.class, 8)};
                HashMap map2 = new HashMap();
                for (a5 a5Var2 : a5VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(a5Var2.a);
                    Class cls3 = a5Var2.a;
                    if (zContainsKey2) {
                        u41.k(ud2.n(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, a5Var2);
                }
                if (a5VarArr2.length > 0) {
                    Class cls4 = a5VarArr2[0].a;
                }
                Collections.unmodifiableMap(map2);
                ni1 ni1VarZ = l5Var.z();
                ji1 ji1VarD = ki1.D();
                ji1VarD.e();
                ki1.w((ki1) ji1VarD.d);
                qi1 qi1VarA = ni1VarZ.A();
                ji1VarD.e();
                ki1.x((ki1) ji1VarD.d, qi1VarA);
                byte[] bArrA3 = k23.a(ni1VarZ.z());
                kz kzVarG3 = mz.g(bArrA3, 0, bArrA3.length);
                ji1VarD.e();
                ki1.y((ki1) ji1VarD.d, kzVarG3);
                ki1 ki1Var = (ki1) ji1VarD.b();
                i5 i5VarC = j5.C();
                i5VarC.e();
                j5.x((j5) i5VarC.d, p5Var);
                i5VarC.e();
                j5.y((j5) i5VarC.d, ki1Var);
                i5VarC.e();
                j5.w((j5) i5VarC.d);
                return (j5) i5VarC.b();
            case 2:
                z5 z5Var = (z5) g0Var;
                v5 v5VarC = w5.C();
                byte[] bArrA4 = k23.a(z5Var.y());
                kz kzVarG4 = mz.g(bArrA4, 0, bArrA4.length);
                v5VarC.e();
                w5.y((w5) v5VarC.d, kzVarG4);
                c6 c6VarZ = z5Var.z();
                v5VarC.e();
                w5.x((w5) v5VarC.d, c6VarZ);
                v5VarC.e();
                w5.w((w5) v5VarC.d);
                return (w5) v5VarC.b();
            case 3:
                f6 f6VarA = g6.A();
                byte[] bArrA5 = k23.a(((j6) g0Var).x());
                kz kzVarG5 = mz.g(bArrA5, 0, bArrA5.length);
                f6VarA.e();
                g6.x((g6) f6VarA.d, kzVarG5);
                f6VarA.e();
                g6.w((g6) f6VarA.d);
                return (g6) f6VarA.b();
            case 4:
                n6 n6VarA = o6.A();
                byte[] bArrA6 = k23.a(((r6) g0Var).x());
                kz kzVarG6 = mz.g(bArrA6, 0, bArrA6.length);
                n6VarA.e();
                o6.x((o6) n6VarA.d, kzVarG6);
                n6VarA.e();
                o6.w((o6) n6VarA.d);
                return (o6) n6VarA.b();
            case 5:
                v6 v6VarA = w6.A();
                byte[] bArrA7 = k23.a(((y6) g0Var).x());
                kz kzVarG7 = mz.g(bArrA7, 0, bArrA7.length);
                v6VarA.e();
                w6.x((w6) v6VarA.d, kzVarG7);
                v6VarA.e();
                w6.w((w6) v6VarA.d);
                return (w6) v6VarA.b();
            case 6:
                k20 k20VarA = l20.A();
                k20VarA.e();
                l20.w((l20) k20VarA.d);
                byte[] bArrA8 = k23.a(32);
                kz kzVarG8 = mz.g(bArrA8, 0, bArrA8.length);
                k20VarA.e();
                l20.x((l20) k20VarA.d, kzVarG8);
                return (l20) k20VarA.b();
            case 7:
                ni1 ni1Var = (ni1) g0Var;
                ji1 ji1VarD2 = ki1.D();
                ji1VarD2.e();
                ki1.w((ki1) ji1VarD2.d);
                qi1 qi1VarA2 = ni1Var.A();
                ji1VarD2.e();
                ki1.x((ki1) ji1VarD2.d, qi1VarA2);
                byte[] bArrA9 = k23.a(ni1Var.z());
                kz kzVarG9 = mz.g(bArrA9, 0, bArrA9.length);
                ji1VarD2.e();
                ki1.y((ki1) ji1VarD2.d, kzVarG9);
                return (ki1) ji1VarD2.b();
            case 8:
                mw1 mw1VarA = nw1.A();
                mw1VarA.e();
                nw1.x((nw1) mw1VarA.d, (ow1) g0Var);
                mw1VarA.e();
                nw1.w((nw1) mw1VarA.d);
                return (nw1) mw1VarA.b();
            case 9:
                rw1 rw1VarA = sw1.A();
                rw1VarA.e();
                sw1.x((sw1) rw1VarA.d, (tw1) g0Var);
                rw1VarA.e();
                sw1.w((sw1) rw1VarA.d);
                return (sw1) rw1VarA.b();
            default:
                ij4 ij4VarA = jj4.A();
                ij4VarA.e();
                jj4.w((jj4) ij4VarA.d);
                byte[] bArrA10 = k23.a(32);
                kz kzVarG10 = mz.g(bArrA10, 0, bArrA10.length);
                ij4VarA.e();
                jj4.x((jj4) ij4VarA.d, kzVarG10);
                return (jj4) ij4VarA.b();
        }
    }

    @Override // defpackage.qq4
    public Map b() {
        switch (this.b) {
            case 0:
                HashMap map = new HashMap();
                y4 y4VarA = z4.A();
                y4VarA.e();
                z4.w((z4) y4VarA.d);
                f5 f5VarZ = g5.z();
                f5VarZ.e();
                g5.w((g5) f5VarZ.d);
                g5 g5Var = (g5) f5VarZ.b();
                y4VarA.e();
                z4.x((z4) y4VarA.d, g5Var);
                map.put("AES_CMAC", new rv1((z4) y4VarA.b(), 1));
                y4 y4VarA2 = z4.A();
                y4VarA2.e();
                z4.w((z4) y4VarA2.d);
                f5 f5VarZ2 = g5.z();
                f5VarZ2.e();
                g5.w((g5) f5VarZ2.d);
                g5 g5Var2 = (g5) f5VarZ2.b();
                y4VarA2.e();
                z4.x((z4) y4VarA2.d, g5Var2);
                map.put("AES256_CMAC", new rv1((z4) y4VarA2.b(), 1));
                y4 y4VarA3 = z4.A();
                y4VarA3.e();
                z4.w((z4) y4VarA3.d);
                f5 f5VarZ3 = g5.z();
                f5VarZ3.e();
                g5.w((g5) f5VarZ3.d);
                g5 g5Var3 = (g5) f5VarZ3.b();
                y4VarA3.e();
                z4.x((z4) y4VarA3.d, g5Var3);
                map.put("AES256_CMAC_RAW", new rv1((z4) y4VarA3.b(), 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_CTR_HMAC_SHA256", c5.m(16, 16, 1));
                map2.put("AES128_CTR_HMAC_SHA256_RAW", c5.m(16, 16, 3));
                map2.put("AES256_CTR_HMAC_SHA256", c5.m(32, 32, 1));
                map2.put("AES256_CTR_HMAC_SHA256_RAW", c5.m(32, 32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_EAX", c5.l(16, 1));
                map3.put("AES128_EAX_RAW", c5.l(16, 3));
                map3.put("AES256_EAX", c5.l(32, 1));
                map3.put("AES256_EAX_RAW", c5.l(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM", c5.n(16, 1));
                map4.put("AES128_GCM_RAW", c5.n(16, 3));
                map4.put("AES256_GCM", c5.n(32, 1));
                map4.put("AES256_GCM_RAW", c5.n(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("AES128_GCM_SIV", c5.o(16, 1));
                map5.put("AES128_GCM_SIV_RAW", c5.o(16, 3));
                map5.put("AES256_GCM_SIV", c5.o(32, 1));
                map5.put("AES256_GCM_SIV_RAW", c5.o(32, 3));
                return Collections.unmodifiableMap(map5);
            case 5:
                HashMap map6 = new HashMap();
                x6 x6VarY = y6.y();
                x6VarY.e();
                y6.w((y6) x6VarY.d);
                map6.put("AES256_SIV", new rv1((y6) x6VarY.b(), 1));
                x6 x6VarY2 = y6.y();
                x6VarY2.e();
                y6.w((y6) x6VarY2.d);
                map6.put("AES256_SIV_RAW", new rv1((y6) x6VarY2.b(), 3));
                return Collections.unmodifiableMap(map6);
            case 6:
                HashMap map7 = new HashMap();
                map7.put("CHACHA20_POLY1305", new rv1(o20.w(), 1));
                map7.put("CHACHA20_POLY1305_RAW", new rv1(o20.w(), 3));
                return Collections.unmodifiableMap(map7);
            case 7:
                HashMap map8 = new HashMap();
                qh1 qh1Var = qh1.SHA256;
                map8.put("HMAC_SHA256_128BITTAG", c5.p(32, 16, qh1Var, 1));
                map8.put("HMAC_SHA256_128BITTAG_RAW", c5.p(32, 16, qh1Var, 3));
                map8.put("HMAC_SHA256_256BITTAG", c5.p(32, 32, qh1Var, 1));
                map8.put("HMAC_SHA256_256BITTAG_RAW", c5.p(32, 32, qh1Var, 3));
                qh1 qh1Var2 = qh1.SHA512;
                map8.put("HMAC_SHA512_128BITTAG", c5.p(64, 16, qh1Var2, 1));
                map8.put("HMAC_SHA512_128BITTAG_RAW", c5.p(64, 16, qh1Var2, 3));
                map8.put("HMAC_SHA512_256BITTAG", c5.p(64, 32, qh1Var2, 1));
                map8.put("HMAC_SHA512_256BITTAG_RAW", c5.p(64, 32, qh1Var2, 3));
                map8.put("HMAC_SHA512_512BITTAG", c5.p(64, 64, qh1Var2, 1));
                map8.put("HMAC_SHA512_512BITTAG_RAW", c5.p(64, 64, qh1Var2, 3));
                return Collections.unmodifiableMap(map8);
            case 8:
            case 9:
            default:
                return super.b();
            case 10:
                HashMap map9 = new HashMap();
                map9.put("XCHACHA20_POLY1305", new rv1(lj4.w(), 1));
                map9.put("XCHACHA20_POLY1305_RAW", new rv1(lj4.w(), 3));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // defpackage.qq4
    public final g0 c(mz mzVar) {
        switch (this.b) {
            case 0:
                return z4.B(mzVar, b61.a());
            case 1:
                return l5.B(mzVar, b61.a());
            case 2:
                return z5.B(mzVar, b61.a());
            case 3:
                return j6.z(mzVar, b61.a());
            case 4:
                return r6.z(mzVar, b61.a());
            case 5:
                return y6.z(mzVar, b61.a());
            case 6:
                return o20.x(mzVar, b61.a());
            case 7:
                return ni1.C(mzVar, b61.a());
            case 8:
                return ow1.y(mzVar, b61.a());
            case 9:
                return tw1.A(mzVar, b61.a());
            default:
                return lj4.x(mzVar, b61.a());
        }
    }

    @Override // defpackage.qq4
    public final void d(g0 g0Var) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                z4 z4Var = (z4) g0Var;
                c5.q(z4Var.z());
                if (z4Var.y() == 32) {
                    return;
                }
                m51.v("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                l5 l5Var = (l5) g0Var;
                a5[] a5VarArr = {new a5(n5.class, 2)};
                HashMap map = new HashMap();
                for (a5 a5Var : a5VarArr) {
                    boolean zContainsKey = map.containsKey(a5Var.a);
                    Class cls = a5Var.a;
                    if (zContainsKey) {
                        u41.k(ud2.n(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map.put(cls, a5Var);
                }
                if (a5VarArr.length > 0) {
                    Class cls2 = a5VarArr[0].a;
                }
                Collections.unmodifiableMap(map);
                r5 r5VarY = l5Var.y();
                ya4.a(r5VarY.z());
                t5 t5VarA = r5VarY.A();
                if (t5VarA.y() < 12 || t5VarA.y() > 16) {
                    m51.v("invalid IV size");
                    return;
                }
                a5[] a5VarArr2 = {new a5(u82.class, 8)};
                HashMap map2 = new HashMap();
                for (a5 a5Var2 : a5VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(a5Var2.a);
                    Class cls3 = a5Var2.a;
                    if (zContainsKey2) {
                        u41.k(ud2.n(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    map2.put(cls3, a5Var2);
                }
                if (a5VarArr2.length > 0) {
                    Class cls4 = a5VarArr2[0].a;
                }
                Collections.unmodifiableMap(map2);
                ni1 ni1VarZ = l5Var.z();
                if (ni1VarZ.z() < 16) {
                    m51.v("key too short");
                    return;
                } else {
                    c5.r(ni1VarZ.A());
                    ya4.a(l5Var.y().z());
                    return;
                }
            case 2:
                z5 z5Var = (z5) g0Var;
                ya4.a(z5Var.y());
                if (z5Var.z().y() == 12 || z5Var.z().y() == 16) {
                    return;
                }
                m51.v("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                ya4.a(((j6) g0Var).x());
                return;
            case 4:
                ya4.a(((r6) g0Var).x());
                return;
            case 5:
                y6 y6Var = (y6) g0Var;
                if (y6Var.x() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + y6Var.x() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                ni1 ni1Var = (ni1) g0Var;
                if (ni1Var.z() >= 16) {
                    c5.r(ni1Var.A());
                    return;
                } else {
                    m51.v("key too short");
                    return;
                }
            case 8:
                return;
            case 9:
                tw1 tw1Var = (tw1) g0Var;
                if (tw1Var.y().isEmpty() || !tw1Var.z()) {
                    m51.v("invalid key format: missing KEK URI or DEK template");
                    return;
                }
                return;
            default:
                return;
        }
    }
}
