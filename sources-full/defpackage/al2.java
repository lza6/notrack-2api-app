package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class al2 extends vr {
    public final int b;

    static {
        v72.h("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al2(im0 im0Var) {
        super(im0Var);
        im0Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.fm0
    public final boolean a(hi4 hi4Var) {
        hi4Var.getClass();
        return hi4Var.j.a == 4;
    }

    @Override // defpackage.vr
    public final int d() {
        return this.b;
    }

    @Override // defpackage.vr
    public final boolean e(Object obj) {
        hl2 hl2Var = (hl2) obj;
        hl2Var.getClass();
        return (hl2Var.a && hl2Var.d) ? false : true;
    }
}
