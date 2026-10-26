package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w91 {
    public final v91 a;
    public final int b;
    public final int c;
    public final le1 d;
    public final le1 e;

    public w91(v91 v91Var, int i, int i2, le1 le1Var, le1 le1Var2) {
        this.a = v91Var;
        this.b = i;
        this.c = i2;
        this.d = le1Var;
        this.e = le1Var2;
    }

    public final void a(y91 y91Var, ArrayList arrayList) {
        le1 le1Var = this.d;
        ne1 ne1Var = le1Var != null ? (ne1) le1Var.invoke(y91Var) : null;
        le1 le1Var2 = this.e;
        ne1 ne1Var2 = le1Var2 != null ? (ne1) le1Var2.invoke(y91Var) : null;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            if (ne1Var != null) {
                arrayList.add(ne1Var);
            }
        } else {
            if (iOrdinal != 3) {
                return;
            }
            if (ne1Var != null) {
                arrayList.add(ne1Var);
            }
            if (ne1Var2 != null) {
                arrayList.add(ne1Var2);
            }
        }
    }
}
