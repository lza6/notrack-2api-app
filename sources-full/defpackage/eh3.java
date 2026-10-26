package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh3 extends ww1 implements je1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wu0 d;
    public final /* synthetic */ ih3 h;
    public final /* synthetic */ le1 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh3(boolean z, wu0 wu0Var, ih3 ih3Var, le1 le1Var, boolean z2) {
        super(0);
        this.c = z;
        this.d = wu0Var;
        this.h = ih3Var;
        this.l = le1Var;
        this.m = z2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        return new hh3(this.c, this.d, this.h, this.l, this.m);
    }
}
