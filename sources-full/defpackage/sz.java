package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.Typography;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class sz implements wq1 {
    public static final sz b = new sz(1);
    public final /* synthetic */ int a;

    public /* synthetic */ sz(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x028c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0299  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a6 A[LOOP:2: B:149:0x0297->B:153:0x02a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:187:0x0351  */
    /* JADX WARN: Code duplicated, block: B:189:0x035c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0364  */
    /* JADX WARN: Code duplicated, block: B:192:0x0368  */
    /* JADX WARN: Code duplicated, block: B:194:0x0370  */
    /* JADX WARN: Code duplicated, block: B:196:0x0377  */
    /* JADX WARN: Code duplicated, block: B:198:0x0380  */
    /* JADX WARN: Code duplicated, block: B:199:0x0385  */
    /* JADX WARN: Code duplicated, block: B:201:0x038d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0391  */
    /* JADX WARN: Code duplicated, block: B:204:0x0399  */
    /* JADX WARN: Code duplicated, block: B:205:0x039d  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:210:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:219:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:222:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:279:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x02af A[SYNTHETIC] */
    @Override // defpackage.wq1
    public final f63 a(i33 i33Var) throws IOException {
        fp1 fp1Var;
        fp1 fp1Var2;
        int i;
        int length;
        int length2;
        String string;
        String string2;
        int i2;
        e63 e63VarF;
        IOException iOException;
        boolean z = true;
        Long l = null;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                l53 l53Var = i33Var.e;
                l53Var.getClass();
                fp1 fp1Var3 = new fp1(l53Var, l);
                pz pzVar = l53Var.f;
                if (pzVar == null) {
                    int i3 = pz.n;
                    th1 th1Var = l53Var.c;
                    int size = th1Var.size();
                    boolean z2 = true;
                    String str = null;
                    int i4 = 0;
                    boolean z3 = false;
                    boolean z4 = false;
                    int iX = -1;
                    int iX2 = -1;
                    boolean z5 = false;
                    boolean z6 = false;
                    boolean z7 = false;
                    int iX3 = -1;
                    int iX4 = -1;
                    boolean z8 = false;
                    boolean z9 = false;
                    boolean z10 = false;
                    while (i4 < size) {
                        boolean z11 = z;
                        String strD = th1Var.d(i4);
                        String strJ = th1Var.j(i4);
                        if (to3.k0(strD, "Cache-Control")) {
                            if (str == null) {
                                str = strJ;
                            }
                            i = 0;
                            while (i < strJ.length()) {
                                fp1 fp1Var4 = fp1Var3;
                                length = strJ.length();
                                th1 th1Var2 = th1Var;
                                length2 = i;
                                while (true) {
                                    if (length2 < length) {
                                        i2 = length;
                                        if (mo3.v0("=,;", strJ.charAt(length2))) {
                                            length2++;
                                            length = i2;
                                        }
                                    } else {
                                        length2 = strJ.length();
                                    }
                                }
                                string = mo3.U0(strJ.substring(i, length2)).toString();
                                if (length2 != strJ.length() || strJ.charAt(length2) == ',' || strJ.charAt(length2) == ';') {
                                    i = length2 + 1;
                                    string2 = null;
                                } else {
                                    int length3 = length2 + 1;
                                    byte[] bArr = ka4.a;
                                    int length4 = strJ.length();
                                    while (true) {
                                        if (length3 < length4) {
                                            char cCharAt = strJ.charAt(length3);
                                            int i5 = length4;
                                            if (cCharAt == ' ' || cCharAt == '\t') {
                                                length3++;
                                                length4 = i5;
                                            }
                                        } else {
                                            length3 = strJ.length();
                                        }
                                    }
                                    if (length3 >= strJ.length() || strJ.charAt(length3) != '\"') {
                                        int length5 = strJ.length();
                                        int length6 = length3;
                                        while (true) {
                                            if (length6 < length5) {
                                                int i6 = length5;
                                                if (!mo3.v0(",;", strJ.charAt(length6))) {
                                                    length6++;
                                                    length5 = i6;
                                                }
                                            } else {
                                                length6 = strJ.length();
                                            }
                                        }
                                        string2 = mo3.U0(strJ.substring(length3, length6)).toString();
                                        i = length6;
                                    } else {
                                        int i7 = length3 + 1;
                                        int iZ0 = mo3.z0(Typography.quote, i7, 4, strJ);
                                        string2 = strJ.substring(i7, iZ0);
                                        i = iZ0 + 1;
                                    }
                                }
                                if ("no-cache".equalsIgnoreCase(string)) {
                                    z3 = z11;
                                } else if ("no-store".equalsIgnoreCase(string)) {
                                    z4 = z11;
                                } else if ("max-age".equalsIgnoreCase(string)) {
                                    iX = ka4.x(-1, string2);
                                } else if ("s-maxage".equalsIgnoreCase(string)) {
                                    iX2 = ka4.x(-1, string2);
                                } else if ("private".equalsIgnoreCase(string)) {
                                    z5 = z11;
                                } else if ("public".equalsIgnoreCase(string)) {
                                    z6 = z11;
                                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                    z7 = z11;
                                } else if ("max-stale".equalsIgnoreCase(string)) {
                                    iX3 = ka4.x(IntCompanionObject.MAX_VALUE, string2);
                                } else if ("min-fresh".equalsIgnoreCase(string)) {
                                    iX4 = ka4.x(-1, string2);
                                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                    z8 = z11;
                                } else if ("no-transform".equalsIgnoreCase(string)) {
                                    z9 = z11;
                                } else if ("immutable".equalsIgnoreCase(string)) {
                                    z10 = z11;
                                }
                                fp1Var3 = fp1Var4;
                                th1Var = th1Var2;
                                size = size;
                            }
                            i4++;
                            z = z11;
                            fp1Var3 = fp1Var3;
                            th1Var = th1Var;
                            size = size;
                        } else {
                            if (to3.k0(strD, "Pragma")) {
                            }
                            i4++;
                            z = z11;
                            fp1Var3 = fp1Var3;
                            th1Var = th1Var;
                            size = size;
                        }
                        z2 = false;
                        i = 0;
                        while (i < strJ.length()) {
                            fp1 fp1Var5 = fp1Var3;
                            length = strJ.length();
                            th1 th1Var3 = th1Var;
                            length2 = i;
                            while (true) {
                                if (length2 < length) {
                                    i2 = length;
                                    if (mo3.v0("=,;", strJ.charAt(length2))) {
                                        length2++;
                                        length = i2;
                                    }
                                } else {
                                    length2 = strJ.length();
                                }
                            }
                            string = mo3.U0(strJ.substring(i, length2)).toString();
                            if (length2 != strJ.length()) {
                                i = length2 + 1;
                                string2 = null;
                            } else {
                                i = length2 + 1;
                                string2 = null;
                            }
                            if ("no-cache".equalsIgnoreCase(string)) {
                                z3 = z11;
                            } else if ("no-store".equalsIgnoreCase(string)) {
                                z4 = z11;
                            } else if ("max-age".equalsIgnoreCase(string)) {
                                iX = ka4.x(-1, string2);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                iX2 = ka4.x(-1, string2);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z5 = z11;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z6 = z11;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z7 = z11;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                iX3 = ka4.x(IntCompanionObject.MAX_VALUE, string2);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                iX4 = ka4.x(-1, string2);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z8 = z11;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z9 = z11;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z10 = z11;
                            }
                            fp1Var3 = fp1Var5;
                            th1Var = th1Var3;
                            size = size;
                        }
                        i4++;
                        z = z11;
                        fp1Var3 = fp1Var3;
                        th1Var = th1Var;
                        size = size;
                    }
                    fp1Var = fp1Var3;
                    pz pzVar2 = new pz(z3, z4, iX, iX2, z5, z6, z7, iX3, iX4, z8, z9, z10, !z2 ? null : str);
                    l53Var.f = pzVar2;
                    pzVar = pzVar2;
                } else {
                    fp1Var = fp1Var3;
                }
                if (pzVar.j) {
                    Object obj = null;
                    fp1Var2 = new fp1(obj, obj);
                } else {
                    fp1Var2 = fp1Var;
                }
                l53 l53Var2 = (l53) fp1Var2.c;
                f63 f63Var = (f63) fp1Var2.d;
                if (l53Var2 == null && f63Var == null) {
                    return new f63(l53Var, n13.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new th1((String[]) new ArrayList(20).toArray(new String[0])), ka4.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (l53Var2 == null) {
                    f63Var.getClass();
                    e63 e63VarH = f63Var.h();
                    f63 f63VarAccess$stripBody = Headers$Companion.access$stripBody(f63Var);
                    e63.b(f63VarAccess$stripBody, "cacheResponse");
                    e63VarH.i = f63VarAccess$stripBody;
                    return e63VarH.a();
                }
                f63 f63VarB = i33Var.b(l53Var2);
                if (f63Var != null) {
                    if (f63VarB.l == 304) {
                        e63 e63VarH2 = f63Var.h();
                        e63VarH2.f = Headers$Companion.access$combine(f63Var.n, f63VarB.n).g();
                        e63VarH2.k = f63VarB.s;
                        e63VarH2.l = f63VarB.t;
                        f63 f63VarAccess$stripBody2 = Headers$Companion.access$stripBody(f63Var);
                        e63.b(f63VarAccess$stripBody2, "cacheResponse");
                        e63VarH2.i = f63VarAccess$stripBody2;
                        f63 f63VarAccess$stripBody3 = Headers$Companion.access$stripBody(f63VarB);
                        e63.b(f63VarAccess$stripBody3, "networkResponse");
                        e63VarH2.h = f63VarAccess$stripBody3;
                        e63VarH2.a();
                        m33 m33Var = f63VarB.o;
                        m33Var.getClass();
                        m33Var.close();
                        throw null;
                    }
                    m33 m33Var2 = f63Var.o;
                    if (m33Var2 != null) {
                        ka4.d(m33Var2);
                    }
                }
                e63 e63VarH3 = f63VarB.h();
                f63 f63VarAccess$stripBody4 = Headers$Companion.access$stripBody(f63Var);
                e63.b(f63VarAccess$stripBody4, "cacheResponse");
                e63VarH3.i = f63VarAccess$stripBody4;
                f63 f63VarAccess$stripBody5 = Headers$Companion.access$stripBody(f63VarB);
                e63.b(f63VarAccess$stripBody5, "networkResponse");
                e63VarH3.h = f63VarAccess$stripBody5;
                return e63VarH3.a();
            case 1:
                y23 y23Var = i33Var.a;
                synchronized (y23Var) {
                    try {
                        if (!y23Var.t) {
                            throw new IllegalStateException("released");
                        }
                        if (y23Var.s) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (y23Var.r) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f51 f51Var = y23Var.o;
                f51Var.getClass();
                tn2 tn2Var = y23Var.c;
                tn2Var.getClass();
                try {
                    e51 e51VarJ = f51Var.a(i33Var.f, i33Var.g, i33Var.h, tn2Var.n, !kr1.n(i33Var.e.b, "GET")).j(tn2Var, i33Var);
                    f51Var.getClass();
                    sd sdVar = new sd();
                    sdVar.b = y23Var;
                    sdVar.c = f51Var;
                    sdVar.d = e51VarJ;
                    sdVar.e = e51VarJ.h();
                    y23Var.q = sdVar;
                    y23Var.v = sdVar;
                    synchronized (y23Var) {
                        y23Var.r = true;
                        y23Var.s = true;
                    }
                    if (!y23Var.u) {
                        return i33.a(i33Var, 0, sdVar, null, 61).b(i33Var.e);
                    }
                    m51.l("Canceled");
                    return null;
                } catch (b83 e) {
                    f51Var.b(e.d);
                    throw e;
                } catch (IOException e2) {
                    f51Var.b(e2);
                    throw new b83(e2);
                }
            default:
                sd sdVar2 = i33Var.d;
                sdVar2.getClass();
                y23 y23Var2 = (y23) sdVar2.b;
                e51 e51Var = (e51) sdVar2.d;
                a33 a33Var = (a33) sdVar2.e;
                l53 l53Var3 = i33Var.e;
                av1 av1Var = l53Var3.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        e51Var.a(l53Var3);
                        try {
                            if (!yh4.O(l53Var3.b) || av1Var == null) {
                                y23Var2.i(sdVar2, true, false, null);
                                e63VarF = null;
                            } else {
                                if ("100-continue".equalsIgnoreCase(l53Var3.c.b("Expect"))) {
                                    try {
                                        e51Var.d();
                                        e63VarF = sdVar2.f(true);
                                    } catch (IOException e3) {
                                        sdVar2.h(e3);
                                        throw e3;
                                    }
                                } else {
                                    e63VarF = null;
                                }
                                if (e63VarF == null) {
                                    av1 av1Var2 = l53Var3.d;
                                    av1Var2.getClass();
                                    long jH = av1Var2.h();
                                    t23 t23Var = new t23(new c51(sdVar2, e51Var.e(l53Var3, jH), jH));
                                    av1Var.Q(t23Var);
                                    t23Var.close();
                                } else {
                                    y23Var2.i(sdVar2, true, false, null);
                                    if (a33Var.g == null) {
                                        z = false;
                                    }
                                    if (!z) {
                                        e51Var.h().k();
                                    }
                                }
                            }
                            try {
                                e51Var.c();
                                iOException = null;
                            } catch (IOException e4) {
                                sdVar2.h(e4);
                                throw e4;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            if (!(e instanceof nl0) || !sdVar2.a) {
                                throw e;
                            }
                            iOException = e;
                        }
                    } catch (IOException e6) {
                        sdVar2.h(e6);
                        throw e6;
                    }
                } catch (IOException e7) {
                    e = e7;
                    e63VarF = null;
                    if (!(e instanceof nl0)) {
                        throw e;
                    }
                    throw e;
                }
                if (e63VarF == null) {
                    try {
                        e63VarF = sdVar2.f(false);
                        e63VarF.getClass();
                    } catch (IOException e8) {
                        if (iOException == null) {
                            throw e8;
                        }
                        gb2.l(iOException, e8);
                        throw iOException;
                    }
                }
                e63VarF.a = l53Var3;
                e63VarF.e = a33Var.e;
                e63VarF.k = jCurrentTimeMillis;
                e63VarF.l = System.currentTimeMillis();
                f63 f63VarA = e63VarF.a();
                int i8 = f63VarA.l;
                if (i8 == 100 || (102 <= i8 && i8 < 200)) {
                    e63 e63VarF2 = sdVar2.f(false);
                    e63VarF2.getClass();
                    e63VarF2.a = l53Var3;
                    e63VarF2.e = a33Var.e;
                    e63VarF2.k = jCurrentTimeMillis;
                    e63VarF2.l = System.currentTimeMillis();
                    f63VarA = e63VarF2.a();
                    i8 = f63VarA.l;
                }
                e63 e63VarH4 = f63VarA.h();
                try {
                    String strA = f63.a(f63VarA, "Content-Type");
                    long jF = e51Var.f(f63VarA);
                    e63VarH4.g = new m33(strA, jF, new u23(new d51(sdVar2, e51Var.b(f63VarA), jF)), 0);
                    f63 f63VarA2 = e63VarH4.a();
                    l53 l53Var4 = f63VarA2.c;
                    l53Var4.getClass();
                    if ("close".equalsIgnoreCase(l53Var4.c.b("Connection")) || "close".equalsIgnoreCase(f63.a(f63VarA2, "Connection"))) {
                        e51Var.h().k();
                    }
                    if (i8 == 204 || i8 == 205) {
                        m33 m33Var3 = f63VarA2.o;
                        if ((m33Var3 != null ? m33Var3.c() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i8);
                            sb.append(" had non-zero Content-Length: ");
                            m33 m33Var4 = f63VarA2.o;
                            sb.append(m33Var4 != null ? Long.valueOf(m33Var4.c()) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return f63VarA2;
                } catch (IOException e9) {
                    sdVar2.h(e9);
                    throw e9;
                }
        }
    }
}
