package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qg2 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg2(vu vuVar, int i) {
        super(0);
        this.c = i;
        this.d = vuVar;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        Object obj = null;
        vu vuVar = this.d;
        int i2 = 1;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) vuVar.m;
                if (!arrayList.isEmpty()) {
                    Object obj2 = arrayList.get(0);
                    float fC = ((ts2) obj2).a.q.c();
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj3 = arrayList.get(i2);
                            float fC2 = ((ts2) obj3).a.q.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj2 = obj3;
                                fC = fC2;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                    obj = obj2;
                }
                ts2 ts2Var = (ts2) obj;
                return Float.valueOf(ts2Var != null ? ts2Var.a.q.c() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) vuVar.m;
                if (!arrayList2.isEmpty()) {
                    Object obj4 = arrayList2.get(0);
                    float fA = ((ts2) obj4).a.a();
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        while (true) {
                            Object obj5 = arrayList2.get(i2);
                            float fA2 = ((ts2) obj5).a.a();
                            if (Float.compare(fA, fA2) < 0) {
                                obj4 = obj5;
                                fA = fA2;
                            }
                            if (i2 != size2) {
                                i2++;
                            }
                        }
                    }
                    obj = obj4;
                }
                ts2 ts2Var2 = (ts2) obj;
                return Float.valueOf(ts2Var2 != null ? ts2Var2.a.a() : 0.0f);
        }
    }
}
