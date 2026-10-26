package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class db4 extends h {
    public static ug1 b(wa4 wa4Var) {
        if (wa4Var instanceof ug1) {
            return (ug1) wa4Var;
        }
        u41.r("Cannot only insert VNode into Group");
        return null;
    }

    @Override // defpackage.h
    public final void a() {
        ug1 ug1VarB = b((wa4) this.c);
        ug1VarB.h(0, ug1VarB.c.size());
    }

    @Override // defpackage.xk
    public final void c(int i, Object obj) {
        b((wa4) this.h).e(i, (wa4) obj);
    }

    @Override // defpackage.xk
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // defpackage.xk
    public final void h(int i, int i2, int i3) {
        ug1 ug1VarB = b((wa4) this.h);
        ArrayList arrayList = ug1VarB.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                wa4 wa4Var = (wa4) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, wa4Var);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                wa4 wa4Var2 = (wa4) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, wa4Var2);
                i4++;
            }
        }
        ug1VarB.c();
    }

    @Override // defpackage.xk
    public final void j(int i, int i2) {
        b((wa4) this.h).h(i, i2);
    }
}
