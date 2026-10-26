package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jd extends ww1 implements le1 {
    public final /* synthetic */ pn2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(pn2 pn2Var, boolean z, boolean z2) {
        super(1);
        this.c = pn2Var;
        this.d = z;
        this.h = z2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        gf3 gf3Var = (gf3) obj;
        long jA = this.c.a();
        ((ue3) gf3Var).j(ee3.a, new de3(this.d ? ah1.d : ah1.h, jA, this.h ? ce3.c : ce3.h, (9223372034707292159L & jA) != 9205357640488583168L));
        return w84.a;
    }
}
