package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class gm4 {
    public static vq4 a;
    public static Method i;
    public static boolean j;
    public static boolean l;
    public static int m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final c13 e = new c13("image-destination");
    public static final c13 f = new c13("image-replacement-text-is-link");
    public static final c13 g = new c13("image-size");
    public static final Object h = new Object();
    public static final Object k = new Object();

    public gm4() {
        new ConcurrentHashMap();
    }

    public static final int B(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                u41.k("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final long C(double d2) {
        return L((float) d2, 4294967296L);
    }

    public static final long D(int i2) {
        return L(i2, 4294967296L);
    }

    public static final void E(xp0 xp0Var, Throwable th) {
        if (th instanceof mw0) {
            th = ((mw0) th).c;
        }
        try {
            aq0 aq0Var = (aq0) xp0Var.get(bg1.m);
            if (aq0Var != null) {
                aq0Var.L(th);
            } else {
                sf3.H(xp0Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                gb2.l(runtimeException, th);
                th = runtimeException;
            }
            sf3.H(xp0Var, th);
        }
    }

    public static final int F(ul ulVar, Object obj, int i2) {
        int i3 = ulVar.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iG = g(i3, i2, ulVar.c);
            if (iG < 0 || kr1.n(obj, ulVar.d[iG])) {
                return iG;
            }
            int i4 = iG + 1;
            while (i4 < i3 && ulVar.c[i4] == i2) {
                if (kr1.n(obj, ulVar.d[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iG - 1; i5 >= 0 && ulVar.c[i5] == i2; i5--) {
                if (kr1.n(obj, ulVar.d[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static so0 G(so0 so0Var) {
        so0 so0VarIntercepted;
        so0Var.getClass();
        uo0 uo0Var = so0Var instanceof uo0 ? (uo0) so0Var : null;
        return (uo0Var == null || (so0VarIntercepted = uo0Var.intercepted()) == null) ? so0Var : so0VarIntercepted;
    }

    public static final boolean H(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static boolean I(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (n == null) {
            n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        n.booleanValue();
        if (o == null) {
            o = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (o.booleanValue()) {
            return !sf3.J() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static final wb2 J(c83 c83Var, int i2, int i3, int i4, int i5, int i6, xb2 xb2Var, List list, nv2[] nv2VarArr, int i7, int i8, int[] iArr, int i9) {
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        List list2 = list;
        long j2 = i6;
        int i14 = i8 - i7;
        int[] iArr2 = new int[i14];
        int i15 = i7;
        int iMax = 0;
        int i16 = 0;
        int i17 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        while (i15 < i8) {
            qb2 qb2Var = (qb2) list2.get(i15);
            float fG = sf3.G(sf3.F(qb2Var));
            if (fG > 0.0f) {
                f3 += fG;
                i16++;
                i11 = i15;
            } else {
                int i18 = i4 - i17;
                nv2 nv2VarC = nv2VarArr[i15];
                if (nv2VarC == null) {
                    if (i4 == Integer.MAX_VALUE) {
                        i11 = i15;
                        i12 = i16;
                        i13 = IntCompanionObject.MAX_VALUE;
                    } else {
                        i11 = i15;
                        i12 = i16;
                        i13 = i18 < 0 ? 0 : i18;
                    }
                    nv2VarC = qb2Var.c(c83Var.g(0, i13, i5, false));
                } else {
                    i11 = i15;
                    i12 = i16;
                }
                nv2 nv2Var = nv2VarC;
                int i19 = c83Var.i(nv2Var);
                int iH = c83Var.h(nv2Var);
                iArr2[i11 - i7] = i19;
                int i20 = i18 - i19;
                if (i20 < 0) {
                    i20 = 0;
                }
                iMin = Math.min(i6, i20);
                i17 += i19 + iMin;
                iMax = Math.max(iMax, iH);
                nv2VarArr[i11] = nv2Var;
                i16 = i12;
            }
            i15 = i11 + 1;
            j2 = j2;
        }
        long j3 = j2;
        int i21 = i16;
        if (i21 == 0) {
            i17 -= iMin;
            i10 = 0;
        } else {
            long j4 = ((long) (i21 - 1)) * j3;
            long jRound = ((long) ((i4 != Integer.MAX_VALUE ? i4 : i2) - i17)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f3;
            for (int i22 = i7; i22 < i8; i22++) {
                jRound -= (long) Math.round(sf3.G(sf3.F((qb2) list2.get(i22))) * f4);
            }
            int i23 = i7;
            int i24 = iMax;
            int i25 = 0;
            while (i23 < i8) {
                if (nv2VarArr[i23] == null) {
                    qb2 qb2Var2 = (qb2) list2.get(i23);
                    f2 = f4;
                    d83 d83VarF = sf3.F(qb2Var2);
                    float fG2 = sf3.G(d83VarF);
                    if (fG2 <= 0.0f) {
                        no1.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fG2 * f2) + iSignum);
                    nv2 nv2VarC2 = qb2Var2.c(c83Var.g((!(d83VarF != null ? d83VarF.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i5, true));
                    int i26 = c83Var.i(nv2VarC2);
                    int iH2 = c83Var.h(nv2VarC2);
                    iArr2[i23 - i7] = i26;
                    i25 += i26;
                    int iMax3 = Math.max(i24, iH2);
                    nv2VarArr[i23] = nv2VarC2;
                    i24 = iMax3;
                    jRound = j5;
                } else {
                    f2 = f4;
                }
                i23++;
                list2 = list;
                f4 = f2;
            }
            i10 = (int) (((long) i25) + j4);
            int i27 = i4 - i17;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 > i27) {
                i10 = i27;
            }
            iMax = i24;
        }
        int i28 = i10 + i17;
        if (i28 < 0) {
            i28 = 0;
        }
        int iMax4 = Math.max(i28, i2);
        int iMax5 = Math.max(iMax, Math.max(i3, 0));
        int[] iArr3 = new int[i14];
        c83Var.f(iMax4, iArr2, iArr3, xb2Var);
        return c83Var.j(nv2VarArr, xb2Var, iArr3, iMax4, iMax5, iArr, i9, i7, i8);
    }

    public static String K(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            u41.k("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static final long L(float f2, long j2) {
        long jFloatToRawIntBits = j2 | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        zz3[] zz3VarArr = yz3.b;
        return jFloatToRawIntBits;
    }

    public static final boolean M(db1 db1Var, ie ieVar) {
        Object[] objArr = new db1[16];
        if (!db1Var.getNode().isAttached()) {
            po1.b("visitChildren called on an unattached node");
        }
        oi2 oi2Var = new oi2(0, new of2[16]);
        of2 child$ui_release = db1Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var, db1Var.getNode());
        } else {
            oi2Var.c(child$ui_release);
        }
        int i2 = 0;
        while (true) {
            int i3 = oi2Var.h;
            if (i3 == 0) {
                break;
            }
            of2 of2VarE = (of2) oi2Var.m(i3 - 1);
            if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                y64.d(oi2Var, of2VarE);
            } else {
                while (of2VarE != null) {
                    if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                        oi2 oi2Var2 = null;
                        while (of2VarE != null) {
                            if (of2VarE instanceof db1) {
                                db1 db1Var2 = (db1) of2VarE;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = db1Var2;
                                i2 = i4;
                            } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                int i5 = 0;
                                for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                    if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            of2VarE = child$ui_release2;
                                        } else {
                                            if (oi2Var2 == null) {
                                                oi2Var2 = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE != null) {
                                                oi2Var2.c(of2VarE);
                                                of2VarE = null;
                                            }
                                            oi2Var2.c(child$ui_release2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            of2VarE = y64.e(oi2Var2);
                        }
                        break;
                    }
                    of2VarE = of2VarE.getChild$ui_release();
                }
            }
        }
        Arrays.sort(objArr, 0, i2, fb1.b);
        int i6 = i2 - 1;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                db1 db1Var3 = (db1) objArr[i6];
                if (av1.C(db1Var3) && f(db1Var3, ieVar)) {
                    return true;
                }
                i6--;
            }
        }
        return false;
    }

    public static final boolean N(db1 db1Var, ie ieVar) {
        Object[] objArr = new db1[16];
        if (!db1Var.getNode().isAttached()) {
            po1.b("visitChildren called on an unattached node");
        }
        oi2 oi2Var = new oi2(0, new of2[16]);
        of2 child$ui_release = db1Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var, db1Var.getNode());
        } else {
            oi2Var.c(child$ui_release);
        }
        int i2 = 0;
        while (true) {
            int i3 = oi2Var.h;
            if (i3 == 0) {
                break;
            }
            of2 of2VarE = (of2) oi2Var.m(i3 - 1);
            if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                y64.d(oi2Var, of2VarE);
            } else {
                while (of2VarE != null) {
                    if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                        oi2 oi2Var2 = null;
                        while (of2VarE != null) {
                            if (of2VarE instanceof db1) {
                                db1 db1Var2 = (db1) of2VarE;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = db1Var2;
                                i2 = i4;
                            } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                int i5 = 0;
                                for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                    if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            of2VarE = child$ui_release2;
                                        } else {
                                            if (oi2Var2 == null) {
                                                oi2Var2 = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE != null) {
                                                oi2Var2.c(of2VarE);
                                                of2VarE = null;
                                            }
                                            oi2Var2.c(child$ui_release2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            of2VarE = y64.e(oi2Var2);
                        }
                        break;
                    }
                    of2VarE = of2VarE.getChild$ui_release();
                }
            }
        }
        Arrays.sort(objArr, 0, i2, fb1.b);
        for (int i6 = 0; i6 < i2; i6++) {
            db1 db1Var3 = (db1) objArr[i6];
            if (av1.C(db1Var3) && x(db1Var3, ieVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0170  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:158:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x013b  */
    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c A[ADDED_TO_REGION, LOOP:6: B:92:0x015c->B:120:0x01b1, LOOP_START, PHI: r13
  0x015c: PHI (r13v13 of2) = (r13v7 of2), (r13v14 of2) binds: [B:91:0x015a, B:120:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    /* JADX WARN: Code duplicated, block: B:97:0x016a  */
    public static final boolean O(db1 db1Var, db1 db1Var2, int i2, ie ieVar) {
        of2 of2Var;
        of2 parent$ui_release;
        ux1 ux1VarM;
        yd ydVar;
        of2 of2VarE;
        oi2 oi2Var;
        if (db1Var.x0() != cb1.d) {
            u41.r("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new db1[16];
        if (!db1Var.getNode().isAttached()) {
            po1.b("visitChildren called on an unattached node");
        }
        oi2 oi2Var2 = new oi2(0, new of2[16]);
        of2 child$ui_release = db1Var.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            y64.d(oi2Var2, db1Var.getNode());
        } else {
            oi2Var2.c(child$ui_release);
        }
        int i3 = 0;
        while (true) {
            int i4 = oi2Var2.h;
            of2Var = null;
            if (i4 == 0) {
                break;
            }
            of2 of2VarE2 = (of2) oi2Var2.m(i4 - 1);
            if ((of2VarE2.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                y64.d(oi2Var2, of2VarE2);
            } else {
                while (of2VarE2 != null) {
                    if ((of2VarE2.getKindSet$ui_release() & 1024) != 0) {
                        oi2 oi2Var3 = null;
                        while (of2VarE2 != null) {
                            if (of2VarE2 instanceof db1) {
                                db1 db1Var3 = (db1) of2VarE2;
                                int i5 = i3 + 1;
                                if (objArr.length < i5) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i5, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i3] = db1Var3;
                                i3 = i5;
                            } else if ((of2VarE2.getKindSet$ui_release() & 1024) != 0 && (of2VarE2 instanceof ju0)) {
                                int i6 = 0;
                                for (of2 child$ui_release2 = ((ju0) of2VarE2).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                    if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            of2VarE2 = child$ui_release2;
                                        } else {
                                            if (oi2Var3 == null) {
                                                oi2Var3 = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE2 != null) {
                                                oi2Var3.c(of2VarE2);
                                                of2VarE2 = null;
                                            }
                                            oi2Var3.c(child$ui_release2);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            of2VarE2 = y64.e(oi2Var3);
                        }
                        break;
                    }
                    of2VarE2 = of2VarE2.getChild$ui_release();
                }
            }
        }
        Arrays.sort(objArr, 0, i3, fb1.b);
        if (i2 != 1) {
            if (i2 != 2) {
                u41.r("This function should only be used for 1-D focus search");
                return false;
            }
            lq1 lq1VarX = py.X(0, i3);
            int i7 = lq1VarX.c;
            int i8 = lq1VarX.d;
            if (i7 <= i8) {
                boolean z = false;
                while (true) {
                    if (z) {
                        db1 db1Var4 = (db1) objArr[i8];
                        if (av1.C(db1Var4) && f(db1Var4, ieVar)) {
                            return true;
                        }
                    }
                    if (kr1.n(objArr[i8], db1Var2)) {
                        z = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8--;
                }
            }
            if (i2 != 1) {
                if (!db1Var.getNode().isAttached()) {
                    po1.b("visitAncestors called on an unattached node");
                }
                parent$ui_release = db1Var.getNode().getParent$ui_release();
                ux1VarM = y64.M(db1Var);
                loop5: while (ux1VarM != null) {
                    if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                                of2VarE = parent$ui_release;
                                oi2Var = null;
                                while (of2VarE != null) {
                                    if (of2VarE instanceof db1) {
                                        of2Var = of2VarE;
                                        break loop5;
                                    }
                                    if ((of2VarE.getKindSet$ui_release() & 1024) == 0) {
                                    }
                                    of2VarE = y64.e(oi2Var);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    ux1VarM = ux1VarM.t();
                    if (ux1VarM != null) {
                    }
                }
                if (of2Var != null) {
                    return ((Boolean) ieVar.invoke(db1Var)).booleanValue();
                }
            }
            return false;
        }
        lq1 lq1VarX2 = py.X(0, i3);
        int i9 = lq1VarX2.c;
        int i10 = lq1VarX2.d;
        if (i9 <= i10) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    db1 db1Var5 = (db1) objArr[i9];
                    if (av1.C(db1Var5) && x(db1Var5, ieVar)) {
                        return true;
                    }
                }
                if (kr1.n(objArr[i9], db1Var2)) {
                    z2 = true;
                }
                if (i9 == i10) {
                    break;
                }
                i9++;
            }
        }
        if (i2 != 1 && db1Var.w0().a) {
            if (!db1Var.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            parent$ui_release = db1Var.getNode().getParent$ui_release();
            ux1VarM = y64.M(db1Var);
            loop5: while (ux1VarM != null) {
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 1024) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 1024) != 0) {
                            of2VarE = parent$ui_release;
                            oi2Var = null;
                            while (of2VarE != null) {
                                if (of2VarE instanceof db1) {
                                    of2Var = of2VarE;
                                    break loop5;
                                }
                                if ((of2VarE.getKindSet$ui_release() & 1024) == 0 && (of2VarE instanceof ju0)) {
                                    int i11 = 0;
                                    for (of2 child$ui_release3 = ((ju0) of2VarE).d; child$ui_release3 != null; child$ui_release3 = child$ui_release3.getChild$ui_release()) {
                                        if ((child$ui_release3.getKindSet$ui_release() & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                of2VarE = child$ui_release3;
                                            } else {
                                                if (oi2Var == null) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var.c(child$ui_release3);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                parent$ui_release = (ux1VarM != null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
            }
            if (of2Var != null) {
                return ((Boolean) ieVar.invoke(db1Var)).booleanValue();
            }
        }
        return false;
    }

    public static final void P(int i2, int i3, tf3 tf3Var) {
        tf3Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(tf3Var.e(i5));
            }
            i4 >>>= 1;
        }
        throw new ke2(tf3Var.b(), arrayList);
    }

    public static final Bitmap.Config Q(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || i2 != 3) {
            return (i3 < 26 || i2 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final void R(EditorInfo editorInfo, CharSequence charSequence, long j2, in1 in1Var) {
        int i2;
        int i3;
        int i4 = in1Var.e;
        int i5 = in1Var.d;
        boolean z = in1Var.a;
        if (i4 == 1) {
            i2 = z ? 6 : 0;
        } else if (i4 == 0) {
            i2 = 1;
        } else if (i4 == 2) {
            i2 = 2;
        } else if (i4 == 6) {
            i2 = 5;
        } else if (i4 == 5) {
            i2 = 7;
        } else if (i4 == 3) {
            i2 = 3;
        } else if (i4 == 4) {
            i2 = 4;
        } else {
            if (i4 != 7) {
                u41.r("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i2;
        g72 g72Var = in1Var.f;
        if (kr1.n(g72Var, g72.h)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(le0.q0(g72Var, 10));
            Iterator it = g72Var.c.iterator();
            while (it.hasNext()) {
                arrayList.add(((f72) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i3 = 1;
        } else if (i5 == 3) {
            i3 = 2;
        } else if (i5 == 4) {
            i3 = 3;
        } else if (i5 == 5) {
            i3 = 17;
        } else if (i5 == 6) {
            i3 = 33;
        } else if (i5 == 7) {
            i3 = 129;
        } else if (i5 == 8) {
            i3 = 18;
        } else {
            if (i5 != 9) {
                u41.r("Invalid Keyboard Type");
                return;
            }
            i3 = 8194;
        }
        editorInfo.inputType = i3;
        if (!z && (i3 & 1) == 1) {
            editorInfo.inputType = 131072 | i3;
            if (in1Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 1) == 1) {
            int i7 = in1Var.b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | ConstantsKt.DEFAULT_BLOCK_SIZE;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | ConstantsKt.DEFAULT_BUFFER_SIZE;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (in1Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i8 = jz3.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        kr1.i0(editorInfo, charSequence);
        editorInfo.imeOptions |= 33554432;
        if (!bp3.a || i5 == 7 || i5 == 8) {
            if (oy.a()) {
                p11.b(editorInfo, false);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
            return;
        }
        if (oy.a()) {
            p11.b(editorInfo, true);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        editorInfo.setSupportedHandwritingGestures(kr1.U(lb.m(), lb.z(), lb.v(), lb.x(), lb.B(), lb.C(), lb.D()));
        editorInfo.setSupportedHandwritingGesturePreviews(py.S(lb.m(), lb.z(), lb.v(), lb.x()));
    }

    public static Object S(ne1 ne1Var, Object obj, so0 so0Var) {
        ne1Var.getClass();
        xp0 context = so0Var.getContext();
        Object nr1Var = context == x21.c ? new nr1(so0Var) : new or1(so0Var, context);
        y64.l(2, ne1Var);
        return ne1Var.invoke(obj, nr1Var);
    }

    public static final iw a(float f2, long j2) {
        return new iw(f2, new vl3(j2));
    }

    public static jy b(int i2, int i3, fy fyVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        fy fyVar2 = fy.c;
        if (i4 != 0) {
            fyVar = fyVar2;
        }
        if (i2 == -2) {
            if (fyVar != fyVar2) {
                return new ll0(1, fyVar);
            }
            w20.a.getClass();
            return new jy(v20.b);
        }
        if (i2 == -1) {
            if (fyVar == fyVar2) {
                return new ll0(1, fy.d);
            }
            u41.k("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return fyVar == fyVar2 ? new jy(0) : new ll0(1, fyVar);
        }
        if (i2 != Integer.MAX_VALUE) {
            return fyVar == fyVar2 ? new jy(i2) : new ll0(i2, fyVar);
        }
        return new jy(IntCompanionObject.MAX_VALUE);
    }

    public static final long c(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final Bitmap d(bm1 bm1Var) {
        if (bm1Var instanceof ib) {
            return ((ib) bm1Var).b;
        }
        j93.k("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final ms2 e(am1 am1Var, Context context, int i2) {
        if (am1Var instanceof gv) {
            return y64.a(new ib(((gv) am1Var).a), i2);
        }
        return am1Var instanceof xz0 ? new zz0(vl0.t(am1Var, context.getResources()).mutate()) : new km1(am1Var);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean f(db1 db1Var, ie ieVar) {
        int iOrdinal = db1Var.x0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                db1 db1VarV = av1.v(db1Var);
                if (db1VarV == null) {
                    u41.r("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = db1VarV.x0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (f(db1VarV, ieVar) || z(db1Var, db1VarV, 2, ieVar) || (db1VarV.w0().a && ((Boolean) ieVar.invoke(db1VarV)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            u41.e();
                            return false;
                        }
                        u41.r("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return z(db1Var, db1VarV, 2, ieVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u41.e();
                    return false;
                }
                if (!M(db1Var, ieVar)) {
                    if (!(db1Var.w0().a ? ((Boolean) ieVar.invoke(db1Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return M(db1Var, ieVar);
    }

    public static final int g(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int h(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final vf3 i(String str, yo4 yo4Var, tf3[] tf3VarArr, le1 le1Var) {
        if (mo3.C0(str)) {
            u41.k("Blank serial names are prohibited");
            return null;
        }
        if (yo4Var.equals(zo3.n)) {
            u41.k("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        wc0 wc0Var = new wc0(str);
        le1Var.invoke(wc0Var);
        return new vf3(str, yo4Var, wc0Var.c.size(), vl.y0(tf3VarArr), wc0Var);
    }

    public static final void j(long j2) {
        zz3[] zz3VarArr = yz3.b;
        if ((j2 & 1095216660480L) == 0) {
            ro1.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void k(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            m51.s(ud2.l(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void l(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            m51.s(ud2.l(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void m(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            u41.l("fromIndex: ", i2, ", toIndex: ", i3, i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            u41.k(ud2.l(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static so0 o(so0 so0Var, so0 so0Var2, ne1 ne1Var) {
        ne1Var.getClass();
        if (ne1Var instanceof wr) {
            return ((wr) ne1Var).create(so0Var, so0Var2);
        }
        xp0 context = so0Var2.getContext();
        return context == x21.c ? new lr1(so0Var2, so0Var, ne1Var) : new mr1(so0Var2, context, ne1Var, so0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object t(wk0 wk0Var, o13 o13Var) {
        if (!((of2) wk0Var).getNode().isAttached()) {
            po1.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        su2 su2Var = (su2) y64.M(wk0Var).J;
        su2Var.getClass();
        return yo4.O(su2Var, o13Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.l81 r7, defpackage.w20 r8, boolean r9, defpackage.so0 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.o81
            if (r0 == 0) goto L13
            r0 = r10
            o81 r0 = (defpackage.o81) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            o81 r0 = new o81
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.m
            int r1 = r0.n
            r2 = 0
            r3 = 2
            r4 = 1
            hq0 r5 = defpackage.hq0.c
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L37
            boolean r9 = r0.l
            gy r7 = r0.h
            w20 r8 = r0.d
            l81 r1 = r0.c
            defpackage.g13.O(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r7)
            return r2
        L3d:
            boolean r9 = r0.l
            gy r7 = r0.h
            w20 r8 = r0.d
            l81 r1 = r0.c
            defpackage.g13.O(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.g13.O(r10)
            boolean r10 = r7 instanceof defpackage.p04
            if (r10 != 0) goto La9
            gy r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            r0.d = r8     // Catch: java.lang.Throwable -> L35
            r0.h = r10     // Catch: java.lang.Throwable -> L35
            r0.l = r9     // Catch: java.lang.Throwable -> L35
            r0.n = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.c = r1     // Catch: java.lang.Throwable -> L35
            r0.d = r8     // Catch: java.lang.Throwable -> L35
            r0.h = r7     // Catch: java.lang.Throwable -> L35
            r0.l = r9     // Catch: java.lang.Throwable -> L35
            r0.n = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.c(r2)
        L8b:
            w84 r7 = defpackage.w84.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L99:
            if (r2 != 0) goto La5
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La5:
            r8.c(r2)
        La8:
            throw r10
        La9:
            p04 r7 = (defpackage.p04) r7
            java.lang.Throwable r7 = r7.c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm4.u(l81, w20, boolean, so0):java.lang.Object");
    }

    public static final long v(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && um0.d(j2)) ? um0.h(j2) : IntCompanionObject.MAX_VALUE;
        if (um0.j(j2) != iH) {
            iH = py.x(g13.q(f2), um0.j(j2), iH);
        }
        return Protocol$Companion.m1784x4c29bdda(0, iH, 0, um0.g(j2));
    }

    public static lc1 w(lc1[] lc1VarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        lc1 lc1Var = null;
        int i4 = IntCompanionObject.MAX_VALUE;
        for (lc1 lc1Var2 : lc1VarArr) {
            int iAbs = (Math.abs(lc1Var2.c - i3) * 2) + (lc1Var2.d == z ? 0 : 1);
            if (lc1Var == null || i4 > iAbs) {
                lc1Var = lc1Var2;
                i4 = iAbs;
            }
        }
        return lc1Var;
    }

    public static final boolean x(db1 db1Var, ie ieVar) {
        int iOrdinal = db1Var.x0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                db1 db1VarV = av1.v(db1Var);
                if (db1VarV != null) {
                    return x(db1VarV, ieVar) || z(db1Var, db1VarV, 1, ieVar);
                }
                u41.r("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return db1Var.w0().a ? ((Boolean) ieVar.invoke(db1Var)).booleanValue() : N(db1Var, ieVar);
                }
                u41.e();
                return false;
            }
        }
        return N(db1Var, ieVar);
    }

    public static /* synthetic */ k81 y(xe1 xe1Var, xp0 xp0Var, int i2, fy fyVar, int i3) {
        if ((i3 & 1) != 0) {
            xp0Var = x21.c;
        }
        if ((i3 & 2) != 0) {
            i2 = -3;
        }
        if ((i3 & 4) != 0) {
            fyVar = fy.c;
        }
        return xe1Var.b(xp0Var, i2, fyVar);
    }

    public static final boolean z(db1 db1Var, db1 db1Var2, int i2, ie ieVar) {
        if (O(db1Var, db1Var2, i2, ieVar)) {
            return true;
        }
        qn0 qn0Var = ((va1) y64.N(db1Var).getFocusOwner()).h;
        qn0Var.getClass();
        Boolean bool = (Boolean) av1.H(db1Var, i2, new jf0(qn0Var, ((va1) y64.N(db1Var).getFocusOwner()).l, db1Var, db1Var2, i2, ieVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public abstract Object A(p13 p13Var);

    public abstract boolean n(p13 p13Var);

    public abstract Typeface p(Context context, ac1 ac1Var, Resources resources, int i2);

    public abstract Typeface q(Context context, lc1[] lc1VarArr, int i2);

    public Typeface r(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface s(Context context, Resources resources, int i2, String str, int i3) {
        File fileA = yo4.A(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (yo4.o(fileA, resources, i2)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }
}
