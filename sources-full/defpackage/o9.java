package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class o9 implements y00 {
    public Canvas a = p9.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.y00
    public final void a(long j, long j2, ks2 ks2Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, ks2 ks2Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void c(nt2 nt2Var, ks2 ks2Var) {
        Canvas canvas = this.a;
        if (nt2Var instanceof ic) {
            canvas.drawPath(((ic) nt2Var).a, (Paint) ((bc) ks2Var).d);
        } else {
            j93.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.y00
    public final void d(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.y00
    public final void e(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.y00
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.y00
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.y00
    public final void h(bm1 bm1Var, ks2 ks2Var) {
        this.a.drawBitmap(gm4.d(bm1Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void i() {
        this.a.restore();
    }

    @Override // defpackage.y00
    public final void j(float f, long j, ks2 ks2Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.y00
    public final void m(float f, float f2, float f3, float f4, float f5, float f6, ks2 ks2Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void n() {
        p23.w(this.a, false);
    }

    @Override // defpackage.y00
    public final void o(nt2 nt2Var) {
        Canvas canvas = this.a;
        if (nt2Var instanceof ic) {
            canvas.clipPath(((ic) nt2Var).a, Region.Op.INTERSECT);
        } else {
            j93.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.y00
    public final void p(bm1 bm1Var, long j, long j2, long j3, long j4, ks2 ks2Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapD = gm4.d(bm1Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapD, rect, rect2, (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void q(float[] fArr) {
        if (y64.F(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        yo4.T(fArr, matrix);
        this.a.concat(matrix);
    }

    @Override // defpackage.y00
    public final void r(float f, float f2, float f3, float f4, ks2 ks2Var) {
        this.a.drawRect(f, f2, f3, f4, (Paint) ((bc) ks2Var).d);
    }

    @Override // defpackage.y00
    public final void s(h43 h43Var, ks2 ks2Var) {
        this.a.saveLayer(h43Var.a, h43Var.b, h43Var.c, h43Var.d, (Paint) ((bc) ks2Var).d, 31);
    }

    @Override // defpackage.y00
    public final void t() {
        p23.w(this.a, true);
    }
}
