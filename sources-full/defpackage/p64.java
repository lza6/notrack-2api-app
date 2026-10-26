package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p64 extends o64 {
    public final /* synthetic */ int l;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                int i = this.h;
                this.h = i + 2;
                Object[] objArr = this.c;
                return new s92(objArr[i], 0, objArr[i + 1]);
            case 1:
                int i2 = this.h;
                this.h = i2 + 2;
                return this.c[i2];
            default:
                int i3 = this.h;
                this.h = i3 + 2;
                return this.c[i3 + 1];
        }
    }
}
