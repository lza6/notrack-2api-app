package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class dc {
    public final hc a;
    public final int b;
    public final long c;
    public final vy3 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:141:0x020f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0212  */
    /* JADX WARN: Code duplicated, block: B:144:0x022c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x024a  */
    /* JADX WARN: Code duplicated, block: B:157:0x027f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0283  */
    /* JADX WARN: Code duplicated, block: B:160:0x029b  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:175:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX WARN: Instruction removed from duplicated block: B:158:0x0283, please report this as an issue */
    public dc(hc hcVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        vy3 vy3VarA;
        int i7;
        dc dcVar;
        int i8;
        int i9;
        int i10;
        Layout layout;
        Spanned spanned;
        og3[] og3VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        List list;
        int spanEnd;
        int lineForOffset;
        boolean z;
        boolean z2;
        boolean z3;
        h43 h43Var;
        float fH;
        int i12;
        int i13;
        this.a = hcVar;
        this.b = i;
        this.c = j;
        if (um0.i(j) != 0 || um0.j(j) != 0) {
            qo1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            qo1.a("maxLines should be greater than 0");
        }
        uz3 uz3Var = hcVar.d;
        CharSequence charSequence2 = hcVar.p;
        if (i2 == 2) {
            i3 = 0;
            if (!yz3.a(uz3Var.a.h, gm4.D(0)) && !yz3.a(uz3Var.a.h, yz3.c) && (i13 = uz3Var.b.a) != Integer.MIN_VALUE && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!g13.C(spannableString, pn1.class)) {
                    spannableString.setSpan(new pn1(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        xs2 xs2Var = uz3Var.b;
        em3 em3Var = uz3Var.a;
        int i14 = xs2Var.a;
        int i15 = 3;
        int i16 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i17 = i14 == 4 ? 1 : i3;
        int i18 = xs2Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = xs2Var.g;
        int i20 = i19 & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i21 == 1) {
            i15 = i3;
        } else if (i21 == 2) {
            i15 = 1;
        } else if (i21 == 3) {
            i15 = 2;
        } else if (i21 != 4) {
            i15 = i3;
        }
        int i22 = (i19 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i22 != 1) {
            i5 = 2;
            i6 = i22 == 2 ? 1 : i6;
            if (i2 == i5) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i2 == 5) {
                    if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c = ' ';
                        truncateAt = null;
                    }
                    vy3VarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                    Layout layout2 = vy3VarA.f;
                    i7 = i16;
                    if (Build.VERSION.SDK_INT < 35 || hcVar.o.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        dcVar = this;
                        i8 = i;
                        i9 = i7;
                        i10 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i10 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        dcVar = this;
                        i8 = i;
                        i9 = i7;
                        vy3VarA = dcVar.a(i9, i17, truncateAt, i8, i18, i4, i15, i6, TextUtils.concat(charSequenceArr));
                    }
                    int i23 = vy3VarA.g;
                    if (i2 == i10 || vy3VarA.a() <= um0.g(j) || i8 <= 1) {
                        dcVar.d = vy3VarA;
                    } else {
                        int iG = um0.g(j);
                        int i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                i24 = i23;
                                break;
                            } else if (vy3VarA.e(i24) > iG) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i24 >= 0 && i24 != dcVar.b) {
                            vy3VarA = dcVar.a(i9, i17, truncateAt, i24 < 1 ? 1 : i24, i18, i4, i15, i6, dcVar.e);
                        }
                        dcVar.d = vy3VarA;
                    }
                    dcVar.a.o.c(em3Var.a.b(), (((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c), em3Var.a.getAlpha());
                    layout = dcVar.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), og3.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            og3VarArr = (og3[]) ((Spanned) text2).getSpans(0, layout.getText().length(), og3.class);
                        } else {
                            og3VarArr = null;
                        }
                    } else {
                        og3VarArr = null;
                    }
                    if (og3VarArr != null) {
                        i12 = 0;
                        while (i12 < og3VarArr.length) {
                            int i25 = i12 + 1;
                            try {
                                og3VarArr[i12].h.setValue(new bi3((((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c)));
                                i12 = i25;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                j93.g(e.getMessage());
                                throw null;
                            }
                        }
                    }
                    charSequence = dcVar.e;
                    if (charSequence instanceof Spanned) {
                        spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), qv2.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            qv2 qv2Var = (qv2) obj;
                            int spanStart = spanned2.getSpanStart(qv2Var);
                            spanEnd = spanned2.getSpanEnd(qv2Var);
                            lineForOffset = dcVar.d.f.getLineForOffset(spanStart);
                            if (lineForOffset >= dcVar.b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (dcVar.d.f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= dcVar.d.f.getEllipsisStart(lineForOffset)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (spanEnd > dcVar.d.f(lineForOffset)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && !z3 && !z) {
                                int iOrdinal = (dcVar.d.f.isRtlCharAt(spanStart) ? u53.d : u53.c).ordinal();
                                if (iOrdinal == 0) {
                                    fH = dcVar.d.h(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        u41.e();
                                        throw null;
                                    }
                                    float fH2 = dcVar.d.h(spanStart, false);
                                    if (!qv2Var.l) {
                                        qo1.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fH = fH2 - qv2Var.d;
                                }
                                if (!qv2Var.l) {
                                    qo1.b("PlaceholderSpan is not laid out yet.");
                                }
                                float f = qv2Var.d + fH;
                                float fD = dcVar.d.d(lineForOffset) - qv2Var.b();
                                h43Var = new h43(fH, fD, f, qv2Var.b() + fD);
                            }
                            arrayList.add(h43Var);
                        }
                        list = arrayList;
                    } else {
                        list = z21.c;
                    }
                    dcVar.f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c = ' ';
            truncateAt = truncateAt2;
            vy3VarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
            Layout layout3 = vy3VarA.f;
            i7 = i16;
            if (Build.VERSION.SDK_INT < 35) {
                dcVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            } else {
                dcVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            }
            int i26 = vy3VarA.g;
            if (i2 == i10) {
                dcVar.d = vy3VarA;
            } else {
                dcVar.d = vy3VarA;
            }
            dcVar.a.o.c(em3Var.a.b(), (((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c), em3Var.a.getAlpha());
            layout = dcVar.d.f;
            if (layout.getText() instanceof Spanned) {
                og3VarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                text3.getClass();
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), og3.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    text4.getClass();
                    og3VarArr = (og3[]) ((Spanned) text4).getSpans(0, layout.getText().length(), og3.class);
                } else {
                    og3VarArr = null;
                }
            }
            if (og3VarArr != null) {
                i12 = 0;
                while (i12 < og3VarArr.length) {
                    int i27 = i12 + 1;
                    og3VarArr[i12].h.setValue(new bi3((((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c)));
                    i12 = i27;
                }
            }
            charSequence = dcVar.e;
            if (charSequence instanceof Spanned) {
                list = z21.c;
            } else {
                spanned2 = (Spanned) charSequence;
                Object[] spans2 = spanned2.getSpans(0, charSequence.length(), qv2.class);
                arrayList = new ArrayList(spans2.length);
                while (i11 < r4) {
                    qv2 qv2Var2 = (qv2) obj;
                    int spanStart2 = spanned2.getSpanStart(qv2Var2);
                    spanEnd = spanned2.getSpanEnd(qv2Var2);
                    lineForOffset = dcVar.d.f.getLineForOffset(spanStart2);
                    if (lineForOffset >= dcVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dcVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > dcVar.d.f(lineForOffset)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    h43Var = z2 ? null : null;
                    arrayList.add(h43Var);
                }
                list = arrayList;
            }
            dcVar.f = list;
        }
        i5 = 2;
        i6 = i3;
        if (i2 == i5) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 == 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c = ' ';
                    truncateAt = null;
                }
                vy3VarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                Layout layout4 = vy3VarA.f;
                i7 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                    dcVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                } else {
                    dcVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                }
                int i28 = vy3VarA.g;
                if (i2 == i10) {
                    dcVar.d = vy3VarA;
                } else {
                    dcVar.d = vy3VarA;
                }
                dcVar.a.o.c(em3Var.a.b(), (((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c), em3Var.a.getAlpha());
                layout = dcVar.d.f;
                if (layout.getText() instanceof Spanned) {
                    og3VarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    text5.getClass();
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), og3.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        text6.getClass();
                        og3VarArr = (og3[]) ((Spanned) text6).getSpans(0, layout.getText().length(), og3.class);
                    } else {
                        og3VarArr = null;
                    }
                }
                if (og3VarArr != null) {
                    i12 = 0;
                    while (i12 < og3VarArr.length) {
                        int i29 = i12 + 1;
                        og3VarArr[i12].h.setValue(new bi3((((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c)));
                        i12 = i29;
                    }
                }
                charSequence = dcVar.e;
                if (charSequence instanceof Spanned) {
                    list = z21.c;
                } else {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans3 = spanned2.getSpans(0, charSequence.length(), qv2.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i11 < r4) {
                        qv2 qv2Var3 = (qv2) obj;
                        int spanStart3 = spanned2.getSpanStart(qv2Var3);
                        spanEnd = spanned2.getSpanEnd(qv2Var3);
                        lineForOffset = dcVar.d.f.getLineForOffset(spanStart3);
                        if (lineForOffset >= dcVar.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dcVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > dcVar.d.f(lineForOffset)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                        }
                        arrayList.add(h43Var);
                    }
                    list = arrayList;
                }
                dcVar.f = list;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c = ' ';
        truncateAt = truncateAt2;
        vy3VarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
        Layout layout5 = vy3VarA.f;
        i7 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            dcVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        } else {
            dcVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        }
        int i210 = vy3VarA.g;
        if (i2 == i10) {
            dcVar.d = vy3VarA;
        } else {
            dcVar.d = vy3VarA;
        }
        dcVar.a.o.c(em3Var.a.b(), (((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c), em3Var.a.getAlpha());
        layout = dcVar.d.f;
        if (layout.getText() instanceof Spanned) {
            og3VarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            text7.getClass();
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), og3.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                text8.getClass();
                og3VarArr = (og3[]) ((Spanned) text8).getSpans(0, layout.getText().length(), og3.class);
            } else {
                og3VarArr = null;
            }
        }
        if (og3VarArr != null) {
            i12 = 0;
            while (i12 < og3VarArr.length) {
                int i211 = i12 + 1;
                og3VarArr[i12].h.setValue(new bi3((((long) Float.floatToRawIntBits(dcVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(dcVar.d())) << c)));
                i12 = i211;
            }
        }
        charSequence = dcVar.e;
        if (charSequence instanceof Spanned) {
            list = z21.c;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans4 = spanned2.getSpans(0, charSequence.length(), qv2.class);
            arrayList = new ArrayList(spans4.length);
            while (i11 < r4) {
                qv2 qv2Var4 = (qv2) obj;
                int spanStart4 = spanned2.getSpanStart(qv2Var4);
                spanEnd = spanned2.getSpanEnd(qv2Var4);
                lineForOffset = dcVar.d.f.getLineForOffset(spanStart4);
                if (lineForOffset >= dcVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (dcVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > dcVar.d.f(lineForOffset)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(h43Var);
            }
            list = arrayList;
        }
        dcVar.f = list;
    }

    public final vy3 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        fw2 fw2Var;
        float fD = d();
        hc hcVar = this.a;
        be beVar = hcVar.o;
        int i8 = hcVar.t;
        gx1 gx1Var = hcVar.q;
        uz3 uz3Var = hcVar.d;
        ec ecVar = fc.a;
        jw2 jw2Var = uz3Var.c;
        return new vy3(charSequence, fD, beVar, i, truncateAt, i8, (jw2Var == null || (fw2Var = jw2Var.b) == null) ? false : fw2Var.a, i3, i5, i6, i7, i4, i2, gx1Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v26, types: [mb] */
    public final long c(h43 h43Var, int i, j93 j93Var) {
        wc3 cg1Var;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderH;
        RectF rectFX0 = xr0.x0(h43Var);
        boolean z = false;
        boolean z2 = i != 0 && i == 1;
        final ea eaVar = new ea(2, j93Var);
        vy3 vy3Var = this.d;
        TextPaint textPaint = vy3Var.a;
        Layout layout = vy3Var.f;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 12;
        if (i3 >= 34) {
            if (z2) {
                segmentFinderH = new tg(new bv0(i4, layout.getText(), vy3Var.j(), z));
            } else {
                lb.n();
                segmentFinderH = lb.h(lb.g(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFX0, segmentFinderH, new Layout.TextInclusionStrategy() { // from class: mb
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) eaVar.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            vu vuVarC = vy3Var.c();
            if (z2) {
                cg1Var = new bv0(i4, layout.getText(), vy3Var.j(), z);
            } else {
                CharSequence text = layout.getText();
                cg1Var = i3 >= 29 ? new cg1(text, textPaint) : new dg1(text);
            }
            wc3 wc3Var = cg1Var;
            int lineForVertical = layout.getLineForVertical((int) rectFX0.top);
            if (rectFX0.top <= vy3Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < vy3Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFX0.bottom);
                if (lineForVertical2 != 0 || rectFX0.bottom >= vy3Var.g(0)) {
                    int iU = xp1.u(vy3Var, layout, vuVarC, i5, rectFX0, wc3Var, eaVar, true);
                    while (true) {
                        i2 = i5;
                        if (iU != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iU = xp1.u(vy3Var, layout, vuVarC, i5, rectFX0, wc3Var, eaVar, true);
                    }
                    if (iU == -1) {
                        rangeForRect = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iU2 = xp1.u(vy3Var, layout, vuVarC, i6, rectFX0, wc3Var, eaVar, false);
                        while (iU2 == -1 && i2 < i6) {
                            i6--;
                            iU2 = xp1.u(vy3Var, layout, vuVarC, i6, rectFX0, wc3Var, eaVar, false);
                        }
                        if (iU2 == -1) {
                            rangeForRect = null;
                        } else {
                            rangeForRect = new int[]{wc3Var.a(iU + 1), wc3Var.b(iU2 - 1)};
                        }
                    }
                } else {
                    rangeForRect = null;
                }
            } else {
                rangeForRect = null;
            }
        }
        return rangeForRect == null ? jz3.b : p23.d(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return um0.h(this.c);
    }

    public final void e(y00 y00Var) {
        Canvas canvasA = p9.a(y00Var);
        vy3 vy3Var = this.d;
        if (vy3Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = vy3Var.h;
        if (canvasA.getClipBounds(vy3Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            lt3 lt3Var = bz3.a;
            lt3Var.a = canvasA;
            vy3Var.f.draw(lt3Var);
            if (i != 0) {
                canvasA.translate(0.0f, (-1.0f) * i);
            }
        }
        if (vy3Var.d) {
            canvasA.restore();
        }
    }

    public final void f(y00 y00Var, long j, pg3 pg3Var, tt3 tt3Var, uz0 uz0Var) {
        be beVar = this.a.o;
        int i = beVar.c;
        beVar.d(j);
        beVar.f(pg3Var);
        beVar.g(tt3Var);
        beVar.e(uz0Var);
        beVar.b(3);
        e(y00Var);
        beVar.b(i);
    }

    public final void g(y00 y00Var, yx yxVar, float f, pg3 pg3Var, tt3 tt3Var, uz0 uz0Var) {
        be beVar = this.a.o;
        int i = beVar.c;
        float fD = d();
        beVar.c(yxVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        beVar.f(pg3Var);
        beVar.g(tt3Var);
        beVar.e(uz0Var);
        beVar.b(3);
        e(y00Var);
        beVar.b(i);
    }
}
