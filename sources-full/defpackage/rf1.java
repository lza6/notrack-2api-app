package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rf1 extends li2 {
    @Override // defpackage.li2
    public final li2 C(le1 le1Var, le1 le1Var2) {
        return (li2) ((pk3) vk3.f(new f01(new qf1(le1Var, le1Var2, 0), 8)));
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void c() {
        synchronized (vk3.b) {
            o();
        }
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void k() {
        jr1.P();
        throw null;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void l() {
        jr1.P();
        throw null;
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void m() {
        vk3.a();
    }

    @Override // defpackage.li2, defpackage.pk3
    public final pk3 u(le1 le1Var) {
        return (r23) ((pk3) vk3.f(new f01(new f01(le1Var, 4), 8)));
    }

    @Override // defpackage.li2
    public final xr0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
