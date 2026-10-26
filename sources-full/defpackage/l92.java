package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l92 extends n92 implements Iterator, gu1 {
    public final /* synthetic */ int m;

    public l92(o92 o92Var, int i) {
        this.m = i;
        o92Var.getClass();
        this.l = o92Var;
        this.d = -1;
        this.h = o92Var.p;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                b();
                int i = this.c;
                o92 o92Var = (o92) this.l;
                if (i >= o92Var.n) {
                    m51.o();
                    return null;
                }
                this.c = i + 1;
                this.d = i;
                m92 m92Var = new m92(o92Var, i);
                e();
                return m92Var;
            case 1:
                b();
                int i2 = this.c;
                o92 o92Var2 = (o92) this.l;
                if (i2 >= o92Var2.n) {
                    m51.o();
                    return null;
                }
                this.c = i2 + 1;
                this.d = i2;
                Object obj = o92Var2.c[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.c;
                o92 o92Var3 = (o92) this.l;
                if (i3 >= o92Var3.n) {
                    m51.o();
                    return null;
                }
                this.c = i3 + 1;
                this.d = i3;
                Object[] objArr = o92Var3.d;
                objArr.getClass();
                Object obj2 = objArr[this.d];
                e();
                return obj2;
        }
    }
}
