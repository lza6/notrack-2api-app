package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh3 extends ww1 implements le1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wu0 d;
    public final /* synthetic */ le1 h;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh3(boolean z, wu0 wu0Var, le1 le1Var, boolean z2) {
        super(1);
        this.c = z;
        this.d = wu0Var;
        this.h = le1Var;
        this.l = z2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        le1 le1Var = this.h;
        boolean z = this.l;
        return new hh3(this.c, this.d, (ih3) obj, le1Var, z);
    }
}
