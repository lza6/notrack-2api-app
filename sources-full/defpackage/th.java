package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float h;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th(float f, float f2, float f3, int i) {
        super(0);
        this.c = i;
        this.d = f;
        this.h = f2;
        this.l = f3;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        switch (this.c) {
            case 0:
                return new lw(this.d, this.h, this.l);
            default:
                return new w44(this.d, this.h, this.l);
        }
    }
}
