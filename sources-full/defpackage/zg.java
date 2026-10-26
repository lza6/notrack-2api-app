package defpackage;

import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.material3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zg extends ww1 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg(int i, Object obj) {
        super(3);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar;
        int i = this.c;
        a31 a31Var = a31.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                xb2 xb2Var = (xb2) obj;
                qb2 qb2Var = (qb2) obj2;
                long j = ((um0) obj3).a;
                kw kwVar = (kw) obj4;
                a aVar2 = kwVar != null ? (a) ((ci4) kwVar).d : null;
                if (aVar2 != null) {
                    ((lw) aVar2).b.h(-xb2Var.w(80.0f));
                }
                nv2 nv2VarC = qb2Var.c(j);
                return xb2Var.s(nv2VarC.c, gb2.R(nv2VarC.d + ((kwVar == null || (aVar = (a) ((ci4) kwVar).d) == null) ? 0.0f : ((lw) aVar).d.f())), a31Var, new xc(nv2VarC, 3));
            case 1:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                tp0 tp0Var = (tp0) obj4;
                if (!zBooleanValue) {
                    iIntValue = tp0Var.q.n(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = tp0Var.q.n(iIntValue2);
                }
                boolean z = false;
                if (tp0Var.o) {
                    long j2 = tp0Var.l.b;
                    int i2 = jz3.c;
                    if (iIntValue != ((int) (j2 >> 32)) || iIntValue2 != ((int) (4294967295L & j2))) {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        ch1 ch1Var = ch1.c;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > tp0Var.l.a.d.length()) {
                            xw3 xw3Var = tp0Var.r;
                            xw3Var.q(false);
                            xw3Var.o(ch1Var);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                xw3 xw3Var2 = tp0Var.r;
                                xw3Var2.q(false);
                                xw3Var2.o(ch1Var);
                            } else {
                                tp0Var.r.f(true);
                            }
                            tp0Var.m.v.invoke(new ey3(tp0Var.l.a, p23.d(iIntValue, iIntValue2), (jz3) null));
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                long j3 = ((ln2) obj3).a;
                ((le1) obj4).invoke(new ln2(((dx2) obj2).c));
                return w84.a;
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                nu3 nu3Var = (nu3) obj4;
                c cVar = nu3Var.h;
                au3 au3VarB = zBooleanValue2 ? cVar.a.b() : cVar.d();
                long j4 = au3VarB.h;
                if (!nu3Var.n || Math.min(iIntValue3, iIntValue4) < 0 || Math.max(iIntValue3, iIntValue4) > au3VarB.d.length()) {
                    return Boolean.FALSE;
                }
                int i3 = jz3.c;
                if (iIntValue3 == ((int) (j4 >> 32)) && iIntValue4 == ((int) (4294967295L & j4))) {
                    return Boolean.TRUE;
                }
                long jD = p23.d(iIntValue3, iIntValue4);
                if (zBooleanValue2 || iIntValue3 == iIntValue4) {
                    nu3Var.m.x(vz3.c);
                } else {
                    nu3Var.m.x(vz3.h);
                }
                c cVar2 = nu3Var.h;
                if (zBooleanValue2) {
                    cVar2.k(jD);
                } else {
                    cVar2.j(jD);
                }
                return Boolean.TRUE;
            default:
                long j5 = ((um0) obj3).a;
                long j6 = ((yx3) obj4).f;
                nv2 nv2VarC2 = ((qb2) obj2).c(um0.a(j5, py.x((int) (j6 >> 32), um0.j(j5), um0.h(j5)), 0, py.x((int) (4294967295L & j6), um0.i(j5), um0.g(j5)), 0, 10));
                return ((xb2) obj).s(nv2VarC2.c, nv2VarC2.d, a31Var, new xc(nv2VarC2, 15));
        }
    }
}
