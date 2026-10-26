package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xe implements vb2 {
    public final qf a;
    public boolean b;

    public xe(qf qfVar) {
        this.a = qfVar;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((qb2) list.get(0)).d(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iD2 = ((qb2) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iQ = ((qb2) list.get(0)).Q(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iQ2 = ((qb2) list.get(i2)).Q(i);
                if (iQ2 > iQ) {
                    iQ = iQ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iQ;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            nv2 nv2VarC = ((qb2) list.get(i)).c(j);
            iMax = Math.max(iMax, nv2VarC.c);
            iMax2 = Math.max(iMax2, nv2VarC.d);
            arrayList.add(nv2VarC);
        }
        boolean zR = xb2Var.r();
        qf qfVar = this.a;
        if (zR) {
            this.b = true;
            qfVar.b.setValue(new qq1((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            qfVar.b.setValue(new qq1((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return xb2Var.s(iMax, iMax2, a31.c, new ta(arrayList, 2));
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iR = ((qb2) list.get(0)).R(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iR2 = ((qb2) list.get(i2)).R(i);
                if (iR2 > iR) {
                    iR = iR2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iR;
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iM = ((qb2) list.get(0)).M(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iM2 = ((qb2) list.get(i2)).M(i);
                if (iM2 > iM) {
                    iM = iM2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iM;
    }
}
