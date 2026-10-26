package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ez1 {
    public final boolean a;
    public final oz1 b;
    public final int c;
    public final int d;
    public final dz1 e;
    public final tz1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ oz1 h;

    public ez1(boolean z, oz1 oz1Var, int i, int i2, dz1 dz1Var, tz1 tz1Var) {
        this.g = z;
        this.h = oz1Var;
        this.a = z;
        this.b = oz1Var;
        this.c = i;
        this.d = i2;
        this.e = dz1Var;
        this.f = tz1Var;
    }

    public final long a(int i, int i2) {
        int i3;
        oz1 oz1Var = this.b;
        int[] iArr = oz1Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = oz1Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.a) {
            if (i3 < 0) {
                ro1.a("width must be >= 0");
            }
            return wm0.h(i3, i3, 0, IntCompanionObject.MAX_VALUE);
        }
        if (i3 < 0) {
            ro1.a("height must be >= 0");
        }
        return wm0.h(0, IntCompanionObject.MAX_VALUE, i3, i3);
    }

    public final lz1 b(int i) {
        kc1 kc1VarO = this.f.o(i);
        int i2 = kc1VarO.a;
        int size = kc1VarO.b.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.c) ? 0 : this.d;
        kz1[] kz1VarArr = new kz1[size];
        int i5 = 0;
        while (true) {
            List list = kc1VarO.b;
            if (i3 >= size) {
                return new lz1(i, kz1VarArr, this.h, list, this.g, i4);
            }
            int i6 = (int) ((sg1) list.get(i3)).a;
            kz1 kz1VarA = this.e.a(i2 + i3, a(i5, i6), i5, i6, i4);
            i5 += i6;
            kz1VarArr[i3] = kz1VarA;
            i3++;
        }
    }
}
