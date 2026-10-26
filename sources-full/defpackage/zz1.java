package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zz1 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz1(Object obj, int i, int i2, int i3) {
        super(0);
        this.c = i3;
        this.d = i;
        this.h = i2;
        this.l = obj;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        switch (this.c) {
            case 0:
                return new wz1(this.d, this.h, (mz1) this.l);
            default:
                return new g22(this.d, this.h, (b22) this.l);
        }
    }
}
