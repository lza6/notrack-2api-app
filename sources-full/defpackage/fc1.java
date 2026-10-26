package defpackage;

import java.util.Arrays;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class fc1 implements dc1 {
    public final float[] a;
    public final float[] b;

    public fc1(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            u41.k("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.dc1
    public final float a(float f) {
        return Headers$Companion.access$lookupAndInterpolate(f, this.b, this.a);
    }

    @Override // defpackage.dc1
    public final float b(float f) {
        return Headers$Companion.access$lookupAndInterpolate(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fc1)) {
            return false;
        }
        fc1 fc1Var = (fc1) obj;
        return Arrays.equals(this.a, fc1Var.a) && Arrays.equals(this.b, fc1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
