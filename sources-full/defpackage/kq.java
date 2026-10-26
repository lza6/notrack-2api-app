package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class kq extends mq3 implements ne1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ Bitmap d;
    public final /* synthetic */ ah2 h;
    public final /* synthetic */ mi2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(float f, Bitmap bitmap, ah2 ah2Var, mi2 mi2Var, so0 so0Var) {
        super(2, so0Var);
        this.c = f;
        this.d = bitmap;
        this.h = ah2Var;
        this.l = mi2Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new kq(this.c, this.d, this.h, this.l, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kq kqVar = (kq) create((gq0) obj, (so0) obj2);
        w84 w84Var = w84.a;
        kqVar.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        g13.O(obj);
        Paint paint = qq.a;
        bt2 bt2Var = (bt2) this.h;
        float f = bt2Var.f();
        float f2 = this.c;
        if (f != f2) {
            float f3 = bt2Var.f();
            mi2 mi2Var = this.l;
            if (f3 > 0.0f) {
                mi2Var.setValue(pq0.a((pq0) mi2Var.getValue(), 0, 0.0f, (((pq0) mi2Var.getValue()).c * f2) / bt2Var.f(), (((pq0) mi2Var.getValue()).d * f2) / bt2Var.f(), 3));
            }
            bt2Var.h(f2);
            mi2Var.setValue(qq.g((pq0) mi2Var.getValue(), this.d, f2));
        }
        return w84.a;
    }
}
