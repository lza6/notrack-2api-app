package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public interface nt2 {
    static void a(nt2 nt2Var, h43 h43Var) {
        ic icVar = (ic) nt2Var;
        float f = h43Var.a;
        float f2 = h43Var.d;
        float f3 = h43Var.c;
        float f4 = h43Var.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            kc.c("Invalid rectangle, make sure no value is NaN");
        }
        if (icVar.b == null) {
            icVar.b = new RectF();
        }
        RectF rectF = icVar.b;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = icVar.a;
        RectF rectF2 = icVar.b;
        rectF2.getClass();
        path.addRect(rectF2, kc.b(lt2.c));
    }

    static void b(nt2 nt2Var, x73 x73Var) {
        ic icVar = (ic) nt2Var;
        if (icVar.b == null) {
            icVar.b = new RectF();
        }
        RectF rectF = icVar.b;
        rectF.getClass();
        float f = x73Var.a;
        long j = x73Var.h;
        long j2 = x73Var.g;
        long j3 = x73Var.f;
        long j4 = x73Var.e;
        rectF.set(f, x73Var.b, x73Var.c, x73Var.d);
        if (icVar.c == null) {
            icVar.c = new float[8];
        }
        float[] fArr = icVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = icVar.a;
        RectF rectF2 = icVar.b;
        rectF2.getClass();
        float[] fArr2 = icVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, kc.b(lt2.c));
    }
}
