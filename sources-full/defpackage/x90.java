package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x90 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(int i, g22 g22Var, gn3 gn3Var, mi2 mi2Var, so0 so0Var) {
        super(2, so0Var);
        this.h = i;
        this.l = g22Var;
        this.m = gn3Var;
        this.n = mi2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(k81[] k81VarArr, int i, AtomicInteger atomicInteger, jy jyVar, so0 so0Var) {
        super(2, so0Var);
        this.l = k81VarArr;
        this.h = i;
        this.m = atomicInteger;
        this.n = jyVar;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                return new x90(this.h, (g22) obj4, (gn3) obj3, (mi2) obj2, so0Var);
            default:
                return new x90((k81[]) obj4, this.h, (AtomicInteger) obj3, (jy) obj2, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((x90) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        Object obj2 = this.l;
        hq0 hq0Var = hq0.c;
        Object obj3 = this.n;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    if (i2 <= 0 || ((xa0) ((gn3) obj4).getValue()).a.isEmpty()) {
                        return w84Var;
                    }
                    this.d = 1;
                    if (wa0.v1((g22) obj2, true, new lg(18), this) == hq0Var) {
                        return hq0Var;
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                ((mi2) obj3).setValue(Boolean.TRUE);
                return w84Var;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                jy jyVar = (jy) obj3;
                int i4 = this.d;
                try {
                    if (i4 == 0) {
                        g13.O(obj);
                        k81 k81Var = ((k81[]) obj2)[i2];
                        of0 of0Var = new of0(jyVar, i2);
                        this.d = 1;
                        if (k81Var.a(of0Var, this) == hq0Var) {
                            return hq0Var;
                        }
                    } else {
                        if (i4 != 1) {
                            u41.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g13.O(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return w84Var;
                    }
                    jyVar.g(null);
                    return w84Var;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        jyVar.g(null);
                    }
                    throw th;
                }
        }
    }
}
