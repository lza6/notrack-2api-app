package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class d42 implements LineHeightSpan {
    public final float c;
    public final int d;
    public final boolean h;
    public final boolean l;
    public final float m;
    public final boolean n;
    public int o = Integer.MIN_VALUE;
    public int p = Integer.MIN_VALUE;
    public int q = Integer.MIN_VALUE;
    public int r = Integer.MIN_VALUE;
    public int s;
    public int t;

    public d42(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.c = f;
        this.d = i;
        this.h = z;
        this.l = z2;
        this.m = f2;
        this.n = z3;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            qo1.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.d;
        boolean z3 = this.l;
        boolean z4 = this.h;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (this.o == Integer.MIN_VALUE) {
            int i7 = i5 - i6;
            int iCeil = (int) Math.ceil(this.c);
            int i8 = iCeil - i7;
            if (!this.n || i8 > 0) {
                float fAbs = this.m;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i8 <= 0 ? Math.ceil(i8 * fAbs) : Math.ceil((1.0f - fAbs) * i8));
                int i9 = fontMetricsInt.descent;
                int i10 = iCeil2 + i9;
                this.q = i10;
                int i11 = i10 - iCeil;
                this.p = i11;
                if (z4) {
                    i11 = fontMetricsInt.ascent;
                }
                this.o = i11;
                if (z3) {
                    i10 = i9;
                }
                this.r = i10;
                this.s = fontMetricsInt.ascent - i11;
                this.t = i10 - i9;
            } else {
                int i12 = fontMetricsInt.ascent;
                this.p = i12;
                int i13 = fontMetricsInt.descent;
                this.q = i13;
                this.o = i12;
                this.r = i13;
                this.s = 0;
                this.t = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.o : this.p;
        fontMetricsInt.descent = z2 ? this.r : this.q;
    }
}
