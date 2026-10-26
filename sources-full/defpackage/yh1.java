package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh1(int i, int i2, uz3 uz3Var) {
        super(1);
        this.c = 0;
        this.d = i;
        this.h = i2;
        this.l = uz3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh1(Object obj, int i, int i2, int i3) {
        super(1);
        this.c = i3;
        this.l = obj;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        int i3 = this.d;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i3));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i2));
                inspectorInfo.getProperties().set("textStyle", (uz3) obj2);
                break;
            case 1:
                zt3 zt3Var = (zt3) obj;
                fn1 fn1Var = (fn1) obj2;
                long jB = fn1Var.b(p23.d(0, zt3Var.d.length()));
                int iF = jz3.f(jB);
                int iE = jz3.e(jB);
                if (i3 < iF) {
                    i3 = iF;
                }
                if (i3 <= iE) {
                    iE = i3;
                }
                int iF2 = jz3.f(jB);
                int iE2 = jz3.e(jB);
                if (i2 < iF2) {
                    i2 = iF2;
                }
                if (i2 <= iE2) {
                    iE2 = i2;
                }
                zt3Var.f(fn1Var.a(p23.d(iE, iE2)));
                break;
            default:
                ss2 ss2Var = (ss2) obj;
                ic icVar = (ic) obj2;
                dc dcVar = ss2Var.a;
                int iD = ss2Var.d(i3);
                int iD2 = ss2Var.d(i2);
                CharSequence charSequence = dcVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    qo1.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                vy3 vy3Var = dcVar.d;
                vy3Var.f.getSelectionPath(iD, iD2, path);
                int i4 = vy3Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ss2Var.f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                icVar.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return w84Var;
    }
}
