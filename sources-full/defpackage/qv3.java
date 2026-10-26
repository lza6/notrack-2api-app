package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qv3 {
    public final z22 a;
    public final xw3 b;
    public final ey3 c;
    public final boolean d;
    public final boolean e;
    public final iz3 f;
    public final nn2 g;
    public final q84 h;
    public final ur0 i;
    public final rn0 j = iv1.a;
    public final le1 k;
    public final int l;

    public qv3(z22 z22Var, xw3 xw3Var, ey3 ey3Var, boolean z, boolean z2, iz3 iz3Var, nn2 nn2Var, q84 q84Var, ur0 ur0Var, le1 le1Var, int i) {
        this.a = z22Var;
        this.b = xw3Var;
        this.c = ey3Var;
        this.d = z;
        this.e = z2;
        this.f = iz3Var;
        this.g = nn2Var;
        this.h = q84Var;
        this.i = ur0Var;
        this.k = le1Var;
        this.l = i;
    }

    public final void a(List list) {
        fp1 fp1Var = this.a.d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new n71());
        this.k.invoke(fp1Var.b(arrayList));
    }
}
