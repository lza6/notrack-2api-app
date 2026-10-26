package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kf2 extends ww1 implements ne1 {
    public final /* synthetic */ je1 c;
    public final /* synthetic */ if2 d;
    public final /* synthetic */ ue h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf2(je1 je1Var, if2 if2Var, ue ueVar, ne1 ne1Var, int i) {
        super(2);
        this.c = je1Var;
        this.d = if2Var;
        this.h = ueVar;
        this.l = ne1Var;
        this.m = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        mf2.ModalBottomSheetDialog(this.c, this.d, this.h, this.l, (ck0) obj, sf3.V(this.m | 1));
        return w84.a;
    }
}
