package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gn1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn1(int i, int i2, int i3) {
        super(1);
        this.c = i3;
        this.d = i;
        this.h = i2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf A[SYNTHETIC] */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int length;
        int i;
        long j;
        jt2 jt2Var;
        char cCharAt;
        int i2 = this.c;
        w84 w84Var = w84.a;
        int i3 = this.h;
        int i4 = this.d;
        switch (i2) {
            case 0:
                zt3 zt3Var = (zt3) obj;
                if (i4 < 0 || i3 < 0) {
                    so1.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i3 + " respectively.");
                }
                long j2 = zt3Var.l;
                jt2 jt2Var2 = zt3Var.d;
                int i5 = jz3.c;
                int i6 = (int) (j2 & 4294967295L);
                int length2 = i6 + i3;
                if (((i6 ^ length2) & (i3 ^ length2)) < 0) {
                    length2 = jt2Var2.length();
                }
                xr0.e0(zt3Var, (int) (4294967295L & zt3Var.l), Math.min(length2, jt2Var2.length()));
                int i7 = (int) (zt3Var.l >> 32);
                int i8 = i7 - i4;
                if (((i4 ^ i7) & (i7 ^ i8)) < 0) {
                    i8 = 0;
                }
                xr0.e0(zt3Var, Math.max(0, i8), (int) (zt3Var.l >> 32));
                break;
            case 1:
                zt3 zt3Var2 = (zt3) obj;
                if (i4 < 0 || i3 < 0) {
                    so1.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i4 + " and " + i3 + " respectively.");
                }
                int i9 = 0;
                for (int i10 = 0; i10 < i4; i10++) {
                    int i11 = i9 + 1;
                    long j3 = zt3Var2.l;
                    jt2 jt2Var3 = zt3Var2.d;
                    int i12 = jz3.c;
                    int i13 = (int) (j3 >> 32);
                    if (i13 <= i11) {
                        i9 = i13;
                        length = 0;
                        for (int i14 = 0; i14 < i3; i14++) {
                            i = length + 1;
                            j = zt3Var2.l;
                            jt2Var = zt3Var2.d;
                            int i15 = jz3.c;
                            if (((int) (j & 4294967295L)) + i < jt2Var.length()) {
                                length = jt2Var.length() - ((int) (zt3Var2.l & 4294967295L));
                                long j4 = zt3Var2.l;
                                int i16 = jz3.c;
                                int i17 = (int) (j4 & 4294967295L);
                                xr0.e0(zt3Var2, i17, length + i17);
                                int i18 = (int) (zt3Var2.l >> 32);
                                xr0.e0(zt3Var2, i18 - i9, i18);
                            } else {
                                cCharAt = jt2Var.charAt((((int) (zt3Var2.l & 4294967295L)) + i) - 1);
                                char cCharAt2 = jt2Var.charAt(((int) (zt3Var2.l & 4294967295L)) + i);
                                if (Character.isHighSurrogate(cCharAt) || !Character.isLowSurrogate(cCharAt2)) {
                                    length = i;
                                } else {
                                    length += 2;
                                }
                            }
                            break;
                        }
                        long j5 = zt3Var2.l;
                        int i19 = jz3.c;
                        int i110 = (int) (j5 & 4294967295L);
                        xr0.e0(zt3Var2, i110, length + i110);
                        int i111 = (int) (zt3Var2.l >> 32);
                        xr0.e0(zt3Var2, i111 - i9, i111);
                    } else {
                        i9 = (Character.isHighSurrogate(jt2Var3.charAt((i13 - i11) + (-1))) && Character.isLowSurrogate(jt2Var3.charAt(((int) (zt3Var2.l >> 32)) - i11))) ? i9 + 2 : i11;
                    }
                    break;
                }
                length = 0;
                while (i14 < i3) {
                    i = length + 1;
                    j = zt3Var2.l;
                    jt2Var = zt3Var2.d;
                    int i112 = jz3.c;
                    if (((int) (j & 4294967295L)) + i < jt2Var.length()) {
                        length = jt2Var.length() - ((int) (zt3Var2.l & 4294967295L));
                        long j6 = zt3Var2.l;
                        int i113 = jz3.c;
                        int i114 = (int) (j6 & 4294967295L);
                        xr0.e0(zt3Var2, i114, length + i114);
                        int i115 = (int) (zt3Var2.l >> 32);
                        xr0.e0(zt3Var2, i115 - i9, i115);
                    } else {
                        cCharAt = jt2Var.charAt((((int) (zt3Var2.l & 4294967295L)) + i) - 1);
                        char cCharAt3 = jt2Var.charAt(((int) (zt3Var2.l & 4294967295L)) + i);
                        if (Character.isHighSurrogate(cCharAt)) {
                            length = i;
                        } else {
                            length = i;
                        }
                    }
                    break;
                }
                long j7 = zt3Var2.l;
                int i116 = jz3.c;
                int i117 = (int) (j7 & 4294967295L);
                xr0.e0(zt3Var2, i117, length + i117);
                int i118 = (int) (zt3Var2.l >> 32);
                xr0.e0(zt3Var2, i118 - i9, i118);
                break;
            default:
                zt3 zt3Var3 = (zt3) obj;
                jz3 jz3Var = zt3Var3.m;
                jt2 jt2Var4 = zt3Var3.d;
                if (jz3Var != null) {
                    zt3Var3.e(null);
                }
                int iX = py.x(i4, 0, jt2Var4.length());
                int iX2 = py.x(i3, 0, jt2Var4.length());
                if (iX != iX2) {
                    if (iX < iX2) {
                        zt3Var3.d(iX, iX2, null);
                    } else {
                        zt3Var3.d(iX2, iX, null);
                    }
                }
                break;
        }
        return w84Var;
    }
}
