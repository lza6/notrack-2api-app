package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class je extends mq3 implements ne1 {
    public final /* synthetic */ int c = 1;
    public int d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(boolean z, long j, fh2 fh2Var, so0 so0Var) {
        super(2, so0Var);
        this.h = z;
        this.l = j;
        this.m = fh2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(boolean z, me meVar, long j, so0 so0Var) {
        super(2, so0Var);
        this.h = z;
        this.m = meVar;
        this.l = j;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                long j = this.l;
                return new je(this.h, (me) obj2, j, so0Var);
            default:
                return new je(this.h, this.l, (fh2) obj2, so0Var);
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
        return ((je) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.h;
        hq0 hq0Var = hq0.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                fk2 fk2Var = ((me) obj2).c;
                if (z) {
                    this.d = 2;
                    if (fk2Var.a(this.l, 0L, this) != hq0Var) {
                        return w84Var;
                    }
                } else {
                    this.d = 1;
                    if (fk2Var.a(0L, this.l, this) != hq0Var) {
                        return w84Var;
                    }
                }
                return hq0Var;
            default:
                fh2 fh2Var = (fh2) obj2;
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    ((ct2) fh2Var).h(0);
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g13.O(obj);
                }
                while (z) {
                    ((ct2) fh2Var).h((int) ((System.currentTimeMillis() - this.l) / 1000));
                    this.d = 1;
                    if (p23.u(500L, this) == hq0Var) {
                        return hq0Var;
                    }
                }
                return w84Var;
        }
    }
}
