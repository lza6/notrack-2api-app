package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj0 implements ne1 {
    public final /* synthetic */ int c;

    public /* synthetic */ oj0(int i) {
        this.c = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        tf0 tf0Var;
        Object obj3;
        switch (this.c) {
            case 0:
                return pj0.lambda_1093770540$lambda$0((ck0) obj, ((Integer) obj2).intValue());
            case 1:
                return qj0.lambda_1269655344$lambda$0((ck0) obj, ((Integer) obj2).intValue());
            case 2:
                return qj0.lambda_637835161$lambda$1((ck0) obj, ((Integer) obj2).intValue());
            case 3:
                return qj0.lambda__1576804740$lambda$6((ck0) obj, ((Integer) obj2).intValue());
            case 4:
                xp0 xp0Var = (xp0) obj;
                vp0 vp0Var = (vp0) obj2;
                xp0Var.getClass();
                vp0Var.getClass();
                xp0 xp0VarMinusKey = xp0Var.minusKey(vp0Var.getKey());
                x21 x21Var = x21.c;
                if (xp0VarMinusKey == x21Var) {
                    return vp0Var;
                }
                t73 t73Var = t73.m;
                zp0 zp0Var = (zp0) xp0VarMinusKey.get(t73Var);
                if (zp0Var == null) {
                    tf0Var = new tf0(vp0Var, xp0VarMinusKey);
                } else {
                    xp0 xp0VarMinusKey2 = xp0VarMinusKey.minusKey(t73Var);
                    if (xp0VarMinusKey2 == x21Var) {
                        return new tf0(zp0Var, vp0Var);
                    }
                    tf0Var = new tf0(zp0Var, new tf0(vp0Var, xp0VarMinusKey2));
                }
                return tf0Var;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                obj3 = bool;
                break;
            case 6:
                return ((xp0) obj).plus((vp0) obj2);
            case 7:
                return ((xp0) obj).plus((vp0) obj2);
            case 8:
                return Boolean.valueOf(kr1.n(obj, obj2));
            case 9:
                Canvas canvas = (Canvas) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                canvas.getClass();
                float f = fFloatValue / 2.0f;
                Paint paint = new Paint(1);
                paint.setShader(new RadialGradient(f, f, f, new int[]{-2370, -218111910, 1207947836, 16765500}, new float[]{0.0f, 0.18f, 0.45f, 1.0f}, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue, paint);
                return w84.a;
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                return obj;
            case 12:
                if (obj == null) {
                    return null;
                }
                m51.t();
                return null;
            default:
                obj3 = (l04) obj;
                break;
        }
        return obj3;
    }
}
