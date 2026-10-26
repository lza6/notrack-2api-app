package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class vy3 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public bk e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final d42[] o;
    public final Rect p = new Rect();
    public vu q;

    /* JADX WARN: Code duplicated, block: B:101:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x020e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x024b  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0121 A[PHI: r12
  0x0121: PHI (r12v8 int) = (r12v7 int), (r12v10 int) binds: [B:63:0x0133, B:56:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x019e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    public vy3(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, gx1 gx1Var) {
        Layout.Alignment alignment;
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutP;
        char c;
        boolean z2;
        int i10;
        int i11;
        long j;
        d42[] d42VarArr;
        long j2;
        int i12;
        Layout layout;
        int i13;
        int length;
        int i14;
        int iMax;
        int iMax2;
        long j3;
        int i15;
        CharSequence text;
        boolean zIsFallbackLineSpacingEnabled;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length2 = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = bz3.a(i2);
        Layout.Alignment alignment2 = kt3.a;
        if (i == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = i != 4 ? Layout.Alignment.ALIGN_NORMAL : kt3.b;
        } else {
            alignment = kt3.a;
        }
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length2, as.class) < length2;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = gx1Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || gx1Var.c() > f || z3) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicA;
                layoutP = y64.p(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    qo1.a("negative width");
                }
                if (iCeil < 0) {
                    qo1.a("negative ellipsized width");
                }
                layoutP = Build.VERSION.SDK_INT >= 33 ? i1.e(charSequence, textPaint, iCeil, alignment, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicA;
            }
            this.f = layoutP;
            Trace.endSection();
            int iMin = Math.min(layoutP.getLineCount(), i9);
            this.g = iMin;
            int i16 = iMin - 1;
            this.d = iMin >= i9 && (layoutP.getEllipsisCount(i16) > 0 || layoutP.getLineEnd(i16) != charSequence.length());
            long j4 = bz3.b;
            long j5 = 4294967295L;
            if (!z) {
                if (this.l) {
                    BoringLayout boringLayout = (BoringLayout) layoutP;
                    i10 = 33;
                    if (Build.VERSION.SDK_INT >= 33) {
                        zIsFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
                    } else {
                        zIsFallbackLineSpacingEnabled = false;
                    }
                } else {
                    i10 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutP;
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 33) {
                        zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i17 >= 28) {
                        zIsFallbackLineSpacingEnabled = true;
                    } else {
                        zIsFallbackLineSpacingEnabled = false;
                    }
                }
                if (zIsFallbackLineSpacingEnabled) {
                    c = ' ';
                    z2 = true;
                } else {
                    TextPaint paint = layoutP.getPaint();
                    CharSequence text2 = layoutP.getText();
                    i11 = 0;
                    Rect rectW = av1.w(paint, text2, layoutP.getLineStart(0), layoutP.getLineEnd(0));
                    int lineAscent = layoutP.getLineAscent(0);
                    c = ' ';
                    int i18 = rectW.top;
                    int topPadding = i18 < lineAscent ? lineAscent - i18 : layoutP.getTopPadding();
                    z2 = true;
                    rectW = iMin != 1 ? av1.w(paint, text2, layoutP.getLineStart(i16), layoutP.getLineEnd(i16)) : rectW;
                    int lineDescent = layoutP.getLineDescent(i16);
                    int i19 = rectW.bottom;
                    int bottomPadding = i19 > lineDescent ? i19 - lineDescent : layoutP.getBottomPadding();
                    j = (topPadding == 0 && bottomPadding == 0) ? j4 : (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
                }
                Paint.FontMetricsInt fontMetricsInt = null;
                if (layoutP.getText() instanceof Spanned) {
                    text = layoutP.getText();
                    text.getClass();
                    if (!g13.C((Spanned) text, d42.class) || layoutP.getText().length() <= 0) {
                        CharSequence text3 = layoutP.getText();
                        text3.getClass();
                        d42VarArr = (d42[]) ((Spanned) text3).getSpans(i11, layoutP.getText().length(), d42.class);
                    } else {
                        d42VarArr = null;
                    }
                } else {
                    d42VarArr = null;
                }
                this.o = d42VarArr;
                if (d42VarArr != null) {
                    length = d42VarArr.length;
                    i14 = i11;
                    iMax = i14;
                    iMax2 = iMax;
                    while (i14 < length) {
                        boolean z4 = z2;
                        d42 d42Var = d42VarArr[i14];
                        long j6 = j5;
                        int i20 = d42Var.s;
                        iMax = i20 < 0 ? Math.max(iMax, Math.abs(i20)) : iMax;
                        i15 = d42Var.t;
                        if (i15 < 0) {
                            iMax2 = Math.max(iMax, Math.abs(i15));
                        }
                        i14++;
                        j5 = j6;
                        z2 = z4;
                    }
                    j2 = j5;
                    if (iMax == 0 || iMax2 != 0) {
                        j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                    } else {
                        j3 = bz3.b;
                    }
                    j4 = j3;
                } else {
                    j2 = 4294967295L;
                }
                this.h = Math.max((int) (j >> c), (int) (j4 >> c));
                this.i = Math.max((int) (j & j2), (int) (j4 & j2));
                TextPaint textPaint2 = this.a;
                d42[] d42VarArr2 = this.o;
                i12 = this.g - 1;
                layout = this.f;
                if (layout.getLineStart(i12) == layout.getLineEnd(i12) || d42VarArr2 == null || d42VarArr2.length == 0) {
                    i13 = i11;
                } else {
                    SpannableString spannableString = new SpannableString("\u200b");
                    if (d42VarArr2.length == 0) {
                        j93.g("Array is empty.");
                        throw null;
                    }
                    d42 d42Var2 = d42VarArr2[i11];
                    spannableString.setSpan(new d42(d42Var2.c, spannableString.length(), (i12 == 0 || !d42Var2.l) ? d42Var2.l : i11, d42Var2.l, d42Var2.m, d42Var2.n), i11, spannableString.length(), i10);
                    i13 = i11;
                    StaticLayout staticLayoutP = y64.p(spannableString, textPaint2, IntCompanionObject.MAX_VALUE, spannableString.length(), textDirectionHeuristic, bx1.a, IntCompanionObject.MAX_VALUE, null, IntCompanionObject.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                    fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutP.getLineAscent(i13);
                    fontMetricsInt.descent = staticLayoutP.getLineDescent(i13);
                    fontMetricsInt.top = staticLayoutP.getLineTop(i13);
                    fontMetricsInt.bottom = staticLayoutP.getLineBottom(i13);
                }
                this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i16) - g(i16))) : i13;
                this.m = fontMetricsInt;
                Layout layout2 = this.f;
                this.j = xp1.n(layout2, i16, layout2.getPaint());
                Layout layout3 = this.f;
                this.k = xp1.o(layout3, i16, layout3.getPaint());
            }
            c = ' ';
            z2 = true;
            i10 = 33;
            i11 = 0;
            Paint.FontMetricsInt fontMetricsInt2 = null;
            if (layoutP.getText() instanceof Spanned) {
                d42VarArr = null;
            } else {
                text = layoutP.getText();
                text.getClass();
                if (g13.C((Spanned) text, d42.class)) {
                }
                CharSequence text4 = layoutP.getText();
                text4.getClass();
                d42VarArr = (d42[]) ((Spanned) text4).getSpans(i11, layoutP.getText().length(), d42.class);
            }
            this.o = d42VarArr;
            if (d42VarArr != null) {
                length = d42VarArr.length;
                i14 = i11;
                iMax = i14;
                iMax2 = iMax;
                while (i14 < length) {
                    boolean z5 = z2;
                    d42 d42Var3 = d42VarArr[i14];
                    long j7 = j5;
                    int i21 = d42Var3.s;
                    if (i21 < 0) {
                    }
                    i15 = d42Var3.t;
                    if (i15 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i15));
                    }
                    i14++;
                    j5 = j7;
                    z2 = z5;
                }
                j2 = j5;
                if (iMax == 0) {
                    j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                } else {
                    j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                }
                j4 = j3;
            } else {
                j2 = 4294967295L;
            }
            this.h = Math.max((int) (j >> c), (int) (j4 >> c));
            this.i = Math.max((int) (j & j2), (int) (j4 & j2));
            TextPaint textPaint3 = this.a;
            d42[] d42VarArr3 = this.o;
            i12 = this.g - 1;
            layout = this.f;
            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                i13 = i11;
            } else {
                i13 = i11;
            }
            this.n = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (e(i16) - g(i16))) : i13;
            this.m = fontMetricsInt2;
            Layout layout4 = this.f;
            this.j = xp1.n(layout4, i16, layout4.getPaint());
            Layout layout5 = this.f;
            this.k = xp1.o(layout5, i16, layout5.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final vu c() {
        vu vuVar = this.q;
        if (vuVar != null) {
            return vuVar;
        }
        vu vuVar2 = new vu();
        vuVar2.c = this.f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iZ0 = mo3.z0('\n', length, 4, ((Layout) vuVar2.c).getText());
            length = iZ0 < 0 ? ((Layout) vuVar2.c).getText().length() : iZ0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) vuVar2.c).getText().length());
        vuVar2.d = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        vuVar2.h = arrayList2;
        vuVar2.l = new boolean[((ArrayList) vuVar2.d).size()];
        ((ArrayList) vuVar2.d).size();
        this.q = vuVar2;
        return vuVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        lt3 lt3Var = bz3.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().j(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().j(i, false, z);
    }

    public final bk j() {
        bk bkVar = this.e;
        if (bkVar != null) {
            return bkVar;
        }
        Layout layout = this.f;
        bk bkVar2 = new bk(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = bkVar2;
        return bkVar2;
    }
}
