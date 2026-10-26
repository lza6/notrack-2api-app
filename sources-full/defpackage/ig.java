package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig {
    public static final hg a = new hg(BuildConfig.VERSION_NAME);

    public static final List a(hg hgVar, int i, int i2, v1 v1Var) {
        List list;
        if (i == i2 || (list = hgVar.c) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= hgVar.d.length()) {
            if (v1Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) v1Var.invoke(((gg) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            gg ggVar = (gg) list.get(i3);
            if (v1Var != null ? ((Boolean) v1Var.invoke(ggVar.a)).booleanValue() : true) {
                int i4 = ggVar.b;
                int i5 = ggVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new gg(py.x(ggVar.b, i, i2) - i, py.x(i5, i, i2) - i, (dg) ggVar.a, ggVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
