package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq1 {
    public int[] a;
    public int b;

    public final int a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        m51.s("Index must be between 0 and size");
        return 0;
    }

    public final int b() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        j93.g("IntList is empty.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eq1) {
            eq1 eq1Var = (eq1) obj;
            int i = eq1Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = eq1Var.a;
                lq1 lq1VarX = py.X(0, i2);
                int i3 = lq1VarX.c;
                int i4 = lq1VarX.d;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
