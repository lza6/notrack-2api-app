package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sl4 extends ul4 {
    public final transient int h;
    public final transient int l;
    public final /* synthetic */ ul4 m;

    public sl4(ul4 ul4Var, int i, int i2) {
        this.m = ul4Var;
        this.h = i;
        this.l = i2;
    }

    @Override // defpackage.ll4
    public final Object[] b() {
        return this.m.b();
    }

    @Override // defpackage.ll4
    public final int d() {
        return this.m.d() + this.h;
    }

    @Override // defpackage.ll4
    public final int g() {
        return this.m.d() + this.h + this.l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wd4.c(i, this.l);
        return this.m.get(i + this.h);
    }

    @Override // defpackage.ul4, java.util.List
    /* JADX INFO: renamed from: l */
    public final ul4 subList(int i, int i2) {
        wd4.d(i, i2, this.l);
        int i3 = this.h;
        return this.m.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }
}
