package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jf0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(h01 h01Var, int i, ArrayList arrayList, mi2 mi2Var, ah2 ah2Var) {
        super(1);
        this.c = 1;
        this.h = h01Var;
        this.d = i;
        this.l = arrayList;
        this.m = mi2Var;
        this.n = ah2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf0(qn0 qn0Var, db1 db1Var, db1 db1Var2, Object obj, int i, ie ieVar, int i2) {
        super(1);
        this.c = i2;
        this.h = db1Var;
        this.l = db1Var2;
        this.m = obj;
        this.d = i;
        this.n = ieVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(nv2[] nv2VarArr, kf0 kf0Var, int i, xb2 xb2Var, int[] iArr) {
        super(1);
        this.c = 0;
        this.h = nv2VarArr;
        this.l = kf0Var;
        this.d = i;
        this.m = xb2Var;
        this.n = iArr;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.n;
        int i2 = this.d;
        Object obj3 = this.m;
        Object obj4 = this.h;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                mv2 mv2Var = (mv2) obj;
                nv2[] nv2VarArr = (nv2[]) obj4;
                kf0 kf0Var = (kf0) obj5;
                xb2 xb2Var = (xb2) obj3;
                int[] iArr = (int[]) obj2;
                int length = nv2VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    nv2 nv2Var = nv2VarArr[i3];
                    int i5 = i4 + 1;
                    nv2Var.getClass();
                    Object objI = nv2Var.i();
                    d83 d83Var = objI instanceof d83 ? (d83) objI : null;
                    dx1 layoutDirection = xb2Var.getLayoutDirection();
                    qq0 qq0Var = d83Var != null ? d83Var.c : null;
                    mv2.d(mv2Var, nv2Var, qq0Var != null ? qq0Var.m(i2 - nv2Var.c, layoutDirection) : kf0Var.b.a(0, i2 - nv2Var.c, layoutDirection), iArr[i4]);
                    i3++;
                    i4 = i5;
                }
                return w84Var;
            case 1:
                mv2 mv2Var2 = (mv2) obj;
                ah2 ah2Var = (ah2) obj2;
                ji4 ji4Var = ((h01) obj4).a;
                r92 r92VarF = ji4Var.f();
                i01 i01Var = i01.c;
                float fD = r92VarF.d(i01Var);
                float f = -i2;
                mi2 mi2Var = (mi2) obj3;
                t64 t64Var = uj2.a;
                if (!((Boolean) mi2Var.getValue()).booleanValue() || fD != f) {
                    if (!((Boolean) mi2Var.getValue()).booleanValue()) {
                        mi2Var.setValue(Boolean.TRUE);
                    }
                    ((bt2) ah2Var).h(f);
                    pj2 pj2Var = new pj2(1, ah2Var);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ah2 ah2Var2 = (ah2) pj2Var.d;
                    t64 t64Var2 = uj2.a;
                    linkedHashMap.put(i01Var, Float.valueOf(((bt2) ah2Var2).f()));
                    linkedHashMap.put(i01.d, Float.valueOf(0.0f));
                    ji4.z(ji4Var, new r92(linkedHashMap));
                }
                ArrayList arrayList = (ArrayList) obj5;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    mv2.f(mv2Var2, (nv2) arrayList.get(i6), 0, 0);
                }
                return w84Var;
            case 2:
                ot otVar = (ot) obj;
                db1 db1Var = (db1) obj5;
                if (((db1) obj4) != ((va1) y64.N(db1Var).getFocusOwner()).l) {
                    return Boolean.TRUE;
                }
                boolean zO = gm4.O(db1Var, (db1) obj3, i2, (ie) obj2);
                Boolean boolValueOf = Boolean.valueOf(zO);
                if (zO || !otVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                ot otVar2 = (ot) obj;
                db1 db1Var2 = (db1) obj5;
                if (((db1) obj4) != ((va1) y64.N(db1Var2).getFocusOwner()).l) {
                    return Boolean.TRUE;
                }
                boolean zW = yh4.W(i2, (ie) obj2, db1Var2, (h43) obj3);
                Boolean boolValueOf2 = Boolean.valueOf(zW);
                if (zW || !otVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
