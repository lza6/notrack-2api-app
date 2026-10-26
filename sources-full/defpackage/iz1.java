package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iz1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ List l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz1(mi2 mi2Var, ArrayList arrayList, List list, boolean z, int i) {
        super(1);
        this.c = i;
        this.d = mi2Var;
        this.h = arrayList;
        this.l = list;
        this.m = z;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.d;
        boolean z = this.m;
        List list = this.l;
        ArrayList arrayList = this.h;
        switch (i) {
            case 0:
                mv2 mv2Var = (mv2) obj;
                hz1 hz1Var = new hz1(arrayList, list, z, 0);
                mv2Var.a = true;
                hz1Var.invoke(mv2Var);
                mv2Var.a = false;
                mi2Var.getValue();
                break;
            default:
                mv2 mv2Var2 = (mv2) obj;
                hz1 hz1Var2 = new hz1(arrayList, list, z, 1);
                mv2Var2.a = true;
                hz1Var2.invoke(mv2Var2);
                mv2Var2.a = false;
                mi2Var.getValue();
                break;
        }
        return w84Var;
    }
}
