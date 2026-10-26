package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fx2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public fx2(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx2)) {
            return false;
        }
        fx2 fx2Var = (fx2) obj;
        return xr0.V(this.a, fx2Var.a) && this.b == fx2Var.b && ln2.c(this.c, fx2Var.c) && ln2.c(this.d, fx2Var.d) && this.e == fx2Var.e && Float.compare(this.f, fx2Var.f) == 0 && this.g == fx2Var.g && this.h == fx2Var.h && this.i.equals(fx2Var.i) && ln2.c(this.j, fx2Var.j) && ln2.c(this.k, fx2Var.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + ud2.h((this.i.hashCode() + ud2.k(fq2.e(this.g, fq2.d(this.f, ud2.k(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.a + ')'));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) ln2.k(this.c));
        sb.append(", position=");
        sb.append((Object) ln2.k(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i != 3) {
            str = i != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) ln2.k(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) ln2.k(this.k));
        sb.append(')');
        return sb.toString();
    }
}
