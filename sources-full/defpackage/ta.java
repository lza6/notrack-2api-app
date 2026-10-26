package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta(ArrayList arrayList, int i) {
        super(1);
        this.c = i;
        this.d = arrayList;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        ArrayList arrayList = this.d;
        switch (i) {
            case 0:
                mv2 mv2Var = (mv2) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mv2.f(mv2Var, (nv2) arrayList.get(i2), 0, 0);
                }
                return w84Var;
            case 1:
                mv2 mv2Var2 = (mv2) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        mv2.f(mv2Var2, (nv2) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return w84Var;
            case 2:
                mv2 mv2Var3 = (mv2) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    mv2.d(mv2Var3, (nv2) arrayList.get(i4), 0, 0);
                }
                return w84Var;
            case 3:
                mv2 mv2Var4 = (mv2) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    mv2.f(mv2Var4, (nv2) arrayList.get(i5), 0, 0);
                }
                return w84Var;
            case 4:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 5:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 6:
                mv2 mv2Var5 = (mv2) obj;
                int size5 = arrayList.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    mv2.g(mv2Var5, (nv2) arrayList.get(i6), 0, 0);
                }
                return w84Var;
            default:
                mv2 mv2Var6 = (mv2) obj;
                int size6 = arrayList.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    mv2.d(mv2Var6, (nv2) arrayList.get(i7), 0, 0);
                }
                return w84Var;
        }
    }
}
