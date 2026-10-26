package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class x20 extends y20 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(x20.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final w20 l;
    public final boolean m;

    public /* synthetic */ x20(w20 w20Var, boolean z) {
        this(w20Var, z, x21.c, -3, fy.c);
    }

    public x20(w20 w20Var, boolean z, xp0 xp0Var, int i, fy fyVar) {
        super(xp0Var, i, fyVar);
        this.l = w20Var;
        this.m = z;
    }

    @Override // defpackage.y20, defpackage.k81
    public final Object a(l81 l81Var, so0 so0Var) throws Throwable {
        int i = this.d;
        hq0 hq0Var = hq0.c;
        if (i == -3) {
            boolean z = this.m;
            if (z && n.getAndSet(this, 1) == 1) {
                u41.r("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objU = gm4.u(l81Var, this.l, z, so0Var);
            if (objU == hq0Var) {
                return objU;
            }
        } else {
            Object objA = super.a(l81Var, so0Var);
            if (objA == hq0Var) {
                return objA;
            }
        }
        return w84.a;
    }

    @Override // defpackage.y20
    public final String d() {
        return "channel=" + this.l;
    }

    @Override // defpackage.y20
    public final Object e(wz2 wz2Var, so0 so0Var) throws Throwable {
        Object objU = gm4.u(new of3(wz2Var), this.l, this.m, so0Var);
        return objU == hq0.c ? objU : w84.a;
    }

    @Override // defpackage.y20
    public final y20 g(xp0 xp0Var, int i, fy fyVar) {
        return new x20(this.l, this.m, xp0Var, i, fyVar);
    }

    @Override // defpackage.y20
    public final k81 h() {
        return new x20(this.l, this.m);
    }

    @Override // defpackage.y20
    public final w20 i(gq0 gq0Var) {
        if (!this.m || n.getAndSet(this, 1) != 1) {
            return this.d == -3 ? this.l : super.i(gq0Var);
        }
        u41.r("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }
}
