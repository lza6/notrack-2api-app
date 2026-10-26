package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import kotlin.text.Typography;
import org.scilab.forge.jlatexmath.XMLResourceParseException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u41 implements bz2, kv1, nx0, b11 {
    public static final u41 d = new u41(0);
    public final /* synthetic */ int c;

    public /* synthetic */ u41(int i) {
        this.c = i;
    }

    public static /* synthetic */ void e() {
        throw new eg0();
    }

    public static void f(int i) {
        throw new jt1(ud2.m(i, "An unknown field for index "));
    }

    public static /* synthetic */ void g(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void l(String str, int i, Object obj, int i2, int i3) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ", size: ") + i3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    public static /* synthetic */ void o(String str, String str2, String str3, String str4) {
        throw new XMLResourceParseException(str, str2, str3, str4);
    }

    public static /* synthetic */ void p() {
        throw new eg0();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException((str + obj + Typography.quote).toString());
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.bz2
    public Object a(kr1 kr1Var) throws GeneralSecurityException {
        qc0 qc0Var = new qc0();
        if (ud2.a(1)) {
            return qc0Var;
        }
        m51.v("Can not use AES-CMAC in FIPS-mode.");
        return null;
    }

    @Override // defpackage.b11
    public float b(float f) {
        return f;
    }

    @Override // defpackage.nx0
    public double c(double d2) {
        switch (this.c) {
            case 13:
                double d3 = d2 < 0.0d ? -d2 : d2;
                return Math.copySign(d3 >= 0.0031308049535603718d ? (Math.pow(d3, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d3 / 0.07739938080495357d, d2);
            case 14:
                double d4 = d2 < 0.0d ? -d2 : d2;
                return Math.copySign(d4 >= 0.04045d ? Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d) : d4 * 0.07739938080495357d, d2);
            case 15:
                float[] fArr = ef0.a;
                return ef0.b(ef0.c, d2);
            case 16:
                float[] fArr2 = ef0.a;
                return ef0.a(ef0.c, d2);
            case 17:
                float[] fArr3 = ef0.a;
                return ef0.d(ef0.d, d2);
            default:
                float[] fArr4 = ef0.a;
                return ef0.c(ef0.d, d2);
        }
    }

    @Override // defpackage.kv1
    public kr1 d(f13 f13Var) throws GeneralSecurityException {
        d5 d5Var;
        boolean z = false;
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        switch (this.c) {
            case 3:
                if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    k("Wrong type URL in call to AesCmacParameters.parseParameters");
                    return null;
                }
                try {
                    w4 w4VarD = w4.D((mz) f13Var.c, b61.a());
                    if (w4VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ci4 ci4Var = new ci4(i2, z);
                    ci4Var.d = null;
                    ci4Var.h = null;
                    ci4Var.l = d5.n;
                    ci4Var.L(w4VarD.z().size());
                    int iY = w4VarD.A().y();
                    if (iY < 10 || 16 < iY) {
                        throw new GeneralSecurityException(ud2.m(iY, "Invalid tag size for AesCmacParameters: "));
                    }
                    ci4Var.h = Integer.valueOf(iY);
                    ci4Var.l = h5.a((lr2) f13Var.e);
                    e5 e5VarK = ci4Var.k();
                    ci4 ci4Var2 = new ci4(i3, z);
                    ci4Var2.h = null;
                    ci4Var2.l = null;
                    ci4Var2.d = e5VarK;
                    ci4Var2.h = new sz0(nz.a(w4VarD.z().k()));
                    ci4Var2.l = (Integer) f13Var.f;
                    return ci4Var2.j();
                } catch (IllegalArgumentException | sr1 unused) {
                    m51.v("Parsing AesCmacKey failed");
                    return null;
                }
            case 4:
                if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    k("Wrong type URL in call to AesEaxParameters.parseParameters");
                    return null;
                }
                try {
                    w5 w5VarD = w5.D((mz) f13Var.c, b61.a());
                    if (w5VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    d5 d5Var2 = d5.q;
                    int size = w5VarD.z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iY2 = w5VarD.A().y();
                    if (iY2 != 12 && iY2 != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iY2)));
                    }
                    lr2 lr2Var = (lr2) f13Var.e;
                    int iOrdinal = lr2Var.ordinal();
                    if (iOrdinal == 1) {
                        d5Var2 = d5.o;
                    } else if (iOrdinal == 2) {
                        d5Var2 = d5.p;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var.b());
                        }
                        d5Var2 = d5.p;
                    }
                    a6 a6Var = new a6(size, iY2, 16, d5Var2);
                    ci4 ci4Var3 = new ci4(i, z);
                    ci4Var3.h = null;
                    ci4Var3.l = null;
                    ci4Var3.d = a6Var;
                    ci4Var3.h = new sz0(nz.a(w5VarD.z().k()));
                    ci4Var3.l = (Integer) f13Var.f;
                    return ci4Var3.l();
                } catch (sr1 unused2) {
                    m51.v("Parsing AesEaxcKey failed");
                    return null;
                }
            case 5:
                if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    k("Wrong type URL in call to AesGcmParameters.parseParameters");
                    return null;
                }
                try {
                    g6 g6VarB = g6.B((mz) f13Var.c, b61.a());
                    if (g6VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    d5 d5Var3 = d5.t;
                    int size2 = g6VarB.y().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    lr2 lr2Var2 = (lr2) f13Var.e;
                    int iOrdinal2 = lr2Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        d5Var3 = d5.r;
                    } else if (iOrdinal2 == 2) {
                        d5Var3 = d5.s;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var2.b());
                        }
                        d5Var3 = d5.s;
                    }
                    k6 k6Var = new k6(size2, 12, 16, d5Var3);
                    ci4 ci4Var4 = new ci4(5, z);
                    ci4Var4.h = null;
                    ci4Var4.l = null;
                    ci4Var4.d = k6Var;
                    ci4Var4.h = new sz0(nz.a(g6VarB.y().k()));
                    ci4Var4.l = (Integer) f13Var.f;
                    return ci4Var4.m();
                } catch (sr1 unused3) {
                    m51.v("Parsing AesGcmKey failed");
                    return null;
                }
            case 6:
                if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    k("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                    return null;
                }
                try {
                    o6 o6VarB = o6.B((mz) f13Var.c, b61.a());
                    if (o6VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    d5 d5Var4 = d5.w;
                    int size3 = o6VarB.y().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    lr2 lr2Var3 = (lr2) f13Var.e;
                    int iOrdinal3 = lr2Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        d5Var4 = d5.u;
                    } else if (iOrdinal3 == 2) {
                        d5Var4 = d5.v;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var3.b());
                        }
                        d5Var4 = d5.v;
                    }
                    s6 s6Var = new s6(size3, d5Var4);
                    ci4 ci4Var5 = new ci4(6, z);
                    ci4Var5.h = null;
                    ci4Var5.l = null;
                    ci4Var5.d = s6Var;
                    ci4Var5.h = new sz0(nz.a(o6VarB.y().k()));
                    ci4Var5.l = (Integer) f13Var.f;
                    return ci4Var5.n();
                } catch (sr1 unused4) {
                    m51.v("Parsing AesGcmSivKey failed");
                    return null;
                }
            default:
                if (!((String) f13Var.a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    k("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                    return null;
                }
                try {
                    l20 l20VarB = l20.B((mz) f13Var.c, b61.a());
                    if (l20VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    lr2 lr2Var4 = (lr2) f13Var.e;
                    int iOrdinal4 = lr2Var4.ordinal();
                    if (iOrdinal4 == 1) {
                        d5Var = d5.x;
                    } else if (iOrdinal4 == 2) {
                        d5Var = d5.y;
                    } else if (iOrdinal4 == 3) {
                        d5Var = d5.z;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + lr2Var4.b());
                        }
                        d5Var = d5.y;
                    }
                    return m20.q0(d5Var, new sz0(nz.a(l20VarB.y().k())), (Integer) f13Var.f);
                } catch (sr1 unused5) {
                    m51.v("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }
}
