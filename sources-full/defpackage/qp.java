package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qp implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ qp(int i, int i2) {
        this.c = i2;
        this.d = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        int i2 = this.d;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                return zp.AvatarPickerSheet$lambda$81$lambda$80$lambda$76$lambda$47$lambda$46$lambda$44(i2, (ck0) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                xv.a((ck0) obj, i2);
                return w84Var;
            case 2:
                Canvas canvas = (Canvas) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                canvas.getClass();
                float f = fFloatValue / 2.0f;
                canvas.translate(f, 2.0f + f);
                float f2 = fFloatValue / 26.0f;
                canvas.scale(f2, f2);
                Path path = new Path();
                path.moveTo(0.0f, 8.5f);
                path.cubicTo(-11.0f, 1.5f, -8.5f, -9.5f, 0.0f, -4.5f);
                path.cubicTo(8.5f, -9.5f, 11.0f, 1.5f, 0.0f, 8.5f);
                path.close();
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, -9.0f, 0.0f, 9.0f, new int[]{-15660, i2, i2}, new float[]{0.0f, 0.35f, 1.0f}, Shader.TileMode.CLAMP));
                paint.setShadowLayer(4.0f / f2, 0.0f, 0.0f, 1508918650);
                canvas.drawPath(path, paint);
                return w84Var;
            default:
                Canvas canvas2 = (Canvas) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                canvas2.getClass();
                float f3 = fFloatValue2 / 2.0f;
                canvas2.translate(f3, f3);
                Path path2 = new Path();
                path2.moveTo(0.0f, -12.0f);
                path2.cubicTo(9.0f, -6.0f, 8.0f, 8.0f, 0.0f, 12.0f);
                path2.cubicTo(-8.0f, 8.0f, -9.0f, -6.0f, 0.0f, -12.0f);
                Paint paint2 = new Paint(1);
                paint2.setShader(new LinearGradient(-8.0f, -10.0f, 8.0f, 10.0f, -3851, this.d, Shader.TileMode.CLAMP));
                canvas2.drawPath(path2, paint2);
                Paint paint3 = new Paint(1);
                paint3.setColor(1087790476);
                paint3.setStrokeWidth(0.8f);
                canvas2.drawLine(0.0f, -9.0f, 0.0f, 9.0f, paint3);
                return w84Var;
        }
    }
}
