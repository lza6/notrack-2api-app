package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.compose.foundation.text.input.internal.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class yo4 {
    public static final c13 b = new c13("list-item-type");
    public static final c13 c = new c13("bullet-list-item-level");
    public static final c13 d = new c13("ordered-list-item-number");
    public static final c13 e = new c13("heading-level");
    public static final c13 f = new c13("link-destination");
    public static final c13 g = new c13("paragraph-is-in-tight-list");
    public static final c13 h = new c13("code-block-info");
    public static final f61 i = new f61(-1);
    public static final f61 j = new f61(null);
    public static final f61 k = new f61(null);
    public static final f61 l = new f61(null);
    public static final w63 m = new w63(0.16f, 0.1f, 0.08f, 0.1f);
    public final /* synthetic */ int a;

    public /* synthetic */ yo4(int i2) {
        this.a = i2;
    }

    public static File A(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static xx2 B(kk kkVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new xx2(og.n(kkVar));
        }
        TextPaint textPaint = new TextPaint(kkVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = kkVar.getBreakStrategy();
        int hyphenationFrequency = kkVar.getHyphenationFrequency();
        if (kkVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (kkVar.getInputType() & 15) != 3) {
            boolean z = kkVar.getLayoutDirection() == 1;
            switch (kkVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(og.c(DecimalFormatSymbols.getInstance(kkVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new xx2(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final int C(tf3 tf3Var, tf3[] tf3VarArr) {
        tf3VarArr.getClass();
        int iHashCode = (tf3Var.b().hashCode() * 31) + Arrays.hashCode(tf3VarArr);
        int iD = tf3Var.d();
        int i2 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i3 = iD - 1;
            int i4 = i2 * 31;
            String strB = tf3Var.i(tf3Var.d() - iD).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i2 = i4 + iHashCode2;
            iD = i3;
        }
        int iD2 = tf3Var.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode3;
            }
            int i5 = iD2 - 1;
            int i6 = iHashCode3 * 31;
            yo4 yo4VarC = tf3Var.i(tf3Var.d() - iD2).c();
            iHashCode3 = i6 + (yo4VarC != null ? yo4VarC.hashCode() : 0);
            iD2 = i5;
        }
    }

    public static final yw0 D(gs1 gs1Var, boolean z, js1 js1Var) {
        if (gs1Var instanceof os1) {
            return ((os1) gs1Var).I(z, js1Var);
        }
        return gs1Var.O(js1Var.q(), z, new l(1, js1Var, js1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 26));
    }

    public static final boolean E(xp0 xp0Var) {
        gs1 gs1Var = (gs1) xp0Var.get(bg1.s);
        if (gs1Var != null) {
            return gs1Var.a();
        }
        return true;
    }

    public static final boolean F(gq0 gq0Var) {
        gs1 gs1Var = (gs1) gq0Var.getCoroutineContext().get(bg1.s);
        if (gs1Var != null) {
            return gs1Var.a();
        }
        return true;
    }

    public static boolean G(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static ly1 H(q22 q22Var, je1 je1Var) {
        t73 t73Var = t73.C;
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 0) {
            return new yq3(je1Var);
        }
        if (iOrdinal == 1) {
            z83 z83Var = new z83();
            z83Var.c = je1Var;
            z83Var.d = t73Var;
            return z83Var;
        }
        if (iOrdinal != 2) {
            u41.e();
            return null;
        }
        j94 j94Var = new j94();
        j94Var.c = je1Var;
        j94Var.d = t73Var;
        return j94Var;
    }

    public static yq3 I(je1 je1Var) {
        je1Var.getClass();
        return new yq3(je1Var);
    }

    public static final fp1 J(ne1 ne1Var, le1 le1Var) {
        ea eaVar = new ea(5, ne1Var);
        y64.l(1, le1Var);
        fp1 fp1Var = z93.a;
        return new fp1(eaVar, le1Var);
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final void N(float[] fArr, float[] fArr2, int i2, float[] fArr3) {
        if (i2 == 0) {
            po1.a("At least one point must be provided");
        }
        int i3 = 2 >= i2 ? i2 - 1 : 2;
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i2];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i2];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            float[] fArr8 = fArr4[i10];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i2);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr9 = fArr5[i11];
                float fU = u(fArr7, fArr9);
                for (int i12 = 0; i12 < i2; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr9[i12] * fU);
                }
            }
            float fSqrt = (float) Math.sqrt(u(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr7[i13] = fArr7[i13] * f2;
            }
            float[] fArr10 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr10[i14] = i14 < i10 ? 0.0f : u(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float fU2 = u(fArr5[i15], fArr2);
            float[] fArr11 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    fU2 -= fArr11[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = fU2 / fArr11[i15];
        }
    }

    public static final Object O(su2 su2Var, vk0 vk0Var) {
        vk0Var.getClass();
        Object objA = su2Var.get(vk0Var);
        if (objA == null) {
            objA = vk0Var.a();
        }
        return ((bb4) objA).b(su2Var);
    }

    public static boolean P(Parcel parcel, int i2) {
        d0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static int Q(Parcel parcel, int i2) {
        d0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int R(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void S(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            og.q(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final void T(float[] fArr, Matrix matrix) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void U(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static void V(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void W(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void X(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + R(parcel, i2));
    }

    public static final String Y(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback) {
        return (!(callback instanceof a04) || Build.VERSION.SDK_INT < 26) ? callback : ((a04) callback).a;
    }

    public static final qo0 a(xp0 xp0Var) {
        if (xp0Var.get(bg1.s) == null) {
            xp0Var = xp0Var.plus(c());
        }
        return new qo0(xp0Var);
    }

    public static final su2 a0(s13[] s13VarArr, su2 su2Var, su2 su2Var2) {
        ru2 ru2Var = new ru2(su2.l);
        for (s13 s13Var : s13VarArr) {
            vk0 vk0Var = s13Var.a;
            vk0Var.getClass();
            o13 o13Var = (o13) vk0Var;
            if (s13Var.h || !su2Var.containsKey(o13Var)) {
                ru2Var.put(o13Var, o13Var.b(s13Var, (bb4) su2Var2.get(o13Var)));
            }
        }
        return ru2Var.a();
    }

    public static final void b(int i2) {
        if (i2 > 0) {
            return;
        }
        u41.k("px must be > 0.");
    }

    public static int b0(Parcel parcel) {
        int i2 = parcel.readInt();
        int iR = R(parcel, i2);
        char c2 = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new eg0("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iR + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i3).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i3);
        throw new eg0(sb.toString(), parcel);
    }

    public static is1 c() {
        return new is1(null);
    }

    public static ActionMode.Callback c0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof a04) || callback == null) ? callback : new a04(callback, textView);
    }

    public static final oj4 d(long j2) {
        int i2 = (int) j2;
        int i3 = (int) (j2 >> 32);
        int i4 = ~i2;
        oj4 oj4Var = new oj4();
        oj4Var.h = i2;
        oj4Var.l = i3;
        oj4Var.m = 0;
        oj4Var.n = 0;
        oj4Var.o = i4;
        oj4Var.p = (i2 << 10) ^ (i3 >>> 4);
        if ((i3 | i2 | i4) == 0) {
            u41.k("Initial state must have at least one non-zero element.");
            return null;
        }
        for (int i5 = 0; i5 < 64; i5++) {
            oj4Var.c();
        }
        return oj4Var;
    }

    public static void d0(Parcel parcel, int i2, int i3) {
        int iR = R(parcel, i2);
        if (iR == i3) {
            return;
        }
        String hexString = Integer.toHexString(iR);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iR).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(iR);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new eg0(sb.toString(), parcel);
    }

    public static final int e(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(p04 p04Var, xn2 xn2Var, Throwable th, uo0 uo0Var) throws Throwable {
        p81 p81Var;
        if (uo0Var instanceof p81) {
            p81Var = (p81) uo0Var;
            int i2 = p81Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p81Var.h = i2 - Integer.MIN_VALUE;
            } else {
                p81Var = new p81(uo0Var);
            }
        } else {
            p81Var = new p81(uo0Var);
        }
        Object obj = p81Var.d;
        int i3 = p81Var.h;
        w84 w84Var = w84.a;
        try {
            if (i3 == 0) {
                g13.O(obj);
                p81Var.c = th;
                p81Var.h = 1;
                xn2Var.invoke(p04Var, th, p81Var);
                hq0 hq0Var = hq0.c;
                if (w84Var == hq0Var) {
                    return hq0Var;
                }
            } else {
                if (i3 != 1) {
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = p81Var.c;
                g13.O(obj);
            }
            return w84Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                gb2.l(th2, th);
            }
            throw th2;
        }
    }

    public static final void g(q33 q33Var, dx2 dx2Var) {
        fc4 fc4Var = (fc4) q33Var.c;
        fc4 fc4Var2 = (fc4) q33Var.b;
        boolean zS = py.s(dx2Var);
        long j2 = dx2Var.b;
        if (zS) {
            pr0[] pr0VarArr = fc4Var2.d;
            vl.p0(0, pr0VarArr.length, null, pr0VarArr);
            fc4Var2.e = 0;
            pr0[] pr0VarArr2 = fc4Var.d;
            vl.p0(0, pr0VarArr2.length, null, pr0VarArr2);
            fc4Var.e = 0;
            q33Var.a = 0L;
        }
        if (!py.u(dx2Var)) {
            List list = dx2Var.k;
            if (list == null) {
                list = z21.c;
            }
            int i2 = 0;
            for (int size = list.size(); i2 < size; size = size) {
                ei1 ei1Var = (ei1) list.get(i2);
                long j3 = ei1Var.a;
                long j4 = ei1Var.c;
                fc4Var2.a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                fc4Var.a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                i2++;
            }
            long j5 = dx2Var.l;
            fc4Var2.a(Float.intBitsToFloat((int) (j5 >> 32)), j2);
            fc4Var.a(Float.intBitsToFloat((int) (j5 & 4294967295L)), j2);
        }
        if (py.u(dx2Var) && j2 - q33Var.a > 40) {
            pr0[] pr0VarArr3 = fc4Var2.d;
            vl.p0(0, pr0VarArr3.length, null, pr0VarArr3);
            fc4Var2.e = 0;
            pr0[] pr0VarArr4 = fc4Var.d;
            vl.p0(0, pr0VarArr4.length, null, pr0VarArr4);
            fc4Var.e = 0;
            q33Var.a = 0L;
        }
        q33Var.a = j2;
    }

    public static void h(StringBuilder sb, Object obj, le1 le1Var) {
        if (le1Var != null) {
            sb.append((CharSequence) le1Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final Object i(iu0 iu0Var, je1 je1Var, uo0 uo0Var) {
        Object obj;
        wl2 wl2VarL;
        Object objBringIntoView;
        yd ydVar;
        if (iu0Var.getNode().isAttached()) {
            if (!iu0Var.getNode().isAttached()) {
                po1.b("visitAncestors called on an unattached node");
            }
            of2 parent$ui_release = iu0Var.getNode().getParent$ui_release();
            ux1 ux1VarM = y64.M(iu0Var);
            loop0: while (true) {
                obj = null;
                if (ux1VarM == null) {
                    break;
                }
                if ((((of2) ux1VarM.N.f).getAggregateChildKindSet$ui_release() & 524288) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & 524288) != 0) {
                            of2 of2VarE = parent$ui_release;
                            oi2 oi2Var = null;
                            while (of2VarE != null) {
                                if (of2VarE instanceof ix) {
                                    obj = of2VarE;
                                    break loop0;
                                }
                                if ((of2VarE.getKindSet$ui_release() & 524288) != 0 && (of2VarE instanceof ju0)) {
                                    int i2 = 0;
                                    for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                        if ((child$ui_release.getKindSet$ui_release() & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                of2VarE = child$ui_release;
                                            } else {
                                                if (oi2Var == null) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (of2VarE != null) {
                                                    oi2Var.c(of2VarE);
                                                    of2VarE = null;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                of2VarE = y64.e(oi2Var);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                ux1VarM = ux1VarM.t();
                parent$ui_release = (ux1VarM == null || (ydVar = ux1VarM.N) == null) ? null : (es3) ydVar.e;
            }
            ix ixVar = (ix) obj;
            if (ixVar != null && (objBringIntoView = ixVar.bringIntoView((wl2VarL = y64.L(iu0Var)), new c9(je1Var, 6, wl2VarL), uo0Var)) == hq0.c) {
                return objBringIntoView;
            }
        }
        return w84.a;
    }

    public static final long j(c cVar, wx3 wx3Var, az3 az3Var, long j2) {
        long j3;
        long jN = wx3Var.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && cVar.d().d.length() != 0) {
            long j4 = cVar.d().h;
            ah1 ah1VarM = wx3Var.m();
            int i2 = ah1VarM == null ? -1 : dw3.a[ah1VarM.ordinal()];
            if (i2 != -1) {
                if (i2 == 1 || i2 == 2) {
                    int i3 = jz3.c;
                    j3 = j4 >> 32;
                } else {
                    if (i2 != 3) {
                        u41.e();
                        return 0L;
                    }
                    int i4 = jz3.c;
                    j3 = j4 & 4294967295L;
                }
                int i5 = (int) j3;
                xy3 xy3VarB = az3Var.b();
                if (xy3VarB != null) {
                    pg2 pg2Var = xy3VarB.b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iD = pg2Var.d(i5);
                    float fE = xy3VarB.e(iD);
                    float f2 = xy3VarB.f(iD);
                    float fW = py.w(fIntBitsToFloat, Math.min(fE, f2), Math.max(fE, f2));
                    if (qq1.a(j2, 0L) || Math.abs(fIntBitsToFloat - fW) <= ((int) (j2 >> 32)) / 2) {
                        float f3 = pg2Var.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((pg2Var.b(iD) - f3) / 2.0f) + f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fW)) << 32);
                        cx1 cx1VarD = az3Var.d();
                        ln2 ln2Var = null;
                        if (cx1VarD != null) {
                            if (!cx1VarD.z()) {
                                cx1VarD = null;
                            }
                            if (cx1VarD != null) {
                                jFloatToRawIntBits = kr1.y(jFloatToRawIntBits, vl0.j0(cx1VarD));
                            }
                        }
                        cx1 cx1VarD2 = az3Var.d();
                        if (cx1VarD2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!cx1VarD2.z()) {
                            cx1VarD2 = null;
                        }
                        if (cx1VarD2 == null) {
                            return jFloatToRawIntBits;
                        }
                        cx1 cx1Var = (cx1) az3Var.e.getValue();
                        if (cx1Var != null) {
                            if (!cx1Var.z()) {
                                cx1Var = null;
                            }
                            if (cx1Var != null) {
                                ln2Var = new ln2(cx1Var.y(cx1VarD2, jFloatToRawIntBits));
                            }
                        }
                        return ln2Var != null ? ln2Var.a : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final void k(xp0 xp0Var, CancellationException cancellationException) {
        gs1 gs1Var = (gs1) xp0Var.get(bg1.s);
        if (gs1Var != null) {
            gs1Var.c(cancellationException);
        }
    }

    public static final void l(gq0 gq0Var, CancellationException cancellationException) {
        gs1 gs1Var = (gs1) gq0Var.getCoroutineContext().get(bg1.s);
        if (gs1Var != null) {
            gs1Var.c(cancellationException);
        } else {
            m51.u(gq0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void m(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder sbS = ud2.s("radix ", " was not in valid range ", i2);
            sbS.append(new lq1(2, 36, 1));
            throw new IllegalArgumentException(sbS.toString());
        }
    }

    public static final void n(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        u41.g(i2, i3, ") is greater than size (", "toIndex (");
    }

    public static boolean o(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zP = p(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zP;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean p(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final Object q(ne1 ne1Var, so0 so0Var) {
        db3 db3Var = new db3(so0Var, so0Var.getContext());
        return vl0.c0(db3Var, true, db3Var, ne1Var);
    }

    public static Parcelable r(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iR = R(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iR);
        return parcelable;
    }

    public static String s(Parcel parcel, int i2) {
        int iR = R(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iR);
        return string;
    }

    public static Object[] t(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iR = R(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return objArrCreateTypedArray;
    }

    public static final float u(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    public static final void v(xp0 xp0Var) {
        gs1 gs1Var = (gs1) xp0Var.get(bg1.s);
        if (gs1Var != null && !gs1Var.a()) {
            throw gs1Var.x();
        }
    }

    public static void w(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i2);
        throw new eg0(sb.toString(), parcel);
    }

    public static final boolean x(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final gs1 y(xp0 xp0Var) {
        gs1 gs1Var = (gs1) xp0Var.get(bg1.s);
        if (gs1Var != null) {
            return gs1Var;
        }
        m51.u(xp0Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final xf2 z(xp0 xp0Var) {
        xf2 xf2Var = (xf2) xp0Var.get(bg1.t);
        if (xf2Var != null) {
            return xf2Var;
        }
        u41.r("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public abstract void L(Throwable th);

    public abstract void M(ir3 ir3Var);

    public int hashCode() {
        switch (this.a) {
            case 24:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 24:
                String classSimpleName = Options$Companion.getClassSimpleName(r43.a(getClass()).c);
                classSimpleName.getClass();
                return classSimpleName;
            default:
                return super.toString();
        }
    }
}
