package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i33 {
    public final y23 a;
    public final ArrayList b;
    public final int c;
    public final sd d;
    public final l53 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public i33(y23 y23Var, ArrayList arrayList, int i, sd sdVar, l53 l53Var, int i2, int i3, int i4) {
        l53Var.getClass();
        this.a = y23Var;
        this.b = arrayList;
        this.c = i;
        this.d = sdVar;
        this.e = l53Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static i33 a(i33 i33Var, int i, sd sdVar, l53 l53Var, int i2) {
        if ((i2 & 1) != 0) {
            i = i33Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            sdVar = i33Var.d;
        }
        sd sdVar2 = sdVar;
        if ((i2 & 4) != 0) {
            l53Var = i33Var.e;
        }
        l53 l53Var2 = l53Var;
        int i4 = i33Var.f;
        int i5 = i33Var.g;
        int i6 = i33Var.h;
        l53Var2.getClass();
        return new i33(i33Var.a, i33Var.b, i3, sdVar2, l53Var2, i4, i5, i6);
    }

    public final f63 b(l53 l53Var) {
        l53Var.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            u41.r("Check failed.");
            return null;
        }
        this.i++;
        sd sdVar = this.d;
        if (sdVar != null) {
            f51 f51Var = (f51) sdVar.c;
            tk1 tk1Var = l53Var.a;
            f51Var.getClass();
            tk1Var.getClass();
            tk1 tk1Var2 = f51Var.b.h;
            if (tk1Var.e != tk1Var2.e || !kr1.n(tk1Var.d, tk1Var2.d)) {
                u41.i(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                u41.i(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        i33 i33VarA = a(this, i2, null, l53Var, 58);
        wq1 wq1Var = (wq1) arrayList.get(i);
        f63 f63VarA = wq1Var.a(i33VarA);
        if (f63VarA == null) {
            throw new NullPointerException("interceptor " + wq1Var + " returned null");
        }
        if (sdVar != null && i2 < arrayList.size() && i33VarA.i != 1) {
            u41.i(wq1Var, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (f63VarA.o != null) {
            return f63VarA;
        }
        u41.i(wq1Var, " returned a response with no body", "interceptor ");
        return null;
    }
}
