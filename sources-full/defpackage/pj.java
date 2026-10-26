package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pj extends sc1 {
    public final /* synthetic */ wj r;
    public final /* synthetic */ zj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(zj zjVar, zj zjVar2, wj wjVar) {
        super(zjVar2);
        this.s = zjVar;
        this.r = wjVar;
    }

    @Override // defpackage.sc1
    public final mh3 b() {
        return this.r;
    }

    @Override // defpackage.sc1
    public final boolean c() {
        zj zjVar = this.s;
        if (zjVar.getInternalPopup().a()) {
            return true;
        }
        zjVar.n.l(zjVar.getTextDirection(), zjVar.getTextAlignment());
        return true;
    }
}
