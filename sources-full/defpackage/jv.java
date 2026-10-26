package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class jv extends te0 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public jv(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            n9.i();
            porterDuffColorFilter = n9.f(gb2.X(j), p23.c0(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(gb2.X(j), p23.e0(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return re0.c(this.b, jvVar.b) && this.c == jvVar.c;
    }

    public final int hashCode() {
        int i = re0.j;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        ud2.t(this.b, sb, ", blendMode=");
        int i = this.c;
        if (i == 0) {
            str = "Clear";
        } else if (i == 1) {
            str = "Src";
        } else if (i == 2) {
            str = "Dst";
        } else if (i == 3) {
            str = "SrcOver";
        } else if (i == 4) {
            str = "DstOver";
        } else if (i == 5) {
            str = "SrcIn";
        } else if (i == 6) {
            str = "DstIn";
        } else if (i == 7) {
            str = "SrcOut";
        } else if (i == 8) {
            str = "DstOut";
        } else if (i == 9) {
            str = "SrcAtop";
        } else if (i == 10) {
            str = "DstAtop";
        } else if (i == 11) {
            str = "Xor";
        } else if (i == 12) {
            str = "Plus";
        } else if (i == 13) {
            str = "Modulate";
        } else if (i == 14) {
            str = "Screen";
        } else if (i == 15) {
            str = "Overlay";
        } else if (i == 16) {
            str = "Darken";
        } else if (i == 17) {
            str = "Lighten";
        } else if (i == 18) {
            str = "ColorDodge";
        } else if (i == 19) {
            str = "ColorBurn";
        } else if (i == 20) {
            str = "HardLight";
        } else if (i == 21) {
            str = "Softlight";
        } else if (i == 22) {
            str = "Difference";
        } else if (i == 23) {
            str = "Exclusion";
        } else if (i == 24) {
            str = "Multiply";
        } else if (i == 25) {
            str = "Hue";
        } else if (i == 26) {
            str = "Saturation";
        } else if (i == 27) {
            str = "Color";
        } else {
            str = i == 28 ? "Luminosity" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
