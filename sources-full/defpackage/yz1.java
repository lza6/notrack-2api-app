package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz1(int i, int i2, int i3) {
        super(0);
        this.c = i3;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        switch (this.c) {
            case 0:
                return new wz1(this.d, this.h);
            default:
                return new g22(this.d, this.h);
        }
    }
}
