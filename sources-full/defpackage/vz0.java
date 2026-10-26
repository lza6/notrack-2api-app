package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes.dex */
public final class vz0 extends CharacterStyle implements UpdateAppearance {
    public final uz0 c;

    public vz0(uz0 uz0Var) {
        this.c = uz0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            b71 b71Var = b71.a;
            uz0 uz0Var = this.c;
            if (kr1.n(uz0Var, b71Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (uz0Var instanceof vo3) {
                textPaint.setStyle(Paint.Style.STROKE);
                vo3 vo3Var = (vo3) uz0Var;
                textPaint.setStrokeWidth(vo3Var.a);
                textPaint.setStrokeMiter(vo3Var.b);
                int i = vo3Var.d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else {
                    join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = vo3Var.c;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
            }
        }
    }
}
