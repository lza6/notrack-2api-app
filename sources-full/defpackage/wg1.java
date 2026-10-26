package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wg1 implements Iterator, gu1 {
    public final /* synthetic */ int c = 0;
    public final yj3 d;
    public final int h;
    public int l;
    public int m;

    public wg1(yj3 yj3Var, int i, int i2) {
        this.d = yj3Var;
        this.h = i2;
        this.l = i;
        this.m = yj3Var.p;
        if (yj3Var.o) {
            ak3.e();
        }
    }

    public wg1(yj3 yj3Var, int i, xg1 xg1Var, kr1 kr1Var) {
        this.d = yj3Var;
        this.h = i;
        this.l = yj3Var.p;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                return this.l < this.h;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                yj3 yj3Var = this.d;
                int i = yj3Var.p;
                int i2 = this.m;
                if (i != i2) {
                    ak3.e();
                }
                int i3 = this.l;
                this.l = yj3Var.c[(i3 * 5) + 3] + i3;
                return new zj3(yj3Var, i3, i2);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
