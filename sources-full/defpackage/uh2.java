package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class uh2 implements List, hu1 {
    public final /* synthetic */ int c;
    public final List d;
    public final int h;
    public int l;

    public /* synthetic */ uh2(List list, int i, int i2, int i3) {
        this.c = i3;
        this.d = list;
        this.h = i;
        this.l = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        int i3 = this.h;
        List list = this.d;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.l++;
                break;
            default:
                list.add(i + i3, obj);
                this.l++;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                int i2 = this.l;
                this.l = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.l;
                this.l = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        int i3 = this.h;
        List list = this.d;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.l = collection.size() + this.l;
                return collection.size() > 0;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.l += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.c;
        List list = this.d;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.l, collection);
                this.l = collection.size() + this.l;
                return collection.size() > 0;
            default:
                list.addAll(this.l, collection);
                int size = collection.size();
                this.l += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.c;
        List list = this.d;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.l - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.l = i2;
                break;
            default:
                int i4 = this.l - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.l = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.c;
        List list = this.d;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.l;
                while (i2 < i3) {
                    if (kr1.n(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.l;
                while (i2 < i4) {
                    if (kr1.n(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        int i3 = this.h;
        List list = this.d;
        switch (i2) {
            case 0:
                en2.a(i, this);
                break;
            default:
                pi2.a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.c;
        List list = this.d;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.l;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (kr1.n(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.l;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (kr1.n(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.c) {
            case 0:
                return this.l == this.h;
            default:
                return this.l == this.h;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                return new sh2(0, 0, this);
            default:
                return new sh2(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.c;
        List list = this.d;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.l - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!kr1.n(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.l - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!kr1.n(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.c) {
            case 0:
                return new sh2(0, 0, this);
            default:
                return new sh2(0, 1, this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.c) {
            case 0:
                return new sh2(i, 0, this);
            default:
                return new sh2(i, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.c;
        int i3 = this.h;
        List list = this.d;
        switch (i2) {
            case 0:
                en2.a(i, this);
                Object objRemove = list.remove(i + i3);
                this.l--;
                return objRemove;
            default:
                pi2.a(i, this);
                Object objRemove2 = list.remove(i + i3);
                this.l--;
                return objRemove2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.c;
        int i2 = this.h;
        List list = this.d;
        switch (i) {
            case 0:
                int i3 = this.l;
                while (i2 < i3) {
                    if (kr1.n(list.get(i2), obj)) {
                        list.remove(i2);
                        this.l--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.l;
                while (i2 < i4) {
                    if (kr1.n(list.get(i2), obj)) {
                        list.remove(i2);
                        this.l--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                int i = this.l;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.l;
            default:
                int i2 = this.l;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.l;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.c;
        int i2 = this.h;
        List list = this.d;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.l;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.l--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                return i3 != this.l;
            default:
                int i5 = this.l;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.l--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                return i5 != this.l;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        int i3 = this.h;
        List list = this.d;
        switch (i2) {
            case 0:
                en2.a(i, this);
                break;
            default:
                pi2.a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.c) {
            case 0:
                i = this.l;
                i2 = this.h;
                break;
            default:
                i = this.l;
                i2 = this.h;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.c) {
            case 0:
                en2.b(i, i2, this);
                return new uh2(this, i, i2, 0);
            default:
                pi2.b(i, i2, this);
                return new uh2(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.c) {
            case 0:
                break;
        }
        return yh4.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.c) {
            case 0:
                objArr.getClass();
                break;
        }
        return yh4.b0(this, objArr);
    }
}
