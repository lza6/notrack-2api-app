package defpackage;

import androidx.compose.material3.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class v8 extends mq3 implements le1 {
    public int c;
    public final /* synthetic */ ji4 d;
    public final /* synthetic */ oe1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(ji4 ji4Var, oe1 oe1Var, so0 so0Var) {
        super(1, so0Var);
        this.d = ji4Var;
        this.h = oe1Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        return new v8(this.d, this.h, so0Var);
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        return ((v8) create((so0) obj)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        so0 so0Var = null;
        if (i == 0) {
            g13.O(obj);
            ji4 ji4Var = this.d;
            u8 u8Var = new u8(ji4Var, 0);
            q8 q8Var = new q8(this.h, ji4Var, so0Var, 2);
            this.c = 1;
            Object objA = a.a(u8Var, q8Var, this);
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
