package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class lf extends ww1 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf(Object obj, int i, Object obj2) {
        super(3);
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        Typeface typeface;
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = 2;
        Object obj4 = this.h;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                xb2 xb2Var = (xb2) obj;
                nv2 nv2VarC = ((qb2) obj2).c(((um0) obj3).a);
                if (!xb2Var.r() || ((Boolean) ((le1) obj5).invoke(((o54) obj4).d.getValue())).booleanValue()) {
                    j = (((long) nv2VarC.c) << 32) | (((long) nv2VarC.d) & 4294967295L);
                } else {
                    j = 0;
                }
                return xb2Var.s((int) (j >> 32), (int) (4294967295L & j), a31.c, new xc(nv2VarC, 2));
            case 1:
                dx2 dx2Var = (dx2) obj;
                dx2 dx2Var2 = (dx2) obj2;
                long j2 = ((ln2) obj3).a;
                bz0 bz0Var = (bz0) obj5;
                if (((Boolean) bz0Var.l.invoke(dx2Var)).booleanValue()) {
                    if (!bz0Var.q) {
                        if (bz0Var.o == null) {
                            bz0Var.o = gm4.b(IntCompanionObject.MAX_VALUE, 6, null);
                        }
                        bz0Var.q = true;
                        py.F(bz0Var.getCoroutineScope(), null, null, new az0(bz0Var, null), 3);
                    }
                    yo4.g((q33) obj4, dx2Var);
                    long jH = ln2.h(dx2Var2.c, j2);
                    jy jyVar = bz0Var.o;
                    if (jyVar != null) {
                        jyVar.i(new dy0(jH));
                    }
                }
                return w84Var;
            default:
                em3 em3Var = (em3) obj;
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) obj5;
                gc gcVar = (gc) obj4;
                lb1 lb1Var = em3Var.f;
                ic1 ic1Var = em3Var.c;
                if (ic1Var == null) {
                    ic1Var = ic1.h;
                }
                gc1 gc1Var = em3Var.d;
                int i3 = gc1Var != null ? gc1Var.a : 0;
                hc1 hc1Var = em3Var.e;
                int i4 = hc1Var != null ? hc1Var.a : 65535;
                hc hcVar = (hc) gcVar.d;
                k74 k74VarB = ((mb1) hcVar.m).b(lb1Var, ic1Var, i3, i4);
                if (k74VarB instanceof k74) {
                    Object obj6 = k74VarB.c;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    iy2 iy2Var = new iy2(k74VarB, hcVar.r);
                    hcVar.r = iy2Var;
                    Object obj7 = iy2Var.l;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new yd0(i2, typeface), iIntValue, iIntValue2, 33);
                return w84Var;
        }
    }
}
