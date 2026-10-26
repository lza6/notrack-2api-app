package androidx.compose.ui.graphics;

import defpackage.ef0;
import defpackage.f42;
import defpackage.gb2;
import defpackage.oo1;
import defpackage.ps2;
import defpackage.re0;
import defpackage.t63;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Brush$Companion {
    static final /* synthetic */ Brush$Companion $$INSTANCE = new Brush$Companion();

    /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
    public static f42 m7xd6c5694e(List list) {
        return new f42(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: hsl-JlNiLsg$default, reason: not valid java name */
    public static long m8x2ffe3954(float f) {
        int i = re0.j;
        t63 t63Var = ef0.e;
        if (0.0f > f || f > 360.0f) {
            oo1.a("HSL (" + f + ", 0.42, 0.36) must be in range (0..360, 0..1, 0..1)");
        }
        return gb2.a(hslToRgbComponent(f, 0), hslToRgbComponent(f, 8), hslToRgbComponent(f, 4), 1.0f, t63Var);
    }

    private static float hslToRgbComponent(float f, int i) {
        float f2 = ((f / 30.0f) + i) % 12.0f;
        return 0.36f - (Math.max(-1.0f, Math.min(f2 - 3.0f, Math.min(9.0f - f2, 1.0f))) * (Math.min(0.36f, 0.64f) * 0.42f));
    }

    /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
    public static f42 m9x8523eea0(List list, float f, float f2) {
        return new f42(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
    public static f42 m10x8523eea0(ps2[] ps2VarArr, float f, float f2, int i) {
        float f3 = (i & 2) != 0 ? 0.0f : f;
        float f4 = (i & 4) != 0 ? Float.POSITIVE_INFINITY : f2;
        ps2[] ps2VarArr2 = (ps2[]) Arrays.copyOf(ps2VarArr, ps2VarArr.length);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
        ArrayList arrayList = new ArrayList(ps2VarArr2.length);
        for (ps2 ps2Var : ps2VarArr2) {
            arrayList.add(new re0(((re0) ps2Var.d).a));
        }
        ArrayList arrayList2 = new ArrayList(ps2VarArr2.length);
        for (ps2 ps2Var2 : ps2VarArr2) {
            arrayList2.add(Float.valueOf(((Number) ps2Var2.c).floatValue()));
        }
        return new f42(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2);
    }
}
