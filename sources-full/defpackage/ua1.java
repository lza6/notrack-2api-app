package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ua1 extends ww1 implements le1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua1(int i) {
        super(1);
        this.c = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((db1) obj).z0(this.c));
    }
}
