package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class md extends ww1 implements le1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(long j, je1 je1Var, boolean z) {
        super(1);
        this.c = j;
        this.d = je1Var;
        this.h = z;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        rz rzVar = (rz) obj;
        return rzVar.a(new ld(0, this.d, od.a(rzVar, Float.intBitsToFloat((int) (rzVar.c.b() >> 32)) / 2.0f), new jv(this.c, 5), this.h));
    }
}
