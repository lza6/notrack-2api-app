package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class sh2 implements ListIterator, gu1 {
    public final /* synthetic */ int c;
    public final List d;
    public int h;

    public sh2(int i, int i2, List list) {
        this.c = i2;
        switch (i2) {
            case 1:
                this.d = list;
                this.h = i;
                break;
            default:
                this.d = list;
                this.h = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                int i2 = this.h + 1;
                this.h = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.h, obj);
                this.h++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                return this.h < list.size() - 1;
            default:
                return this.h < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.c) {
            case 0:
                return this.h >= 0;
            default:
                return this.h > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                int i2 = this.h + 1;
                this.h = i2;
                return list.get(i2);
            default:
                int i3 = this.h;
                this.h = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.c) {
            case 0:
                return this.h + 1;
            default:
                return this.h;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                int i2 = this.h;
                this.h = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.h - 1;
                this.h = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.c) {
            case 0:
                return this.h;
            default:
                return this.h - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                list.remove(this.h);
                this.h--;
                break;
            default:
                int i2 = this.h - 1;
                this.h = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                list.set(this.h, obj);
                break;
            default:
                list.set(this.h, obj);
                break;
        }
    }
}
