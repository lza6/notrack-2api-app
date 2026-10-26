package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ le1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf1(le1 le1Var, le1 le1Var2, int i) {
        super(1);
        this.c = i;
        this.d = le1Var;
        this.h = le1Var2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        long j;
        switch (this.c) {
            case 0:
                uk3 uk3Var = (uk3) obj;
                synchronized (vk3.b) {
                    j = vk3.d;
                    vk3.d = 1 + j;
                }
                return new li2(j, uk3Var, this.d, this.h);
            case 1:
                this.d.invoke(obj);
                this.h.invoke(obj);
                return w84.a;
            default:
                this.d.invoke(obj);
                this.h.invoke(obj);
                return w84.a;
        }
    }
}
