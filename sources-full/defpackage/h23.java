package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import app.template.extension.BuildConfig;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class h23 extends ng3 {
    public final List c;
    public final long d;
    public final float e;

    public h23(List list, long j, float f) {
        this.c = list;
        this.d = j;
        this.e = f;
    }

    @Override // defpackage.ng3
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jI = vl0.I(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jI >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = bi3.c(j) / 2.0f;
        }
        List list = this.c;
        xr0.D0(list, null);
        int iR = xr0.R(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), fC, xr0.i0(iR, list), xr0.j0(null, list, iR), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h23)) {
            return false;
        }
        h23 h23Var = (h23) obj;
        return this.c.equals(h23Var.c) && ln2.c(this.d, h23Var.d) && this.e == h23Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + fq2.d(this.e, ud2.h(this.c.hashCode() * 961, 31, this.d), 31);
    }

    public final String toString() {
        String str;
        long j = this.d;
        long j2 = 9223372034707292159L & j;
        String str2 = BuildConfig.VERSION_NAME;
        if (j2 != 9205357640488583168L) {
            str = "center=" + ((Object) ln2.k(j)) + ", ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        float f = this.e;
        if ((Float.floatToRawIntBits(f) & IntCompanionObject.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
