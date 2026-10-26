package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ef2 extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef2(long j, je1 je1Var, boolean z, int i) {
        super(2);
        this.c = j;
        this.d = je1Var;
        this.h = z;
        this.l = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hf2.m208x3ca40b1c(this.c, this.d, this.h, (ck0) obj, sf3.V(this.l | 1));
        return w84.a;
    }
}
