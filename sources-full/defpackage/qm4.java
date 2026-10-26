package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qm4 extends xm4 {
    public final transient int h;
    public final transient int l;
    public final /* synthetic */ xm4 m;

    public qm4(xm4 xm4Var, int i, int i2) {
        this.m = xm4Var;
        this.h = i;
        this.l = i2;
    }

    @Override // defpackage.nm4
    public final int d() {
        return this.m.g() + this.h + this.l;
    }

    @Override // defpackage.nm4
    public final int g() {
        return this.m.g() + this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vd4.b(i, this.l);
        return this.m.get(i + this.h);
    }

    @Override // defpackage.nm4
    public final boolean k() {
        return true;
    }

    @Override // defpackage.nm4
    public final Object[] l() {
        return this.m.l();
    }

    @Override // defpackage.xm4, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final xm4 subList(int i, int i2) {
        vd4.e(i, i2, this.l);
        int i3 = this.h;
        return this.m.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }
}
