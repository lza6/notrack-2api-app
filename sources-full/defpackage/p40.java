package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p40 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ se1 n;
    public final /* synthetic */ se1 o;
    public final /* synthetic */ Object p;

    public /* synthetic */ p40(List list, String str, le1 le1Var, Set set, le1 le1Var2, int i, int i2) {
        this.l = list;
        this.m = str;
        this.n = le1Var;
        this.p = set;
        this.o = le1Var2;
        this.d = i;
        this.h = i2;
    }

    public /* synthetic */ p40(lm1 lm1Var, je1 je1Var, je1 je1Var2, je1 je1Var3, je1 je1Var4, int i, int i2) {
        this.l = lm1Var;
        this.m = je1Var;
        this.n = je1Var2;
        this.o = je1Var3;
        this.p = je1Var4;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj3 = this.p;
        se1 se1Var = this.o;
        se1 se1Var2 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w40.e((List) obj5, (String) obj4, (le1) se1Var2, (Set) obj3, (le1) se1Var, (ck0) obj, this.d, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                fm1.ImageGateDialog((lm1) obj5, (je1) obj4, (je1) se1Var2, (je1) se1Var, (je1) obj3, (ck0) obj, sf3.V(this.d | 1), this.h);
                break;
        }
        return w84Var;
    }
}
