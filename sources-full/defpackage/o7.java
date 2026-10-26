package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o7 extends ww1 implements le1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ xb2 d;
    public final /* synthetic */ float h;
    public final /* synthetic */ int l;
    public final /* synthetic */ ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(ArrayList arrayList, xb2 xb2Var, float f, int i, ArrayList arrayList2) {
        super(1);
        this.c = arrayList;
        this.d = xb2Var;
        this.h = f;
        this.l = i;
        this.m = arrayList2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        xb2 xb2Var;
        mv2 mv2Var = (mv2) obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) arrayList.get(i);
            int size2 = list.size();
            int[] iArr = new int[size2];
            int i2 = 0;
            while (true) {
                xb2Var = this.d;
                if (i2 >= size2) {
                    break;
                }
                iArr[i2] = ((nv2) list.get(i2)).c + (i2 < list.size() + (-1) ? xb2Var.O(this.h) : 0);
                i2++;
            }
            int[] iArr2 = new int[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                iArr2[i3] = 0;
            }
            if (xb2Var.getLayoutDirection() == dx1.c) {
                int i4 = 0;
                for (int i5 = 0; i5 < size2; i5++) {
                    i4 += iArr[i5];
                }
                int i6 = this.l - i4;
                int i7 = 0;
                int i8 = 0;
                while (i7 < size2) {
                    int i9 = iArr[i7];
                    iArr2[i8] = i6;
                    i6 += i9;
                    i7++;
                    i8++;
                }
            } else {
                int i10 = 0;
                for (int i11 = size2 - 1; -1 < i11; i11--) {
                    int i12 = iArr[i11];
                    iArr2[i11] = i10;
                    i10 += i12;
                }
            }
            int size3 = list.size();
            for (int i13 = 0; i13 < size3; i13++) {
                mv2.d(mv2Var, (nv2) list.get(i13), iArr2[i13], ((Number) this.m.get(i)).intValue());
            }
        }
        return w84.a;
    }
}
