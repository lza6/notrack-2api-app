package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends sv1 {
    public static final az2 e = new az2(x4.class, new u41(2));
    public static final az2 f = new az2(li1.class, new m51(6));
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5() {
        super(ki1.class, new a5(u82.class, 8));
        this.d = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(Class cls, a5[] a5VarArr, int i) {
        super(cls, a5VarArr);
        this.d = i;
    }

    public static rv1 l(int i, int i2) {
        y5 y5VarA = z5.A();
        y5VarA.e();
        z5.x((z5) y5VarA.d, i);
        b6 b6VarZ = c6.z();
        b6VarZ.e();
        c6.w((c6) b6VarZ.d);
        c6 c6Var = (c6) b6VarZ.b();
        y5VarA.e();
        z5.w((z5) y5VarA.d, c6Var);
        return new rv1((z5) y5VarA.b(), i2);
    }

    public static rv1 m(int i, int i2, int i3) {
        q5 q5VarB = r5.B();
        s5 s5VarZ = t5.z();
        s5VarZ.e();
        t5.w((t5) s5VarZ.d);
        t5 t5Var = (t5) s5VarZ.b();
        q5VarB.e();
        r5.w((r5) q5VarB.d, t5Var);
        q5VarB.e();
        r5.x((r5) q5VarB.d, i);
        r5 r5Var = (r5) q5VarB.b();
        mi1 mi1VarB = ni1.B();
        pi1 pi1VarB = qi1.B();
        pi1VarB.e();
        qi1.w((qi1) pi1VarB.d, qh1.SHA256);
        pi1VarB.e();
        qi1.x((qi1) pi1VarB.d, i2);
        qi1 qi1Var = (qi1) pi1VarB.b();
        mi1VarB.e();
        ni1.w((ni1) mi1VarB.d, qi1Var);
        mi1VarB.e();
        ni1.x((ni1) mi1VarB.d, 32);
        ni1 ni1Var = (ni1) mi1VarB.b();
        k5 k5VarA = l5.A();
        k5VarA.e();
        l5.w((l5) k5VarA.d, r5Var);
        k5VarA.e();
        l5.x((l5) k5VarA.d, ni1Var);
        return new rv1((l5) k5VarA.b(), i3);
    }

    public static rv1 n(int i, int i2) {
        i6 i6VarY = j6.y();
        i6VarY.e();
        j6.w((j6) i6VarY.d, i);
        return new rv1((j6) i6VarY.b(), i2);
    }

    public static rv1 o(int i, int i2) {
        q6 q6VarY = r6.y();
        q6VarY.e();
        r6.w((r6) q6VarY.d, i);
        return new rv1((r6) q6VarY.b(), i2);
    }

    public static rv1 p(int i, int i2, qh1 qh1Var, int i3) {
        mi1 mi1VarB = ni1.B();
        pi1 pi1VarB = qi1.B();
        pi1VarB.e();
        qi1.w((qi1) pi1VarB.d, qh1Var);
        pi1VarB.e();
        qi1.x((qi1) pi1VarB.d, i2);
        qi1 qi1Var = (qi1) pi1VarB.b();
        mi1VarB.e();
        ni1.w((ni1) mi1VarB.d, qi1Var);
        mi1VarB.e();
        ni1.x((ni1) mi1VarB.d, i);
        return new rv1((ni1) mi1VarB.b(), i3);
    }

    public static void q(g5 g5Var) throws GeneralSecurityException {
        if (g5Var.y() < 10) {
            m51.v("tag size too short");
        } else {
            if (g5Var.y() <= 16) {
                return;
            }
            m51.v("tag size too long");
        }
    }

    public static void r(qi1 qi1Var) throws GeneralSecurityException {
        if (qi1Var.A() < 10) {
            m51.v("tag size too small");
            return;
        }
        int iOrdinal = qi1Var.z().ordinal();
        if (iOrdinal == 1) {
            if (qi1Var.A() <= 20) {
                return;
            }
            m51.v("tag size too big");
            return;
        }
        if (iOrdinal == 2) {
            if (qi1Var.A() <= 48) {
                return;
            }
            m51.v("tag size too big");
            return;
        }
        if (iOrdinal == 3) {
            if (qi1Var.A() <= 32) {
                return;
            }
            m51.v("tag size too big");
        } else if (iOrdinal == 4) {
            if (qi1Var.A() <= 64) {
                return;
            }
            m51.v("tag size too big");
        } else if (iOrdinal != 5) {
            m51.v("unknown hash type");
        } else {
            if (qi1Var.A() <= 28) {
                return;
            }
            m51.v("tag size too big");
        }
    }

    @Override // defpackage.sv1
    public int e() {
        switch (this.d) {
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
            default:
                return super.e();
            case 4:
                return 2;
        }
    }

    @Override // defpackage.sv1
    public final String f() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // defpackage.sv1
    public final qq4 g() {
        switch (this.d) {
            case 0:
                return new b5(z4.class);
            case 1:
                return new b5(this, (byte) 0, (byte) 0);
            case 2:
                return new b5(this);
            case 3:
                return new b5(this, (byte) 0);
            case 4:
                return new b5(this, (char) 0);
            case 5:
                return new b5(this, 0);
            case 6:
                return new b5(this, (short) 0);
            case 7:
                return new b5(this, (byte) 0, false);
            case 8:
                return new b5(this, (byte) 0, (char) 0);
            case 9:
                return new b5(this, (byte) 0, 0);
            default:
                return new b5(this, (byte) 0, (short) 0);
        }
    }

    @Override // defpackage.sv1
    public final wu1 h() {
        int i = this.d;
        wu1 wu1Var = wu1.REMOTE;
        wu1 wu1Var2 = wu1.SYMMETRIC;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return wu1Var2;
            case 8:
            case 9:
                return wu1Var;
            default:
                return wu1Var2;
        }
    }

    @Override // defpackage.sv1
    public final g0 i(mz mzVar) {
        switch (this.d) {
            case 0:
                return w4.D(mzVar, b61.a());
            case 1:
                return ki1.E(mzVar, b61.a());
            case 2:
                return j5.D(mzVar, b61.a());
            case 3:
                return w5.D(mzVar, b61.a());
            case 4:
                return g6.B(mzVar, b61.a());
            case 5:
                return o6.B(mzVar, b61.a());
            case 6:
                return w6.B(mzVar, b61.a());
            case 7:
                return l20.B(mzVar, b61.a());
            case 8:
                return nw1.B(mzVar, b61.a());
            case 9:
                return sw1.B(mzVar, b61.a());
            default:
                return jj4.B(mzVar, b61.a());
        }
    }

    @Override // defpackage.sv1
    public final void k(g0 g0Var) throws GeneralSecurityException {
        switch (this.d) {
            case 0:
                w4 w4Var = (w4) g0Var;
                ya4.c(w4Var.B());
                if (w4Var.z().size() == 32) {
                    q(w4Var.A());
                    return;
                } else {
                    m51.v("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                ki1 ki1Var = (ki1) g0Var;
                ya4.c(ki1Var.C());
                if (ki1Var.A().size() >= 16) {
                    r(ki1Var.B());
                    return;
                } else {
                    m51.v("key too short");
                    return;
                }
            case 2:
                j5 j5Var = (j5) g0Var;
                ya4.c(j5Var.B());
                a5[] a5VarArr = {new a5(n5.class, 2)};
                HashMap map = new HashMap();
                a5 a5Var = a5VarArr[0];
                boolean zContainsKey = map.containsKey(a5Var.a);
                Class cls = a5Var.a;
                if (zContainsKey) {
                    u41.k(ud2.n(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map.put(cls, a5Var);
                Class cls2 = a5VarArr[0].a;
                Collections.unmodifiableMap(map);
                p5 p5VarZ = j5Var.z();
                ya4.c(p5VarZ.C());
                ya4.a(p5VarZ.A().size());
                t5 t5VarB = p5VarZ.B();
                if (t5VarB.y() < 12 || t5VarB.y() > 16) {
                    m51.v("invalid IV size");
                    return;
                }
                a5[] a5VarArr2 = {new a5(u82.class, 8)};
                HashMap map2 = new HashMap();
                a5 a5Var2 = a5VarArr2[0];
                boolean zContainsKey2 = map2.containsKey(a5Var2.a);
                Class cls3 = a5Var2.a;
                if (zContainsKey2) {
                    u41.k(ud2.n(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map2.put(cls3, a5Var2);
                Class cls4 = a5VarArr2[0].a;
                Collections.unmodifiableMap(map2);
                ki1 ki1VarA = j5Var.A();
                ya4.c(ki1VarA.C());
                if (ki1VarA.A().size() >= 16) {
                    r(ki1VarA.B());
                    return;
                } else {
                    m51.v("key too short");
                    return;
                }
            case 3:
                w5 w5Var = (w5) g0Var;
                ya4.c(w5Var.B());
                ya4.a(w5Var.z().size());
                if (w5Var.A().y() == 12 || w5Var.A().y() == 16) {
                    return;
                }
                m51.v("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 4:
                g6 g6Var = (g6) g0Var;
                ya4.c(g6Var.z());
                ya4.a(g6Var.y().size());
                return;
            case 5:
                o6 o6Var = (o6) g0Var;
                ya4.c(o6Var.z());
                ya4.a(o6Var.y().size());
                return;
            case 6:
                w6 w6Var = (w6) g0Var;
                ya4.c(w6Var.z());
                if (w6Var.y().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + w6Var.y().size() + ". Valid keys must have 64 bytes.");
            case 7:
                l20 l20Var = (l20) g0Var;
                ya4.c(l20Var.z());
                if (l20Var.y().size() == 32) {
                    return;
                }
                m51.v("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 8:
                ya4.c(((nw1) g0Var).z());
                return;
            case 9:
                ya4.c(((sw1) g0Var).z());
                return;
            default:
                jj4 jj4Var = (jj4) g0Var;
                ya4.c(jj4Var.z());
                if (jj4Var.y().size() == 32) {
                    return;
                }
                m51.v("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }
}
