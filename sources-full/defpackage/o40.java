package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o40 implements oe1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ o40(List list, String str, Set set, le1 le1Var, le1 le1Var2) {
        this.h = list;
        this.l = str;
        this.m = set;
        this.d = le1Var;
        this.n = le1Var2;
    }

    public /* synthetic */ o40(xa0 xa0Var, le1 le1Var, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3) {
        this.h = xa0Var;
        this.d = le1Var;
        this.l = mi2Var;
        this.m = mi2Var2;
        this.n = mi2Var3;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        Object obj4 = this.n;
        Object obj5 = this.m;
        Object obj6 = this.l;
        Object obj7 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return w40.Segments$lambda$68((List) obj7, (String) obj6, (Set) obj5, this.d, (le1) obj4, (ca1) obj, (ck0) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return wa0.ChatDrawer$lambda$837$lambda$836$lambda$774$lambda$773$lambda$771$lambda$770((xa0) obj7, this.d, (mi2) obj6, (mi2) obj5, (mi2) obj4, (lf0) obj, (ck0) obj2, iIntValue2);
        }
    }
}
