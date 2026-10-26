package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class kz extends mz {
    public final byte[] l;

    public kz(byte[] bArr) {
        this.c = 0;
        bArr.getClass();
        this.l = bArr;
    }

    @Override // defpackage.mz
    public byte b(int i) {
        return this.l[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mz) || size() != ((mz) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return obj.equals(this);
        }
        kz kzVar = (kz) obj;
        int i = this.c;
        int i2 = kzVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > kzVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > kzVar.size()) {
            StringBuilder sbS = ud2.s("Ran off end of other: 0, ", ", ", size);
            sbS.append(kzVar.size());
            throw new IllegalArgumentException(sbS.toString());
        }
        byte[] bArr = kzVar.l;
        int iL = l() + size;
        int iL2 = l();
        int iL3 = kzVar.l();
        while (iL2 < iL) {
            if (this.l[iL2] != bArr[iL3]) {
                return false;
            }
            iL2++;
            iL3++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hz(this);
    }

    @Override // defpackage.mz
    public void j(int i, byte[] bArr) {
        System.arraycopy(this.l, 0, bArr, 0, i);
    }

    public int l() {
        return 0;
    }

    public byte m(int i) {
        return this.l[i];
    }

    @Override // defpackage.mz
    public int size() {
        return this.l.length;
    }
}
