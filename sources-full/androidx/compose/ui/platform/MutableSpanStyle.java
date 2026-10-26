package androidx.compose.ui.platform;

import defpackage.em3;
import defpackage.g72;
import defpackage.gc1;
import defpackage.hc1;
import defpackage.ic1;
import defpackage.iy3;
import defpackage.lb1;
import defpackage.ms0;
import defpackage.pg3;
import defpackage.re0;
import defpackage.tt3;
import defpackage.yz3;
import defpackage.zr;
import defpackage.zz3;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
final class MutableSpanStyle {
    private long background;
    private zr baselineShift;
    private long color;
    private lb1 fontFamily;
    private String fontFeatureSettings;
    private long fontSize;
    private gc1 fontStyle;
    private hc1 fontSynthesis;
    private ic1 fontWeight;
    private long letterSpacing;
    private g72 localeList;
    private pg3 shadow;
    private tt3 textDecoration;
    private iy3 textGeometricTransform;

    private MutableSpanStyle(long j, long j2, ic1 ic1Var, gc1 gc1Var, hc1 hc1Var, lb1 lb1Var, String str, long j3, zr zrVar, iy3 iy3Var, g72 g72Var, long j4, tt3 tt3Var, pg3 pg3Var) {
        this.color = j;
        this.fontSize = j2;
        this.fontWeight = ic1Var;
        this.fontStyle = gc1Var;
        this.fontSynthesis = hc1Var;
        this.fontFamily = lb1Var;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = zrVar;
        this.textGeometricTransform = iy3Var;
        this.localeList = g72Var;
        this.background = j4;
        this.textDecoration = tt3Var;
        this.shadow = pg3Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MutableSpanStyle(long j, long j2, ic1 ic1Var, gc1 gc1Var, hc1 hc1Var, lb1 lb1Var, String str, long j3, zr zrVar, iy3 iy3Var, g72 g72Var, long j4, tt3 tt3Var, pg3 pg3Var, int i, ms0 ms0Var) {
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i & 1) != 0) {
            int i2 = re0.j;
            j5 = re0.i;
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            zz3[] zz3VarArr = yz3.b;
            j6 = yz3.c;
        } else {
            j6 = j2;
        }
        ic1 ic1Var2 = (i & 4) != 0 ? null : ic1Var;
        gc1 gc1Var2 = (i & 8) != 0 ? null : gc1Var;
        hc1 hc1Var2 = (i & 16) != 0 ? null : hc1Var;
        lb1 lb1Var2 = (i & 32) != 0 ? null : lb1Var;
        String str2 = (i & 64) != 0 ? null : str;
        if ((i & Uuid.SIZE_BITS) != 0) {
            zz3[] zz3VarArr2 = yz3.b;
            j7 = yz3.c;
        } else {
            j7 = j3;
        }
        zr zrVar2 = (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : zrVar;
        iy3 iy3Var2 = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : iy3Var;
        g72 g72Var2 = (i & 1024) != 0 ? null : g72Var;
        if ((i & 2048) != 0) {
            int i3 = re0.j;
            j8 = re0.i;
        } else {
            j8 = j4;
        }
        gc1 gc1Var3 = gc1Var2;
        hc1 hc1Var3 = hc1Var2;
        lb1 lb1Var3 = lb1Var2;
        String str3 = str2;
        long j9 = j7;
        zr zrVar3 = zrVar2;
        iy3 iy3Var3 = iy3Var2;
        g72 g72Var3 = g72Var2;
        long j10 = j8;
        this(j5, j6, ic1Var2, gc1Var3, hc1Var3, lb1Var3, str3, j9, zrVar3, iy3Var3, g72Var3, j10, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? null : tt3Var, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? null : pg3Var, null);
    }

    public /* synthetic */ MutableSpanStyle(long j, long j2, ic1 ic1Var, gc1 gc1Var, hc1 hc1Var, lb1 lb1Var, String str, long j3, zr zrVar, iy3 iy3Var, g72 g72Var, long j4, tt3 tt3Var, pg3 pg3Var, ms0 ms0Var) {
        this(j, j2, ic1Var, gc1Var, hc1Var, lb1Var, str, j3, zrVar, iy3Var, g72Var, j4, tt3Var, pg3Var);
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m97xe4b3a951() {
        return this.background;
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final zr m98xac453d88() {
        return this.baselineShift;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m99xee76d8da() {
        return this.color;
    }

    public final lb1 getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m100x1c3cd98a() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final gc1 m101x825ea8a8() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final hc1 m102xb29a60ab() {
        return this.fontSynthesis;
    }

    public final ic1 getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m103x48cf87ab() {
        return this.letterSpacing;
    }

    public final g72 getLocaleList() {
        return this.localeList;
    }

    public final pg3 getShadow() {
        return this.shadow;
    }

    public final tt3 getTextDecoration() {
        return this.textDecoration;
    }

    public final iy3 getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    /* JADX INFO: renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m104x1a8274c4(long j) {
        this.background = j;
    }

    /* JADX INFO: renamed from: setBaselineShift-_isdbwI, reason: not valid java name */
    public final void m105x516aed27(zr zrVar) {
        this.baselineShift = zrVar;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m106x1ff088b5(long j) {
        this.color = j;
    }

    public final void setFontFamily(lb1 lb1Var) {
        this.fontFamily = lb1Var;
    }

    public final void setFontFeatureSettings(String str) {
        this.fontFeatureSettings = str;
    }

    /* JADX INFO: renamed from: setFontSize--R2X_6o, reason: not valid java name */
    public final void m107xdb0c6172(long j) {
        this.fontSize = j;
    }

    /* JADX INFO: renamed from: setFontStyle-mLjRB2g, reason: not valid java name */
    public final void m108x24d5b983(gc1 gc1Var) {
        this.fontStyle = gc1Var;
    }

    /* JADX INFO: renamed from: setFontSynthesis-tDdu0R4, reason: not valid java name */
    public final void m109xcd8b72c7(hc1 hc1Var) {
        this.fontSynthesis = hc1Var;
    }

    public final void setFontWeight(ic1 ic1Var) {
        this.fontWeight = ic1Var;
    }

    /* JADX INFO: renamed from: setLetterSpacing--R2X_6o, reason: not valid java name */
    public final void m110x33b52cfb(long j) {
        this.letterSpacing = j;
    }

    public final void setLocaleList(g72 g72Var) {
        this.localeList = g72Var;
    }

    public final void setShadow(pg3 pg3Var) {
        this.shadow = pg3Var;
    }

    public final void setTextDecoration(tt3 tt3Var) {
        this.textDecoration = tt3Var;
    }

    public final void setTextGeometricTransform(iy3 iy3Var) {
        this.textGeometricTransform = iy3Var;
    }

    public final em3 toSpanStyle() {
        return new em3(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, 49152);
    }
}
