package defpackage;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ IntConsumer d;
    public final /* synthetic */ int h;

    public /* synthetic */ sg(IntConsumer intConsumer, int i, int i2) {
        this.c = i2;
        this.d = intConsumer;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = this.h;
        IntConsumer intConsumer = this.d;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                intConsumer.accept(i2);
                break;
        }
    }
}
