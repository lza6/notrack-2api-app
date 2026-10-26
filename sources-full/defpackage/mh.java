package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mh implements vb2 {
    public final /* synthetic */ ic3 a;
    public final /* synthetic */ el b;
    public final /* synthetic */ gl c;
    public final /* synthetic */ int d;

    public mh(ic3 ic3Var, el elVar, gl glVar, int i) {
        this.a = ic3Var;
        this.b = elVar;
        this.c = glVar;
        this.d = i;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        int iH;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qb2 qb2Var = (qb2) list.get(i);
            if (kr1.n(a.a(qb2Var), "navigationIcon")) {
                nv2 nv2VarC = qb2Var.c(um0.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    qb2 qb2Var2 = (qb2) list.get(i2);
                    if (kr1.n(a.a(qb2Var2), "actionIcons")) {
                        nv2 nv2VarC2 = qb2Var2.c(um0.a(j, 0, 0, 0, 0, 14));
                        if (um0.h(j) == Integer.MAX_VALUE) {
                            iH = um0.h(j);
                        } else {
                            iH = (um0.h(j) - nv2VarC.c) - nv2VarC2.c;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i3 = iH;
                        int size3 = list.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            qb2 qb2Var3 = (qb2) list.get(i4);
                            if (kr1.n(a.a(qb2Var3), "title")) {
                                nv2 nv2VarC3 = qb2Var3.c(um0.a(j, 0, i3, 0, 0, 12));
                                ti1 ti1Var = d8.b;
                                int iU = nv2VarC3.U(ti1Var) != Integer.MIN_VALUE ? nv2VarC3.U(ti1Var) : 0;
                                float fA = this.a.a();
                                int iG = um0.g(j) == Integer.MAX_VALUE ? um0.g(j) : (Float.isNaN(fA) ? 0 : gb2.R(fA)) + um0.g(j);
                                return xb2Var.s(um0.h(j), iG, a31.c, new lh(nv2VarC, iG, nv2VarC3, this.b, j, nv2VarC2, xb2Var, this.c, this.d, iU));
                            }
                        }
                        j93.g("Collection contains no element matching the predicate.");
                        return null;
                    }
                }
                j93.g("Collection contains no element matching the predicate.");
                return null;
            }
        }
        j93.g("Collection contains no element matching the predicate.");
        return null;
    }
}
