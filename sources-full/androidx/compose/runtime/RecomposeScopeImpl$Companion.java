package androidx.compose.runtime;

import defpackage.bk3;
import defpackage.h8;
import defpackage.w33;
import defpackage.y33;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RecomposeScopeImpl$Companion {
    public static void adoptAnchoredScopes$runtime_release(bk3 bk3Var, List list, y33 y33Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = bk3Var.c((h8) list.get(i));
            int iK = bk3Var.K(bk3Var.b, bk3Var.q(iC));
            Object empty = iK < bk3Var.f(bk3Var.b, bk3Var.q(iC + 1)) ? bk3Var.c[bk3Var.g(iK)] : Composer$Companion.getEmpty();
            w33 w33Var = empty instanceof w33 ? (w33) empty : null;
            if (w33Var != null) {
                w33Var.adoptedBy(y33Var);
            }
        }
    }
}
