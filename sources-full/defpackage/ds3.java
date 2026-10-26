package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class ds3 {
    public static void c(ir3 ir3Var, gb2 gb2Var, rj1 rj1Var) {
        ArrayList arrayList = rj1Var.n;
        for (rj1 rj1Var2 : arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList)) {
            if (rj1Var2.m()) {
                ds3 ds3VarW = gb2Var.W((String) rj1Var2.h);
                if (ds3VarW != null) {
                    ds3VarW.a(ir3Var, gb2Var, rj1Var2);
                } else {
                    c(ir3Var, gb2Var, rj1Var2);
                }
            }
        }
    }

    public abstract void a(ir3 ir3Var, gb2 gb2Var, x0 x0Var);

    public abstract Collection b();
}
