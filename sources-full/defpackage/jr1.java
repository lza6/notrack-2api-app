package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.inputmethod.HandwritingGesture;
import androidx.compose.foundation.text.input.internal.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import app.template.extension.BuildConfig;
import com.android.billingclient.api.ProxyBillingActivity;
import java.io.Closeable;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Protocol$Companion;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr1 {
    public static md0 d;
    public static long f;
    public static Method g;
    public static Method h;
    public static Method i;
    public static final ne a = new ne();
    public static final xu0 b = new xu0(1.0f, 1.0f);
    public static final md0 c = new md0(null, null, null);
    public static final Object e = new Object();

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public static final boolean A(yw2 yw2Var) {
        int classification;
        if (Build.VERSION.SDK_INT < 29) {
            classification = 0;
        } else {
            cr1 cr1Var = yw2Var.b;
            MotionEvent motionEvent = cr1Var != null ? (MotionEvent) ((fp1) cr1Var.c).d : null;
            if (motionEvent != null) {
                classification = motionEvent.getClassification();
            } else {
                classification = 0;
            }
        }
        return classification == 2;
    }

    public static boolean B() {
        if (Build.VERSION.SDK_INT >= 29) {
            return y44.c();
        }
        try {
            if (g == null) {
                f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) g.invoke(null, Long.valueOf(f))).booleanValue();
        } catch (Exception e2) {
            x("isTagEnabled", e2);
            return false;
        }
    }

    public static long C(int i2, byte[] bArr) {
        return ((long) (((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16))) & 4294967295L;
    }

    public static final String D(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iMax) {
                if (i2 == i3) {
                    return str;
                }
                if (i2 >= length) {
                    Protocol$Companion.checkBoundsIndexes$kotlin_stdlib(0, i3, bArr.length);
                    return new String(bArr, 0, i3, q30.a);
                }
            } else if (str.charAt(i2) == '%') {
                int i4 = i2 + 3;
                try {
                    String strSubstring = str.substring(i2 + 1, i4);
                    yo4.m(16);
                    bArr[i3] = (byte) Integer.parseInt(strSubstring, 16);
                    i3++;
                    i2 = i4;
                } catch (NumberFormatException unused) {
                    bArr[i3] = (byte) str.charAt(i2);
                    i3++;
                    i2++;
                }
            }
            bArr[i3] = (byte) str.charAt(i2);
            i3++;
            i2++;
        }
    }

    public static void E(long j, hg hgVar, boolean z, pj2 pj2Var) {
        if (z) {
            j = kr1.b(j, hgVar);
        }
        int i2 = (int) (4294967295L & j);
        pj2Var.invoke(new kh1(new n11[]{new lg3(i2, i2), new pu0(jz3.d(j), 0)}));
    }

    public static gl2 F(u23 u23Var) throws EOFException {
        int i2 = Integer.parseInt(u23Var.z(LongCompanionObject.MAX_VALUE));
        long j = Long.parseLong(u23Var.z(LongCompanionObject.MAX_VALUE));
        long j2 = Long.parseLong(u23Var.z(LongCompanionObject.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(u23Var.z(LongCompanionObject.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strZ = u23Var.z(LongCompanionObject.MAX_VALUE);
            int iZ0 = mo3.z0(':', 0, 6, strZ);
            if (iZ0 == -1) {
                u41.h("Unexpected header: ".concat(strZ));
                return null;
            }
            String string = mo3.U0(strZ.substring(0, iZ0)).toString();
            String strSubstring = strZ.substring(iZ0 + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new gl2(i2, j, j2, new yk2(y92.W(linkedHashMap)), null, null);
    }

    public static void G(ProxyBillingActivity proxyBillingActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            df0.i(proxyBillingActivity, broadcastReceiver, intentFilter);
        } else if (i2 >= 26) {
            df0.h(proxyBillingActivity, broadcastReceiver, intentFilter);
        } else {
            proxyBillingActivity.registerReceiver(broadcastReceiver, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
        }
    }

    public static final long H(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        z01 z01Var = z01.NANOSECONDS;
        if (j4 >= 0) {
            return gb2.Y(j3, z01Var);
        }
        z01 z01Var2 = z01.MILLISECONDS;
        if (z01Var.compareTo(z01Var2) >= 0) {
            return v01.g(z(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        int i2 = v01.l;
        return v01.e(gb2.Y(j5, z01Var2), gb2.Y(j6, z01Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object I(gc3 gc3Var, float f2, uo0 uo0Var) throws Throwable {
        kb3 kb3Var;
        n43 n43Var;
        if (uo0Var instanceof kb3) {
            kb3Var = (kb3) uo0Var;
            int i2 = kb3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kb3Var.h = i2 - Integer.MIN_VALUE;
            } else {
                kb3Var = new kb3(uo0Var);
            }
        } else {
            kb3Var = new kb3(uo0Var);
        }
        Object obj = kb3Var.d;
        int i3 = kb3Var.h;
        if (i3 == 0) {
            g13.O(obj);
            n43 n43Var2 = new n43();
            ne1 pqVar = new pq(n43Var2, f2, null);
            kb3Var.c = n43Var2;
            kb3Var.h = 1;
            Object objD = gc3Var.d(ri2.c, pqVar, kb3Var);
            Object obj2 = hq0.c;
            if (objD == obj2) {
                return obj2;
            }
            n43Var = n43Var2;
        } else {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n43Var = kb3Var.c;
            g13.O(obj);
        }
        return new Float(n43Var.c);
    }

    public static final void J(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void K(vc0 vc0Var, String str) {
        String string;
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        Class cls = vc0Var.c;
        sb.append(Options$Companion.getClassSimpleName(cls));
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + string2 + '.';
        } else {
            StringBuilder sbT = fq2.t("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            ud2.v(sbT, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbT.append(Options$Companion.getClassSimpleName(cls));
            sbT.append("' has to be sealed and '@Serializable'.");
            string = sbT.toString();
        }
        throw new ag3(string);
    }

    public static final long L(long j, jy1 jy1Var) {
        return jy1Var == jy1.c ? wm0.a(um0.j(j), um0.h(j), um0.i(j), um0.g(j)) : wm0.a(um0.i(j), um0.g(j), um0.j(j), um0.h(j));
    }

    public static void M(byte[] bArr, long j, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j);
            i3++;
            j >>= 8;
        }
    }

    public static da4 N(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = mt2.d;
        String strO0 = !kr1.n(str2, "/") ? to3.o0(str, str2, "/") : str;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (i2 < strO0.length()) {
            char cCharAt = strO0.charAt(i2);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i5 == -1 && i3 == -1) {
                            i5 = i2 + 1;
                        }
                    } else if (z && i5 == -1 && i3 == -1) {
                        int i8 = i2 + 2;
                        if (i8 < str.length() && str.charAt(i2 + 1) == '/' && str.charAt(i8) == '/') {
                            i6 = i2 + 3;
                            z = false;
                            i7 = i2;
                            i2 = i8;
                        } else if (strO0.equals(str)) {
                            i4 = i2 + 1;
                            i7 = i2;
                            i2 = i4;
                            i6 = i2;
                        }
                    }
                } else if (i4 == -1 && i5 == -1 && i3 == -1) {
                    i4 = i6 == -1 ? 0 : i2;
                    z = false;
                }
            } else if (i3 == -1) {
                i3 = i2 + 1;
            }
            i2++;
        }
        int i9 = IntCompanionObject.MAX_VALUE;
        int iMin = Math.min(i3 == -1 ? Integer.MAX_VALUE : i3 - 1, strO0.length());
        int iMin2 = Math.min(i5 == -1 ? Integer.MAX_VALUE : i5 - 1, iMin);
        if (i6 != -1) {
            strSubstring2 = strO0.substring(0, i7);
            if (i4 != -1) {
                i9 = i4;
            }
            strSubstring = strO0.substring(i6, Math.min(i9, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i4 != -1 ? strO0.substring(i4, iMin2) : null;
        String strSubstring4 = i5 != -1 ? strO0.substring(i5, iMin) : null;
        String strSubstring5 = i3 != -1 ? strO0.substring(i3, strO0.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strD = strSubstring2 != null ? D(strSubstring2, bArr) : null;
        String strD2 = strSubstring != null ? D(strSubstring, bArr) : null;
        String strD3 = strSubstring3 != null ? D(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            D(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            D(strSubstring5, bArr);
        }
        return new da4(strO0, str2, strD, strD2, strD3);
    }

    public static String O(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final void P() {
        throw new UnsupportedOperationException();
    }

    public static final hi4 Q(List list, hi4 hi4Var) {
        hi4 hi4VarB;
        list.getClass();
        hi4Var.getClass();
        or0 or0Var = hi4Var.e;
        boolean zA = or0Var.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zA2 = or0Var.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zA3 = or0Var.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zA && zA2 && zA3) {
            String str = hi4Var.c;
            nr0 nr0Var = new nr0(0);
            nr0Var.b(or0Var.a);
            LinkedHashMap linkedHashMap = nr0Var.a;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            or0 or0Var2 = new or0(linkedHashMap);
            Options$Companion.toByteArrayInternalV1(or0Var2);
            hi4VarB = hi4.b(hi4Var, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", or0Var2, 0, 0L, 0, 0, 0L, 0, 16777195);
        } else {
            hi4VarB = hi4Var;
        }
        if (Build.VERSION.SDK_INT < 26) {
            tm0 tm0Var = hi4VarB.j;
            String str2 = hi4VarB.c;
            if (!kr1.n(str2, ConstraintTrackingWorker.class.getName()) && (tm0Var.e || tm0Var.f)) {
                nr0 nr0Var2 = new nr0(0);
                or0 or0Var3 = hi4VarB.e;
                or0Var3.getClass();
                nr0Var2.b(or0Var3.a);
                LinkedHashMap linkedHashMap2 = nr0Var2.a;
                linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                or0 or0Var4 = new or0(linkedHashMap2);
                Options$Companion.toByteArrayInternalV1(or0Var4);
                return hi4.b(hi4VarB, null, 0, ConstraintTrackingWorker.class.getName(), or0Var4, 0, 0L, 0, 0, 0L, 0, 16777195);
            }
        }
        return hi4VarB;
    }

    public static void R(gl2 gl2Var, t23 t23Var) {
        t23Var.I(gl2Var.a);
        t23Var.writeByte(10);
        t23Var.I(gl2Var.b);
        t23Var.writeByte(10);
        t23Var.I(gl2Var.c);
        t23Var.writeByte(10);
        Set<Map.Entry> setEntrySet = gl2Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        t23Var.I(size);
        t23Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                t23Var.H((String) entry.getKey());
                t23Var.H(":");
                t23Var.H(str);
                t23Var.writeByte(10);
            }
        }
    }

    public static final lo1 a(qu1 qu1Var, String str) {
        return new lo1(str, new mo1(qu1Var));
    }

    public static da4 b(String str) {
        String str2 = mt2.d;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new da4(sb.toString(), str2, "file", null, str);
    }

    public static final int c(float[] fArr) {
        int i2 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i3 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i2 = 1;
        }
        return (i3 << 1) | i2;
    }

    public static final void d(bd4 bd4Var, ux1 ux1Var) {
        long jL = ((xo1) ux1Var.N.c).L(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jL >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jL & 4294967295L)));
        bd4Var.layout(iRound, iRound2, bd4Var.getMeasuredWidth() + iRound, bd4Var.getMeasuredHeight() + iRound2);
    }

    public static final void e(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final List f(wn3 wn3Var, ArrayList arrayList, eq1 eq1Var, int i2, int i3, int i4, le1 le1Var) {
        ch2 ch2Var;
        long j;
        long j2;
        int i5;
        Object obj;
        int i6;
        int i7;
        if (wn3Var == null || arrayList.isEmpty() || eq1Var.b == 0) {
            return z21.c;
        }
        int index = ((t02) ke0.y0(arrayList)).getIndex();
        int i8 = -1;
        if (((t02) ke0.E0(arrayList)).getIndex() - index < 0 || (i7 = eq1Var.b) == 0) {
            ch2Var = fq1.a;
        } else {
            lq1 lq1VarX = py.X(0, i7);
            int i9 = lq1VarX.c;
            int i10 = lq1VarX.d;
            int iA = -1;
            if (i9 <= i10) {
                while (eq1Var.a(i9) <= index) {
                    iA = eq1Var.a(i9);
                    if (i9 == i10) {
                        break;
                    }
                    i9++;
                }
            }
            if (iA == -1) {
                ch2Var = fq1.a;
            } else {
                ch2 ch2Var2 = fq1.a;
                ch2Var = new ch2(1);
                ch2Var.c(iA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj2 = arrayList.get(i11);
            int index2 = ((t02) obj2).getIndex();
            int[] iArr = eq1Var.a;
            int i12 = eq1Var.b;
            for (int i13 = 0; i13 < i12; i13++) {
                if (iArr[i13] == index2) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = ch2Var.a;
        int i14 = ch2Var.b;
        int i15 = 0;
        while (i15 < i14) {
            int i16 = iArr2[i15];
            int size2 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    i17 = i8;
                    break;
                }
                Object obj3 = arrayList.get(i18);
                i18++;
                if (((t02) obj3).getIndex() == i16) {
                    break;
                }
                i17++;
            }
            t02 t02Var = i17 == i8 ? (t02) le1Var.invoke(Integer.valueOf(i16)) : (t02) arrayList.remove(i17);
            int iE = t02Var.e();
            if (i17 == i8) {
                i5 = Integer.MIN_VALUE;
                j = 4294967295L;
            } else {
                long jF = t02Var.f(0);
                if (t02Var.b()) {
                    j = 4294967295L;
                    j2 = jF & 4294967295L;
                } else {
                    j = 4294967295L;
                    j2 = jF >> 32;
                }
                i5 = (int) j2;
            }
            int size3 = arrayList3.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i19);
                if (((t02) obj).getIndex() != i16) {
                    break;
                }
                i19++;
            }
            t02 t02Var2 = (t02) obj;
            if (t02Var2 != null) {
                long jF2 = t02Var2.f(0);
                i6 = (int) (t02Var2.b() ? jF2 & j : jF2 >> 32);
            } else {
                i6 = Integer.MIN_VALUE;
            }
            int iMax = i5 == Integer.MIN_VALUE ? -i2 : Math.max(-i2, i5);
            if (i6 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i6 - iE);
            }
            t02Var.c();
            t02Var.d(iMax, i3, i4);
            arrayList2.add(t02Var);
            i15++;
            i8 = -1;
        }
        return arrayList2;
    }

    public static final void g(WorkDatabase workDatabase, jl0 jl0Var, qh4 qh4Var) {
        int i2;
        workDatabase.getClass();
        jl0Var.getClass();
        ArrayList arrayListV = kr1.V(qh4Var);
        int i3 = 0;
        while (!arrayListV.isEmpty()) {
            List list = ((qh4) pe0.t0(arrayListV)).d;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((fi4) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        ji4 ji4VarU = workDatabase.u();
        ji4VarU.getClass();
        q73 q73VarA = q73.a(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ji4VarU.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(q73VarA);
        try {
            int i4 = cursorM.moveToFirst() ? cursorM.getInt(0) : 0;
            cursorM.close();
            q73VarA.l();
            int i5 = jl0Var.j;
            if (i4 + i3 <= i5) {
                return;
            }
            StringBuilder sb = new StringBuilder("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
            sb.append(i5);
            sb.append(";\nalready enqueued count: ");
            sb.append(i4);
            sb.append(";\ncurrent enqueue operation count: ");
            u41.k(fq2.q(sb, i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        } catch (Throwable th) {
            cursorM.close();
            q73VarA.l();
            throw th;
        }
    }

    public static int h(Context context, String str) {
        if (str == null) {
            m51.x("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new rm2(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static final void i(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                gb2.l(th, th2);
            }
        }
    }

    public static final qf4 j(long j) {
        int i2 = (int) (j & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? qf4.c : qf4.d;
    }

    public static byte[] k(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            u41.k("The key length in bytes must be 32.");
            return null;
        }
        long jC = C(0, bArr) & 67108863;
        int i2 = 3;
        long jC2 = (C(3, bArr) >> 2) & 67108611;
        long jC3 = (C(6, bArr) >> 4) & 67092735;
        long jC4 = (C(9, bArr) >> 6) & 66076671;
        long jC5 = (C(12, bArr) >> 8) & 1048575;
        long j = jC2 * 5;
        long j2 = jC3 * 5;
        long j3 = jC4 * 5;
        long j4 = jC5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jC6 = j9 + (C(0, bArr3) & 67108863);
            long jC7 = j5 + ((C(i2, bArr3) >> 2) & 67108863);
            long jC8 = j6 + ((C(6, bArr3) >> 4) & 67108863);
            long jC9 = j7 + ((C(9, bArr3) >> 6) & 67108863);
            long j10 = jC2;
            long jC10 = j8 + (((C(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jC10 * j) + (jC9 * j2) + (jC8 * j3) + (jC7 * j4) + (jC6 * jC);
            long j12 = (jC10 * j2) + (jC9 * j3) + (jC8 * j4) + (jC7 * jC) + (jC6 * j10);
            long j13 = (jC10 * j3) + (jC9 * j4) + (jC8 * jC) + (jC7 * j10) + (jC6 * jC3);
            long j14 = (jC10 * j4) + (jC9 * jC) + (jC8 * j10) + (jC7 * jC3) + (jC6 * jC4);
            long j15 = jC9 * j10;
            long j16 = jC10 * jC;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jC8 * jC3) + (jC7 * jC4) + (jC6 * jC5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i3 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jC2 = j10;
            i2 = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jC11 = C(16, bArr) + j50;
        long j54 = jC11 & 4294967295L;
        long jC12 = C(20, bArr) + j51 + (jC11 >> 32);
        long jC13 = C(24, bArr) + j52 + (jC12 >> 32);
        long jC14 = (C(28, bArr) + j53 + (jC13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        M(bArr4, j54, 0);
        M(bArr4, jC12 & 4294967295L, 4);
        M(bArr4, jC13 & 4294967295L, 8);
        M(bArr4, jC14, 12);
        return bArr4;
    }

    public static long l(int i2, qf4 qf4Var) {
        int i3 = cr0.a[qf4Var.ordinal()];
        int i4 = -1;
        if (i3 != -1) {
            i4 = 1;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 != 2) {
                u41.e();
                return 0L;
            }
        }
        return (((long) i2) << 32) | (((long) i4) & 4294967295L);
    }

    public static long m(long j, jy1 jy1Var) {
        jy1 jy1Var2 = jy1.c;
        return wm0.a(jy1Var == jy1Var2 ? um0.j(j) : um0.i(j), jy1Var == jy1Var2 ? um0.h(j) : um0.g(j), jy1Var == jy1Var2 ? um0.i(j) : um0.j(j), jy1Var == jy1Var2 ? um0.g(j) : um0.h(j));
    }

    public static long n(long j, int i2) {
        return wm0.a(0, um0.h(j), (i2 & 4) != 0 ? um0.i(j) : 0, um0.g(j));
    }

    public static dl2 o(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i2 : iArr) {
            try {
                builder.addCapability(i2);
            } catch (IllegalArgumentException e2) {
                v72 v72VarF = v72.f();
                String str = dl2.b;
                String str2 = dl2.b;
                String str3 = "Ignoring adding capability '" + i2 + '\'';
                if (v72VarF.c <= 5) {
                    Log.w(str2, str3, e2);
                }
            }
        }
        for (int i3 : iArr2) {
            builder.addTransportType(i3);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new dl2(networkRequestBuild);
    }

    public static gd4 p(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            return (gd4) objNewInstance;
        } catch (IllegalAccessException e2) {
            j93.h("Cannot create an instance of ", cls, e2);
            return null;
        } catch (InstantiationException e3) {
            j93.h("Cannot create an instance of ", cls, e3);
            return null;
        } catch (NoSuchMethodException e4) {
            j93.h("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static int q(c cVar, HandwritingGesture handwritingGesture) {
        ay3 ay3Var = cVar.a;
        ay3Var.b.a().f();
        zt3 zt3Var = ay3Var.b;
        zt3Var.o = null;
        cVar.l(zt3Var);
        ay3.a(ay3Var, true, wu3.c);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c.h(cVar, fallbackText, false, 12);
        return 5;
    }

    public static int r(HandwritingGesture handwritingGesture, pj2 pj2Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        pj2Var.invoke(new wf0(fallbackText, 1));
        return 5;
    }

    public static final String s(da4 da4Var) {
        List listV = v(da4Var);
        String str = da4Var.b;
        if (listV.isEmpty()) {
            return null;
        }
        String str2 = da4Var.e;
        str2.getClass();
        if (!to3.q0(str2, str, false)) {
            str = BuildConfig.VERSION_NAME;
        }
        return ke0.D0(listV, da4Var.b, str, null, null, 60);
    }

    public static final void t(db1 db1Var) {
        ux1 ux1Var;
        yr2 yr2Var;
        wl2 coordinator$ui_release = db1Var.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release == null || (ux1Var = coordinator$ui_release.t) == null || (yr2Var = ux1Var.v) == null) {
            return;
        }
        yr2Var.getFocusOwner();
    }

    public static final float u(xy3 xy3Var, int i2) {
        if (i2 < 0) {
            return 0.0f;
        }
        wy3 wy3Var = xy3Var.a;
        pg2 pg2Var = xy3Var.b;
        if (wy3Var.a.d.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(pg2Var.d(i2), Math.min(pg2Var.b - 1, pg2Var.f - 1));
        if (i2 > pg2Var.c(iMin, false)) {
            return 0.0f;
        }
        pg2Var.m(iMin);
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(iMin, arrayList));
        dc dcVar = ss2Var.a;
        int i3 = iMin - ss2Var.d;
        vy3 vy3Var = dcVar.d;
        return vy3Var.e(i3) - vy3Var.g(i3);
    }

    public static final List v(da4 da4Var) {
        String str = da4Var.e;
        if (str == null) {
            return z21.c;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            int iZ0 = mo3.z0('/', i3, 4, str);
            if (iZ0 == -1) {
                iZ0 = str.length();
            }
            String strSubstring = str.substring(i3, iZ0);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i2 = iZ0;
        }
        return arrayList;
    }

    public static final long w(wx0 wx0Var) {
        DragEvent dragEvent = wx0Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static void x(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            m51.n(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static void y(c cVar, long j, int i2) {
        boolean zC = jz3.c(j);
        wu3 wu3Var = wu3.c;
        if (zC) {
            ay3 ay3Var = cVar.a;
            ay3Var.b.a().f();
            zt3 zt3Var = ay3Var.b;
            zt3Var.o = null;
            cVar.l(zt3Var);
            ay3.a(ay3Var, true, wu3Var);
            return;
        }
        long jE = cVar.e(j);
        ay3 ay3Var2 = cVar.a;
        ay3Var2.b.a().f();
        zt3 zt3Var2 = ay3Var2.b;
        int i3 = (int) (jE >> 32);
        int i4 = (int) (jE & 4294967295L);
        jt2 jt2Var = zt3Var2.d;
        if (i3 >= i4) {
            u41.k(ud2.l(i3, i4, "Do not set reversed or empty range: ", " > "));
            return;
        }
        zt3Var2.o = new ps2(new jy3(i2), new jz3(p23.d(py.x(i3, 0, jt2Var.length()), py.x(i4, 0, jt2Var.length()))));
        ay3.a(ay3Var2, true, wu3Var);
    }

    public static final long z(long j) {
        if (j < 0) {
            int i2 = v01.l;
            return v01.h;
        }
        int i3 = v01.l;
        return v01.d;
    }
}
