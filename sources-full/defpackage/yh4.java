package defpackage;

import ai.notrack.app.R;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import app.template.extension.BuildConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class yh4 implements i31 {
    public static final Object[] c = new Object[0];
    public static final rf4 d = new rf4(0.31006f, 0.31616f);
    public static final rf4 h = new rf4(0.34567f, 0.3585f);
    public static final rf4 l = new rf4(0.32168f, 0.33767f);
    public static final rf4 m = new rf4(0.31271f, 0.32902f);
    public static final float[] n = {0.964212f, 1.0f, 0.825188f};
    public static final xs1 o = new xs1(2);
    public static final d5 p = new d5("NO_THREAD_ELEMENTS", 16);
    public static final oj0 q = new oj0(11);
    public static final oj0 r = new oj0(12);
    public static final oj0 s = new oj0(13);
    public static Boolean t;

    public static final xp0 A(xp0 xp0Var, xp0 xp0Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 5;
        boolean zBooleanValue = ((Boolean) xp0Var.fold(bool, new oj0(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) xp0Var2.fold(bool, new oj0(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return xp0Var.plus(xp0Var2);
        }
        oj0 oj0Var = new oj0(6);
        x21 x21Var = x21.c;
        xp0 xp0Var3 = (xp0) xp0Var.fold(x21Var, oj0Var);
        Object objFold = xp0Var2;
        if (zBooleanValue2) {
            objFold = xp0Var2.fold(x21Var, new oj0(7));
        }
        return xp0Var3.plus((xp0) objFold);
    }

    public static final boolean B(int i, ie ieVar, db1 db1Var, h43 h43Var) {
        if (W(i, ieVar, db1Var, h43Var)) {
            return true;
        }
        qn0 qn0Var = ((va1) y64.N(db1Var).getFocusOwner()).h;
        qn0Var.getClass();
        Boolean bool = (Boolean) av1.H(db1Var, i, new jf0(qn0Var, ((va1) y64.N(db1Var).getFocusOwner()).l, db1Var, h43Var, i, ieVar, 3));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final ArrayList C(er1 er1Var) {
        er1Var.getClass();
        ux1 ux1VarX0 = ((m82) er1Var).x0();
        boolean zJ = J(ux1VarX0);
        th2 th2Var = (th2) ux1VarX0.o();
        oi2 oi2Var = (oi2) th2Var.d;
        ArrayList arrayList = new ArrayList(oi2Var.h);
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var = (ux1) th2Var.get(i2);
            arrayList.add(zJ ? ux1Var.l() : ux1Var.m());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007d A[LOOP:0: B:5:0x0013->B:38:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0082 A[EDGE_INSN: B:43:0x0082->B:39:0x0082 BREAK  A[LOOP:0: B:5:0x0013->B:38:0x007d], SYNTHETIC] */
    public static final xe3 D(ux1 ux1Var) {
        yd ydVar = ux1Var.N;
        Object obj = null;
        if ((((of2) ydVar.f).getAggregateChildKindSet$ui_release() & 8) != 0) {
            loop0: for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & 8) == 0) {
                    if ((child$ui_release.getAggregateChildKindSet$ui_release() & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    of2 of2VarE = child$ui_release;
                    oi2 oi2Var = null;
                    while (of2VarE != null) {
                        if (of2VarE instanceof xe3) {
                            if (((xe3) of2VarE).getShouldMergeDescendantSemantics()) {
                                obj = of2VarE;
                                break loop0;
                            }
                        } else if ((of2VarE.getKindSet$ui_release() & 8) != 0 && (of2VarE instanceof ju0)) {
                            int i = 0;
                            for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                if ((child$ui_release2.getKindSet$ui_release() & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        of2VarE = child$ui_release2;
                                    } else {
                                        if (oi2Var == null) {
                                            oi2Var = new oi2(0, new of2[16]);
                                        }
                                        if (of2VarE != null) {
                                            oi2Var.c(of2VarE);
                                            of2VarE = null;
                                        }
                                        oi2Var.c(child$ui_release2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        of2VarE = y64.e(oi2Var);
                    }
                    if ((child$ui_release.getAggregateChildKindSet$ui_release() & 8) != 0) {
                        break;
                    }
                }
            }
        }
        return (xe3) obj;
    }

    public static final void E(kk0 kk0Var, ne1 ne1Var) {
        ne1Var.getClass();
        y64.l(2, ne1Var);
        ne1Var.invoke(kk0Var, 1);
    }

    public static final boolean F(h43 h43Var, h43 h43Var2, h43 h43Var3, int i) {
        if (!G(i, h43Var, h43Var3)) {
            return false;
        }
        if (G(i, h43Var2, h43Var3) && !n(h43Var3, h43Var, h43Var2, i)) {
            return !n(h43Var3, h43Var2, h43Var, i) && H(i, h43Var3, h43Var) < H(i, h43Var3, h43Var2);
        }
        return true;
    }

    public static final boolean G(int i, h43 h43Var, h43 h43Var2) {
        float f = h43Var.b;
        float f2 = h43Var.d;
        float f3 = h43Var.a;
        float f4 = h43Var.c;
        if (i == 3) {
            float f5 = h43Var2.c;
            float f6 = h43Var2.a;
            if ((f5 > f4 || f6 >= f4) && f6 > f3) {
                return true;
            }
        } else if (i == 4) {
            float f7 = h43Var2.a;
            float f8 = h43Var2.c;
            if ((f7 < f3 || f8 <= f3) && f8 < f4) {
                return true;
            }
        } else if (i == 5) {
            float f9 = h43Var2.d;
            float f10 = h43Var2.b;
            if ((f9 > f2 || f10 >= f2) && f10 > f) {
                return true;
            }
        } else {
            if (i != 6) {
                u41.r("This function should only be used for 2-D focus search");
                return false;
            }
            float f11 = h43Var2.b;
            float f12 = h43Var2.d;
            if ((f11 < f || f12 <= f) && f12 < f2) {
                return true;
            }
        }
        return false;
    }

    public static final long H(int i, h43 h43Var, h43 h43Var2) {
        float f;
        float f2;
        float f3 = h43Var2.b;
        float f4 = h43Var2.d;
        float f5 = h43Var2.a;
        float f6 = h43Var2.c;
        if (i == 3) {
            f = h43Var.a - f6;
        } else if (i == 4) {
            f = f5 - h43Var.c;
        } else if (i == 5) {
            f = h43Var.b - f4;
        } else {
            if (i != 6) {
                u41.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f3 - h43Var.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = h43Var.b;
            f2 = (((h43Var.d - f7) / 2.0f) + f7) - (((f4 - f3) / 2.0f) + f3);
        } else {
            if (i != 5 && i != 6) {
                u41.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = h43Var.a;
            f2 = (((h43Var.c - f8) / 2.0f) + f8) - (((f6 - f5) / 2.0f) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean I(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final boolean J(ux1 ux1Var) {
        int iOrdinal = ux1Var.O.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            u41.e();
                            return false;
                        }
                        ux1 ux1VarT = ux1Var.t();
                        if (ux1VarT != null) {
                            return J(ux1VarT);
                        }
                        u41.k("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean K(x73 x73Var) {
        long j = x73Var.e;
        return (j >>> 32) == (4294967295L & j) && j == x73Var.f && j == x73Var.g && j == x73Var.h;
    }

    public static final xp0 L(gq0 gq0Var, xp0 xp0Var) {
        xp0 xp0VarA = A(gq0Var.getCoroutineContext(), xp0Var, true);
        jt0 jt0Var = sw0.a;
        return (xp0VarA == jt0Var || xp0VarA.get(t73.m) != null) ? xp0VarA : xp0VarA.plus(jt0Var);
    }

    public static final boolean O(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final View P(iu0 iu0Var) {
        if (!iu0Var.getNode().isAttached()) {
            po1.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) xx1.a(y64.M(iu0Var));
    }

    public static final uz3 Q(uz3 uz3Var, dx1 dx1Var) {
        em3 em3Var = uz3Var.a;
        hy3 hy3Var = fm3.d;
        hy3 hy3Var2 = em3Var.a;
        if (hy3Var2.equals(fy3.a)) {
            hy3Var2 = fm3.d;
        }
        hy3 hy3Var3 = hy3Var2;
        long j = em3Var.b;
        zz3[] zz3VarArr = yz3.b;
        if ((j & 1095216660480L) == 0) {
            j = fm3.a;
        }
        long j2 = j;
        ic1 ic1Var = em3Var.c;
        if (ic1Var == null) {
            ic1Var = ic1.h;
        }
        ic1 ic1Var2 = ic1Var;
        gc1 gc1Var = em3Var.d;
        gc1 gc1Var2 = new gc1(gc1Var != null ? gc1Var.a : 0);
        hc1 hc1Var = em3Var.e;
        hc1 hc1Var2 = new hc1(hc1Var != null ? hc1Var.a : 65535);
        lb1 lb1Var = em3Var.f;
        if (lb1Var == null) {
            lb1Var = lb1.a;
        }
        lb1 lb1Var2 = lb1Var;
        String str = em3Var.g;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        String str2 = str;
        long j3 = em3Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = fm3.b;
        }
        long j4 = j3;
        zr zrVar = em3Var.i;
        zr zrVar2 = new zr(zrVar != null ? zrVar.a : 0.0f);
        iy3 iy3Var = em3Var.j;
        if (iy3Var == null) {
            iy3Var = iy3.c;
        }
        iy3 iy3Var2 = iy3Var;
        g72 g72VarZ = em3Var.k;
        if (g72VarZ == null) {
            g72 g72Var = g72.h;
            g72VarZ = yv2.a.z();
        }
        g72 g72Var2 = g72VarZ;
        long j5 = em3Var.l;
        if (j5 == 16) {
            j5 = fm3.c;
        }
        long j6 = j5;
        tt3 tt3Var = em3Var.m;
        if (tt3Var == null) {
            tt3Var = tt3.b;
        }
        tt3 tt3Var2 = tt3Var;
        pg3 pg3Var = em3Var.n;
        if (pg3Var == null) {
            pg3Var = pg3.d;
        }
        pg3 pg3Var2 = pg3Var;
        hw2 hw2Var = em3Var.o;
        uz0 uz0Var = em3Var.p;
        if (uz0Var == null) {
            uz0Var = b71.a;
        }
        em3 em3Var2 = new em3(hy3Var3, j2, ic1Var2, gc1Var2, hc1Var2, lb1Var2, str2, j4, zrVar2, iy3Var2, g72Var2, j6, tt3Var2, pg3Var2, hw2Var, uz0Var);
        xs2 xs2Var = uz3Var.b;
        int i = ys2.b;
        int i2 = xs2Var.a;
        int i3 = 5;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 5;
        }
        int i4 = xs2Var.b;
        if (i4 == 3) {
            int iOrdinal = dx1Var.ordinal();
            if (iOrdinal == 0) {
                i3 = 4;
            } else if (iOrdinal != 1) {
                u41.e();
                return null;
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int iOrdinal2 = dx1Var.ordinal();
            if (iOrdinal2 == 0) {
                i3 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    u41.e();
                    return null;
                }
                i3 = 2;
            }
        } else {
            i3 = i4;
        }
        long j7 = xs2Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = ys2.a;
        }
        ky3 ky3Var = xs2Var.d;
        if (ky3Var == null) {
            ky3Var = ky3.c;
        }
        fw2 fw2Var = xs2Var.e;
        c42 c42Var = xs2Var.f;
        int i5 = xs2Var.g;
        if (i5 == 0) {
            i5 = x32.b;
        }
        int i6 = xs2Var.h;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        hz3 hz3Var = xs2Var.i;
        if (hz3Var == null) {
            hz3Var = hz3.c;
        }
        return new uz3(em3Var2, new xs2(i2, i3, j7, ky3Var, fw2Var, c42Var, i5, i6, hz3Var), uz3Var.c);
    }

    public static final void R(xp0 xp0Var, Object obj) {
        if (obj == p) {
            return;
        }
        if (!(obj instanceof l04)) {
            xp0Var.fold(null, r).getClass();
            m51.t();
            return;
        }
        xo0[] xo0VarArr = ((l04) obj).c;
        int length = xo0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        xo0 xo0Var = xo0VarArr[length];
        throw null;
    }

    public static Object S(je1 je1Var, uo0 uo0Var) {
        return py.Y(x21.c, new h2(je1Var, null, 5), uo0Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    public static int T(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i + 1;
                }
                if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (p23.H(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i5 = i4 + 1;
                if (p23.H(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (cCharAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i4 != i) {
                        return i4;
                    }
                    return -1;
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static int U(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (p23.H(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    public static int V(CharSequence charSequence, int i, char c2) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (p23.H(i2, charSequence)) {
                    i = i2;
                } else {
                    if (cCharAt == c2) {
                        return i;
                    }
                    if (c2 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c2) {
                    return i;
                }
                if (c2 == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }

    public static final boolean W(int i, ie ieVar, db1 db1Var, h43 h43Var) {
        db1 db1VarW;
        oi2 oi2Var = new oi2(0, new db1[16]);
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
        while (true) {
            int i2 = oi2Var2.h;
            if (i2 == 0) {
                break;
            }
            of2 of2VarE = (of2) oi2Var2.m(i2 - 1);
            if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                y64.d(oi2Var2, of2VarE);
            } else {
                while (of2VarE != null) {
                    if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                        oi2 oi2Var3 = null;
                        while (of2VarE != null) {
                            if (of2VarE instanceof db1) {
                                db1 db1Var2 = (db1) of2VarE;
                                if (db1Var2.isAttached()) {
                                    oi2Var.c(db1Var2);
                                }
                            } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                int i3 = 0;
                                for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                    if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            of2VarE = child$ui_release2;
                                        } else {
                                            if (oi2Var3 == null) {
                                                oi2Var3 = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE != null) {
                                                oi2Var3.c(of2VarE);
                                                of2VarE = null;
                                            }
                                            oi2Var3.c(child$ui_release2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            of2VarE = y64.e(oi2Var3);
                        }
                        break;
                    }
                    of2VarE = of2VarE.getChild$ui_release();
                }
            }
        }
        while (oi2Var.h != 0 && (db1VarW = w(oi2Var, h43Var, i)) != null) {
            if (db1VarW.w0().a) {
                return ((Boolean) ieVar.invoke(db1VarW)).booleanValue();
            }
            if (B(i, ieVar, db1VarW, h43Var)) {
                return true;
            }
            oi2Var.l(db1VarW);
        }
        return false;
    }

    public static final an Y(InputStream inputStream) {
        inputStream.getClass();
        return new an(inputStream, new c());
    }

    public static final Object Z(xp0 xp0Var) {
        Object objFold = xp0Var.fold(0, q);
        objFold.getClass();
        return objFold;
    }

    public static final Object[] a0(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = c;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final Object[] b0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final Boolean c0(int i, ie ieVar, db1 db1Var, h43 h43Var) {
        int iOrdinal = db1Var.x0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                db1 db1VarV = av1.v(db1Var);
                if (db1VarV == null) {
                    u41.r("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = db1VarV.x0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolC0 = c0(i, ieVar, db1VarV, h43Var);
                        if (!kr1.n(boolC0, Boolean.FALSE)) {
                            return boolC0;
                        }
                        if (h43Var == null) {
                            if (db1VarV.x0() != cb1.d) {
                                u41.r("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            db1 db1VarQ = av1.q(db1VarV);
                            if (db1VarQ == null) {
                                u41.r("ActiveParent must have a focusedChild");
                                return null;
                            }
                            h43Var = av1.t(db1VarQ);
                        }
                        return Boolean.valueOf(B(i, ieVar, db1Var, h43Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            u41.e();
                            return null;
                        }
                        u41.r("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (h43Var == null) {
                    h43Var = av1.t(db1VarV);
                }
                return Boolean.valueOf(B(i, ieVar, db1Var, h43Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u41.e();
                    return null;
                }
                if (db1Var.w0().a) {
                    return (Boolean) ieVar.invoke(db1Var);
                }
                return h43Var == null ? Boolean.valueOf(x(db1Var, i, ieVar)) : Boolean.valueOf(W(i, ieVar, db1Var, h43Var));
            }
        }
        return Boolean.valueOf(x(db1Var, i, ieVar));
    }

    public static final yu0 d(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        dc1 dc1VarA = ec1.a(f);
        if (dc1VarA == null) {
            dc1VarA = new e42(f);
        }
        return new yu0(f2, f, dc1VarA);
    }

    public static final Object d0(xp0 xp0Var, Object obj) {
        if (obj == null) {
            obj = Z(xp0Var);
        }
        if (obj == 0) {
            return p;
        }
        if (obj instanceof Integer) {
            return xp0Var.fold(new l04(((Number) obj).intValue(), xp0Var), s);
        }
        m51.t();
        return null;
    }

    public static final x73 e(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new x73(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final o84 e0(so0 so0Var, xp0 xp0Var, Object obj) {
        o84 o84Var = null;
        if ((so0Var instanceof iq0) && xp0Var.get(x00.h) != null) {
            iq0 callerFrame = (iq0) so0Var;
            while (!(callerFrame instanceof ow0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof o84) {
                    o84Var = (o84) callerFrame;
                    break;
                }
            }
            if (o84Var != null) {
                o84Var.k0(xp0Var, obj);
            }
        }
        return o84Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:0: B:5:0x0013->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0079 A[EDGE_INSN: B:44:0x0079->B:37:0x0079 BREAK  A[LOOP:0: B:5:0x0013->B:36:0x0074], SYNTHETIC] */
    public static final ze3 i(ux1 ux1Var, boolean z) {
        yd ydVar = ux1Var.N;
        Object obj = null;
        if ((((of2) ydVar.f).getAggregateChildKindSet$ui_release() & 8) != 0) {
            loop0: for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & 8) == 0) {
                    if ((child$ui_release.getAggregateChildKindSet$ui_release() & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    of2 of2VarE = child$ui_release;
                    oi2 oi2Var = null;
                    while (of2VarE != null) {
                        if (of2VarE instanceof xe3) {
                            obj = of2VarE;
                            break loop0;
                        }
                        if ((of2VarE.getKindSet$ui_release() & 8) != 0 && (of2VarE instanceof ju0)) {
                            int i = 0;
                            for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                if ((child$ui_release2.getKindSet$ui_release() & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        of2VarE = child$ui_release2;
                                    } else {
                                        if (oi2Var == null) {
                                            oi2Var = new oi2(0, new of2[16]);
                                        }
                                        if (of2VarE != null) {
                                            oi2Var.c(of2VarE);
                                            of2VarE = null;
                                        }
                                        oi2Var.c(child$ui_release2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        of2VarE = y64.e(oi2Var);
                    }
                    if ((child$ui_release.getAggregateChildKindSet$ui_release() & 8) != 0) {
                        break;
                    }
                }
            }
        }
        obj.getClass();
        of2 node = ((xe3) obj).getNode();
        ue3 ue3VarV = ux1Var.v();
        if (ue3VarV == null) {
            ue3VarV = new ue3();
        }
        return new ze3(node, z, ux1Var, ue3VarV);
    }

    public static final int j(m82 m82Var, ti1 ti1Var) {
        m82 m82VarP0 = m82Var.p0();
        if (m82VarP0 == null) {
            po1.b("Child of " + m82Var + " cannot be null when calculating alignment line");
        }
        if (m82Var.y0().a().containsKey(ti1Var)) {
            Integer num = (Integer) m82Var.y0().a().get(ti1Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iU = m82VarP0.U(ti1Var);
            if (iU != Integer.MIN_VALUE) {
                m82VarP0.o = true;
                m82Var.p = true;
                m82Var.C0();
                m82VarP0.o = false;
                m82Var.p = false;
                return iU + ((int) (ti1Var instanceof ti1 ? m82VarP0.A0() & 4294967295L : m82VarP0.A0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean k(int i, KeyEvent keyEvent) {
        return ((int) (av1.y(keyEvent) >> 32)) == i;
    }

    public static void m(Appendable appendable, char c2) {
        try {
            appendable.append(c2);
        } catch (IOException e) {
            m51.n(e);
        }
    }

    public static final boolean n(h43 h43Var, h43 h43Var2, h43 h43Var3, int i) {
        float f;
        float f2;
        boolean zO = o(i, h43Var3, h43Var);
        float f3 = h43Var3.b;
        float f4 = h43Var3.d;
        float f5 = h43Var3.a;
        float f6 = h43Var3.c;
        float f7 = h43Var.d;
        float f8 = h43Var.b;
        float f9 = h43Var.c;
        float f10 = h43Var.a;
        if (!zO && o(i, h43Var2, h43Var)) {
            if (i == 3) {
                if (f10 < f6) {
                    return true;
                }
            } else if (i == 4) {
                if (f9 > f5) {
                    return true;
                }
            } else if (i == 5) {
                if (f8 < f4) {
                    return true;
                }
            } else if (i != 6) {
                u41.r("This function should only be used for 2-D focus search");
            } else if (f7 > f3) {
                return true;
            }
            if (i == 3 || i == 4) {
                return true;
            }
            if (i == 3) {
                f = f10 - h43Var2.c;
            } else if (i == 4) {
                f = h43Var2.a - f9;
            } else if (i == 5) {
                f = f8 - h43Var2.d;
            } else {
                if (i != 6) {
                    u41.r("This function should only be used for 2-D focus search");
                    return false;
                }
                f = h43Var2.b - f7;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (i == 3) {
                f2 = f10 - f5;
            } else if (i == 4) {
                f2 = f6 - f9;
            } else if (i == 5) {
                f2 = f8 - f3;
            } else {
                if (i != 6) {
                    u41.r("This function should only be used for 2-D focus search");
                    return false;
                }
                f2 = f4 - f7;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            if (f < f2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean o(int i, h43 h43Var, h43 h43Var2) {
        if (i == 3 || i == 4) {
            if (h43Var.d > h43Var2.b && h43Var.b < h43Var2.d) {
                return true;
            }
        } else {
            if (i != 5 && i != 6) {
                u41.r("This function should only be used for 2-D focus search");
                return false;
            }
            if (h43Var.c > h43Var2.a && h43Var.a < h43Var2.c) {
                return true;
            }
        }
        return false;
    }

    public static int p(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, vk.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void r(db1 db1Var, oi2 oi2Var) {
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
        while (true) {
            int i = oi2Var2.h;
            if (i == 0) {
                return;
            }
            of2 of2VarE = (of2) oi2Var2.m(i - 1);
            if ((of2VarE.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                y64.d(oi2Var2, of2VarE);
            } else {
                while (of2VarE != null) {
                    if ((of2VarE.getKindSet$ui_release() & 1024) != 0) {
                        oi2 oi2Var3 = null;
                        while (of2VarE != null) {
                            if (of2VarE instanceof db1) {
                                db1 db1Var2 = (db1) of2VarE;
                                if (db1Var2.isAttached() && !y64.M(db1Var2).X) {
                                    if (db1Var2.w0().a) {
                                        oi2Var.c(db1Var2);
                                    } else {
                                        r(db1Var2, oi2Var);
                                    }
                                }
                            } else if ((of2VarE.getKindSet$ui_release() & 1024) != 0 && (of2VarE instanceof ju0)) {
                                int i2 = 0;
                                for (of2 child$ui_release2 = ((ju0) of2VarE).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                    if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            of2VarE = child$ui_release2;
                                        } else {
                                            if (oi2Var3 == null) {
                                                oi2Var3 = new oi2(0, new of2[16]);
                                            }
                                            if (of2VarE != null) {
                                                oi2Var3.c(of2VarE);
                                                of2VarE = null;
                                            }
                                            oi2Var3.c(child$ui_release2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            of2VarE = y64.e(oi2Var3);
                        }
                        break;
                    }
                    of2VarE = of2VarE.getChild$ui_release();
                }
            }
        }
    }

    public static int s(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void t(a71 a71Var, mt2 mt2Var) {
        if (a71Var.x(mt2Var)) {
            return;
        }
        try {
            a71Var.Q(mt2Var, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final wh4 u(Context context, jl0 jl0Var) {
        o73 o73Var;
        boolean zContainsKey;
        boolean z;
        context.getClass();
        zh4 zh4Var = new zh4(jl0Var.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        wf3 wf3Var = zh4Var.a;
        wf3Var.getClass();
        sb3 sb3Var = jl0Var.d;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        sb3Var.getClass();
        if (z2) {
            o73Var = new o73(applicationContext, null);
            o73Var.i = true;
        } else {
            if (mo3.C0("androidx.work.workdb")) {
                u41.k("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            o73 o73Var2 = new o73(applicationContext, "androidx.work.workdb");
            o73Var2.h = new f4(9, applicationContext);
            o73Var = o73Var2;
        }
        o73Var.f = wf3Var;
        ad0 ad0Var = new ad0(sb3Var);
        ArrayList arrayList = o73Var.c;
        arrayList.add(ad0Var);
        o73Var.a(fe2.h);
        o73Var.a(new r53(applicationContext, 2, 3));
        o73Var.a(fe2.i);
        o73Var.a(fe2.j);
        o73Var.a(new r53(applicationContext, 5, 6));
        o73Var.a(fe2.k);
        o73Var.a(fe2.l);
        o73Var.a(fe2.m);
        o73Var.a(new r53(applicationContext));
        o73Var.a(new r53(applicationContext, 10, 11));
        o73Var.a(fe2.d);
        o73Var.a(fe2.e);
        o73Var.a(fe2.f);
        o73Var.a(fe2.g);
        o73Var.a(new r53(applicationContext, 21, 22));
        o73Var.k = false;
        o73Var.l = true;
        Executor executor = o73Var.f;
        if (executor == null && o73Var.g == null) {
            al alVar = bl.o;
            o73Var.g = alVar;
            o73Var.f = alVar;
        } else if (executor != null && o73Var.g == null) {
            o73Var.g = executor;
        } else if (executor == null) {
            o73Var.f = o73Var.g;
        }
        HashSet hashSet = o73Var.p;
        LinkedHashSet linkedHashSet = o73Var.o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    u41.h(ud2.m(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "));
                    return null;
                }
            }
        }
        zp3 rn0Var = o73Var.h;
        if (rn0Var == null) {
            rn0Var = new rn0(12);
        }
        zp3 zp3Var = rn0Var;
        if (o73Var.m > 0) {
            if (o73Var.b != null) {
                u41.k("Required value was null.");
                return null;
            }
            u41.k("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z3 = o73Var.i;
        int i = o73Var.j;
        if (i == 0) {
            throw null;
        }
        Context context2 = o73Var.a;
        if (i == 1) {
            Object systemService = context2.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = o73Var.f;
        if (executor2 == null) {
            u41.k("Required value was null.");
            return null;
        }
        Executor executor3 = o73Var.g;
        if (executor3 == null) {
            u41.k("Required value was null.");
            return null;
        }
        boolean z4 = o73Var.k;
        boolean z5 = o73Var.l;
        String str = o73Var.b;
        int i2 = i;
        nr0 nr0Var = o73Var.n;
        ArrayList arrayList2 = o73Var.d;
        ArrayList arrayList3 = o73Var.e;
        boolean z6 = false;
        sr0 sr0Var = new sr0(context2, str, zp3Var, nr0Var, arrayList, z3, i2, executor2, executor3, z4, z5, linkedHashSet, arrayList2, arrayList3);
        Package r8 = WorkDatabase.class.getPackage();
        r8.getClass();
        String name = r8.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        canonicalName.getClass();
        name.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            cls.getClass();
            WorkDatabase workDatabase = (WorkDatabase) cls.getDeclaredConstructor(null).newInstance(null);
            wr1 wr1Var = workDatabase.d;
            LinkedHashMap linkedHashMap = workDatabase.g;
            workDatabase.c = workDatabase.e(sr0Var);
            Set setI = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = setI.iterator();
            while (true) {
                int i3 = -1;
                if (!it2.hasNext()) {
                    boolean z7 = z6;
                    int size = arrayList3.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            if (!bitSet.get(size)) {
                                u41.k("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size = i4;
                        }
                    }
                    for (ee2 ee2Var : workDatabase.g(linkedHashMap)) {
                        int i5 = ee2Var.a;
                        int i6 = ee2Var.b;
                        LinkedHashMap linkedHashMap2 = nr0Var.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                            if (map == null) {
                                map = a31.c;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i6));
                        } else {
                            zContainsKey = z7 ? 1 : 0;
                        }
                        if (!zContainsKey) {
                            nr0Var.a(ee2Var);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(sr0Var.g == 3 ? true : z7 ? 1 : 0);
                    workDatabase.f = sr0Var.e;
                    workDatabase.b = sr0Var.h;
                    new wf3(sr0Var.i, 1);
                    workDatabase.e = sr0Var.f;
                    Map mapJ = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    for (Map.Entry entry : mapJ.entrySet()) {
                        Class cls2 = (Class) entry.getKey();
                        for (Class cls3 : (List) entry.getValue()) {
                            int size2 = arrayList2.size() - 1;
                            if (size2 < 0) {
                                size2 = -1;
                                break;
                            }
                            while (true) {
                                int i7 = size2 - 1;
                                if (cls3.isAssignableFrom(arrayList2.get(size2).getClass())) {
                                    bitSet2.set(size2);
                                    break;
                                }
                                if (i7 < 0) {
                                    size2 = -1;
                                    break;
                                }
                                size2 = i7;
                            }
                            if (size2 < 0) {
                                StringBuilder sb = new StringBuilder("A required type converter (");
                                sb.append(cls3);
                                String canonicalName2 = cls2.getCanonicalName();
                                sb.append(") for ");
                                sb.append(canonicalName2);
                                sb.append(" is missing in the database configuration.");
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                            workDatabase.k.put(cls3, arrayList2.get(size2));
                        }
                    }
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i8 = size3 - 1;
                            if (!bitSet2.get(size3)) {
                                throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i8 >= 0) {
                                size3 = i8;
                            }
                        }
                    }
                    Context applicationContext2 = context.getApplicationContext();
                    applicationContext2.getClass();
                    a54 a54Var = new a54(applicationContext2, zh4Var);
                    tz2 tz2Var = new tz2(context.getApplicationContext(), jl0Var, zh4Var, workDatabase);
                    xh4 xh4Var = xh4.c;
                    context.getClass();
                    String str2 = ya3.a;
                    kr3 kr3Var = new kr3(context, workDatabase, jl0Var);
                    bs2.a(context, SystemJobService.class, true);
                    v72.f().c(ya3.a, "Created SystemJobScheduler and enabled SystemJobService");
                    pg1 pg1Var = new pg1(context, jl0Var, a54Var, tz2Var, new fp1(tz2Var, zh4Var), zh4Var);
                    ua3[] ua3VarArr = new ua3[2];
                    ua3VarArr[z7 ? 1 : 0] = kr3Var;
                    ua3VarArr[1] = pg1Var;
                    return new wh4(context.getApplicationContext(), jl0Var, zh4Var, workDatabase, kr1.U(ua3VarArr), tz2Var, a54Var);
                }
                Class cls4 = (Class) it2.next();
                int size4 = arrayList3.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i9 = size4 - 1;
                        z = z6;
                        if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                            bitSet.set(size4);
                            i3 = size4;
                            break;
                        }
                        if (i9 < 0) {
                            break;
                        }
                        size4 = i9;
                        z6 = z;
                    }
                } else {
                    z = z6;
                }
                if (i3 < 0) {
                    j93.i(cls4.getCanonicalName(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return null;
                }
                linkedHashMap.put(cls4, arrayList3.get(i3));
                z6 = z;
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(ud2.n(WorkDatabase.class, new StringBuilder("Cannot access the constructor ")));
        } catch (InstantiationException unused3) {
            throw new RuntimeException(ud2.n(WorkDatabase.class, new StringBuilder("Failed to create an instance of ")));
        }
    }

    public static final void v(a71 a71Var, mt2 mt2Var) throws IOException {
        try {
            IOException iOException = null;
            for (mt2 mt2Var2 : a71Var.A(mt2Var)) {
                try {
                    if (a71Var.K(mt2Var2).b) {
                        v(a71Var, mt2Var2);
                    }
                    a71Var.l(mt2Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final db1 w(oi2 oi2Var, h43 h43Var, int i) {
        h43 h43VarI;
        db1 db1Var = null;
        if (i == 3) {
            h43VarI = h43Var.i((h43Var.c - h43Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            h43VarI = h43Var.i(-((h43Var.c - h43Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            h43VarI = h43Var.i(0.0f, (h43Var.d - h43Var.b) + 1.0f);
        } else {
            if (i != 6) {
                u41.r("This function should only be used for 2-D focus search");
                return null;
            }
            h43VarI = h43Var.i(0.0f, -((h43Var.d - h43Var.b) + 1.0f));
        }
        Object[] objArr = oi2Var.c;
        int i2 = oi2Var.h;
        for (int i3 = 0; i3 < i2; i3++) {
            db1 db1Var2 = (db1) objArr[i3];
            if (av1.C(db1Var2)) {
                h43 h43VarT = av1.t(db1Var2);
                if (F(h43VarT, h43VarI, h43Var, i)) {
                    db1Var = db1Var2;
                    h43VarI = h43VarT;
                }
            }
        }
        return db1Var;
    }

    public static final boolean x(db1 db1Var, int i, le1 le1Var) {
        h43 h43Var;
        oi2 oi2Var = new oi2(0, new db1[16]);
        r(db1Var, oi2Var);
        int i2 = oi2Var.h;
        if (i2 <= 1) {
            db1 db1Var2 = (db1) (i2 == 0 ? null : oi2Var.c[0]);
            if (db1Var2 != null) {
                return ((Boolean) le1Var.invoke(db1Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                h43 h43VarT = av1.t(db1Var);
                float f = h43VarT.a;
                float f2 = h43VarT.b;
                h43Var = new h43(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    u41.r("This function should only be used for 2-D focus search");
                    return false;
                }
                h43 h43VarT2 = av1.t(db1Var);
                float f3 = h43VarT2.c;
                float f4 = h43VarT2.d;
                h43Var = new h43(f3, f4, f3, f4);
            }
            db1 db1VarW = w(oi2Var, h43Var, i);
            if (db1VarW != null) {
                return ((Boolean) le1Var.invoke(db1VarW)).booleanValue();
            }
        }
        return false;
    }

    public static final int y(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int z(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public abstract View M(int i);

    public abstract boolean N();

    public abstract void X(cr3 cr3Var, cr3 cr3Var2, Window window, View view, boolean z, boolean z2);

    public void l(Window window) {
    }

    public abstract List q(String str, List list);
}
