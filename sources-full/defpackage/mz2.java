package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mz2 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(lz2.c, 0);
        map.put(lz2.d, 1);
        map.put(lz2.h, 2);
        for (lz2 lz2Var : map.keySet()) {
            a.append(((Integer) b.get(lz2Var)).intValue(), lz2Var);
        }
    }

    public static int a(lz2 lz2Var) {
        Integer num = (Integer) b.get(lz2Var);
        if (num != null) {
            return num.intValue();
        }
        m51.A(lz2Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static lz2 b(int i) {
        lz2 lz2Var = (lz2) a.get(i);
        if (lz2Var != null) {
            return lz2Var;
        }
        u41.k(ud2.m(i, "Unknown Priority for value "));
        return null;
    }
}
