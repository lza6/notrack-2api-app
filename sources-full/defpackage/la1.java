package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class la1 implements l81 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ la1(ArrayList arrayList, mi2 mi2Var, int i) {
        this.c = i;
        this.d = arrayList;
        this.h = mi2Var;
    }

    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.h;
        ArrayList arrayList = this.d;
        switch (i) {
            case 0:
                tq1 tq1Var = (tq1) obj;
                if (tq1Var instanceof ja1) {
                    arrayList.add(tq1Var);
                } else if (tq1Var instanceof ka1) {
                    arrayList.remove(((ka1) tq1Var).a);
                }
                mi2Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                tq1 tq1Var2 = (tq1) obj;
                if (tq1Var2 instanceof xi1) {
                    arrayList.add(tq1Var2);
                } else if (tq1Var2 instanceof yi1) {
                    arrayList.remove(((yi1) tq1Var2).a);
                }
                mi2Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return w84Var;
    }
}
