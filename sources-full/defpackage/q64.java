package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q64 extends o64 {
    public final yu2 l;

    public q64(yu2 yu2Var) {
        this.l = yu2Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.h;
        this.h = i + 2;
        Object[] objArr = this.c;
        return new nh2(this.l, objArr[i], objArr[i + 1]);
    }
}
