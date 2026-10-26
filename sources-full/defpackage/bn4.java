package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn4 extends xl4 {
    public final Object d;
    public boolean h;

    public bn4(Object obj) {
        super(1);
        this.d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.h) {
            m51.o();
            return null;
        }
        this.h = true;
        return this.d;
    }
}
