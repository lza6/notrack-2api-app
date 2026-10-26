package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ap2 extends eq2 {
    public static final ap2 c = new ap2(0, 2, 1);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        int i = ((nq1) ce0Var.c(0)).a;
        List list = (List) ce0Var.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            xkVar.getClass();
            int i3 = i + i2;
            xkVar.c(i3, obj);
            xkVar.f(i3, obj);
        }
    }
}
