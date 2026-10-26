package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f52 extends g52 {
    @Override // defpackage.g52
    public final void a(Object obj, long j) {
        ((m0) ((yq1) o94.c.i(obj, j))).c = false;
    }

    @Override // defpackage.g52
    public final void b(long j, Object obj, Object obj2) {
        n94 n94Var = o94.c;
        yq1 yq1VarE = (yq1) n94Var.i(obj, j);
        yq1 yq1Var = (yq1) n94Var.i(obj2, j);
        int size = yq1VarE.size();
        int size2 = yq1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((m0) yq1VarE).c) {
                yq1VarE = yq1VarE.e(size2 + size);
            }
            yq1VarE.addAll(yq1Var);
        }
        if (size > 0) {
            yq1Var = yq1VarE;
        }
        o94.p(j, obj, yq1Var);
    }

    @Override // defpackage.g52
    public final List c(Object obj, long j) {
        yq1 yq1Var = (yq1) o94.c.i(obj, j);
        if (((m0) yq1Var).c) {
            return yq1Var;
        }
        int size = yq1Var.size();
        yq1 yq1VarE = yq1Var.e(size == 0 ? 10 : size * 2);
        o94.p(j, obj, yq1VarE);
        return yq1VarE;
    }
}
