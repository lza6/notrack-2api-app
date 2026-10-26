package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class md1 implements kd1 {
    public final /* synthetic */ nd1 a;

    public md1(nd1 nd1Var) {
        this.a = nd1Var;
    }

    @Override // defpackage.kd1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zU;
        nd1 nd1Var = this.a;
        ArrayList arrayList3 = nd1Var.n;
        if (nd1.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + nd1Var.a);
        }
        if (nd1Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zU = false;
        } else {
            ArrayList arrayList4 = nd1Var.d;
            er erVar = (er) arrayList4.get(arrayList4.size() - 1);
            nd1Var.h = erVar;
            ArrayList arrayList5 = erVar.a;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                xc1 xc1Var = ((xd1) obj).b;
                if (xc1Var != null) {
                    xc1Var.u = true;
                }
            }
            zU = nd1Var.U(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(nd1.F((er) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 != null) {
                    m51.t();
                    return false;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zU;
    }
}
