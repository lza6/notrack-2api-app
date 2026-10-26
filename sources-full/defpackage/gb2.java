package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.autofill.ContentType$Companion;
import androidx.compose.ui.autofill.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import app.template.extension.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb2 {
    public static final d5 b;
    public static final d5 c;
    public static final d5 e;
    public static final d5 f;
    public static Field g;
    public static boolean h;
    public static Class i;
    public static boolean j;
    public static Field k;
    public static boolean l;
    public static Field m;
    public static boolean n;
    public static final float[] a = new float[91];
    public static final tf3[] d = new tf3[0];

    static {
        int i2 = 16;
        b = new d5("REMOVED_TASK", i2);
        c = new d5("CLOSED_EMPTY", i2);
        e = new d5("NONE", i2);
        f = new d5("PENDING", i2);
    }

    public static final long A(long j2) {
        long j3 = j2 << 1;
        int i2 = v01.l;
        int i3 = x01.a;
        return j3;
    }

    public static String B(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i2 = b2 & UByte.MAX_VALUE;
            sb.append("0123456789abcdef".charAt(i2 / 16));
            sb.append("0123456789abcdef".charAt(i2 % 16));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    public static final fd3 C(fd3 fd3Var, fe3 fe3Var) {
        boolean z;
        int i2 = 2;
        boolean z2 = false;
        if (fd3Var == null) {
            z = true;
        } else {
            ed3 ed3Var = fd3Var.a;
            long j2 = ed3Var.c;
            ed3 ed3Var2 = fd3Var.b;
            if (j2 != ed3Var2.c) {
                boolean z3 = fd3Var.c;
                if ((z3 ? ed3Var : ed3Var2).b == 0) {
                    if (z3) {
                        ed3Var = ed3Var2;
                    }
                    if (fe3Var.d().f.a.a.d.length() == ed3Var.b) {
                        l43 l43Var = new l43();
                        l43Var.c = true;
                        fe3Var.l(new ed0(l43Var, i2));
                        z = l43Var.c;
                    }
                }
            } else if (ed3Var.b == ed3Var2.b) {
                z = true;
            }
            z = false;
        }
        if (!z) {
            return fd3Var;
        }
        String str = fe3Var.b().f.a.a.d;
        if (fe3Var.getSize() > 1 || fe3Var.c() == null || str.length() == 0) {
            return fd3Var;
        }
        bd3 bd3VarB = fe3Var.b();
        String str2 = bd3VarB.f.a.a.d;
        int i3 = bd3VarB.c;
        int length = str2.length();
        if (i3 == 0) {
            int iY = sf3.y(0, str2);
            return fe3Var.a() ? fd3.a(fd3Var, o(fd3Var.a, bd3VarB, iY), null, true, 2) : fd3.a(fd3Var, null, o(fd3Var.b, bd3VarB, iY), false, 1);
        }
        if (i3 == length) {
            int iZ = sf3.z(length, str2);
            return fe3Var.a() ? fd3.a(fd3Var, o(fd3Var.a, bd3VarB, iZ), null, false, 2) : fd3.a(fd3Var, null, o(fd3Var.b, bd3VarB, iZ), true, 1);
        }
        fd3 fd3VarC = fe3Var.c();
        if (fd3VarC != null && fd3VarC.c) {
            z2 = true;
        }
        int iZ2 = fe3Var.a() ^ z2 ? sf3.z(i3, str2) : sf3.y(i3, str2);
        return fe3Var.a() ? fd3.a(fd3Var, o(fd3Var.a, bd3VarB, iZ2), null, z2, 2) : fd3.a(fd3Var, null, o(fd3Var.b, bd3VarB, iZ2), z2, 1);
    }

    public static boolean D(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [of2] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final i64 E(i64 i64Var) {
        yd ydVar;
        if (!i64Var.getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 parent$ui_release = i64Var.getNode().getParent$ui_release();
        ux1 ux1VarM = y64.M(i64Var);
        while (ux1VarM != null) {
            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        ?? E = parent$ui_release;
                        ?? oi2Var = 0;
                        while (E != 0) {
                            if (E instanceof i64) {
                                i64 i64Var2 = (i64) E;
                                if (kr1.n(i64Var.o(), i64Var2.o()) && i64Var.getClass() == i64Var2.getClass()) {
                                    return i64Var2;
                                }
                            } else if ((E.getKindSet$ui_release() & 262144) != 0 && (E instanceof ju0)) {
                                of2 child$ui_release = ((ju0) E).d;
                                int i2 = 0;
                                E = E;
                                oi2Var = oi2Var;
                                while (child$ui_release != null) {
                                    if ((child$ui_release.getKindSet$ui_release() & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oi2Var = oi2Var;
                                            E = child$ui_release;
                                        } else {
                                            if (oi2Var == 0) {
                                                oi2Var = new oi2(0, new of2[16]);
                                            }
                                            if (E != 0) {
                                                oi2Var.c(E);
                                                E = 0;
                                            }
                                            oi2Var.c(child$ui_release);
                                        }
                                    }
                                    child$ui_release = child$ui_release.getChild$ui_release();
                                    E = E;
                                    oi2Var = oi2Var;
                                }
                                if (i2 == 1) {
                                }
                            }
                            E = y64.e(oi2Var);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            ux1VarM = ux1VarM.t();
            parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
        }
        return null;
    }

    public static pv1 F(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = w43.a;
        synchronized (w43.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(w43.d);
        }
        pv1 pv1Var = (pv1) mapUnmodifiableMap.get(str);
        if (pv1Var != null) {
            return pv1Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }

    public static final t00 G(so0 so0Var) {
        if (!(so0Var instanceof nw0)) {
            return new t00(1, so0Var);
        }
        t00 t00VarL = ((nw0) so0Var).l();
        if (t00VarL != null) {
            if (!t00VarL.C()) {
                t00VarL = null;
            }
            if (t00VarL != null) {
                return t00VarL;
            }
        }
        return new t00(2, so0Var);
    }

    public static final boolean H(hg hgVar) {
        int length = hgVar.d.length();
        List list = hgVar.c;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                gg ggVar = (gg) list.get(i2);
                if ((ggVar.a instanceof m42) && ig.b(0, length, ggVar.b, ggVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final long I(long j2, long j3, float f2) {
        vn2 vn2Var = ef0.x;
        long jA = re0.a(j2, vn2Var);
        long jA2 = re0.a(j3, vn2Var);
        float fD = re0.d(jA);
        float fH = re0.h(jA);
        float fG = re0.g(jA);
        float fE = re0.e(jA);
        float fD2 = re0.d(jA2);
        float fH2 = re0.h(jA2);
        float fG2 = re0.g(jA2);
        float fE2 = re0.e(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return re0.a(h(g13.F(fH, fH2, f2), g13.F(fG, fG2, f2), g13.F(fE, fE2, f2), g13.F(fD, fD2, f2), vn2Var), re0.f(j3));
    }

    public static final float J(long j2) {
        bf0 bf0VarF = re0.f(j2);
        if (!g13.y(bf0VarF.b, 12884901888L)) {
            oo1.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) g13.P(bf0VarF.b)));
        }
        p63 p63Var = ((t63) bf0VarF).p;
        double dC = p63Var.c(re0.h(j2));
        float fC = (float) ((p63Var.c(re0.e(j2)) * 0.0722d) + (p63Var.c(re0.g(j2)) * 0.7152d) + (dC * 0.2126d));
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        if (fC > 1.0f) {
            return 1.0f;
        }
        return fC;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    public static void K(y00 y00Var, xy3 xy3Var) throws Throwable {
        y00 y00Var2;
        Throwable th;
        pg2 pg2Var = xy3Var.b;
        boolean zD = xy3Var.d();
        wy3 wy3Var = xy3Var.a;
        boolean z = zD && wy3Var.f != 3;
        if (z) {
            long j2 = xy3Var.c;
            h43 h43VarA = xp1.a(0L, (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32));
            y00Var.l();
            y00.k(y00Var, h43VarA);
        }
        em3 em3Var = wy3Var.b.a;
        tt3 tt3Var = em3Var.m;
        hy3 hy3Var = em3Var.a;
        if (tt3Var == null) {
            tt3Var = tt3.b;
        }
        tt3 tt3Var2 = tt3Var;
        pg3 pg3Var = em3Var.n;
        if (pg3Var == null) {
            pg3Var = pg3.d;
        }
        pg3 pg3Var2 = pg3Var;
        uz0 uz0Var = em3Var.p;
        if (uz0Var == null) {
            uz0Var = b71.a;
        }
        uz0 uz0Var2 = uz0Var;
        try {
            yx yxVarB = hy3Var.b();
            fy3 fy3Var = fy3.a;
            try {
                if (yxVarB == null) {
                    long jA = hy3Var != fy3Var ? hy3Var.a() : re0.b;
                    y00Var2 = y00Var;
                    try {
                        pg2.i(pg2Var, y00Var2, jA, pg3Var2, tt3Var2, uz0Var2);
                        if (z) {
                            y00Var2.i();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        y00Var2.i();
                        throw th;
                    }
                }
                float alpha = hy3Var != fy3Var ? hy3Var.getAlpha() : 1.0f;
                y00Var2 = y00Var;
                try {
                    pg2.j(pg2Var, y00Var2, yxVarB, alpha, pg3Var2, tt3Var2, uz0Var2);
                    y00Var2 = y00Var2;
                    if (z) {
                        y00Var2.i();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    y00Var2.i();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                y00Var2 = y00Var;
            }
        } catch (Throwable th5) {
            th = th5;
            y00Var2 = y00Var;
        }
        if (!z) {
            throw th;
        }
        y00Var2.i();
        throw th;
    }

    public static final long L(String str) {
        char cCharAt;
        int length = str.length();
        int i2 = (length <= 0 || !mo3.v0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i2 > 16) {
            int i3 = i2;
            while (true) {
                if (i2 >= length) {
                    if (length - i3 <= 16) {
                        break;
                    }
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return LongCompanionObject.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '0') {
                    if (i3 == i2) {
                        i3++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i2++;
            }
        }
        return (!to3.q0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(mo3.w0(1, str));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x025e  */
    /* JADX WARN: Code duplicated, block: B:164:0x031b  */
    /* JADX WARN: Code duplicated, block: B:166:0x031e  */
    /* JADX WARN: Code duplicated, block: B:170:0x032e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0335  */
    /* JADX WARN: Code duplicated, block: B:175:0x033f A[LOOP:5: B:174:0x033d->B:175:0x033f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x037b  */
    /* JADX WARN: Code duplicated, block: B:189:0x0391  */
    /* JADX WARN: Code duplicated, block: B:191:0x039c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0173 A[EDGE_INSN: B:196:0x0173->B:64:0x0173 BREAK  A[LOOP:0: B:9:0x0040->B:62:0x0152], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0150 A[DONT_INVERT, PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
  0x0150: PHI (r20v6 ga) = (r20v5 ga), (r20v7 ga) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r22v4 e14) = (r22v3 e14), (r22v5 e14) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r23v6 androidx.compose.ui.autofill.a) = (r23v5 androidx.compose.ui.autofill.a), (r23v7 androidx.compose.ui.autofill.a) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r25v7 n73) = (r25v6 n73), (r25v8 n73) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r28v8 hg) = (r28v7 hg), (r28v9 hg) binds: [B:10:0x004e, B:60:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0152 A[LOOP:0: B:9:0x0040->B:62:0x0152, LOOP_END] */
    public static final void M(ViewStructure viewStructure, ux1 ux1Var, AutofillId autofillId, String str, j43 j43Var) {
        int i2;
        long j2;
        long j3;
        long j4;
        char c2;
        e14 e14Var;
        n73 n73Var;
        hg hgVar;
        ga gaVar;
        boolean z;
        a aVar;
        Boolean bool;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        boolean z3;
        boolean z4;
        String strM124x239bb0bb;
        int size;
        String strR;
        int i3;
        String[] strArrZ;
        String[] strArrZ2;
        fi2 fi2Var;
        int i4;
        int i5;
        int i6;
        fi2 fi2Var2;
        e14 e14Var2;
        n73 n73Var2;
        hg hgVar2;
        Integer num3 = 1;
        ff3 ff3Var = cf3.a;
        ff3 ff3Var2 = te3.a;
        ue3 ue3VarV = ux1Var.v();
        int i7 = 2;
        int i8 = 8;
        if (ue3VarV == null || (fi2Var2 = ue3VarV.c) == null) {
            i2 = 2;
            j2 = 128;
            j3 = 255;
            j4 = -9187201950435737472L;
            c2 = 7;
            e14Var = null;
            n73Var = null;
            hgVar = null;
            gaVar = null;
            z = false;
            aVar = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            j2 = 128;
            Object[] objArr = fi2Var2.b;
            Object[] objArr2 = fi2Var2.c;
            long[] jArr = fi2Var2.a;
            j3 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                gaVar = null;
                z = false;
                e14Var2 = null;
                aVar = null;
                bool = null;
                n73Var2 = null;
                z2 = false;
                num = null;
                hgVar2 = null;
                j4 = -9187201950435737472L;
                while (true) {
                    long j5 = jArr[i9];
                    i2 = i7;
                    c2 = 7;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j5 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr[i12];
                                Object obj2 = objArr2[i12];
                                ff3 ff3Var3 = (ff3) obj;
                                if (kr1.n(ff3Var3, cf3.q)) {
                                    obj2.getClass();
                                    gaVar = (ga) obj2;
                                } else if (kr1.n(ff3Var3, cf3.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) ke0.z0((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (kr1.n(ff3Var3, cf3.p)) {
                                    obj2.getClass();
                                    aVar = (a) obj2;
                                } else if (kr1.n(ff3Var3, cf3.D)) {
                                    obj2.getClass();
                                    hgVar2 = (hg) obj2;
                                } else if (kr1.n(ff3Var3, cf3.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (kr1.n(ff3Var3, cf3.M)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (kr1.n(ff3Var3, cf3.I)) {
                                    z2 = true;
                                } else if (kr1.n(ff3Var3, cf3.w)) {
                                    obj2.getClass();
                                    n73Var2 = (n73) obj2;
                                } else if (kr1.n(ff3Var3, cf3.G)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (kr1.n(ff3Var3, cf3.H)) {
                                    obj2.getClass();
                                    e14Var2 = (e14) obj2;
                                } else if (kr1.n(ff3Var3, te3.b)) {
                                    viewStructure.setClickable(true);
                                } else if (kr1.n(ff3Var3, te3.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (kr1.n(ff3Var3, te3.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (kr1.n(ff3Var3, te3.j)) {
                                    z = true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                        if (i9 != length) {
                            break;
                        }
                        i9++;
                        i7 = i2;
                    } else if (i9 != length) {
                        break;
                        break;
                    } else {
                        i9++;
                        i7 = i2;
                    }
                }
            } else {
                i2 = 2;
                j4 = -9187201950435737472L;
                c2 = 7;
                gaVar = null;
                z = false;
                e14Var2 = null;
                aVar = null;
                bool = null;
                n73Var2 = null;
                z2 = false;
                num = null;
                hgVar2 = null;
            }
            e14Var = e14Var2;
            n73Var = n73Var2;
            hgVar = hgVar2;
        }
        ue3 ue3VarV2 = ux1Var.v();
        if (ue3VarV2 != null && ue3VarV2.h && !ue3VarV2.l) {
            ue3VarV2 = ue3VarV2.b();
            vh2 vh2Var = new vh2(((oi2) ((th2) ux1Var.n()).d).h);
            vh2Var.h(ux1Var.n());
            while (true) {
                int i13 = vh2Var.b;
                if (i13 == 0) {
                    break;
                }
                ux1 ux1Var2 = (ux1) vh2Var.k(i13 - 1);
                ue3 ue3VarV3 = ux1Var2.v();
                if (ue3VarV3 != null && !ue3VarV3.h) {
                    ue3VarV2.g(ue3VarV3);
                    if (!ue3VarV3.l) {
                        vh2Var.h(ux1Var2.n());
                    }
                }
            }
        }
        if (ue3VarV2 == null || (fi2Var = ue3VarV2.c) == null) {
            num2 = num3;
            list = null;
        } else {
            Object[] objArr3 = fi2Var.b;
            Object[] objArr4 = fi2Var.c;
            long[] jArr2 = fi2Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                list = null;
                while (true) {
                    long j6 = jArr2[i14];
                    num2 = num3;
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j6 & j3) < j2) {
                                int i17 = (i14 << 3) + i16;
                                Object obj3 = objArr3[i17];
                                Object obj4 = objArr4[i17];
                                i6 = i8;
                                ff3 ff3Var4 = (ff3) obj3;
                                i5 = i16;
                                if (kr1.n(ff3Var4, cf3.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (kr1.n(ff3Var4, cf3.z)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i5 = i16;
                                i6 = i8;
                            }
                            j6 >>= i6;
                            i16 = i5 + 1;
                            i8 = i6;
                        }
                        i4 = i8;
                        if (i15 != i4) {
                            break;
                        }
                    } else {
                        i4 = i8;
                    }
                    if (i14 == length2) {
                        break;
                    }
                    i14++;
                    i8 = i4;
                    num3 = num2;
                }
            } else {
                num2 = num3;
                list = null;
            }
        }
        Integer numValueOf = Integer.valueOf(ux1Var.d);
        if (ux1Var.t() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        Integer numValueOf2 = (gaVar == null && !z) ? e14Var != null ? Integer.valueOf(i2) : null : num2;
        if (numValueOf2 != null) {
            viewStructure.setAutofillType(numValueOf2.intValue());
        }
        if (aVar != null && (strArrZ2 = xr0.Z(aVar)) != null) {
            viewStructure.setAutofillHints(strArrZ2);
        }
        j43Var.a.r(ux1Var.d, new gc(i2, viewStructure));
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (e14Var != null) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(e14Var == e14.c);
        } else if (bool != null && (n73Var == null || n73Var.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        a.a.getClass();
        String[] strArrZ3 = xr0.Z(ContentType$Companion.getPassword());
        strArrZ3.getClass();
        if (strArrZ3.length == 0) {
            j93.g("Array is empty.");
            return;
        }
        String str2 = strArrZ3[0];
        if (aVar != null && (strArrZ = xr0.Z(aVar)) != null) {
            boolean zF0 = vl.f0(strArrZ, str2);
            z3 = true;
            boolean z5 = zF0;
            if (!z2 || z5) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (z4) {
                viewStructure.setDataIsSensitive(true);
            }
            viewStructure.setVisibility(((wl2) ux1Var.N.d).X0() ? 4 : 0);
            if (list != null) {
                size = list.size();
                strR = BuildConfig.VERSION_NAME;
                for (i3 = 0; i3 < size; i3++) {
                    hg hgVar3 = (hg) list.get(i3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strR);
                    strR = ud2.r(sb, hgVar3.d, '\n');
                }
                viewStructure.setText(strR);
                viewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            }
            if (((th2) ux1Var.n()).isEmpty() && n73Var != null && (strM124x239bb0bb = SemanticsUtils_androidKt.m124x239bb0bb(n73Var.a)) != null) {
                viewStructure.setClassName(strM124x239bb0bb);
            }
            if (z) {
                viewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (hgVar != null) {
                    viewStructure.setAutofillValue(AutofillValue.forText(hgVar.d));
                }
                if (z4) {
                    viewStructure.setInputType(129);
                }
            }
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            viewStructure.setDataIsSensitive(true);
        }
        viewStructure.setVisibility(((wl2) ux1Var.N.d).X0() ? 4 : 0);
        if (list != null) {
            size = list.size();
            strR = BuildConfig.VERSION_NAME;
            while (i3 < size) {
                hg hgVar4 = (hg) list.get(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strR);
                strR = ud2.r(sb2, hgVar4.d, '\n');
            }
            viewStructure.setText(strR);
            viewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
        }
        if (((th2) ux1Var.n()).isEmpty()) {
            viewStructure.setClassName(strM124x239bb0bb);
        }
        if (z) {
            viewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (hgVar != null) {
                viewStructure.setAutofillValue(AutofillValue.forText(hgVar.d));
            }
            if (z4) {
                viewStructure.setInputType(129);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object N(am3 am3Var, uo0 uo0Var) throws Throwable {
        pa4 pa4Var;
        am3 am3Var2;
        Throwable th;
        dy dyVar;
        if (uo0Var instanceof pa4) {
            pa4Var = (pa4) uo0Var;
            int i2 = pa4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pa4Var.l = i2 - Integer.MIN_VALUE;
            } else {
                pa4Var = new pa4(uo0Var);
            }
        } else {
            pa4Var = new pa4(uo0Var);
        }
        Object obj = pa4Var.h;
        int i3 = pa4Var.l;
        if (i3 != 0) {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dyVar = pa4Var.d;
            am3Var2 = pa4Var.c;
            try {
                g13.O(obj);
                xp1.g(am3Var2, null);
                return dyVar;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    xp1.g(am3Var2, th);
                    throw th3;
                }
            }
        }
        g13.O(obj);
        try {
            dy dyVar2 = new dy();
            pa4Var.c = am3Var;
            pa4Var.d = dyVar2;
            pa4Var.l = 1;
            am3Var.c.B(dyVar2);
            w84 w84Var = w84.a;
            hq0 hq0Var = hq0.c;
            if (w84Var == hq0Var) {
                return hq0Var;
            }
            am3Var2 = am3Var;
            dyVar = dyVar2;
            xp1.g(am3Var2, null);
            return dyVar;
        } catch (Throwable th4) {
            am3Var2 = am3Var;
            th = th4;
            throw th;
        }
    }

    public static final float P(long j2, float f2, wu0 wu0Var) {
        float fC;
        long jB = yz3.b(j2);
        if (zz3.a(jB, 4294967296L)) {
            if (wu0Var.l() <= 1.05d) {
                return wu0Var.f0(j2);
            }
            fC = yz3.c(j2) / yz3.c(wu0Var.k0(f2));
        } else {
            if (!zz3.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = yz3.c(j2);
        }
        return fC * f2;
    }

    public static int Q(double d2) {
        if (Double.isNaN(d2)) {
            u41.k("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return IntCompanionObject.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int R(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        u41.k("Cannot round NaN value.");
        return 0;
    }

    public static long S(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        u41.k("Cannot round NaN value.");
        return 0L;
    }

    public static final void T(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(X(j2)), i2, i3, 33);
        }
    }

    public static final void U(Spannable spannable, long j2, wu0 wu0Var, int i2, int i3) {
        long jB = yz3.b(j2);
        if (zz3.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(R(wu0Var.f0(j2)), false), i2, i3, 33);
        } else if (zz3.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(yz3.c(j2)), i2, i3, 33);
        }
    }

    public static final void V(Spannable spannable, g72 g72Var, int i2, int i3) {
        if (g72Var != null) {
            ArrayList arrayList = new ArrayList(le0.q0(g72Var, 10));
            Iterator it = g72Var.c.iterator();
            while (it.hasNext()) {
                arrayList.add(((f72) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i2, i3, 33);
        }
    }

    public static final int X(long j2) {
        float[] fArr = ef0.a;
        return (int) (re0.a(j2, ef0.e) >>> 32);
    }

    public static final long Y(long j2, z01 z01Var) {
        TimeUnit timeUnit = z01Var.c;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(DurationKt.MAX_NANOS, timeUnit2);
        return ((-jConvert) > j2 || j2 > jConvert) ? y(py.y(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, DurationKt.MAX_MILLIS)) : A(timeUnit2.convert(j2, timeUnit));
    }

    public static final ExtractedText Z(ey3 ey3Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = ey3Var.a.d;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = ey3Var.b;
        extractedText.selectionStart = jz3.f(j2);
        extractedText.selectionEnd = jz3.e(j2);
        extractedText.flags = !mo3.v0(ey3Var.a.d, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long a(float f2, float f3, float f4, float f5, bf0 bf0Var) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (bf0Var.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = re0.j;
            return j2;
        }
        if (((int) (bf0Var.b >> 32)) != 3) {
            oo1.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = bf0Var.c;
        if (i25 == -1) {
            oo1.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = bf0Var.b(0);
        float fA3 = bf0Var.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s = (short) i4;
                    fB = bf0Var.b(1);
                    fA = bf0Var.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                fB2 = bf0Var.b(2);
                                fA2 = bf0Var.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s3 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = re0.j;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                                i20 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s4 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = re0.j;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i12 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s5 = (short) i11;
                    fB2 = bf0Var.b(2);
                    fA2 = bf0Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s6 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = re0.j;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i20 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s7 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = re0.j;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i35 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s8 = (short) i4;
        fB = bf0Var.b(1);
        fA = bf0Var.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s9 = (short) i11;
                    fB2 = bf0Var.b(2);
                    fA2 = bf0Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s10 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = re0.j;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i20 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s11 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = re0.j;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i12 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s12 = (short) i11;
        fB2 = bf0Var.b(2);
        fA2 = bf0Var.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s13 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = re0.j;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i20 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s14 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = re0.j;
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [le1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void a0(i64 i64Var, le1 le1Var) {
        yd ydVar;
        if (!i64Var.getNode().isAttached()) {
            po1.b("visitAncestors called on an unattached node");
        }
        of2 parent$ui_release = i64Var.getNode().getParent$ui_release();
        ux1 ux1VarM = y64.M(i64Var);
        while (ux1VarM != null) {
            if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        ?? E = parent$ui_release;
                        ?? oi2Var = 0;
                        while (E != 0) {
                            boolean zBooleanValue = true;
                            if (E instanceof i64) {
                                i64 i64Var2 = (i64) E;
                                if (kr1.n(i64Var.o(), i64Var2.o()) && i64Var.getClass() == i64Var2.getClass()) {
                                    zBooleanValue = ((Boolean) le1Var.invoke(i64Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((E.getKindSet$ui_release() & 262144) != 0 && (E instanceof ju0)) {
                                of2 child$ui_release = ((ju0) E).d;
                                int i2 = 0;
                                while (child$ui_release != null) {
                                    if ((child$ui_release.getKindSet$ui_release() & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            E = E;
                                            oi2Var = oi2Var;
                                            oi2Var = oi2Var;
                                            E = child$ui_release;
                                        } else {
                                            if (oi2Var == 0) {
                                                oi2Var = new oi2(0, new of2[16]);
                                            }
                                            if (E != 0) {
                                                oi2Var.c(E);
                                                E = 0;
                                            }
                                            oi2Var.c(child$ui_release);
                                        }
                                    } else {
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                    child$ui_release = child$ui_release.getChild$ui_release();
                                    E = E;
                                    oi2Var = oi2Var;
                                }
                                if (i2 == 1) {
                                    E = E;
                                    oi2Var = oi2Var;
                                } else {
                                    E = E;
                                    oi2Var = oi2Var;
                                }
                            }
                            E = y64.e(oi2Var);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            ux1VarM = ux1VarM.t();
            parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
        }
    }

    public static final long b(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = re0.j;
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [i64, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [le1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void b0(i64 i64Var, le1 le1Var) {
        of2 of2Var = (of2) i64Var;
        if (!of2Var.getNode().isAttached()) {
            po1.b("visitSubtreeIf called on an unattached node");
        }
        oi2 oi2Var = new oi2(0, new of2[16]);
        of2 child$ui_release = of2Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var, of2Var.getNode());
        } else {
            oi2Var.c(child$ui_release);
        }
        while (true) {
            int i2 = oi2Var.h;
            if (i2 == 0) {
                return;
            }
            of2 of2Var2 = (of2) oi2Var.m(i2 - 1);
            if ((of2Var2.getAggregateChildKindSet$ui_release() & 262144) != 0) {
                of2 child$ui_release2 = of2Var2;
                while (true) {
                    if (child$ui_release2 != null) {
                        if ((child$ui_release2.getKindSet$ui_release() & 262144) != 0) {
                            ?? E = child$ui_release2;
                            ?? oi2Var2 = 0;
                            while (E != 0) {
                                if (E instanceof i64) {
                                    i64 i64Var2 = (i64) E;
                                    h64 h64Var = (kr1.n(i64Var.o(), i64Var2.o()) && i64Var.getClass() == i64Var2.getClass()) ? (h64) le1Var.invoke(i64Var2) : h64.c;
                                    if (h64Var != h64.h) {
                                        if (h64Var == h64.d) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.getKindSet$ui_release() & 262144) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release3 = ((ju0) E).d;
                                    int i3 = 0;
                                    E = E;
                                    oi2Var2 = oi2Var2;
                                    while (child$ui_release3 != null) {
                                        if ((child$ui_release3.getKindSet$ui_release() & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                oi2Var2 = oi2Var2;
                                                E = child$ui_release3;
                                            } else {
                                                if (oi2Var2 == 0) {
                                                    oi2Var2 = new oi2(0, new of2[16]);
                                                }
                                                if (E != 0) {
                                                    oi2Var2.c(E);
                                                    E = 0;
                                                }
                                                oi2Var2.c(child$ui_release3);
                                            }
                                        }
                                        child$ui_release3 = child$ui_release3.getChild$ui_release();
                                        E = E;
                                        oi2Var2 = oi2Var2;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                E = y64.e(oi2Var2);
                            }
                        }
                        child$ui_release2 = child$ui_release2.getChild$ui_release();
                    }
                }
            }
            y64.d(oi2Var, of2Var2);
        }
    }

    public static final long c(int i2, int i3, int i4, int i5) {
        return b(((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | ((i5 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (i4 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static final int c0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = re0.j;
        return j3;
    }

    public static /* synthetic */ long e(int i2, int i3, int i4) {
        return c(i2, i3, i4, KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static final jn3 f(Object obj) {
        if (obj == null) {
            obj = av1.c;
        }
        return new jn3(obj);
    }

    public static dc g(String str, uz3 uz3Var, long j2, wu0 wu0Var, kb1 kb1Var, int i2, int i3) {
        z21 z21Var = z21.c;
        return new dc(new hc(str, uz3Var, z21Var, z21Var, kb1Var, wu0Var), i2, 1, j2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long h(float f2, float f3, float f4, float f5, bf0 bf0Var) {
        int i2;
        int i3;
        int i4;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (bf0Var.c()) {
            long j2 = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i19 = re0.j;
            return j2;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        int i20 = iFloatToRawIntBits3 >>> 31;
        int i21 = (iFloatToRawIntBits3 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = 49;
        int i24 = ConstantsKt.MINIMUM_BLOCK_SIZE;
        int i25 = 0;
        if (i21 == 255) {
            i3 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else {
                if (i2 > 0) {
                    int i26 = i22 >> 13;
                    if ((iFloatToRawIntBits3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i4 = (((i2 << 10) | i26) + 1) | (i20 << 15);
                    } else {
                        i3 = i26;
                    }
                    short s = (short) i4;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i16 = i14 - 112;
                                    if (i16 < 31) {
                                        if (i16 <= 0) {
                                            i25 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                                i17 = (((i16 << 10) | i25) + 1) | (i13 << 15);
                                            } else {
                                                i23 = i16;
                                            }
                                        } else if (i16 >= -10) {
                                            i18 = (i15 | 8388608) >> (1 - i16);
                                            if ((i18 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                                i18 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                            }
                                            i23 = 0;
                                            i25 = i18 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
                                    int i27 = re0.j;
                                    return jMax;
                                }
                                if (i15 == 0) {
                                    i24 = 0;
                                }
                                i25 = i24;
                                i23 = 31;
                                i17 = (i13 << 15) | (i23 << 10) | i25;
                                long jMax2 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
                                int i28 = re0.j;
                                return jMax2;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i12 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s3 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i25 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i17 = (((i16 << 10) | i25) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i18 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                }
                                i23 = 0;
                                i25 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
                        int i29 = re0.j;
                        return jMax3;
                    }
                    if (i15 == 0) {
                        i24 = 0;
                    }
                    i25 = i24;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i25;
                    long jMax4 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
                    int i210 = re0.j;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i30 = (i22 | 8388608) >> (1 - i2);
                    if ((i30 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i30 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i3 = i30 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i20 << 15) | (i2 << 10);
        short s4 = (short) i4;
        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s5 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i25 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i17 = (((i16 << 10) | i25) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                                    i18 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                                }
                                i23 = 0;
                                i25 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
                        int i211 = re0.j;
                        return jMax5;
                    }
                    if (i15 == 0) {
                        i24 = 0;
                    }
                    i25 = i24;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i25;
                    long jMax6 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
                    int i212 = re0.j;
                    return jMax6;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i12 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s6 = (short) i11;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i16 = i14 - 112;
            if (i16 < 31) {
                if (i16 <= 0) {
                    i25 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i17 = (((i16 << 10) | i25) + 1) | (i13 << 15);
                    } else {
                        i23 = i16;
                    }
                } else if (i16 >= -10) {
                    i18 = (i15 | 8388608) >> (1 - i16);
                    if ((i18 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                        i18 += ConstantsKt.DEFAULT_BUFFER_SIZE;
                    }
                    i23 = 0;
                    i25 = i18 >> 13;
                } else {
                    i23 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
            int i213 = re0.j;
            return jMax7;
        }
        if (i15 == 0) {
            i24 = 0;
        }
        i25 = i24;
        i23 = 31;
        i17 = (i13 << 15) | (i23 << 10) | i25;
        long jMax8 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) bf0Var.c) & 63);
        int i214 = re0.j;
        return jMax8;
    }

    public static final fd3 i(fe3 fe3Var, sw swVar) {
        boolean z = fe3Var.k() == sq0.c;
        return new fd3(m(fe3Var.e(), z, true, fe3Var.f(), swVar), m(fe3Var.j(), z, false, fe3Var.i(), swVar), z);
    }

    public static final long j(String str) {
        z01 z01Var;
        long jZ;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            u41.k("The string is empty");
            return 0L;
        }
        int i2 = v01.l;
        char cCharAt2 = str.charAt(0);
        int i3 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i3 > 0 && str.length() > 0 && yo4.x(str.charAt(0), '-', false);
        if (length <= i3) {
            u41.k("No components");
            return 0L;
        }
        if (str.charAt(i3) != 'P') {
            throw new IllegalArgumentException();
        }
        int i4 = i3 + 1;
        if (i4 == length) {
            throw new IllegalArgumentException();
        }
        z01 z01Var2 = null;
        long jE = 0;
        boolean z2 = false;
        while (i4 < length) {
            if (str.charAt(i4) != 'T') {
                int i5 = i4;
                while (i5 < str.length() && (('0' <= (cCharAt = str.charAt(i5)) && cCharAt < ':') || mo3.v0("+-.", cCharAt))) {
                    i5++;
                }
                String strSubstring = str.substring(i4, i5);
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i4;
                if (length2 < 0 || length2 >= str.length()) {
                    u41.k("Missing unit for value ".concat(strSubstring));
                    return 0L;
                }
                char cCharAt3 = str.charAt(length2);
                int i6 = length2 + 1;
                z01 z01Var3 = z01.SECONDS;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        z01Var = z01.HOURS;
                    } else if (cCharAt3 == 'M') {
                        z01Var = z01.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        z01Var = z01Var3;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    z01Var = z01.DAYS;
                }
                if (z01Var2 != null && z01Var2.compareTo(z01Var) <= 0) {
                    u41.k("Unexpected order of duration components");
                    return 0L;
                }
                int iZ0 = mo3.z0('.', 0, 6, strSubstring);
                if (z01Var != z01Var3 || iZ0 <= 0) {
                    jE = v01.e(jE, Y(L(strSubstring), z01Var));
                } else {
                    long jE2 = v01.e(jE, Y(L(strSubstring.substring(0, iZ0)), z01Var));
                    double d2 = Double.parseDouble(strSubstring.substring(iZ0));
                    double dV = g13.v(d2, z01Var, z01.NANOSECONDS);
                    if (Double.isNaN(dV)) {
                        u41.k("Duration value cannot be NaN.");
                        jZ = 0;
                    } else {
                        long jS = S(dV);
                        jZ = (-4611686018426999999L > jS || jS >= 4611686018427000000L) ? z(S(g13.v(d2, z01Var, z01.MILLISECONDS))) : A(jS);
                    }
                    jE = v01.e(jE2, jZ);
                }
                z01Var2 = z01Var;
                i4 = i6;
            } else {
                if (z2 || (i4 = i4 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        return z ? v01.g(jE) : jE;
    }

    public static final ed3 k(fe3 fe3Var, bd3 bd3Var, ed3 ed3Var) {
        int i2 = fe3Var.a() ? bd3Var.c : bd3Var.d;
        int iF = fe3Var.a() ? fe3Var.f() : fe3Var.i();
        int i3 = bd3Var.b;
        xy3 xy3Var = bd3Var.f;
        int i4 = bd3Var.e;
        if (iF != i3) {
            return bd3Var.a(i2);
        }
        id3 id3Var = new id3(i2, 0, bd3Var);
        q22 q22Var = q22.d;
        ly1 ly1VarH = yo4.H(q22Var, id3Var);
        ly1 ly1VarH2 = yo4.H(q22Var, new hd3(bd3Var, i2, fe3Var.a() ? bd3Var.d : bd3Var.c, fe3Var, ly1VarH));
        if (bd3Var.a != ed3Var.c) {
            return (ed3) ly1VarH2.getValue();
        }
        if (i2 == i4) {
            return ed3Var;
        }
        if (((Number) ly1VarH.getValue()).intValue() != xy3Var.b.d(i4)) {
            return (ed3) ly1VarH2.getValue();
        }
        int i5 = ed3Var.b;
        long j2 = xy3Var.j(i5);
        boolean zA = fe3Var.a();
        if (i4 != -1) {
            if (i2 != i4) {
                if (((zA ? 1 : 0) ^ (bd3Var.b() == sq0.c ? 1 : 0)) == 0) {
                }
            }
            return bd3Var.a(i2);
        }
        int i6 = jz3.c;
        return (i5 == ((int) (j2 >> 32)) || i5 == ((int) (j2 & 4294967295L))) ? (ed3) ly1VarH2.getValue() : bd3Var.a(i2);
    }

    public static void l(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = as1.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = xv2.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final ed3 m(bd3 bd3Var, boolean z, boolean z2, int i2, sw swVar) {
        long j2;
        int i3 = z2 ? bd3Var.c : bd3Var.d;
        if (i2 != bd3Var.b) {
            return bd3Var.a(i3);
        }
        long jM = swVar.m(bd3Var, i3);
        if (z ^ z2) {
            int i4 = jz3.c;
            j2 = jM >> 32;
        } else {
            int i5 = jz3.c;
            j2 = 4294967295L & jM;
        }
        return bd3Var.a((int) j2);
    }

    public static final Set n(tf3 tf3Var) {
        tf3Var.getClass();
        if (tf3Var instanceof xz) {
            return ((xz) tf3Var).f();
        }
        HashSet hashSet = new HashSet(tf3Var.d());
        int iD = tf3Var.d();
        for (int i2 = 0; i2 < iD; i2++) {
            hashSet.add(tf3Var.e(i2));
        }
        return hashSet;
    }

    public static final ed3 o(ed3 ed3Var, bd3 bd3Var, int i2) {
        return new ed3(bd3Var.f.a(i2), i2, ed3Var.c);
    }

    public static final void p(ho0 ho0Var) {
        ho0Var.a.setValue(eo0.a);
    }

    public static final tf3[] q(List list) {
        tf3[] tf3VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (tf3VarArr = (tf3[]) list.toArray(new tf3[0])) == null) ? d : tf3VarArr;
    }

    public static final long r(long j2, long j3) {
        float f2;
        float f3;
        long jA = re0.a(j2, re0.f(j3));
        float fD = re0.d(j3);
        float fD2 = re0.d(jA);
        float f4 = 1.0f - fD2;
        float f5 = (fD * f4) + fD2;
        float fH = re0.h(jA);
        float fH2 = re0.h(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fH2 * fD) * f4) + (fH * fD2)) / f5;
        }
        float fG = re0.g(jA);
        float fG2 = re0.g(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fG2 * fD) * f4) + (fG * fD2)) / f5;
        }
        float fE = re0.e(jA);
        float fE2 = re0.e(j3);
        if (f5 != 0.0f) {
            f6 = (((fE2 * fD) * f4) + (fE * fD2)) / f5;
        }
        return h(f2, f3, f6, f5, re0.f(j3));
    }

    public static final boolean s(h43 h43Var, float f2, float f3) {
        float f4 = h43Var.a;
        if (f2 > h43Var.c || f4 > f2) {
            return false;
        }
        return f3 <= h43Var.d && h43Var.b <= f3;
    }

    public static final cg t(cg cgVar) {
        cg cgVarC = cgVar.c();
        int iB = cgVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            cgVarC.e(cgVar.a(i2), i2);
        }
        return cgVarC;
    }

    public static ub1 u(Context context) {
        ProviderInfo providerInfo;
        sb1 sb1Var;
        ApplicationInfo applicationInfo;
        int i2 = 3;
        qn0 rs0Var = Build.VERSION.SDK_INT >= 28 ? new rs0(i2) : new qn0(i2);
        PackageManager packageManager = context.getPackageManager();
        p23.n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            sb1Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrQ = rs0Var.q(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrQ) {
                    arrayList.add(signature.toByteArray());
                }
                sb1Var = new sb1(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                sb1Var = null;
            }
        }
        if (sb1Var == null) {
            return null;
        }
        return new ub1(new tb1(context, sb1Var));
    }

    public static final mb1 v(Context context) {
        bg1 bg1Var = new bg1(20);
        context.getApplicationContext();
        return new mb1(bg1Var, new gb(Build.VERSION.SDK_INT >= 31 ? jc1.a.a(context) : 0));
    }

    public static byte[] w(byte[] bArr) {
        if (bArr.length != 16) {
            u41.k("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = (byte) ((bArr[i2] << 1) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((byte) ((bArr[i2 + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] x(String str) {
        if (str.length() % 2 != 0) {
            u41.k("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                u41.k("input is not hexadecimal");
                return null;
            }
            bArr[i2] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static final long y(long j2) {
        long j3 = (j2 << 1) + 1;
        int i2 = v01.l;
        int i3 = x01.a;
        return j3;
    }

    public static final long z(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? y(py.y(j2, -4611686018427387903L, DurationKt.MAX_MILLIS)) : A(j2 * 1000000);
    }

    public abstract void O(ir3 ir3Var, qa2 qa2Var);

    public abstract ds3 W(String str);
}
