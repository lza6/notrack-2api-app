package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.PorterDuff;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class p23 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final oj0 e = new oj0(8);
    public static final byte[] f = {112, 114, 111, 0};
    public static final byte[] g = {112, 114, 109, 0};
    public static final c13 h = new c13("task-list-done");
    public static Method i;
    public static Method j;
    public static boolean k;

    public static final int A(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final float B(wu0 wu0Var, boolean z, long j2) {
        float fD = ln2.d(y64.b(bi3.d(j2), bi3.b(j2))) / 2.0f;
        return z ? wu0Var.w(10.0f) + fD : fD;
    }

    public static final u53 C(xy3 xy3Var, int i2) {
        wy3 wy3Var = xy3Var.a;
        pg2 pg2Var = xy3Var.b;
        if (wy3Var.a.d.length() != 0) {
            int iD = pg2Var.d(i2);
            if ((i2 != 0 && iD == pg2Var.d(i2 - 1)) || (i2 != wy3Var.a.d.length() && iD == pg2Var.d(i2 + 1))) {
                return xy3Var.a(i2);
            }
        }
        return xy3Var.h(i2);
    }

    public static final th3 D(xy3 xy3Var, int i2, int i3, int i4, long j2, boolean z, boolean z2) {
        fd3 fd3Var;
        if (z) {
            fd3Var = null;
        } else {
            int i5 = jz3.c;
            int i6 = (int) (j2 >> 32);
            int i7 = (int) (4294967295L & j2);
            fd3Var = new fd3(new ed3(C(xy3Var, i6), i6, 1L), new ed3(C(xy3Var, i7), i7, 1L), jz3.g(j2));
        }
        return new th3(z2, 1, 1, fd3Var, new bd3(1L, 1, i2, i3, i4, xy3Var));
    }

    public static final int E(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static int F(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return hf0.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final float[] G(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean H(int i2, CharSequence charSequence) {
        if (i2 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i2);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static float I(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final long J(float f2, long j2) {
        return (Float.isNaN(f2) || f2 >= 1.0f) ? j2 : re0.b(re0.d(j2) * f2, j2);
    }

    public static final float[] K(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] L(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void M(of2 of2Var, je1 je1Var) {
        kn2 ownerScope$ui_release = of2Var.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new kn2((jn2) of2Var);
            of2Var.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        y64.N(of2Var).getSnapshotObserver().a(ownerScope$ui_release, fl1.M, je1Var);
    }

    public static void O(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float P(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e11.c(edgeEffect, f2, f3);
        }
        d11.a(edgeEffect, f2, f3);
        return f2;
    }

    public static int[] Q(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iM0 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM0 += (int) xr0.m0(2, byteArrayInputStream);
            iArr[i3] = iM0;
        }
        return iArr;
    }

    public static mv0[] R(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, mv0[] mv0VarArr) throws IOException {
        byte[] bArr3 = y64.h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, y64.i)) {
                u41.r("Unsupported meta version");
                return null;
            }
            int iM0 = (int) xr0.m0(2, fileInputStream);
            byte[] bArrL0 = xr0.l0(fileInputStream, (int) xr0.m0(4, fileInputStream), (int) xr0.m0(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                u41.r("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrL0);
            try {
                mv0[] mv0VarArrT = T(byteArrayInputStream, bArr2, iM0, mv0VarArr);
                byteArrayInputStream.close();
                return mv0VarArrT;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(y64.c, bArr2)) {
            u41.r("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            u41.r("Unsupported meta version");
            return null;
        }
        int iM1 = (int) xr0.m0(1, fileInputStream);
        byte[] bArrL1 = xr0.l0(fileInputStream, (int) xr0.m0(4, fileInputStream), (int) xr0.m0(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            u41.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrL1);
        try {
            mv0[] mv0VarArrS = S(byteArrayInputStream2, iM1, mv0VarArr);
            byteArrayInputStream2.close();
            return mv0VarArrS;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static mv0[] S(ByteArrayInputStream byteArrayInputStream, int i2, mv0[] mv0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new mv0[0];
        }
        if (i2 != mv0VarArr.length) {
            u41.r("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iM0 = (int) xr0.m0(2, byteArrayInputStream);
            iArr[i3] = (int) xr0.m0(2, byteArrayInputStream);
            strArr[i3] = new String(xr0.k0(iM0, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            mv0 mv0Var = mv0VarArr[i4];
            if (!mv0Var.b.equals(strArr[i4])) {
                u41.r("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            mv0Var.e = i5;
            mv0Var.h = Q(byteArrayInputStream, i5);
        }
        return mv0VarArr;
    }

    public static mv0[] T(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, mv0[] mv0VarArr) throws IOException {
        mv0 mv0Var;
        if (byteArrayInputStream.available() == 0) {
            return new mv0[0];
        }
        if (i2 != mv0VarArr.length) {
            u41.r("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            xr0.m0(2, byteArrayInputStream);
            String str = new String(xr0.k0((int) xr0.m0(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jM0 = xr0.m0(4, byteArrayInputStream);
            int iM0 = (int) xr0.m0(2, byteArrayInputStream);
            if (mv0VarArr.length <= 0) {
                mv0Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= mv0VarArr.length) {
                    mv0Var = null;
                    break;
                }
                if (mv0VarArr[i4].b.equals(strSubstring)) {
                    mv0Var = mv0VarArr[i4];
                    break;
                }
                i4++;
            }
            if (mv0Var == null) {
                u41.r("Missing profile key: ".concat(str));
                return null;
            }
            mv0Var.d = jM0;
            int[] iArrQ = Q(byteArrayInputStream, iM0);
            if (Arrays.equals(bArr, y64.g)) {
                mv0Var.e = iM0;
                mv0Var.h = iArrQ;
            }
        }
        return mv0VarArr;
    }

    public static mv0[] U(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, y64.d)) {
            u41.r("Unsupported version");
            return null;
        }
        int iM0 = (int) xr0.m0(1, fileInputStream);
        byte[] bArrL0 = xr0.l0(fileInputStream, (int) xr0.m0(4, fileInputStream), (int) xr0.m0(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            u41.r("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrL0);
        try {
            mv0[] mv0VarArrV = V(byteArrayInputStream, str, iM0);
            byteArrayInputStream.close();
            return mv0VarArrV;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static mv0[] V(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new mv0[0];
        }
        mv0[] mv0VarArr = new mv0[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iM0 = (int) xr0.m0(2, byteArrayInputStream);
            int iM1 = (int) xr0.m0(2, byteArrayInputStream);
            mv0VarArr[i4] = new mv0(str, new String(xr0.k0(iM0, byteArrayInputStream), StandardCharsets.UTF_8), xr0.m0(4, byteArrayInputStream), iM1, (int) xr0.m0(4, byteArrayInputStream), (int) xr0.m0(4, byteArrayInputStream), new int[iM1], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            mv0 mv0Var = mv0VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = mv0Var.f;
            int i7 = mv0Var.g;
            TreeMap treeMap = mv0Var.i;
            int i8 = iAvailable - i6;
            int iM2 = i3;
            while (byteArrayInputStream.available() > i8) {
                iM2 += (int) xr0.m0(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iM2), 1);
                int iM3 = (int) xr0.m0(2, byteArrayInputStream);
                while (iM3 > 0) {
                    xr0.m0(2, byteArrayInputStream);
                    int iM4 = (int) xr0.m0(1, byteArrayInputStream);
                    if (iM4 != 6 && iM4 != 7) {
                        while (iM4 > 0) {
                            xr0.m0(1, byteArrayInputStream);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iM5 = (int) xr0.m0(1, byteArrayInputStream); iM5 > 0; iM5--) {
                                xr0.m0(2, byteArrayInputStream);
                            }
                            iM4--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iM3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                u41.r("Read too much data during profile line parse");
                return null;
            }
            mv0Var.h = Q(byteArrayInputStream, mv0Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(xr0.k0((((i7 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return mv0VarArr;
    }

    public static final ew0 W(ew0 ew0Var, ew0 ew0Var2) {
        int iOrdinal = ew0Var2.ordinal();
        ew0 ew0Var3 = ew0.c;
        if (iOrdinal != 0) {
            ew0 ew0Var4 = ew0.h;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return ew0Var4;
                }
                u41.e();
                return null;
            }
            int iOrdinal2 = ew0Var.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return ew0.d;
                }
                if (iOrdinal2 == 2) {
                    return ew0Var4;
                }
                u41.e();
                return null;
            }
        }
        return ew0Var3;
    }

    public static final mq1 X(h43 h43Var) {
        return new mq1(Math.round(h43Var.a), Math.round(h43Var.b), Math.round(h43Var.c), Math.round(h43Var.d));
    }

    public static int Y(char c2, int i2, int i3, CharSequence charSequence) {
        while (i2 < i3) {
            if (charSequence.charAt(i2) != c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int Z(int i2, int i3, CharSequence charSequence) {
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long a(float f2) {
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static boolean a0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final long b(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final String b0(long j2, CharSequence charSequence) {
        return charSequence.subSequence(jz3.f(j2), jz3.e(j2)).toString();
    }

    public static final s41 c(pm1 pm1Var, Throwable th) {
        am1 am1Var;
        if (th instanceof um2) {
            le1 le1Var = pm1Var.p;
            nm1 nm1Var = pm1Var.v;
            am1Var = (am1) le1Var.invoke(pm1Var);
            if (am1Var == null) {
                am1Var = (am1) nm1Var.j.invoke(pm1Var);
            }
            if (am1Var == null && (am1Var = (am1) pm1Var.o.invoke(pm1Var)) == null) {
                am1Var = (am1) nm1Var.i.invoke(pm1Var);
            }
        } else {
            am1Var = (am1) pm1Var.o.invoke(pm1Var);
            if (am1Var == null) {
                am1Var = (am1) pm1Var.v.i.invoke(pm1Var);
            }
        }
        return new s41(am1Var, pm1Var, th);
    }

    public static final BlendMode c0(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final long d(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            qo1.a("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        long j2 = (((long) i3) & 4294967295L) | (((long) i2) << 32);
        int i4 = jz3.c;
        return j2;
    }

    public static final ImageDecoder.Source d0(wm1 wm1Var, jq2 jq2Var, boolean z) {
        mt2 mt2VarU;
        if (wm1Var.getFileSystem() == a71.c && (mt2VarU = wm1Var.u()) != null) {
            return ImageDecoder.createSource(mt2VarU.toFile());
        }
        yo4 yo4VarW = wm1Var.w();
        if (yo4VarW instanceof yl) {
            return ImageDecoder.createSource(jq2Var.a.getAssets(), ((yl) yo4VarW).n);
        }
        if ((yo4VarW instanceof on0) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((on0) yo4VarW).n;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new wl1(1, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (yo4VarW instanceof y53) {
            y53 y53Var = (y53) yo4VarW;
            if (y53Var.n.equals(jq2Var.a.getPackageName())) {
                return ImageDecoder.createSource(jq2Var.a.getResources(), y53Var.o);
            }
        }
        if (!(yo4VarW instanceof fz)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((fz) yo4VarW).n.isDirect()) {
            return ImageDecoder.createSource(((fz) yo4VarW).n);
        }
        return null;
    }

    public static final Object[] e(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        vl.n0(0, i2, 6, objArr, objArr2);
        vl.j0(i2 + 2, i2, objArr.length, objArr, objArr2);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final PorterDuff.Mode e0(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final Object[] f(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        vl.n0(0, i2, 6, objArr, objArr2);
        vl.j0(i2, i2 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static boolean f0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, mv0[] mv0VarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = y64.g;
        byte[] bArr3 = y64.f;
        byte[] bArr4 = y64.c;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = y64.d;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrS = s(mv0VarArr, bArr5);
                xr0.E0(byteArrayOutputStream, mv0VarArr.length, 1);
                xr0.E0(byteArrayOutputStream, bArrS.length, 4);
                byte[] bArrP = xr0.P(bArrS);
                xr0.E0(byteArrayOutputStream, bArrP.length, 4);
                byteArrayOutputStream.write(bArrP);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                xr0.E0(byteArrayOutputStream, mv0VarArr.length, 1);
                for (mv0 mv0Var : mv0VarArr) {
                    int size = mv0Var.i.size() * 4;
                    String strX = x(mv0Var.a, mv0Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    xr0.F0(byteArrayOutputStream, strX.getBytes(charset).length);
                    xr0.F0(byteArrayOutputStream, mv0Var.h.length);
                    xr0.E0(byteArrayOutputStream, size, 4);
                    xr0.E0(byteArrayOutputStream, mv0Var.c, 4);
                    byteArrayOutputStream.write(strX.getBytes(charset));
                    Iterator it = mv0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        xr0.F0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        xr0.F0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : mv0Var.h) {
                        xr0.F0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = y64.e;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrS2 = s(mv0VarArr, bArr6);
                xr0.E0(byteArrayOutputStream, mv0VarArr.length, 1);
                xr0.E0(byteArrayOutputStream, bArrS2.length, 4);
                byte[] bArrP2 = xr0.P(bArrS2);
                xr0.E0(byteArrayOutputStream, bArrP2.length, 4);
                byteArrayOutputStream.write(bArrP2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            xr0.F0(byteArrayOutputStream, mv0VarArr.length);
            for (mv0 mv0Var2 : mv0VarArr) {
                String str = mv0Var2.a;
                TreeMap treeMap = mv0Var2.i;
                String strX2 = x(str, mv0Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                xr0.F0(byteArrayOutputStream, strX2.getBytes(charset2).length);
                xr0.F0(byteArrayOutputStream, treeMap.size());
                xr0.F0(byteArrayOutputStream, mv0Var2.h.length);
                xr0.E0(byteArrayOutputStream, mv0Var2.c, 4);
                byteArrayOutputStream.write(strX2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    xr0.F0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : mv0Var2.h) {
                    xr0.F0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            xr0.F0(byteArrayOutputStream2, mv0VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (mv0 mv0Var3 : mv0VarArr) {
                xr0.E0(byteArrayOutputStream2, mv0Var3.c, 4);
                xr0.E0(byteArrayOutputStream2, mv0Var3.d, 4);
                xr0.E0(byteArrayOutputStream2, mv0Var3.g, 4);
                String strX3 = x(mv0Var3.a, mv0Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strX3.getBytes(charset3).length;
                xr0.F0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strX3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            fj4 fj4Var = new fj4(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(fj4Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < mv0VarArr.length) {
                try {
                    mv0 mv0Var4 = mv0VarArr[i8];
                    xr0.F0(byteArrayOutputStream3, i8);
                    xr0.F0(byteArrayOutputStream3, mv0Var4.e);
                    i9 = i9 + 4 + (mv0Var4.e * i6);
                    int[] iArr = mv0Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        xr0.F0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            fj4 fj4Var2 = new fj4(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(fj4Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < mv0VarArr.length; i14++) {
                try {
                    mv0 mv0Var5 = mv0VarArr[i14];
                    Iterator it3 = mv0Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        i0(byteArrayOutputStream5, iIntValue, mv0Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            j0(byteArrayOutputStream6, mv0Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            xr0.F0(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            xr0.E0(byteArrayOutputStream4, length4, 4);
                            xr0.F0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i15 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            fj4 fj4Var3 = new fj4(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(fj4Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            xr0.E0(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                fj4 fj4Var4 = (fj4) arrayList.get(i16);
                int i17 = fj4Var4.a;
                byte[] bArr7 = fj4Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                xr0.E0(byteArrayOutputStream, j2, 4);
                xr0.E0(byteArrayOutputStream, size2, 4);
                if (fj4Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrP3 = xr0.P(bArr7);
                    arrayList2.add(bArrP3);
                    xr0.E0(byteArrayOutputStream, bArrP3.length, 4);
                    xr0.E0(byteArrayOutputStream, length5, 4);
                    length = bArrP3.length;
                } else {
                    arrayList2.add(bArr7);
                    xr0.E0(byteArrayOutputStream, bArr7.length, 4);
                    xr0.E0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static final Object[] g(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        vl.n0(0, i2, 6, objArr, objArr2);
        vl.j0(i2, i2 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, mv0 mv0Var) throws IOException {
        j0(byteArrayOutputStream, mv0Var);
        int i2 = mv0Var.g;
        int[] iArr = mv0Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            xr0.F0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : mv0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static bf0 h(bf0 bf0Var) {
        rf4 rf4Var = yh4.h;
        if (g13.y(bf0Var.b, 12884901888L)) {
            t63 t63Var = (t63) bf0Var;
            rf4 rf4Var2 = t63Var.d;
            if (!q(rf4Var2, rf4Var)) {
                return new t63(t63Var.a, t63Var.h, rf4Var, K(o(m4.c.b, rf4Var2.a(), rf4Var.a()), t63Var.i), t63Var.k, t63Var.n, t63Var.e, t63Var.f, t63Var.g, -1);
            }
        }
        return bf0Var;
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, mv0 mv0Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        xr0.F0(byteArrayOutputStream, str.getBytes(charset).length);
        xr0.F0(byteArrayOutputStream, mv0Var.e);
        xr0.E0(byteArrayOutputStream, mv0Var.f, 4);
        xr0.E0(byteArrayOutputStream, mv0Var.c, 4);
        xr0.E0(byteArrayOutputStream, mv0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final boolean i(rq3 rq3Var) {
        List list = rq3Var.n.n.a;
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((dx2) list.get(i2)).d) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, int i2, mv0 mv0Var) throws IOException {
        int i3 = mv0Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : mv0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[LOOP:0: B:20:0x0054->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003c A[EDGE_INSN: B:28:0x003c->B:16:0x003c BREAK  A[LOOP:0: B:20:0x0054->B:24:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object j(defpackage.rq3 r6, defpackage.zw2 r7, defpackage.wr r8) {
        /*
            boolean r0 = r8 instanceof defpackage.mc1
            if (r0 == 0) goto L13
            r0 = r8
            mc1 r0 = (defpackage.mc1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            mc1 r0 = new mc1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            zw2 r6 = r0.d
            rq3 r7 = r0.c
            defpackage.g13.O(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r6)
            r6 = 0
            return r6
        L33:
            defpackage.g13.O(r8)
            boolean r8 = i(r6)
            if (r8 != 0) goto L64
        L3c:
            r0.c = r6
            r0.d = r7
            r0.l = r2
            java.lang.Object r8 = r6.a(r7, r0)
            hq0 r1 = defpackage.hq0.c
            if (r8 != r1) goto L4b
            return r1
        L4b:
            yw2 r8 = (defpackage.yw2) r8
            java.util.List r8 = r8.a
            int r1 = r8.size()
            r3 = 0
        L54:
            if (r3 >= r1) goto L64
            java.lang.Object r4 = r8.get(r3)
            dx2 r4 = (defpackage.dx2) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L61
            goto L3c
        L61:
            int r3 = r3 + 1
            goto L54
        L64:
            w84 r6 = defpackage.w84.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p23.j(rq3, zw2, wr):java.lang.Object");
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, mv0 mv0Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : mv0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                xr0.F0(byteArrayOutputStream, iIntValue - i2);
                xr0.F0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void k(uo0 uo0Var) throws Throwable {
        eu0 eu0Var;
        if (uo0Var instanceof eu0) {
            eu0Var = (eu0) uo0Var;
            int i2 = eu0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eu0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                eu0Var = new eu0(uo0Var);
            }
        } else {
            eu0Var = new eu0(uo0Var);
        }
        Object obj = eu0Var.c;
        int i3 = eu0Var.d;
        if (i3 == 0) {
            g13.O(obj);
            eu0Var.d = 1;
            t00 t00Var = new t00(1, gm4.G(eu0Var));
            t00Var.u();
            if (t00Var.s() == hq0.c) {
                return;
            }
        } else {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            g13.O(obj);
        }
        u41.p();
    }

    public static float k0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final Object l(ix2 ix2Var, ne1 ne1Var, so0 so0Var) {
        Object objV0 = ((sq3) ix2Var).v0(new nc1(so0Var.getContext(), ne1Var, null, 0), so0Var);
        return objV0 == hq0.c ? objV0 : w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(h32 h32Var, uo0 uo0Var) throws Throwable {
        s32 s32Var;
        h32 h32Var2;
        q43 q43Var;
        Throwable th;
        m32 m32Var;
        m32 m32Var2;
        if (uo0Var instanceof s32) {
            s32Var = (s32) uo0Var;
            int i2 = s32Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s32Var.l = i2 - Integer.MIN_VALUE;
            } else {
                s32Var = new s32(uo0Var);
            }
        } else {
            s32Var = new s32(uo0Var);
        }
        Object obj = s32Var.h;
        int i3 = s32Var.l;
        w84 w84Var = w84.a;
        if (i3 != 0) {
            if (i3 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q43Var = s32Var.d;
            h32Var2 = s32Var.c;
            try {
                g13.O(obj);
                m32Var2 = (m32) q43Var.c;
                if (m32Var2 != null) {
                    h32Var2.b(m32Var2);
                }
                return w84Var;
            } catch (Throwable th2) {
                th = th2;
                m32Var = (m32) q43Var.c;
                if (m32Var != null) {
                    h32Var2.b(m32Var);
                }
                throw th;
            }
        }
        g13.O(obj);
        if (((p32) h32Var).c.compareTo(g32.l) >= 0) {
            return w84Var;
        }
        q43 q43Var2 = new q43();
        try {
            s32Var.c = h32Var;
            s32Var.d = q43Var2;
            s32Var.l = 1;
            t00 t00Var = new t00(1, gm4.G(s32Var));
            t00Var.u();
            t32 t32Var = new t32(t00Var);
            q43Var2.c = t32Var;
            h32Var.a(t32Var);
            Object objS = t00Var.s();
            hq0 hq0Var = hq0.c;
            if (objS == hq0Var) {
                return hq0Var;
            }
            h32Var2 = h32Var;
            q43Var = q43Var2;
            m32Var2 = (m32) q43Var.c;
            if (m32Var2 != null) {
                h32Var2.b(m32Var2);
            }
            return w84Var;
        } catch (Throwable th3) {
            h32Var2 = h32Var;
            q43Var = q43Var2;
            th = th3;
            m32Var = (m32) q43Var.c;
            if (m32Var != null) {
                h32Var2.b(m32Var);
            }
            throw th;
        }
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        m51.x(str);
    }

    public static final float[] o(float[] fArr, float[] fArr2, float[] fArr3) {
        L(fArr, fArr2);
        L(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrG = G(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return K(fArrG, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final long p(long j2, int i2) {
        int i3 = jz3.c;
        int i4 = (int) (j2 >> 32);
        int i5 = i4 < 0 ? 0 : i4;
        if (i5 > i2) {
            i5 = i2;
        }
        int i6 = (int) (4294967295L & j2);
        int i7 = i6 >= 0 ? i6 : 0;
        if (i7 <= i2) {
            i2 = i7;
        }
        return (i5 == i4 && i2 == i6) ? j2 : d(i5, i2);
    }

    public static final boolean q(rf4 rf4Var, rf4 rf4Var2) {
        if (rf4Var == rf4Var2) {
            return true;
        }
        return Math.abs(rf4Var.a - rf4Var2.a) < 0.001f && Math.abs(rf4Var.b - rf4Var2.b) < 0.001f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] r(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static byte[] s(mv0[] mv0VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (mv0 mv0Var : mv0VarArr) {
            length += ((((mv0Var.g * 2) + 7) & (-8)) / 8) + (mv0Var.e * 2) + x(mv0Var.a, mv0Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + mv0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, y64.e)) {
            int length2 = mv0VarArr.length;
            while (i2 < length2) {
                mv0 mv0Var2 = mv0VarArr[i2];
                h0(byteArrayOutputStream, mv0Var2, x(mv0Var2.a, mv0Var2.b, bArr));
                g0(byteArrayOutputStream, mv0Var2);
                i2++;
            }
        } else {
            for (mv0 mv0Var3 : mv0VarArr) {
                h0(byteArrayOutputStream, mv0Var3, x(mv0Var3.a, mv0Var3.b, bArr));
            }
            int length3 = mv0VarArr.length;
            while (i2 < length3) {
                g0(byteArrayOutputStream, mv0VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final yl0 t(bf0 bf0Var, bf0 bf0Var2) {
        if (bf0Var == bf0Var2) {
            return new wl0(bf0Var, bf0Var, 1);
        }
        return (g13.y(bf0Var.b, 12884901888L) && g13.y(bf0Var2.b, 12884901888L)) ? new xl0((t63) bf0Var, (t63) bf0Var2) : new yl0(bf0Var, bf0Var2, 0);
    }

    public static final Object u(long j2, so0 so0Var) {
        if (j2 > 0) {
            t00 t00Var = new t00(1, gm4.G(so0Var));
            t00Var.u();
            if (j2 < LongCompanionObject.MAX_VALUE) {
                y(t00Var.m).l(j2, t00Var);
            }
            Object objS = t00Var.s();
            if (objS == hq0.c) {
                return objS;
            }
        }
        return w84.a;
    }

    public static final float v(long j2, h43 h43Var) {
        float f2 = h43Var.d;
        float f3 = h43Var.c;
        if (vl0.z(j2, h43Var)) {
            return 0.0f;
        }
        float fE = ln2.e(ln2.h(h43Var.e(), j2));
        if (fE >= Float.MAX_VALUE) {
            fE = Float.MAX_VALUE;
        }
        float fE2 = ln2.e(ln2.h((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(h43Var.b)) & 4294967295L), j2));
        if (fE2 < fE) {
            fE = fE2;
        }
        float fE3 = ln2.e(ln2.h((((long) Float.floatToRawIntBits(h43Var.a)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), j2));
        if (fE3 < fE) {
            fE = fE3;
        }
        float fE4 = ln2.e(ln2.h((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), j2));
        return fE4 < fE ? fE4 : fE;
    }

    public static void w(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!k) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    i = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    j = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    i = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    j = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = i;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = j;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            k = true;
        }
        if (z) {
            try {
                Method method4 = i;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = j) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static String x(String str, String str2, byte[] bArr) {
        byte[] bArr2 = y64.f;
        byte[] bArr3 = y64.g;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return fq2.r(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final du0 y(xp0 xp0Var) {
        vp0 vp0Var = xp0Var.get(t73.m);
        du0 du0Var = vp0Var instanceof du0 ? (du0) vp0Var : null;
        return du0Var == null ? ts0.a : du0Var;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e11.b(edgeEffect);
        }
        return 0.0f;
    }

    public void N(uu uuVar) {
    }
}
