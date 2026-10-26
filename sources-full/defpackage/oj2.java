package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oj2 extends ww1 implements je1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h01 d;
    public final /* synthetic */ gq0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj2(boolean z, h01 h01Var, gq0 gq0Var) {
        super(0);
        this.c = z;
        this.d = h01Var;
        this.h = gq0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        if (this.c) {
            h01 h01Var = this.d;
            if (((Boolean) ((le1) h01Var.a.d).invoke(i01.c)).booleanValue()) {
                py.F(this.h, null, null, new da0(h01Var, null, 6), 3);
            }
        }
        return w84.a;
    }
}
