package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n92 {
    public int c;
    public int d;
    public int h;
    public Object l;

    public n92() {
        if (sb3.d == null) {
            sb3.d = new sb3(10);
        }
    }

    public int a(int i) {
        if (i < this.h) {
            return ((ByteBuffer) this.l).getShort(this.d + i);
        }
        return 0;
    }

    public void b() {
        if (((o92) this.l).p != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.c;
            o92 o92Var = (o92) this.l;
            if (i >= o92Var.n || o92Var.h[i] >= 0) {
                return;
            } else {
                this.c = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.d) {
            d(view, obj);
            return;
        }
        c1 c1Var = null;
        if (Build.VERSION.SDK_INT >= this.d) {
            tag = c(view);
        } else {
            tag = view.getTag(this.c);
            if (!((Class) this.l).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = zc4.c(view);
            if (accessibilityDelegateC != null) {
                c1Var = accessibilityDelegateC instanceof b1 ? ((b1) accessibilityDelegateC).a : new c1(accessibilityDelegateC);
            }
            if (c1Var == null) {
                c1Var = new c1();
            }
            zc4.h(view, c1Var);
            view.setTag(this.c, obj);
            zc4.e(view, this.h);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.c < ((o92) this.l).n;
    }

    public void remove() {
        o92 o92Var = (o92) this.l;
        b();
        if (this.d == -1) {
            u41.r("Call next() before removing element from the iterator.");
            return;
        }
        o92Var.c();
        o92Var.k(this.d);
        this.d = -1;
        this.h = o92Var.p;
    }
}
