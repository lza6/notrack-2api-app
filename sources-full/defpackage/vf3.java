package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vf3 implements tf3, xz {
    public final String a;
    public final yo4 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final tf3[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final tf3[] k;
    public final yq3 l;

    public vf3(String str, yo4 yo4Var, int i, List list, wc0 wc0Var) {
        this.a = str;
        this.b = yo4Var;
        this.c = i;
        this.d = wc0Var.b;
        ArrayList arrayList = wc0Var.c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(y92.S(le0.q0(arrayList, 12)));
        ke0.M0(arrayList, hashSet);
        this.e = hashSet;
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = gb2.q(wc0Var.e);
        this.h = (List[]) wc0Var.f.toArray(new List[0]);
        ArrayList arrayList2 = wc0Var.g;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            zArr[i3] = ((Boolean) obj).booleanValue();
            i3++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        strArr.getClass();
        un1 un1Var = new un1(i2, new wl(i2, strArr));
        ArrayList arrayList3 = new ArrayList(le0.q0(un1Var, 10));
        Iterator it = un1Var.iterator();
        while (true) {
            q01 q01Var = (q01) it;
            if (!q01Var.d.hasNext()) {
                this.j = y92.V(arrayList3);
                this.k = gb2.q(list);
                this.l = new yq3(new wl(19, this));
                return;
            }
            tn1 tn1Var = (tn1) q01Var.next();
            arrayList3.add(new ps2(tn1Var.b, Integer.valueOf(tn1Var.a)));
        }
    }

    @Override // defpackage.tf3
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.tf3
    public final String b() {
        return this.a;
    }

    @Override // defpackage.tf3
    public final yo4 c() {
        return this.b;
    }

    @Override // defpackage.tf3
    public final int d() {
        return this.c;
    }

    @Override // defpackage.tf3
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vf3) {
            tf3 tf3Var = (tf3) obj;
            if (this.a.equals(tf3Var.b()) && Arrays.equals(this.k, ((vf3) obj).k)) {
                int iD = tf3Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        tf3[] tf3VarArr = this.g;
                        if (kr1.n(tf3VarArr[i2].b(), tf3Var.i(i2).b()) && kr1.n(tf3VarArr[i2].c(), tf3Var.i(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xz
    public final Set f() {
        return this.e;
    }

    @Override // defpackage.tf3
    public final boolean g() {
        return false;
    }

    @Override // defpackage.tf3
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.tf3
    public final List h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.tf3
    public final tf3 i(int i) {
        return this.g[i];
    }

    @Override // defpackage.tf3
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.tf3
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return ke0.D0(py.X(0, this.c), ", ", this.a.concat("("), ")", new s(10, this), 24);
    }
}
