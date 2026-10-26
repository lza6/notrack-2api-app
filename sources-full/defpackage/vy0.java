package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vy0 extends mq3 implements ne1 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bz0 h;
    public final /* synthetic */ ix2 l;
    public final /* synthetic */ lf m;
    public final /* synthetic */ ie n;
    public final /* synthetic */ wy0 o;
    public final /* synthetic */ wy0 p;
    public final /* synthetic */ da q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(bz0 bz0Var, ix2 ix2Var, lf lfVar, ie ieVar, wy0 wy0Var, wy0 wy0Var2, da daVar, so0 so0Var) {
        super(2, so0Var);
        this.h = bz0Var;
        this.l = ix2Var;
        this.m = lfVar;
        this.n = ieVar;
        this.o = wy0Var;
        this.p = wy0Var2;
        this.q = daVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        vy0 vy0Var = new vy0(this.h, this.l, this.m, this.n, this.o, this.p, this.q, so0Var);
        vy0Var.d = obj;
        return vy0Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((vy0) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        CancellationException cancellationException;
        gq0 gq0Var;
        jy jyVar;
        int i = this.c;
        w84 w84Var = w84.a;
        bz0 bz0Var = this.h;
        if (i == 0) {
            g13.O(obj);
            gq0 gq0Var2 = (gq0) this.d;
            try {
                nq2 nq2Var = bz0Var.h;
                ix2 ix2Var = this.l;
                lf lfVar = this.m;
                ie ieVar = this.n;
                wy0 wy0Var = this.o;
                wy0 wy0Var2 = this.p;
                da daVar = this.q;
                this.d = gq0Var2;
                this.c = 1;
                float f = uy0.a;
                Object objL = p23.l(ix2Var, new py0(wy0Var2, new p43(), nq2Var, lfVar, daVar, wy0Var, ieVar, null), this);
                hq0 hq0Var = hq0.c;
                if (objL != hq0Var) {
                    objL = w84Var;
                }
                if (objL == hq0Var) {
                    return hq0Var;
                }
            } catch (CancellationException e) {
                cancellationException = e;
                gq0Var = gq0Var2;
                jyVar = bz0Var.o;
                if (jyVar != null) {
                    jyVar.i(by0.a);
                }
                if (!yo4.F(gq0Var)) {
                    throw cancellationException;
                }
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gq0Var = (gq0) this.d;
            try {
                g13.O(obj);
            } catch (CancellationException e2) {
                cancellationException = e2;
                jyVar = bz0Var.o;
                if (jyVar != null) {
                    jyVar.i(by0.a);
                }
                if (!yo4.F(gq0Var)) {
                    throw cancellationException;
                }
            }
        }
        return w84Var;
    }
}
