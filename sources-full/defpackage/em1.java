package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ em1(List list, boolean z, le1 le1Var, uw2 uw2Var, boolean z2) {
        this.l = list;
        this.d = z;
        this.m = le1Var;
        this.n = uw2Var;
        this.h = z2;
    }

    public /* synthetic */ em1(boolean z, boolean z2, je1 je1Var, Map map, String str) {
        this.d = z;
        this.h = z2;
        this.l = je1Var;
        this.m = map;
        this.n = str;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return fm1.ImageGateDialog$lambda$9(this.d, this.h, (je1) obj5, (Map) obj4, (String) obj3, (ck0) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return uv2.PlanCard$lambda$35((List) obj5, this.d, (le1) obj4, (uw2) obj3, this.h, (ck0) obj, iIntValue2);
        }
    }
}
