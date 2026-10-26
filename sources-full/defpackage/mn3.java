package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mn3 implements ln3 {
    public final cn c = new cn(0);

    public final boolean c(int i) {
        return (this.c.get() & i) != 0;
    }

    public final void e(int i) {
        cn cnVar;
        int i2;
        do {
            cnVar = this.c;
            i2 = cnVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!cnVar.compareAndSet(i2, i2 | i));
    }
}
