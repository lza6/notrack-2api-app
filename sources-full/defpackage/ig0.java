package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig0 implements ko2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ ig0(qg0 qg0Var, int i) {
        this.a = i;
        this.b = qg0Var;
    }

    @Override // defpackage.ko2
    public final void a(qg0 qg0Var) {
        int i = this.a;
        qg0 qg0Var2 = this.b;
        switch (i) {
            case 0:
                qg0Var.getClass();
                Bundle bundleA = ((t93) qg0Var2.l.c).a("android:support:activity-result");
                if (bundleA != null) {
                    ng0 ng0Var = qg0Var2.q;
                    LinkedHashMap linkedHashMap = ng0Var.b;
                    LinkedHashMap linkedHashMap2 = ng0Var.a;
                    Bundle bundle = ng0Var.g;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            ng0Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    y64.k(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            ng0Var.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                zc1 zc1Var = (zc1) ((zh) qg0Var2).C.c;
                zc1Var.x.b(zc1Var, zc1Var, null);
                break;
        }
    }
}
