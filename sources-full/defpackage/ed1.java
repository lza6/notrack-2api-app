package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements r3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nd1 d;

    public /* synthetic */ ed1(nd1 nd1Var, int i) {
        this.c = i;
        this.d = nd1Var;
    }

    @Override // defpackage.r3
    public final void b(Object obj) {
        int i = this.c;
        nd1 nd1Var = this.d;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                jd1 jd1Var = (jd1) nd1Var.F.pollFirst();
                if (jd1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = jd1Var.c;
                    if (nd1Var.c.N(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                q3 q3Var = (q3) obj;
                jd1 jd1Var2 = (jd1) nd1Var.F.pollLast();
                if (jd1Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = jd1Var2.c;
                    int i3 = jd1Var2.d;
                    xc1 xc1VarN = nd1Var.c.N(str2);
                    if (xc1VarN == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        xc1VarN.t(i3, q3Var.c, q3Var.d);
                    }
                }
                break;
            default:
                q3 q3Var2 = (q3) obj;
                jd1 jd1Var3 = (jd1) nd1Var.F.pollFirst();
                if (jd1Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = jd1Var3.c;
                    int i4 = jd1Var3.d;
                    xc1 xc1VarN2 = nd1Var.c.N(str3);
                    if (xc1VarN2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        xc1VarN2.t(i4, q3Var2.c, q3Var2.d);
                    }
                }
                break;
        }
    }
}
