package defpackage;

import androidx.compose.ui.Alignment$Companion;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t01 implements tx2 {
    public final long a;
    public final wu0 b;
    public final int c;
    public final ea d;
    public final i8 e;
    public final i8 f;
    public final sf4 g;
    public final sf4 h;
    public final j8 i;
    public final j8 j;
    public final j8 k;
    public final tf4 l;
    public final tf4 m;

    public t01(long j, wu0 wu0Var, ea eaVar) {
        int iO = wu0Var.O(48.0f);
        this.a = j;
        this.b = wu0Var;
        this.c = iO;
        this.d = eaVar;
        int iO2 = wu0Var.O(Float.intBitsToFloat((int) (j >> 32)));
        this.e = new i8(Alignment$Companion.getStart(), Alignment$Companion.getStart(), iO2);
        this.f = new i8(Alignment$Companion.getEnd(), Alignment$Companion.getEnd(), iO2);
        this.g = new sf4(vl0.c);
        this.h = new sf4(vl0.d);
        int iO3 = wu0Var.O(Float.intBitsToFloat((int) (j & 4294967295L)));
        this.i = new j8(Alignment$Companion.getTop(), Alignment$Companion.getBottom(), iO3);
        this.j = new j8(Alignment$Companion.getBottom(), Alignment$Companion.getTop(), iO3);
        this.k = new j8(Alignment$Companion.getCenterVertically(), Alignment$Companion.getTop(), iO3);
        this.l = new tf4(Alignment$Companion.getTop(), iO);
        this.m = new tf4(Alignment$Companion.getBottom(), iO);
    }

    @Override // defpackage.tx2
    public final long a(mq1 mq1Var, long j, dx1 dx1Var, long j2) {
        mq1 mq1Var2;
        long j3;
        int iA;
        char c;
        int i;
        int i2 = (int) (j >> 32);
        int i3 = 0;
        List listU = kr1.U(this.e, this.f, ((int) (mq1Var.a() >> 32)) < i2 / 2 ? this.g : this.h);
        int size = listU.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                mq1Var2 = mq1Var;
                j3 = j;
                iA = 0;
                break;
            }
            int i5 = (int) (j2 >> 32);
            mq1Var2 = mq1Var;
            j3 = j;
            iA = ((kd2) listU.get(i4)).a(mq1Var2, j3, i5, dx1Var);
            if (i4 == listU.size() - 1 || (iA >= 0 && i5 + iA <= i2)) {
                break;
            }
            i4++;
        }
        char c2 = ' ';
        int i6 = (int) (j3 & 4294967295L);
        List listU2 = kr1.U(this.i, this.j, this.k, ((int) (mq1Var2.a() & 4294967295L)) < i6 / 2 ? this.l : this.m);
        int size2 = listU2.size();
        int i7 = 0;
        while (i7 < size2) {
            c = c2;
            int i8 = i6;
            int i9 = (int) (j2 & 4294967295L);
            int iA2 = ((ld2) listU2.get(i7)).a(mq1Var2, j3, i9);
            if (i7 == listU2.size() - 1 || (iA2 >= (i = this.c) && i9 + iA2 <= i8 - i)) {
                i3 = iA2;
                long j4 = (((long) iA) << c) | (((long) i3) & 4294967295L);
                int i10 = (int) (j4 >> c);
                int i11 = (int) (j4 & 4294967295L);
                this.d.invoke(mq1Var2, new mq1(i10, i11, ((int) (j2 >> c)) + i10, ((int) (j2 & 4294967295L)) + i11));
                return j4;
            }
            i7++;
            c2 = c;
            i6 = i8;
        }
        c = c2;
        long j5 = (((long) iA) << c) | (((long) i3) & 4294967295L);
        int i12 = (int) (j5 >> c);
        int i13 = (int) (j5 & 4294967295L);
        this.d.invoke(mq1Var2, new mq1(i12, i13, ((int) (j2 >> c)) + i12, ((int) (j2 & 4294967295L)) + i13));
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t01)) {
            return false;
        }
        t01 t01Var = (t01) obj;
        return this.a == t01Var.a && kr1.n(this.b, t01Var.b) && this.c == t01Var.c && kr1.n(this.d, t01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fq2.e(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) tx0.a(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
