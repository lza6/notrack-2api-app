package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya3 {
    public static final String a = v72.h("Schedulers");

    public static void a(ji4 ji4Var, sb3 sb3Var, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            sb3Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ji4Var.n(((hi4) obj).a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(jl0 jl0Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        ji4 ji4VarU = workDatabase.u();
        workDatabase.c();
        try {
            ArrayList arrayListH = ji4VarU.h();
            a(ji4VarU, jl0Var.d, arrayListH);
            ArrayList arrayListG = ji4VarU.g(jl0Var.k);
            a(ji4VarU, jl0Var.d, arrayListG);
            arrayListG.addAll(arrayListH);
            ArrayList arrayListE = ji4VarU.e();
            workDatabase.p();
            workDatabase.k();
            if (arrayListG.size() > 0) {
                hi4[] hi4VarArr = (hi4[]) arrayListG.toArray(new hi4[arrayListG.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ua3 ua3Var = (ua3) it.next();
                    if (ua3Var.e()) {
                        ua3Var.c(hi4VarArr);
                    }
                }
            }
            if (arrayListE.size() > 0) {
                hi4[] hi4VarArr2 = (hi4[]) arrayListE.toArray(new hi4[arrayListE.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ua3 ua3Var2 = (ua3) it2.next();
                    if (!ua3Var2.e()) {
                        ua3Var2.c(hi4VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
