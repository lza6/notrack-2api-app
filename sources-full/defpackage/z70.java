package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z70 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ z70(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        boolean z = this.d;
        switch (i) {
            case 0:
                return wa0.ChatItem$lambda$997$lambda$996$lambda$985(z, (ck0) obj, ((Integer) obj2).intValue());
            case 1:
                return wa0.ChatDrawer$lambda$837$lambda$836$lambda$815$lambda$814$lambda$813(z, (ck0) obj, ((Integer) obj2).intValue());
            case 2:
                return wa0.MessageBubble$lambda$492(z, (ck0) obj, ((Integer) obj2).intValue());
            case 3:
                Canvas canvas = (Canvas) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                canvas.getClass();
                float f = fFloatValue / 2.0f;
                float f2 = f - 3.0f;
                int[] iArr = z ? new int[]{KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE} : new int[]{70, 140, 190};
                Paint paint = new Paint(1);
                paint.setShader(new RadialGradient(f, f, f2, new int[]{ye1.a(iArr, 0.02f), ye1.a(iArr, 0.02f), ye1.a(iArr, 0.16f), ye1.a(iArr, 0.55f)}, new float[]{0.0f, 0.55f, 0.9325f, 1.0f}, Shader.TileMode.CLAMP));
                canvas.drawCircle(f, f, f2, paint);
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(1.2f);
                paint2.setColor(ye1.a(iArr, 0.6f));
                canvas.drawCircle(f, f, f2, paint2);
                canvas.save();
                canvas.translate(f - (0.38f * f2), f - (0.42f * f2));
                canvas.rotate((float) Math.toDegrees(-0.7d));
                float f3 = -f2;
                RectF rectF = new RectF(f3 * 0.2f, f3 * 0.11f, 0.2f * f2, f2 * 0.11f);
                Paint paint3 = new Paint(1);
                paint3.setColor(-1073741825);
                canvas.drawOval(rectF, paint3);
                canvas.restore();
                return w84.a;
            case 4:
                return fm1.ImageGateDialog$lambda$5(z, (ck0) obj, ((Integer) obj2).intValue());
            default:
                return pe4.VoiceGateDialog$lambda$31(z, (ck0) obj, ((Integer) obj2).intValue());
        }
    }
}
