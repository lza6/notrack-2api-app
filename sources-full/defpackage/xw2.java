package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class xw2 implements tf3, xz {
    public final String a;
    public final ff1 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final ly1 i;
    public final ly1 j;
    public final ly1 k;

    public xw2(String str, ff1 ff1Var, int i) {
        this.a = str;
        this.b = ff1Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = a31.c;
        je1 je1Var = new je1(this) { // from class: ww2
            public final /* synthetic */ xw2 d;

            {
                this.d = this;
            }

            @Override // defpackage.je1
            public final Object invoke() {
                int i5 = i2;
                xw2 xw2Var = this.d;
                switch (i5) {
                    case 0:
                        return xw2Var.b.childSerializers();
                    default:
                        return Integer.valueOf(yo4.C(xw2Var, (tf3[]) xw2Var.j.getValue()));
                }
            }
        };
        q22 q22Var = q22.c;
        this.i = yo4.H(q22Var, je1Var);
        this.j = yo4.H(q22Var, new b72(this));
        final int i5 = 1;
        this.k = yo4.H(q22Var, new je1(this) { // from class: ww2
            public final /* synthetic */ xw2 d;

            {
                this.d = this;
            }

            @Override // defpackage.je1
            public final Object invoke() {
                int i6 = i5;
                xw2 xw2Var = this.d;
                switch (i6) {
                    case 0:
                        return xw2Var.b.childSerializers();
                    default:
                        return Integer.valueOf(yo4.C(xw2Var, (tf3[]) xw2Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.tf3
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
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
        return zo3.n;
    }

    @Override // defpackage.tf3
    public final int d() {
        return this.c;
    }

    @Override // defpackage.tf3
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xw2) {
            tf3 tf3Var = (tf3) obj;
            if (this.a.equals(tf3Var.b()) && Arrays.equals((tf3[]) this.j.getValue(), (tf3[]) ((xw2) obj).j.getValue())) {
                int iD = tf3Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (kr1.n(i(i2).b(), tf3Var.i(i2).b()) && kr1.n(i(i2).c(), tf3Var.i(i2).c())) {
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
        return this.h.keySet();
    }

    @Override // defpackage.tf3
    public final boolean g() {
        return false;
    }

    @Override // defpackage.tf3
    public final List getAnnotations() {
        return z21.c;
    }

    @Override // defpackage.tf3
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? z21.c : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.tf3
    public final tf3 i(int i) {
        return ((qu1[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // defpackage.tf3
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.tf3
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public final String toString() {
        return ke0.D0(py.X(0, this.c), ", ", this.a.concat("("), ")", new s(8, this), 24);
    }
}
