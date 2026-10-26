package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dl implements gl {
    public final /* synthetic */ int c;

    @Override // defpackage.gl
    public final void k(wu0 wu0Var, int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        switch (this.c) {
            case 0:
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                break;
            default:
                int length2 = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i8] = i9;
                    i9 += i10;
                    i2++;
                    i8++;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
