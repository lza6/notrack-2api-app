package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb3 extends ww1 implements je1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb3(int i) {
        super(0);
        this.c = i;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        return new rb3(this.c);
    }
}
