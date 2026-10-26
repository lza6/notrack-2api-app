package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hz1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hz1(ArrayList arrayList, List list, boolean z, int i) {
        super(1);
        this.c = i;
        this.d = arrayList;
        this.h = list;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        List list = this.h;
        int i2 = 0;
        ArrayList arrayList = this.d;
        switch (i) {
            case 0:
                mv2 mv2Var = (mv2) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((kz1) arrayList.get(i3)).j(mv2Var);
                }
                int size2 = list.size();
                while (i2 < size2) {
                    ((kz1) list.get(i2)).j(mv2Var);
                    i2++;
                }
                break;
            default:
                mv2 mv2Var2 = (mv2) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((a22) arrayList.get(i4)).j(mv2Var2);
                }
                int size4 = list.size();
                while (i2 < size4) {
                    ((a22) list.get(i2)).j(mv2Var2);
                    i2++;
                }
                break;
        }
        return w84Var;
    }
}
