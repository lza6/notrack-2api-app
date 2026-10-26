package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qj2 implements vb2 {
    public final /* synthetic */ h01 a;
    public final /* synthetic */ mi2 b;
    public final /* synthetic */ ah2 c;

    public qj2(h01 h01Var, mi2 mi2Var, ah2 ah2Var) {
        this.a = h01Var;
        this.b = mi2Var;
        this.c = ah2Var;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        Integer numValueOf;
        long jA = um0.a(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((qb2) list.get(i)).c(jA));
        }
        Integer num = null;
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            numValueOf = Integer.valueOf(((nv2) arrayList.get(0)).c);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((nv2) arrayList.get(i3)).c);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer numValueOf3 = Integer.valueOf(((nv2) arrayList.get(0)).d);
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((nv2) arrayList.get(i2)).d);
                    if (numValueOf4.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf3;
        }
        return xb2Var.s(iIntValue, num != null ? num.intValue() : 0, a31.c, new jf0(this.a, iIntValue, arrayList, this.b, this.c));
    }
}
