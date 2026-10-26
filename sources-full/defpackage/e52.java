package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e52 extends g52 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List listE;
        List list = (List) o94.c.i(obj, j);
        if (list.isEmpty()) {
            if (list instanceof p22) {
                listE = new o22(i);
            } else {
                listE = ((list instanceof dz2) && (list instanceof yq1)) ? ((yq1) list).e(i) : new ArrayList(i);
            }
            o94.p(j, obj, listE);
            return listE;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            o94.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof d94) {
            d94 d94Var = (d94) list;
            o22 o22Var = new o22(d94Var.c.size() + i);
            o22Var.addAll(d94Var);
            o94.p(j, obj, o22Var);
            return o22Var;
        }
        if ((list instanceof dz2) && (list instanceof yq1)) {
            yq1 yq1Var = (yq1) list;
            if (!((m0) yq1Var).c) {
                yq1 yq1VarE = yq1Var.e(list.size() + i);
                o94.p(j, obj, yq1VarE);
                return yq1VarE;
            }
        }
        return list;
    }

    @Override // defpackage.g52
    public final void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) o94.c.i(obj, j);
        if (list instanceof p22) {
            objUnmodifiableList = ((p22) list).f();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof dz2) && (list instanceof yq1)) {
                m0 m0Var = (m0) ((yq1) list);
                if (m0Var.c) {
                    m0Var.c = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o94.p(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.g52
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) o94.c.i(obj2, j);
        List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        o94.p(j, obj, list);
    }

    @Override // defpackage.g52
    public final List c(Object obj, long j) {
        return d(10, j, obj);
    }
}
