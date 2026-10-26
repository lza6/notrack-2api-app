package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class iq2 extends d0 implements RandomAccess {
    public final lz[] c;
    public final int[] d;

    public iq2(lz[] lzVarArr, int[] iArr) {
        this.c = lzVarArr;
        this.d = iArr;
    }

    @Override // defpackage.t
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.t, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof lz) {
            return super.contains((lz) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.c[i];
    }

    @Override // defpackage.d0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof lz) {
            return super.indexOf((lz) obj);
        }
        return -1;
    }

    @Override // defpackage.d0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof lz) {
            return super.lastIndexOf((lz) obj);
        }
        return -1;
    }
}
