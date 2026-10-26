package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s84 extends mq3 implements pe1 {
    public int c;
    public /* synthetic */ Throwable d;
    public /* synthetic */ long h;

    @Override // defpackage.pe1
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        s84 s84Var = new s84(4, (so0) obj4);
        s84Var.d = (Throwable) obj2;
        s84Var.h = jLongValue;
        return s84Var.invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            g13.O(obj);
            Throwable th = this.d;
            long j = this.h;
            v72.f().e(t84.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, t84.b);
            this.c = 1;
            Object objU = p23.u(jMin, this);
            hq0 hq0Var = hq0.c;
            if (objU == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return Boolean.TRUE;
    }
}
