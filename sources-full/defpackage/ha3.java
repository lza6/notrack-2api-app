package defpackage;

import androidx.compose.foundation.layout.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ha3 extends ww1 implements le1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ h61 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ e p;
    public final /* synthetic */ jp3 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Integer t;
    public final /* synthetic */ ArrayList u;
    public final /* synthetic */ Integer v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, h61 h61Var, int i, int i2, e eVar, jp3 jp3Var, int i3, int i4, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.c = arrayList;
        this.d = arrayList2;
        this.h = arrayList3;
        this.l = arrayList4;
        this.m = h61Var;
        this.n = i;
        this.o = i2;
        this.p = eVar;
        this.q = jp3Var;
        this.r = i3;
        this.s = i4;
        this.t = num;
        this.u = arrayList5;
        this.v = num2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i;
        mv2 mv2Var = (mv2) obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mv2.d(mv2Var, (nv2) arrayList.get(i2), 0, 0);
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mv2.d(mv2Var, (nv2) arrayList2.get(i3), 0, 0);
        }
        ArrayList arrayList3 = this.h;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            i = this.r;
            if (i4 >= size3) {
                break;
            }
            nv2 nv2Var = (nv2) arrayList3.get(i4);
            int i5 = (this.n - this.o) / 2;
            jp3 jp3Var = this.q;
            mv2.d(mv2Var, nv2Var, this.p.d(jp3Var, jp3Var.getLayoutDirection()) + i5, i - this.s);
            i4++;
        }
        ArrayList arrayList4 = this.l;
        int size4 = arrayList4.size();
        for (int i6 = 0; i6 < size4; i6++) {
            nv2 nv2Var2 = (nv2) arrayList4.get(i6);
            Integer num = this.t;
            mv2.d(mv2Var, nv2Var2, 0, i - (num != null ? num.intValue() : 0));
        }
        h61 h61Var = this.m;
        if (h61Var != null) {
            ArrayList arrayList5 = this.u;
            int size5 = arrayList5.size();
            for (int i7 = 0; i7 < size5; i7++) {
                nv2 nv2Var3 = (nv2) arrayList5.get(i7);
                int i8 = h61Var.a;
                Integer num2 = this.v;
                num2.getClass();
                mv2.d(mv2Var, nv2Var3, i8, i - num2.intValue());
            }
        }
        return w84.a;
    }
}
