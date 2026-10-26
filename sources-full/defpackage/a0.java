package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements Iterator, gu1 {
    public final /* synthetic */ int c;
    public int d;
    public final Object h;

    public /* synthetic */ a0(int i, Object obj) {
        this.c = i;
        this.h = obj;
    }

    public a0(Object[] objArr) {
        this.c = 1;
        objArr.getClass();
        this.h = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        Object obj = this.h;
        switch (i) {
            case 0:
                return this.d < ((d0) obj).b();
            case 1:
                return this.d < ((Object[]) obj).length;
            case 2:
                return this.d < ((byte[]) obj).length;
            case 3:
                return this.d < ((int[]) obj).length;
            case 4:
                return this.d < ((long[]) obj).length;
            default:
                return this.d < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    m51.o();
                    return null;
                }
                int i2 = this.d;
                this.d = i2 + 1;
                return ((d0) obj).get(i2);
            case 1:
                try {
                    int i3 = this.d;
                    this.d = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.d--;
                    j93.g(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.d;
                byte[] bArr = (byte[]) obj;
                if (i4 < bArr.length) {
                    this.d = i4 + 1;
                    return new r74(bArr[i4]);
                }
                j93.g(String.valueOf(i4));
                return null;
            case 3:
                int i5 = this.d;
                int[] iArr = (int[]) obj;
                if (i5 < iArr.length) {
                    this.d = i5 + 1;
                    return new w74(iArr[i5]);
                }
                j93.g(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.d;
                long[] jArr = (long[]) obj;
                if (i6 < jArr.length) {
                    this.d = i6 + 1;
                    return new b84(jArr[i6]);
                }
                j93.g(String.valueOf(i6));
                return null;
            default:
                int i7 = this.d;
                short[] sArr = (short[]) obj;
                if (i7 < sArr.length) {
                    this.d = i7 + 1;
                    return new h84(sArr[i7]);
                }
                j93.g(String.valueOf(i7));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
