package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ru0 implements Iterator, gu1 {
    public final /* synthetic */ int c;
    public int d;
    public int h;
    public int l;
    public Object m;
    public final /* synthetic */ Object n;

    public ru0(su0 su0Var) {
        this.c = 0;
        this.n = su0Var;
        this.d = -1;
        int iX = py.x(0, 0, ((CharSequence) su0Var.b).length());
        this.h = iX;
        this.l = iX;
    }

    public ru0(u63 u63Var) {
        this.c = 1;
        this.n = u63Var;
        this.h = u63Var.l;
        this.l = u63Var.h;
    }

    public void a() {
        su0 su0Var = (su0) this.n;
        CharSequence charSequence = (CharSequence) su0Var.b;
        int i = this.l;
        if (i < 0) {
            this.d = 0;
            this.m = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.h;
            charSequence.getClass();
            this.m = new lq1(i2, charSequence.length() - 1, 1);
            this.l = -1;
        } else {
            ps2 ps2Var = (ps2) ((ne1) su0Var.c).invoke(charSequence, Integer.valueOf(this.l));
            if (ps2Var == null) {
                int i3 = this.h;
                charSequence.getClass();
                this.m = new lq1(i3, charSequence.length() - 1, 1);
                this.l = -1;
            } else {
                int iIntValue = ((Number) ps2Var.c).intValue();
                int iIntValue2 = ((Number) ps2Var.d).intValue();
                this.m = py.X(this.h, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.h = i4;
                this.l = i4 + (iIntValue2 == 0 ? 1 : 0);
            }
        }
        this.d = 1;
    }

    public boolean b() {
        this.d = 3;
        int i = this.h;
        if (i == 0) {
            this.d = 2;
        } else {
            u63 u63Var = (u63) this.n;
            Object[] objArr = u63Var.c;
            int i2 = this.l;
            this.m = objArr[i2];
            this.d = 1;
            this.l = (i2 + 1) % u63Var.d;
            this.h = i - 1;
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                if (this.d == -1) {
                    a();
                }
                return this.d == 1;
            default:
                int i = this.d;
                if (i == 0) {
                    return b();
                }
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    u41.k("hasNext called when the iterator is in the FAILED state.");
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                if (this.d == -1) {
                    a();
                }
                if (this.d == 0) {
                    m51.o();
                    return null;
                }
                lq1 lq1Var = (lq1) this.m;
                lq1Var.getClass();
                this.m = null;
                this.d = -1;
                return lq1Var;
            default:
                int i = this.d;
                if (i == 1) {
                    this.d = 0;
                    return this.m;
                }
                if (i == 2 || !b()) {
                    m51.o();
                    return null;
                }
                this.d = 0;
                return this.m;
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
