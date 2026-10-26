package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq implements pe1 {
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ gn3 d;
    public final /* synthetic */ ah2 h;
    public final /* synthetic */ mi2 l;

    public /* synthetic */ lq(ah2 ah2Var, mi2 mi2Var, gn3 gn3Var, Bitmap bitmap) {
        this.c = bitmap;
        this.d = gn3Var;
        this.h = ah2Var;
        this.l = mi2Var;
    }

    @Override // defpackage.pe1
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        ln2 ln2Var = (ln2) obj;
        ln2 ln2Var2 = (ln2) obj2;
        float fFloatValue = ((Float) obj3).floatValue();
        ((Float) obj4).getClass();
        Paint paint = qq.a;
        boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
        w84 w84Var = w84.a;
        if (!zBooleanValue) {
            bt2 bt2Var = (bt2) this.h;
            if (bt2Var.f() > 0.0f) {
                mi2 mi2Var = this.l;
                float fW = py.w(((pq0) mi2Var.getValue()).b * fFloatValue, 1.0f, 4.0f);
                float f = fW / ((pq0) mi2Var.getValue()).b;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ln2Var.a >> 32)) - (bt2Var.f() / 2.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ln2Var.a & 4294967295L)) - (bt2Var.f() / 2.0f);
                mi2Var.setValue(qq.g(pq0.a((pq0) mi2Var.getValue(), 0, fW, Float.intBitsToFloat((int) (ln2Var2.a >> 32)) + ((((pq0) mi2Var.getValue()).c - fIntBitsToFloat) * f) + fIntBitsToFloat, Float.intBitsToFloat((int) (ln2Var2.a & 4294967295L)) + ((((pq0) mi2Var.getValue()).d - fIntBitsToFloat2) * f) + fIntBitsToFloat2, 1), this.c, bt2Var.f()));
            }
        }
        return w84Var;
    }
}
