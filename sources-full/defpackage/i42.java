package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i42 implements Iterator, gu1 {
    public final CharSequence c;
    public int d;
    public int h;
    public int l;
    public int m;

    public i42(CharSequence charSequence) {
        charSequence.getClass();
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.d;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.m < 0) {
            this.d = 2;
            return false;
        }
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.h; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.d = 1;
                this.m = i;
                this.l = length;
                return true;
            }
        }
        i = -1;
        this.d = 1;
        this.m = i;
        this.l = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            m51.o();
            return null;
        }
        this.d = 0;
        int i = this.l;
        int i2 = this.h;
        this.h = this.m + i;
        return this.c.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
