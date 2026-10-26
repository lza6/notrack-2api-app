package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class x52 implements lg2 {
    public static int f(er1 er1Var, ArrayList arrayList, int i, ne1 ne1Var) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        int i2 = 1;
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iO = i == Integer.MAX_VALUE ? i : i - er1Var.O(32.0f);
        qb2 qb2Var = (qb2) ke0.z0(list4);
        if (qb2Var != null) {
            iIntValue = ((Number) ne1Var.invoke(qb2Var, Integer.valueOf(iO))).intValue();
            int iQ = qb2Var.Q(IntCompanionObject.MAX_VALUE);
            if (iO != Integer.MAX_VALUE) {
                iO -= iQ;
            }
        } else {
            iIntValue = 0;
        }
        qb2 qb2Var2 = (qb2) ke0.z0(list5);
        if (qb2Var2 != null) {
            iIntValue2 = ((Number) ne1Var.invoke(qb2Var2, Integer.valueOf(iO))).intValue();
            int iQ2 = qb2Var2.Q(IntCompanionObject.MAX_VALUE);
            if (iO != Integer.MAX_VALUE) {
                iO -= iQ2;
            }
        } else {
            iIntValue2 = 0;
        }
        Object obj = (qb2) ke0.z0(list2);
        int iIntValue3 = obj != null ? ((Number) ne1Var.invoke(obj, Integer.valueOf(iO))).intValue() : 0;
        Object obj2 = (qb2) ke0.z0(list3);
        int iIntValue4 = obj2 != null ? ((Number) ne1Var.invoke(obj2, Integer.valueOf(iO))).intValue() : 0;
        boolean z = iIntValue4 > er1Var.C(gm4.D(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue4 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else if (z2 || z3) {
            i2 = 2;
        }
        Object obj3 = (qb2) ke0.z0(list);
        return s52.c(er1Var, iIntValue, iIntValue2, obj3 != null ? ((Number) ne1Var.invoke(obj3, Integer.valueOf(i))).intValue() : 0, iIntValue3, iIntValue4, i2, er1Var.O((i2 == 3 ? 12.0f : 8.0f) * 2.0f), wm0.b(0, 0, 15));
    }

    public static int g(er1 er1Var, ArrayList arrayList, int i, ne1 ne1Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        qb2 qb2Var = (qb2) ke0.z0(list4);
        int iIntValue = qb2Var != null ? ((Number) ne1Var.invoke(qb2Var, Integer.valueOf(i))).intValue() : 0;
        qb2 qb2Var2 = (qb2) ke0.z0(list5);
        int iIntValue2 = qb2Var2 != null ? ((Number) ne1Var.invoke(qb2Var2, Integer.valueOf(i))).intValue() : 0;
        qb2 qb2Var3 = (qb2) ke0.z0(list);
        int iIntValue3 = qb2Var3 != null ? ((Number) ne1Var.invoke(qb2Var3, Integer.valueOf(i))).intValue() : 0;
        qb2 qb2Var4 = (qb2) ke0.z0(list2);
        int iIntValue4 = qb2Var4 != null ? ((Number) ne1Var.invoke(qb2Var4, Integer.valueOf(i))).intValue() : 0;
        qb2 qb2Var5 = (qb2) ke0.z0(list3);
        int iIntValue5 = qb2Var5 != null ? ((Number) ne1Var.invoke(qb2Var5, Integer.valueOf(i))).intValue() : 0;
        int iO = er1Var.O(32.0f);
        long jB = wm0.b(0, 0, 15);
        if (um0.d(jB)) {
            return um0.h(jB);
        }
        return iO + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // defpackage.lg2
    public final int a(er1 er1Var, List list, int i) {
        return f(er1Var, (ArrayList) list, i, t52.c);
    }

    @Override // defpackage.lg2
    public final int b(er1 er1Var, List list, int i) {
        return g(er1Var, (ArrayList) list, i, u52.c);
    }

    @Override // defpackage.lg2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        int i;
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        List list5 = (List) list.get(3);
        List list6 = (List) list.get(4);
        long jA = um0.a(j, 0, 0, 0, 0, 10);
        int iO = xb2Var.O(32.0f);
        qb2 qb2Var = (qb2) ke0.z0(list5);
        int iM = qb2Var != null ? qb2Var.M(um0.g(j)) : 0;
        qb2 qb2Var2 = (qb2) ke0.z0(list6);
        int iM2 = qb2Var2 != null ? qb2Var2.M(um0.g(j)) : 0;
        int iH = um0.h(jA);
        int i2 = iM + iM2 + iO;
        if (iH != Integer.MAX_VALUE) {
            iH -= i2;
        }
        qb2 qb2Var3 = (qb2) ke0.z0(list4);
        long jI = wm0.i(-iO, -xb2Var.O(((((ke0.z0(list3) != null) && (ke0.z0(list4) != null)) || ((qb2Var3 != null ? qb2Var3.R(iH) : 0) > xb2Var.C(gm4.D(30)))) ? 12.0f : 8.0f) * 2.0f), jA);
        qb2 qb2Var4 = (qb2) ke0.z0(list5);
        nv2 nv2VarC = qb2Var4 != null ? qb2Var4.c(jI) : null;
        float f = ov3.b;
        int i3 = nv2VarC != null ? nv2VarC.c : 0;
        qb2 qb2Var5 = (qb2) ke0.z0(list6);
        nv2 nv2VarC2 = qb2Var5 != null ? qb2Var5.c(wm0.j(jI, -i3, 0, 2)) : null;
        int i4 = i3 + (nv2VarC2 != null ? nv2VarC2.c : 0);
        qb2 qb2Var6 = (qb2) ke0.z0(list2);
        nv2 nv2VarC3 = qb2Var6 != null ? qb2Var6.c(wm0.j(jI, -i4, 0, 2)) : null;
        int i5 = nv2VarC3 != null ? nv2VarC3.d : 0;
        qb2 qb2Var7 = (qb2) ke0.z0(list4);
        nv2 nv2VarC4 = qb2Var7 != null ? qb2Var7.c(wm0.i(-i4, -i5, jI)) : null;
        int i6 = i5 + (nv2VarC4 != null ? nv2VarC4.d : 0);
        boolean z = (nv2VarC4 == null || nv2VarC4.U(d8.a) == nv2VarC4.U(d8.b)) ? false : true;
        qb2 qb2Var8 = (qb2) ke0.z0(list3);
        nv2 nv2VarC5 = qb2Var8 != null ? qb2Var8.c(wm0.i(-i4, -i6, jI)) : null;
        boolean z2 = nv2VarC5 != null;
        boolean z3 = nv2VarC4 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f2 = i == 3 ? 12.0f : 8.0f;
        float f3 = f2 * 2.0f;
        int iH2 = um0.d(j) ? um0.h(j) : iO + (nv2VarC != null ? nv2VarC.c : 0) + Math.max(nv2VarC3 != null ? nv2VarC3.c : 0, Math.max(nv2VarC5 != null ? nv2VarC5.c : 0, nv2VarC4 != null ? nv2VarC4.c : 0)) + (nv2VarC2 != null ? nv2VarC2.c : 0);
        nv2 nv2Var = nv2VarC5;
        float f4 = f2;
        int iC = s52.c(xb2Var, nv2VarC != null ? nv2VarC.d : 0, nv2VarC2 != null ? nv2VarC2.d : 0, nv2VarC3 != null ? nv2VarC3.d : 0, nv2VarC5 != null ? nv2VarC5.d : 0, nv2VarC4 != null ? nv2VarC4.d : 0, i, xb2Var.O(f3), j);
        return xb2Var.s(iH2, iC, a31.c, new r52(nv2VarC, nv2VarC2, xb2Var.O(16.0f), i == 3, xb2Var.O(f4), nv2VarC3, nv2Var, nv2VarC4, iC, iH2, xb2Var.O(16.0f)));
    }

    @Override // defpackage.lg2
    public final int d(er1 er1Var, List list, int i) {
        return f(er1Var, (ArrayList) list, i, v52.c);
    }

    @Override // defpackage.lg2
    public final int e(er1 er1Var, List list, int i) {
        return g(er1Var, (ArrayList) list, i, w52.c);
    }
}
