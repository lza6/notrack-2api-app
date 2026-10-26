package okhttp3;

import defpackage.a;
import defpackage.b14;
import defpackage.bc;
import defpackage.c52;
import defpackage.cx1;
import defpackage.d64;
import defpackage.e64;
import defpackage.ey3;
import defpackage.fq2;
import defpackage.gb2;
import defpackage.h43;
import defpackage.hh1;
import defpackage.i63;
import defpackage.ig3;
import defpackage.j;
import defpackage.je1;
import defpackage.jz3;
import defpackage.ka4;
import defpackage.kb1;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.l92;
import defpackage.le1;
import defpackage.li2;
import defpackage.lv0;
import defpackage.lz;
import defpackage.m51;
import defpackage.mo3;
import defpackage.n13;
import defpackage.n92;
import defpackage.nn2;
import defpackage.o92;
import defpackage.pk3;
import defpackage.ps2;
import defpackage.py;
import defpackage.py3;
import defpackage.q30;
import defpackage.qt;
import defpackage.r10;
import defpackage.re0;
import defpackage.rt;
import defpackage.sc0;
import defpackage.st;
import defpackage.to3;
import defpackage.u41;
import defpackage.ud2;
import defpackage.uu3;
import defpackage.uz3;
import defpackage.vk3;
import defpackage.vl0;
import defpackage.wm0;
import defpackage.wu0;
import defpackage.x10;
import defpackage.xp1;
import defpackage.xy3;
import defpackage.y00;
import defpackage.y92;
import defpackage.yo4;
import defpackage.z21;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.Typography;
import notrack.ai.data.promo.OwnFacts;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class Protocol$Companion {
    public static void appendQuotedString$okhttp(StringBuilder sb, String str) {
        str.getClass();
        sb.append(Typography.quote);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append(Typography.quote);
    }

    public static void checkBoundsIndexes$kotlin_stdlib(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            u41.l("startIndex: ", i, ", endIndex: ", i2, i3);
        } else {
            if (i <= i2) {
                return;
            }
            u41.k(ud2.l(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static void checkRangeIndexes$kotlin_stdlib(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            u41.l("fromIndex: ", i, ", toIndex: ", i2, i3);
        } else {
            if (i <= i2) {
                return;
            }
            u41.k(ud2.l(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
    public static void m1781xcadc9c24(y00 y00Var, ey3 ey3Var, long j, long j2, nn2 nn2Var, xy3 xy3Var, bc bcVar, long j3) throws Throwable {
        xy3 xy3Var2;
        if (!jz3.c(j)) {
            bcVar.f(j3);
            xy3Var2 = xy3Var;
            m1782x3f231d13(y00Var, j, nn2Var, xy3Var2, bcVar);
        } else if (!jz3.c(j2)) {
            long jB = xy3Var.a.b.b();
            re0 re0Var = new re0(jB);
            if (jB == 16) {
                re0Var = null;
            }
            long j4 = re0Var != null ? re0Var.a : re0.b;
            bcVar.f(re0.b(re0.d(j4) * 0.2f, j4));
            xy3Var2 = xy3Var;
            m1782x3f231d13(y00Var, j2, nn2Var, xy3Var2, bcVar);
        } else if (jz3.c(ey3Var.b)) {
            xy3Var2 = xy3Var;
        } else {
            bcVar.f(j3);
            xy3Var2 = xy3Var;
            m1782x3f231d13(y00Var, ey3Var.b, nn2Var, xy3Var2, bcVar);
        }
        gb2.K(y00Var, xy3Var2);
    }

    /* JADX INFO: renamed from: drawHighlight-Le-punE, reason: not valid java name */
    private static void m1782x3f231d13(y00 y00Var, long j, nn2 nn2Var, xy3 xy3Var, bc bcVar) {
        int iO = nn2Var.o(jz3.f(j));
        int iO2 = nn2Var.o(jz3.e(j));
        if (iO != iO2) {
            y00Var.c(xy3Var.i(iO, iO2), bcVar);
        }
    }

    public static String fill(String str, OwnFacts ownFacts, int i) {
        str.getClass();
        ownFacts.getClass();
        return str.length() == 0 ? str : to3.o0(to3.o0(to3.o0(to3.o0(to3.o0(to3.o0(str, "{pairs}", iso(String.valueOf(i))), "{free}", iso(String.valueOf(ownFacts.getFreePairs()))), "{plus}", iso(String.valueOf(ownFacts.getPaidPairs()))), "{mult}", iso(String.valueOf(ownFacts.getMemMult()))), "{plusUsd}", iso(ownFacts.getPlusUsd())), "{proUsd}", iso(ownFacts.getProUsd()));
    }

    /* JADX INFO: renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
    public static long m1783xcb8e775(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = IntCompanionObject.MAX_VALUE;
        int iMin3 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    wm0.l(i6);
                    u41.p();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i2);
        }
        return wm0.a(Math.min(i5, i), iMin2, iMin, iMin3);
    }

    /* JADX INFO: renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
    public static long m1784x4c29bdda(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = IntCompanionObject.MAX_VALUE;
        int iMin3 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    wm0.l(i6);
                    u41.p();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i4);
        }
        return wm0.a(iMin, iMin3, Math.min(i5, i3), iMin2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static b14 forJavaName(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return b14.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return b14.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return b14.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return b14.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return b14.SSL_3_0;
        }
        u41.k("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static hh1 get(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = z21.c;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            u41.r("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            m51.l("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        sc0 sc0VarForJavaName = sc0.b.forJavaName(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            u41.r("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            m51.l("tlsVersion == NONE");
            return null;
        }
        b14 b14VarForJavaName = forJavaName(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? ka4.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = ka4.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new hh1(b14VarForJavaName, sc0VarForJavaName, listK2, new j(16, listK));
    }

    public static n13 get(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return n13.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return n13.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return n13.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return n13.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return n13.SPDY_3;
        }
        if (str.equals("quic")) {
            return n13.QUIC;
        }
        m51.l("Unexpected protocol: ".concat(str));
        return null;
    }

    public static pk3 getCurrentThreadSnapshot() {
        return (pk3) vk3.a.get();
    }

    public static String getTriggerName$room_runtime_release(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("`room_table_modification_trigger_");
        sb.append(str);
        sb.append('_');
        return ud2.r(sb, str2, '`');
    }

    private static String iso(String str) {
        return fq2.n("\u2068", str, "\u2069");
    }

    public static int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        m51.l(ud2.l(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static pk3 makeCurrentNonObservable(pk3 pk3Var) {
        if (pk3Var instanceof d64) {
            d64 d64Var = (d64) pk3Var;
            if (d64Var.t == py.A()) {
                d64Var.r = null;
                return pk3Var;
            }
        }
        if (pk3Var instanceof e64) {
            e64 e64Var = (e64) pk3Var;
            if (e64Var.h == py.A()) {
                e64Var.g = null;
                return pk3Var;
            }
        }
        pk3 pk3VarH = vk3.h(pk3Var, null, false);
        pk3VarH.j();
        return pk3VarH;
    }

    public static void notifyFocusedRect$foundation_release(ey3 ey3Var, lv0 lv0Var, xy3 xy3Var, cx1 cx1Var, py3 py3Var, boolean z, nn2 nn2Var) {
        h43 h43VarB;
        if (z) {
            int iO = nn2Var.o(jz3.e(ey3Var.b));
            if (iO < xy3Var.a.a.d.length()) {
                h43VarB = xy3Var.b(iO);
            } else {
                h43VarB = iO != 0 ? xy3Var.b(iO - 1) : new h43(0.0f, 0.0f, 1.0f, (int) (uu3.a((uz3) lv0Var.c, (wu0) lv0Var.d, (kb1) lv0Var.e, uu3.a, 1) & 4294967295L));
            }
            float f = h43VarB.b;
            float f2 = h43VarB.a;
            long jL = cx1Var.L((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            h43 h43VarA = xp1.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL >> 32)))) << 32), (((long) Float.floatToRawIntBits(h43VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(h43VarB.d - f)) & 4294967295L));
            if (kr1.n((py3) py3Var.a.b.get(), py3Var)) {
                py3Var.b.h(h43VarA);
            }
        }
    }

    public static Object observe(je1 je1Var, le1 le1Var) {
        pk3 d64Var;
        if (le1Var == null) {
            return je1Var.invoke();
        }
        pk3 pk3Var = (pk3) vk3.a.get();
        if (pk3Var instanceof d64) {
            d64 d64Var2 = (d64) pk3Var;
            if (d64Var2.t == py.A()) {
                le1 le1Var2 = d64Var2.r;
                le1 le1Var3 = d64Var2.s;
                try {
                    ((d64) pk3Var).r = vk3.l(le1Var, le1Var2, true);
                    ((d64) pk3Var).s = le1Var3;
                    return je1Var.invoke();
                } finally {
                    d64Var2.r = le1Var2;
                    d64Var2.s = le1Var3;
                }
            }
        }
        if (pk3Var == null || (pk3Var instanceof li2)) {
            d64Var = new d64(pk3Var instanceof li2 ? (li2) pk3Var : null, le1Var, null, true, false);
        } else {
            if (le1Var == null) {
                return je1Var.invoke();
            }
            d64Var = pk3Var.u(le1Var);
        }
        try {
            pk3 pk3VarJ = d64Var.j();
            try {
                Object objInvoke = je1Var.invoke();
                pk3.q(pk3VarJ);
                d64Var.c();
                return objInvoke;
            } catch (Throwable th) {
                pk3.q(pk3VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            d64Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0241 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x025a A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0263 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x027b A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x028e  */
    /* JADX WARN: Code duplicated, block: B:117:0x028f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:157:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d3 A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0205 A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x021f A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0230 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:3:0x0002, B:6:0x0018, B:8:0x001f, B:19:0x0067, B:11:0x0026, B:13:0x003b, B:16:0x0045, B:20:0x006a, B:22:0x0078, B:25:0x0082, B:27:0x008a, B:30:0x00a1, B:32:0x00a7, B:35:0x00b5, B:36:0x00b9, B:39:0x00bf, B:41:0x00c6, B:42:0x00d3, B:44:0x00dd, B:46:0x00f2, B:48:0x00fa, B:50:0x0108, B:51:0x010c, B:53:0x0111, B:55:0x0117, B:57:0x0123, B:58:0x0127, B:59:0x013a, B:61:0x0143, B:63:0x0157, B:65:0x015d, B:67:0x0165, B:68:0x0169, B:70:0x0180, B:72:0x0188, B:76:0x01a4, B:81:0x01be, B:84:0x01d3, B:85:0x01d7, B:88:0x01eb, B:89:0x01ef, B:92:0x0205, B:93:0x0209, B:95:0x021f, B:96:0x0223, B:98:0x0230, B:99:0x0234, B:101:0x0241, B:102:0x0245, B:104:0x025a, B:107:0x0263, B:108:0x0267, B:110:0x026f, B:112:0x0275, B:114:0x027b, B:119:0x0292, B:120:0x0299, B:122:0x029f, B:124:0x02a7, B:131:0x02bb), top: B:143:0x0002 }] */
    public static qt parse(String str) {
        Object i63Var;
        Object obj;
        st stVar;
        String str2;
        o92 o92Var;
        String strOptString;
        Iterator<String> itKeys;
        String next;
        String strOptString2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("presets");
            c52 c52VarA = kr1.A();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString3 = jSONObjectOptJSONObject.optString("id");
                        String strOptString4 = jSONObjectOptJSONObject.optString("url");
                        strOptString3.getClass();
                        if (!mo3.C0(strOptString3)) {
                            strOptString4.getClass();
                            if (!mo3.C0(strOptString4)) {
                                String strOptString5 = jSONObjectOptJSONObject.optString("name", strOptString3);
                                strOptString5.getClass();
                                String strOptString6 = jSONObjectOptJSONObject.optString("thumb", strOptString4);
                                strOptString6.getClass();
                                c52VarA.add(new rt(strOptString3, strOptString5, strOptString4, strOptString6, jSONObjectOptJSONObject.optBoolean("free", false)));
                            }
                        }
                    }
                }
            }
            c52 c52VarQ = kr1.q(c52VarA);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("free");
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("pt");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optJSONObject("sizes") : null;
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optJSONObject("ava_cap_px") : null;
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("own_max");
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("strings");
            boolean zOptBoolean = jSONObject.optBoolean("enabled", true);
            ig3 ig3Var = parse$lambda$17$set(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("bg") : null);
            boolean zIsEmpty = ig3Var.c.isEmpty();
            Set setR = ig3Var;
            if (zIsEmpty) {
                setR = py.R("none");
            }
            Set set = setR;
            ig3 ig3Var2 = parse$lambda$17$set(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("fx") : null);
            ArrayList arrayList = new ArrayList();
            Object it = ig3Var2.iterator();
            while (((n92) it).hasNext()) {
                Object next2 = ((l92) it).next();
                c52 c52Var = c52VarQ;
                if (qt.o.contains((String) next2)) {
                    arrayList.add(next2);
                }
                c52VarQ = c52Var;
            }
            c52 c52Var2 = c52VarQ;
            Set setS0 = ke0.S0(arrayList);
            if (setS0.isEmpty()) {
                setS0 = py.R("none");
            }
            Set set2 = setS0;
            ig3 ig3Var3 = parse$lambda$17$set(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("pt") : null);
            boolean zIsEmpty2 = ig3Var3.c.isEmpty();
            Set setR2 = ig3Var3;
            if (zIsEmpty2) {
                setR2 = py.R("none");
            }
            Set set3 = setR2;
            ig3 ig3Var4 = parse$lambda$17$set(jSONObject.optJSONArray("fx"));
            ArrayList arrayList2 = new ArrayList();
            Object it2 = ig3Var4.iterator();
            while (((n92) it2).hasNext()) {
                Object next3 = ((l92) it2).next();
                Set set4 = set3;
                if (qt.o.contains((String) next3)) {
                    arrayList2.add(next3);
                }
                set3 = set4;
            }
            Set set5 = set3;
            boolean zIsEmpty3 = arrayList2.isEmpty();
            List listT = arrayList2;
            if (zIsEmpty3) {
                listT = kr1.T("none");
            }
            List list = listT;
            st stVar2 = parse$lambda$17$range(jSONObject, new st(0, 80, 5, 35));
            if (jSONObjectOptJSONObject3 != null) {
                JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject3.optJSONObject("opacity");
                if (jSONObjectOptJSONObject8 != null) {
                    int iOptInt = jSONObjectOptJSONObject8.optInt("min", 20);
                    int iOptInt2 = jSONObjectOptJSONObject8.optInt("max", 100);
                    int iOptInt3 = jSONObjectOptJSONObject8.optInt("step", 5);
                    int i2 = 1;
                    if (iOptInt3 >= 1) {
                        i2 = iOptInt3;
                    }
                    stVar = new st(iOptInt, iOptInt2, i2, jSONObjectOptJSONObject8.optInt("def", 60));
                } else {
                    stVar = null;
                }
                if (stVar != null) {
                    st stVar3 = stVar;
                    str2 = "m";
                    Map mapT = y92.T(new ps2("s", Float.valueOf((float) (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("s", 0.36d) : 0.36d))), new ps2("m", Float.valueOf((float) (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("m", 0.54d) : 0.54d))), new ps2("l", Float.valueOf((float) (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("l", 0.72d) : 0.72d))));
                    Map mapT2 = y92.T(new ps2("s", Integer.valueOf(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optInt("s", 180) : 180)), new ps2("m", Integer.valueOf(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optInt("m", 250) : 250)), new ps2("l", Integer.valueOf(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optInt("l", 320) : 320)));
                    int iOptInt4 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optInt("bg", 1600) : 1600;
                    int iOptInt5 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optInt("pt", 1100) : 1100;
                    o92Var = new o92();
                    if (jSONObjectOptJSONObject7 != null && (itKeys = jSONObjectOptJSONObject7.keys()) != null) {
                        while (itKeys.hasNext()) {
                            next = itKeys.next();
                            strOptString2 = jSONObjectOptJSONObject7.optString(next);
                            strOptString2.getClass();
                            if (!mo3.C0(strOptString2)) {
                                strOptString2 = null;
                            }
                            if (strOptString2 != null) {
                                next.getClass();
                                o92Var.put(next, strOptString2);
                            }
                        }
                    }
                    o92 o92VarB = o92Var.b();
                    if (jSONObjectOptJSONObject3 != null && (strOptString = jSONObjectOptJSONObject3.optString("def_size", "m")) != null) {
                        if (py.S("s", "m", "l").contains(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString == null) {
                            str2 = strOptString;
                        }
                    }
                    i63Var = new qt(zOptBoolean, c52Var2, set, set2, set5, list, stVar2, stVar3, mapT, mapT2, iOptInt4, iOptInt5, o92VarB, str2);
                    if (c52Var2.isEmpty() && zOptBoolean) {
                        i63Var = null;
                    }
                }
                if (i63Var instanceof i63) {
                    obj = null;
                } else {
                    obj = i63Var;
                }
                return (qt) obj;
            }
            stVar2 = stVar2;
            set2 = set2;
            stVar = new st(20, 100, 5, 60);
            st stVar4 = stVar;
            str2 = "m";
            Map mapT3 = y92.T(new ps2("s", Float.valueOf((float) (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("s", 0.36d) : 0.36d))), new ps2("m", Float.valueOf((float) (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("m", 0.54d) : 0.54d))), new ps2("l", Float.valueOf((float) (jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("l", 0.72d) : 0.72d))));
            Map mapT4 = y92.T(new ps2("s", Integer.valueOf(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optInt("s", 180) : 180)), new ps2("m", Integer.valueOf(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optInt("m", 250) : 250)), new ps2("l", Integer.valueOf(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optInt("l", 320) : 320)));
            int iOptInt6 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optInt("bg", 1600) : 1600;
            int iOptInt7 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optInt("pt", 1100) : 1100;
            o92Var = new o92();
            if (jSONObjectOptJSONObject7 != null) {
                while (itKeys.hasNext()) {
                    next = itKeys.next();
                    strOptString2 = jSONObjectOptJSONObject7.optString(next);
                    strOptString2.getClass();
                    if (!mo3.C0(strOptString2)) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        next.getClass();
                        o92Var.put(next, strOptString2);
                    }
                }
            }
            o92 o92VarB2 = o92Var.b();
            if (jSONObjectOptJSONObject3 != null) {
                if (py.S("s", "m", "l").contains(strOptString)) {
                    strOptString = null;
                }
                if (strOptString == null) {
                    str2 = strOptString;
                }
            }
            i63Var = new qt(zOptBoolean, c52Var2, set, set2, set5, list, stVar2, stVar4, mapT3, mapT4, iOptInt6, iOptInt7, o92VarB2, str2);
            if (c52Var2.isEmpty()) {
                i63Var = null;
            }
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        if (i63Var instanceof i63) {
            obj = null;
        } else {
            obj = i63Var;
        }
        return (qt) obj;
    }

    /* JADX INFO: renamed from: parse, reason: collision with other method in class */
    public static r10 m1785parse(String str) {
        Object i63Var;
        Iterator<String> itKeys;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("enabled", false)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("strings");
                o92 o92Var = parse$lambda$7$ints(jSONObject, "limits");
                o92 o92Var2 = parse$lambda$7$ints(jSONObject, "max_chars");
                int iOptInt = jSONObject.optInt("min_pairs", 2);
                int i = iOptInt < 1 ? 1 : iOptInt;
                String strOptString = jSONObject.optString("premium_path", "/premium?from=carry");
                strOptString.getClass();
                o92 o92Var3 = new o92();
                if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString2 = jSONObjectOptJSONObject.optString(next);
                        strOptString2.getClass();
                        if (mo3.C0(strOptString2)) {
                            strOptString2 = null;
                        }
                        if (strOptString2 != null) {
                            next.getClass();
                            o92Var3.put(next, strOptString2);
                        }
                    }
                }
                i63Var = new r10(true, o92Var, o92Var2, i, strOptString, o92Var3.b());
            } else {
                i63Var = null;
            }
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        return (r10) (i63Var instanceof i63 ? null : i63Var);
    }

    public static x10 parse(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("plan", "free");
        String str = mo3.C0(strOptString) ? "free" : strOptString;
        int iOptInt = jSONObject.optInt("limit", 0);
        int iOptInt2 = jSONObject.optInt("retry_after", 0);
        o92 o92Var = new o92();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("limits");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                o92Var.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next)));
            }
        }
        return new x10(str, iOptInt, iOptInt2, o92Var.b());
    }

    private static final st parse$lambda$17$range(JSONObject jSONObject, st stVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dim");
        if (jSONObjectOptJSONObject == null) {
            return stVar;
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("min", stVar.a);
        int iOptInt2 = jSONObjectOptJSONObject.optInt("max", stVar.b);
        int iOptInt3 = jSONObjectOptJSONObject.optInt("step", stVar.c);
        if (iOptInt3 < 1) {
            iOptInt3 = 1;
        }
        return new st(iOptInt, iOptInt2, iOptInt3, jSONObjectOptJSONObject.optInt("def", stVar.d));
    }

    private static final ig3 parse$lambda$17$set(JSONArray jSONArray) {
        ig3 ig3Var = new ig3();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArray.optString(i);
                strOptString.getClass();
                ig3Var.add(strOptString);
            }
        }
        return py.p(ig3Var);
    }

    private static final o92 parse$lambda$7$ints(JSONObject jSONObject, String str) {
        o92 o92Var = new o92();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                o92Var.put(next, Integer.valueOf(jSONObjectOptJSONObject.optInt(next)));
            }
        }
        return o92Var.b();
    }

    public static String pin(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        lz lzVar = lz.l;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        int length = encoded.length;
        vl0.w(encoded.length, 0L, length);
        yo4.n(length, encoded.length);
        int i = 0;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, length);
        bArrCopyOfRange.getClass();
        byte[] bArr = new lz(bArrCopyOfRange).b("SHA-256").c;
        byte[] bArr2 = a.a;
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length2 = bArr.length - (bArr.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & UByte.MAX_VALUE) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & UByte.MAX_VALUE) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & UByte.MAX_VALUE) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length3 = bArr.length - length2;
        if (length3 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & UByte.MAX_VALUE) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = Base64.padSymbol;
            bArr3[i2 + 3] = Base64.padSymbol;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & UByte.MAX_VALUE) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & UByte.MAX_VALUE) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = Base64.padSymbol;
        }
        sb.append(new String(bArr3, q30.a));
        return sb.toString();
    }

    public static void restoreNonObservable(pk3 pk3Var, pk3 pk3Var2, le1 le1Var) {
        if (pk3Var != pk3Var2) {
            pk3Var2.getClass();
            pk3.q(pk3Var);
            pk3Var2.c();
        } else if (pk3Var instanceof d64) {
            ((d64) pk3Var).r = le1Var;
        } else if (pk3Var instanceof e64) {
            ((e64) pk3Var).g = le1Var;
        } else {
            m51.u(pk3Var, "Non-transparent snapshot was reused: ");
        }
    }
}
