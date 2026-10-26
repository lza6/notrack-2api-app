package defpackage;

import androidx.compose.foundation.gestures.b;

/* JADX INFO: loaded from: classes.dex */
public final class ec3 extends mq3 implements ne1 {
    public int c;
    public final /* synthetic */ fc3 d;
    public final /* synthetic */ float h;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec3(fc3 fc3Var, float f, float f2, so0 so0Var) {
        super(2, so0Var);
        this.d = fc3Var;
        this.h = f;
        this.l = f2;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new ec3(this.d, this.h, this.l, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((ec3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            g13.O(obj);
            oc3 oc3Var = this.d.x;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.h)) << 32) | (((long) Float.floatToRawIntBits(this.l)) & 4294967295L);
            this.c = 1;
            Object objA = b.a(oc3Var, jFloatToRawIntBits, this);
            hq0 hq0Var = hq0.c;
            if (objA == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }
}
