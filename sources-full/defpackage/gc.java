package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class gc extends ww1 implements pe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc(int i, Object obj) {
        super(4);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.pe1
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                hc hcVar = (hc) obj5;
                k74 k74VarB = ((mb1) hcVar.m).b((lb1) obj, (ic1) obj2, ((gc1) obj3).a, ((hc1) obj4).a);
                if (k74VarB instanceof k74) {
                    Object obj6 = k74VarB.c;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                iy2 iy2Var = new iy2(k74VarB, hcVar.r);
                hcVar.r = iy2Var;
                Object obj7 = iy2Var.l;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((cq3) obj5).h(new ge1(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) obj5).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                return w84Var;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cx1 cx1Var = (cx1) obj2;
                long jY = ((ln2) obj3).a;
                gd3 gd3Var = (gd3) obj4;
                le3 le3Var = (le3) obj5;
                long J = cx1Var.J();
                h43 h43Var = new h43(0.0f, 0.0f, (int) (J >> 32), (int) (J & 4294967295L));
                if (!vl0.z(jY, h43Var)) {
                    jY = kr1.y(jY, h43Var);
                }
                long jA = le3.a(le3Var, cx1Var, jY);
                if ((9223372034707292159L & jA) != 9205357640488583168L) {
                    le3Var.l(zBooleanValue);
                    le3Var.r = null;
                    le3Var.o(jA, 9205357640488583168L, false, gd3Var);
                    za1.b(le3Var.h);
                    le3Var.s = false;
                    le3Var.p();
                }
                return w84Var;
        }
    }
}
