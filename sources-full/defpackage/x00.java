package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x00 implements vp0, wp0 {
    public static final bg1 d = new bg1(27);
    public static final x00 h = new x00(1);
    public final /* synthetic */ int c;

    public /* synthetic */ x00(int i) {
        this.c = i;
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        switch (this.c) {
            case 0:
                break;
        }
        return ne1Var.invoke(obj, this);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        switch (this.c) {
            case 0:
                break;
        }
        return y64.w(this, wp0Var);
    }

    @Override // defpackage.vp0
    public final wp0 getKey() {
        switch (this.c) {
            case 0:
                return d;
            default:
                return this;
        }
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        switch (this.c) {
            case 0:
                break;
        }
        return y64.H(this, wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        switch (this.c) {
            case 0:
                break;
        }
        return y64.I(this, xp0Var);
    }
}
