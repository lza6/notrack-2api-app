package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc3 extends mq3 implements ne1 {
    public long c;
    public int d;
    public /* synthetic */ long h;
    public final /* synthetic */ oc3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc3(oc3 oc3Var, so0 so0Var) {
        super(2, so0Var);
        this.l = oc3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        nc3 nc3Var = new nc3(this.l, so0Var);
        nc3Var.h = ((dc4) obj).a;
        return nc3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        long j = ((dc4) obj).a;
        nc3 nc3Var = new nc3(this.l, (so0) obj2);
        nc3Var.h = j;
        return nc3Var.invokeSuspend(w84.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.d;
        oc3 oc3Var = this.l;
        hq0 hq0Var = hq0.c;
        if (i == 0) {
            g13.O(obj);
            j = this.h;
            fk2 fk2Var = oc3Var.f;
            this.h = j;
            this.d = 1;
            obj = fk2Var.b(j, this);
            if (obj != hq0Var) {
            }
            return hq0Var;
        }
        if (i == 1) {
            j = this.h;
            g13.O(obj);
        } else {
            if (i == 2) {
                j2 = this.c;
                j = this.h;
                g13.O(obj);
                j3 = ((dc4) obj).a;
                fk2 fk2Var2 = oc3Var.f;
                long jD = dc4.d(j2, j3);
                this.h = j;
                this.c = j3;
                this.d = 3;
                obj = fk2Var2.a(jD, j3, this);
                if (obj != hq0Var) {
                    j4 = j;
                    j5 = j3;
                }
                return hq0Var;
            }
            if (i != 3) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.c;
            j4 = this.h;
            g13.O(obj);
        }
        return new dc4(dc4.d(j4, dc4.d(j5, ((dc4) obj).a)));
        long jD2 = dc4.d(j, ((dc4) obj).a);
        this.h = j;
        this.c = jD2;
        this.d = 2;
        obj = oc3Var.b(jD2, this);
        if (obj != hq0Var) {
            j2 = jD2;
            j3 = ((dc4) obj).a;
            fk2 fk2Var3 = oc3Var.f;
            long jD3 = dc4.d(j2, j3);
            this.h = j;
            this.c = j3;
            this.d = 3;
            obj = fk2Var3.a(jD3, j3, this);
            if (obj != hq0Var) {
                j4 = j;
                j5 = j3;
                return new dc4(dc4.d(j4, dc4.d(j5, ((dc4) obj).a)));
            }
        }
        return hq0Var;
    }
}
