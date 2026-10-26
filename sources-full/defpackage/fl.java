package defpackage;

import androidx.compose.ui.Alignment$Companion;
import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fl implements el, gl {
    public final float c;
    public final float d;

    public fl(float f) {
        this.c = f;
        this.d = f;
    }

    @Override // defpackage.el, defpackage.gl
    public final float a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl) && rx0.a(this.c, ((fl) obj).c);
    }

    @Override // defpackage.el
    public final void h(wu0 wu0Var, int i, int[] iArr, dx1 dx1Var, int[] iArr2) {
        int i2;
        int i3;
        if (iArr.length == 0) {
            return;
        }
        int iO = wu0Var.O(this.c);
        if (dx1Var == dx1.d) {
            int length = iArr.length - 1;
            i2 = 0;
            i3 = 0;
            while (-1 < length) {
                int i4 = iArr[length];
                int iMin = Math.min(i2, i - i4);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iO, (i - iMin) - i4);
                int i5 = iArr2[length] + i4 + iMin2;
                length--;
                i3 = iMin2;
                i2 = i5;
            }
        } else {
            int length2 = iArr.length;
            i2 = 0;
            i3 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2) {
                int i8 = iArr[i6];
                int iMin3 = Math.min(i2, i - i8);
                iArr2[i7] = iMin3;
                int iMin4 = Math.min(iO, (i - iMin3) - i8);
                int i9 = iArr2[i7] + i8 + iMin4;
                i6++;
                i3 = iMin4;
                i2 = i9;
                i7++;
            }
        }
        int i10 = i2 - i3;
        if (i10 < i) {
            int iA = Alignment$Companion.getStart().a(0, i - i10, dx1Var);
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iA;
            }
        }
    }

    public final int hashCode() {
        return pe.u.hashCode() + ud2.k(Float.hashCode(this.c) * 31, 31, true);
    }

    @Override // defpackage.gl
    public final void k(wu0 wu0Var, int i, int[] iArr, int[] iArr2) {
        h(wu0Var, i, iArr, dx1.c, iArr2);
    }

    public final String toString() {
        return BuildConfig.VERSION_NAME + "Arrangement#spacedAligned(" + ((Object) rx0.b(this.c)) + ", " + pe.u + ')';
    }
}
