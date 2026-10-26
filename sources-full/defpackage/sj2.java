package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sj2 extends ww1 implements ne1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj2(boolean z, je1 je1Var, je1 je1Var2, long j, int i) {
        super(2);
        this.c = z;
        this.d = je1Var;
        this.h = je1Var2;
        this.l = j;
        this.m = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        uj2.m1826xa4f58eab(this.c, this.d, this.h, this.l, (ck0) obj, sf3.V(this.m | 1));
        return w84.a;
    }
}
