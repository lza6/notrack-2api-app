package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidComposeView;
import app.template.extension.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class xr0 implements hs0, nk0 {
    public static final so0[] a = new so0[0];
    public static final fb1 b = new fb1(7);
    public static final Object c = new Object();
    public static final d5 d = new d5("NO_VALUE", 16);
    public static ib e;
    public static o9 f;
    public static a10 g;

    public static final String A0(so0 so0Var) {
        Object i63Var;
        if (so0Var instanceof nw0) {
            return ((nw0) so0Var).toString();
        }
        try {
            i63Var = so0Var + '@' + a0(so0Var);
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        if (j63.a(i63Var) != null) {
            i63Var = so0Var.getClass().getName() + '@' + a0(so0Var);
        }
        return (String) i63Var;
    }

    public static final fa1 B0(int i) {
        if (i == 1) {
            return new fa1(2);
        }
        if (i == 2) {
            return new fa1(1);
        }
        if (i == 17) {
            return new fa1(3);
        }
        if (i == 33) {
            return new fa1(5);
        }
        if (i == 66) {
            return new fa1(4);
        }
        if (i != 130) {
            return null;
        }
        return new fa1(6);
    }

    public static final double C0(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final ha D(String str) {
        return new ha(py.R(str));
    }

    public static final void D0(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            u41.k("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            u41.k("colors and colorStops arguments must have equal length.");
        }
    }

    public static final long E() {
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    public static void E0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final long F(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static void F0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        E0(byteArrayOutputStream, i, 2);
    }

    public static kt1 G(le1 le1Var) {
        qs1 qs1Var = rs1.d;
        qs1Var.getClass();
        us1 us1Var = new us1();
        ws1 ws1Var = qs1Var.a;
        us1Var.a = ws1Var.a;
        boolean z = ws1Var.c;
        us1Var.b = ws1Var.b;
        String str = ws1Var.d;
        us1Var.c = ws1Var.e;
        uc0 uc0Var = ws1Var.g;
        boolean z2 = ws1Var.f;
        zf3 zf3Var = qs1Var.b;
        le1Var.invoke(us1Var);
        if (!kr1.n(str, "    ")) {
            u41.k("Indent should not be specified when default printing mode is used");
            return null;
        }
        ws1 ws1Var2 = new ws1(us1Var.a, us1Var.b, z, str, us1Var.c, z2, uc0Var);
        zf3Var.getClass();
        return new kt1(ws1Var2, zf3Var);
    }

    public static ah3 H(int i, int i2, fy fyVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i4 = i2 & 4;
        fy fyVar2 = fy.c;
        if (i4 != 0) {
            fyVar = fyVar2;
        }
        if (i < 0) {
            u41.h(ud2.m(i, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i3 <= 0 && i <= 0 && fyVar != fyVar2) {
            m51.z(fyVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i5 = i + i3;
        if (i5 < 0) {
            i5 = IntCompanionObject.MAX_VALUE;
        }
        return new ah3(i3, i5, fyVar);
    }

    public static final void I(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final void J(fi2 fi2Var, Object obj, Object obj2) {
        int iF = fi2Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : fi2Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof gi2) {
                ((gi2) obj3).a(obj2);
            } else if (obj3 != obj2) {
                gi2 gi2Var = new gi2();
                gi2Var.a(obj3);
                gi2Var.a(obj2);
                obj2 = gi2Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            fi2Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        fi2Var.b[i] = obj;
        fi2Var.c[i] = obj2;
    }

    public static final void K(CursorAnchorInfo.Builder builder, xy3 xy3Var, h43 h43Var) {
        if (h43Var.g()) {
            return;
        }
        float f2 = h43Var.b;
        pg2 pg2Var = xy3Var.b;
        int iE = pg2Var.e(f2);
        int iE2 = pg2Var.e(h43Var.d);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(xy3Var.e(iE), pg2Var.f(iE), xy3Var.f(iE), pg2Var.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }

    public static final ew0 L(ew0 ew0Var, ew0 ew0Var2, ge3 ge3Var, long j, ed3 ed3Var) {
        if (ed3Var == null) {
            return p23.W(ew0Var, ew0Var2);
        }
        int iCompare = ge3Var.f.compare(Long.valueOf(ed3Var.c), Long.valueOf(j));
        if (iCompare < 0) {
            return ew0.c;
        }
        return iCompare > 0 ? ew0.h : ew0.d;
    }

    public static final h43 M(View view, AndroidComposeView androidComposeView) {
        int[] iArr = y64.b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f2 = i - iArr[0];
        float f3 = i2 - iArr[1];
        return new h43(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static final c N(c cVar, rg3 rg3Var) {
        return a.b(cVar, 0.0f, 0.0f, 0.0f, rg3Var, true, 124927);
    }

    public static final c O(c cVar) {
        return a.b(cVar, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static byte[] P(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static fi2 Q() {
        long[] jArr = qa3.a;
        return new fi2();
    }

    public static final int R(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            if (re0.d(((re0) list.get(i2)).a) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static void S(String str, String str2, Object obj) {
        String strD0 = d0(str);
        if (Log.isLoggable(strD0, 3)) {
            Log.d(strD0, String.format(str2, obj));
        }
    }

    public static void U(String str, String str2, Exception exc) {
        String strD0 = d0(str);
        if (Log.isLoggable(strD0, 6)) {
            Log.e(strD0, str2, exc);
        }
    }

    public static final boolean V(long j, long j2) {
        return j == j2;
    }

    public static String W(mz mzVar) {
        StringBuilder sb = new StringBuilder(mzVar.size());
        for (int i = 0; i < mzVar.size(); i++) {
            byte b2 = mzVar.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int X(int i, q02 q02Var, Object obj) {
        int iD;
        return (obj == null || q02Var.a() == 0 || (i < q02Var.a() && obj.equals(q02Var.b(i))) || (iD = q02Var.d(obj)) == -1) ? i : iD;
    }

    public static final k81 Y(xg3 xg3Var, xp0 xp0Var, int i, fy fyVar) {
        return ((i == 0 || i == -3) && fyVar == fy.c) ? xg3Var : new a30(xg3Var, xp0Var, i, fyVar);
    }

    public static final String[] Z(androidx.compose.ui.autofill.a aVar) {
        aVar.getClass();
        return (String[]) ((ha) aVar).b.toArray(new String[0]);
    }

    public static final String a0(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final int b0(long j, xy3 xy3Var) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        pg2 pg2Var = xy3Var.b;
        return fIntBitsToFloat >= pg2Var.e ? xy3Var.a.a.d.length() : pg2Var.g(j);
    }

    public static Object c0(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return l1.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (q3.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static String d0(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final void e0(zt3 zt3Var, int i, int i2) {
        jz3 jz3Var = zt3Var.m;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        zt3Var.c(iMin, iMax, BuildConfig.VERSION_NAME);
        if (jz3Var != null) {
            long jG = y64.g(jz3Var.a, iMin, iMax, 0);
            if (jz3.c(jG)) {
                zt3Var.e(null);
            } else {
                zt3Var.d(jz3.f(jG), jz3.e(jG), null);
            }
        }
    }

    public static final void f0(zt3 zt3Var, int i, int i2, CharSequence charSequence) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == zt3Var.d.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3 && charSequence.charAt(length - 1) == zt3Var.d.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i4 == iMax && i3 == length) {
            zt3Var.e(null);
            zt3Var.o = null;
        } else {
            zt3Var.c(i4, iMax, charSequence.subSequence(i3, length));
        }
        int length2 = charSequence.length() + iMin;
        zt3Var.f(p23.d(length2, length2));
    }

    public static boolean g0(int i) {
        return (i & 32768) != 0;
    }

    public static boolean h0(int i) {
        if (i != 15 && i != 255) {
            if (i == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i != 32783) {
                return i == 33023 || i == 0;
            }
            int i2 = Build.VERSION.SDK_INT;
            return i2 < 28 || i2 > 29;
        }
        return true;
    }

    public static final int[] i0(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = gb2.X(((re0) list.get(i3)).a);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((re0) list.get(i3)).a;
            if (re0.d(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = gb2.X(re0.b(0.0f, ((re0) list.get(1)).a));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = gb2.X(re0.b(0.0f, ((re0) list.get(i3 - 1)).a));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = gb2.X(re0.b(0.0f, ((re0) list.get(i3 - 1)).a));
                    i4 += 2;
                    iArr2[i5] = gb2.X(re0.b(0.0f, ((re0) list.get(i3 + 1)).a));
                }
                i4 = i2;
            } else {
                iArr2[i4] = gb2.X(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] j0(List list, List list2, int i) {
        int i2 = 0;
        if (i == 0) {
            if (list == null) {
                return null;
            }
            float[] fArr = new float[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fArr[i2] = ((Number) it.next()).floatValue();
                i2++;
            }
            return fArr;
        }
        float[] fArr2 = new float[list2.size() + i];
        fArr2[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j = ((re0) list2.get(i4)).a;
            float fFloatValue = list != null ? ((Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr2[i3] = fFloatValue;
            if (re0.d(j) == 0.0f) {
                i3 += 2;
                fArr2[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr2[i3] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr2;
    }

    public static byte[] k0(int i, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                u41.r(ud2.m(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] l0(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long m0(int i, InputStream inputStream) throws IOException {
        byte[] bArrK0 = k0(i, inputStream);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrK0[i2] & UByte.MAX_VALUE)) << (i2 * 8);
        }
        return j;
    }

    public static final boolean n0(fi2 fi2Var, Object obj, Object obj2) {
        Object objG = fi2Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof gi2)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            fi2Var.j(obj);
            return true;
        }
        gi2 gi2Var = (gi2) objG;
        boolean zL = gi2Var.l(obj2);
        if (zL && gi2Var.g()) {
            fi2Var.j(obj);
        }
        return zL;
    }

    public static final void o0(fi2 fi2Var, Object obj) {
        boolean zG;
        long[] jArr = fi2Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = fi2Var.b[i4];
                        Object obj3 = fi2Var.c[i4];
                        if (obj3 instanceof gi2) {
                            gi2 gi2Var = (gi2) obj3;
                            gi2Var.l(obj);
                            zG = gi2Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            fi2Var.k(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean p0(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
            if (rect != null) {
                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final void q0(hq2 hq2Var, int i, Object obj) {
        hq2Var.o[(hq2Var.p - hq2Var.k[hq2Var.l - 1].b) + i] = obj;
    }

    public static final void r0(hq2 hq2Var, int i, Object obj, int i2, Object obj2) {
        int i3 = hq2Var.p - hq2Var.k[hq2Var.l - 1].b;
        Object[] objArr = hq2Var.o;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final long s0(String str, long j, long j2, long j3) {
        String property;
        int i = lr3.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lT0 = to3.t0(property);
        if (lT0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lT0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int t0(int i, int i2, String str) {
        return (int) s0(str, i, 1L, (i2 & 8) != 0 ? IntCompanionObject.MAX_VALUE : 2097150);
    }

    public static final Integer u0(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final Rect v0(mq1 mq1Var) {
        return new Rect(mq1Var.a, mq1Var.b, mq1Var.c, mq1Var.d);
    }

    public static final Rect w0(h43 h43Var) {
        return new Rect((int) h43Var.a, (int) h43Var.b, (int) h43Var.c, (int) h43Var.d);
    }

    public static final RectF x0(h43 h43Var) {
        return new RectF(h43Var.a, h43Var.b, h43Var.c, h43Var.d);
    }

    public static final void y0(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof au3) {
            y0(((au3) charSequence).d, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static final h43 z0(RectF rectF) {
        return new h43(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.nk0
    public long A(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return b();
    }

    @Override // defpackage.hs0
    public nk0 B(tf3 tf3Var) {
        tf3Var.getClass();
        return this;
    }

    @Override // defpackage.hs0
    public double C() {
        T();
        throw null;
    }

    public void T() {
        throw new ag3(r43.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.hs0
    public Object a(qu1 qu1Var) {
        qu1Var.getClass();
        return qu1Var.deserialize(this);
    }

    @Override // defpackage.hs0
    public abstract long b();

    @Override // defpackage.nk0
    public hs0 c(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return u(yy2Var.i(i));
    }

    @Override // defpackage.hs0
    public boolean d() {
        T();
        throw null;
    }

    @Override // defpackage.hs0
    public boolean e() {
        return true;
    }

    @Override // defpackage.hs0
    public char f() {
        T();
        throw null;
    }

    @Override // defpackage.nk0
    public Object g(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        tf3Var.getClass();
        qu1Var.getClass();
        if (qu1Var.getDescriptor().g() || e()) {
            return a(qu1Var);
        }
        return null;
    }

    @Override // defpackage.nk0
    public double i(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return C();
    }

    @Override // defpackage.nk0
    public char j(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return f();
    }

    @Override // defpackage.nk0
    public float k(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return z();
    }

    @Override // defpackage.nk0
    public byte m(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return t();
    }

    @Override // defpackage.nk0
    public String n(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return y();
    }

    @Override // defpackage.hs0
    public abstract int o();

    @Override // defpackage.nk0
    public short p(yy2 yy2Var, int i) {
        yy2Var.getClass();
        return x();
    }

    public void q(tf3 tf3Var) {
        tf3Var.getClass();
    }

    @Override // defpackage.nk0
    public boolean s(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return d();
    }

    @Override // defpackage.hs0
    public abstract byte t();

    @Override // defpackage.hs0
    public hs0 u(tf3 tf3Var) {
        tf3Var.getClass();
        return this;
    }

    public Object v(tf3 tf3Var, int i, qu1 qu1Var, Object obj) {
        tf3Var.getClass();
        qu1Var.getClass();
        return a(qu1Var);
    }

    @Override // defpackage.nk0
    public int w(tf3 tf3Var, int i) {
        tf3Var.getClass();
        return o();
    }

    @Override // defpackage.hs0
    public abstract short x();

    @Override // defpackage.hs0
    public String y() {
        T();
        throw null;
    }

    @Override // defpackage.hs0
    public float z() {
        T();
        throw null;
    }
}
