package defpackage;

import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements CharSequence {
    public CharSequence c;
    public ze1 d;
    public int h;
    public int l;

    public final void a(int i, int i2, int i3, CharSequence charSequence) {
        if (i > i2) {
            so1.a("start=" + i + " > end=" + i2);
        }
        if (i3 < 0) {
            so1.a("textStart=0 > textEnd=" + i3);
        }
        if (i < 0) {
            so1.a("start must be non-negative, but was " + i);
        }
        ze1 ze1Var = this.d;
        if (ze1Var == null) {
            int iMax = Math.max(KotlinVersion.MAX_COMPONENT_VALUE, i3 + Uuid.SIZE_BITS);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.c.length() - i2, 64);
            int i4 = i - iMin;
            xr0.y0(this.c, cArr, 0, i4, i);
            int i5 = iMax - iMin2;
            int i6 = iMin2 + i2;
            xr0.y0(this.c, cArr, i5, i2, i6);
            xr0.y0(charSequence, cArr, iMin, 0, i3);
            ze1 ze1Var2 = new ze1(1);
            ze1Var2.b = iMax;
            ze1Var2.c = cArr;
            ze1Var2.d = iMin + i3;
            ze1Var2.e = i5;
            this.d = ze1Var2;
            this.h = i4;
            this.l = i6;
            return;
        }
        int i7 = this.h;
        int i8 = i - i7;
        int i9 = i2 - i7;
        if (i8 < 0 || i9 > ze1Var.b - ze1Var.a()) {
            this.c = toString();
            this.d = null;
            this.h = -1;
            this.l = -1;
            a(i, i2, i3, charSequence);
            return;
        }
        int i10 = i3 - (i9 - i8);
        if (i10 > ze1Var.a()) {
            int iA = i10 - ze1Var.a();
            int i11 = ze1Var.b;
            do {
                i11 *= 2;
            } while (i11 - ze1Var.b < iA);
            char[] cArr2 = new char[i11];
            vl.k0(ze1Var.c, cArr2, 0, 0, ze1Var.d);
            int i12 = ze1Var.b;
            int i13 = ze1Var.e;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            vl.k0(ze1Var.c, cArr2, i15, i13, i14 + i13);
            ze1Var.c = cArr2;
            ze1Var.b = i11;
            ze1Var.e = i15;
        }
        int i16 = ze1Var.d;
        if (i8 < i16 && i9 <= i16) {
            int i17 = i16 - i9;
            char[] cArr3 = ze1Var.c;
            vl.k0(cArr3, cArr3, ze1Var.e - i17, i9, i16);
            ze1Var.d = i8;
            ze1Var.e -= i17;
        } else if (i8 >= i16 || i9 < i16) {
            int iA2 = ze1Var.a() + i8;
            int iA3 = ze1Var.a() + i9;
            int i18 = ze1Var.e;
            char[] cArr4 = ze1Var.c;
            vl.k0(cArr4, cArr4, ze1Var.d, i18, iA2);
            ze1Var.d += iA2 - i18;
            ze1Var.e = iA3;
        } else {
            ze1Var.e = ze1Var.a() + i9;
            ze1Var.d = i8;
        }
        xr0.y0(charSequence, ze1Var.c, ze1Var.d, 0, i3);
        ze1Var.d += i3;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        ze1 ze1Var = this.d;
        if (ze1Var != null && i >= this.h) {
            int iA = ze1Var.b - ze1Var.a();
            int i2 = this.h;
            if (i >= iA + i2) {
                return this.c.charAt(i - ((iA - this.l) + i2));
            }
            int i3 = i - i2;
            int i4 = ze1Var.d;
            char[] cArr = ze1Var.c;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + ze1Var.e];
        }
        return this.c.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        ze1 ze1Var = this.d;
        CharSequence charSequence = this.c;
        if (ze1Var == null) {
            return charSequence.length();
        }
        return (ze1Var.b - ze1Var.a()) + (charSequence.length() - (this.l - this.h));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        ze1 ze1Var = this.d;
        CharSequence charSequence = this.c;
        if (ze1Var == null) {
            return charSequence.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, this.h);
        sb.append(ze1Var.c, 0, ze1Var.d);
        char[] cArr = ze1Var.c;
        int i = ze1Var.e;
        sb.append(cArr, i, ze1Var.b - i);
        CharSequence charSequence2 = this.c;
        sb.append(charSequence2, this.l, charSequence2.length());
        return sb.toString();
    }
}
