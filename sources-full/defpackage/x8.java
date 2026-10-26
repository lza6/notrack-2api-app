package defpackage;

import androidx.compose.material3.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends mq3 implements le1 {
    public int c;
    public final /* synthetic */ ji4 d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ pe1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(ji4 ji4Var, Object obj, pe1 pe1Var, so0 so0Var) {
        super(1, so0Var);
        this.d = ji4Var;
        this.h = obj;
        this.l = pe1Var;
    }

    @Override // defpackage.wr
    public final so0 create(so0 so0Var) {
        return new x8(this.d, this.h, this.l, so0Var);
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        return ((x8) create((so0) obj)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        so0 so0Var = null;
        int i2 = 1;
        if (i == 0) {
            g13.O(obj);
            Object obj2 = this.h;
            ji4 ji4Var = this.d;
            ji4Var.s(obj2);
            u8 u8Var = new u8(ji4Var, i2);
            q8 q8Var = new q8(this.l, ji4Var, so0Var, 3);
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
