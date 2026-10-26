package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gf1 implements Iterator, gu1 {
    public final /* synthetic */ int c;
    public int d;
    public Object h;
    public final Object l;

    public gf1(Object obj, Map map) {
        this.c = 3;
        this.h = obj;
        this.l = map;
    }

    public gf1(ji2 ji2Var) {
        this.c = 2;
        this.l = ji2Var;
        this.d = -1;
        this.h = sf3.M(new ii2(ji2Var, this, null));
    }

    public gf1(su0 su0Var) {
        this.c = 0;
        this.l = su0Var;
        this.d = -2;
    }

    public gf1(yh2 yh2Var) {
        this.c = 1;
        this.l = yh2Var;
        this.d = -1;
        this.h = sf3.M(new xh2(yh2Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.d;
        su0 su0Var = (su0) this.l;
        if (i == -2) {
            objInvoke = ((je1) su0Var.b).invoke();
        } else {
            le1 le1Var = (le1) su0Var.c;
            Object obj = this.h;
            obj.getClass();
            objInvoke = le1Var.invoke(obj);
        }
        this.h = objInvoke;
        this.d = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                if (this.d < 0) {
                    a();
                }
                return this.d == 1;
            case 1:
                return ((qf3) this.h).hasNext();
            case 2:
                return ((qf3) this.h).hasNext();
            default:
                return this.d < ((Map) this.l).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.c) {
            case 0:
                if (this.d < 0) {
                    a();
                }
                if (this.d == 0) {
                    m51.o();
                    return null;
                }
                Object obj2 = this.h;
                obj2.getClass();
                this.d = -1;
                return obj2;
            case 1:
                return ((qf3) this.h).next();
            case 2:
                return ((qf3) this.h).next();
            default:
                if (hasNext()) {
                    obj = this.h;
                    this.d++;
                    Object obj3 = ((Map) this.l).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.h = ((w42) obj3).b;
                } else {
                    m51.o();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        Object obj = this.l;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.d;
                if (i2 != -1) {
                    ((yh2) obj).d.h(i2);
                    this.d = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.d;
                if (i3 != -1) {
                    ((ji2) obj).d.m(i3);
                    this.d = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
