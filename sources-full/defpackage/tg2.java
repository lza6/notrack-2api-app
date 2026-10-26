package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class tg2 implements fe3 {
    public final jh2 a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final fd3 f;

    public tg2(jh2 jh2Var, List list, int i, int i2, boolean z, fd3 fd3Var) {
        this.a = jh2Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = fd3Var;
        if (list.size() > 1) {
            return;
        }
        so1.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void m(lh2 lh2Var, fd3 fd3Var, bd3 bd3Var, int i, int i2) {
        fd3 fd3Var2;
        if (fd3Var.c) {
            fd3Var2 = new fd3(bd3Var.a(i2), bd3Var.a(i), i2 > i);
        } else {
            fd3Var2 = new fd3(bd3Var.a(i), bd3Var.a(i2), i > i2);
        }
        if (i > i2) {
            so1.c("minOffset should be less than or equal to maxOffset: " + fd3Var2);
        }
        long j = bd3Var.a;
        int iC = lh2Var.c(j);
        Object[] objArr = lh2Var.c;
        Object obj = objArr[iC];
        lh2Var.b[iC] = j;
        objArr[iC] = fd3Var2;
    }

    @Override // defpackage.fe3
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.fe3
    public final bd3 b() {
        return this.e ? e() : j();
    }

    @Override // defpackage.fe3
    public final fd3 c() {
        return this.f;
    }

    @Override // defpackage.fe3
    public final bd3 d() {
        return k() == sq0.c ? j() : e();
    }

    @Override // defpackage.fe3
    public final bd3 e() {
        return (bd3) this.b.get(o(this.c, true));
    }

    @Override // defpackage.fe3
    public final int f() {
        return this.c;
    }

    @Override // defpackage.fe3
    public final boolean g(fe3 fe3Var) {
        if (this.f != null && fe3Var != null && (fe3Var instanceof tg2)) {
            tg2 tg2Var = (tg2) fe3Var;
            if (this.e == tg2Var.e && this.c == tg2Var.c && this.d == tg2Var.d) {
                List list = tg2Var.b;
                List list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        bd3 bd3Var = (bd3) list2.get(i);
                        bd3 bd3Var2 = (bd3) list.get(i);
                        if (bd3Var.a != bd3Var2.a || bd3Var.c != bd3Var2.c || bd3Var.d != bd3Var2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.fe3
    public final int getSize() {
        return this.b.size();
    }

    @Override // defpackage.fe3
    public final lh2 h(fd3 fd3Var) {
        ed3 ed3Var = fd3Var.a;
        boolean z = fd3Var.c;
        long j = ed3Var.c;
        int i = ed3Var.b;
        ed3 ed3Var2 = fd3Var.b;
        long j2 = ed3Var2.c;
        int i2 = ed3Var2.b;
        if (j != j2) {
            lh2 lh2Var = a82.a;
            lh2 lh2Var2 = new lh2();
            m(lh2Var2, fd3Var, d(), (z ? ed3Var2 : ed3Var).b, d().f.a.a.d.length());
            l(new sg2(this, lh2Var2, fd3Var, 0));
            if (!z) {
                ed3Var = ed3Var2;
            }
            m(lh2Var2, fd3Var, k() == sq0.c ? e() : j(), 0, ed3Var.b);
            return lh2Var2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            so1.c("unexpectedly miss-crossed selection: " + fd3Var);
        }
        long j3 = ed3Var.c;
        lh2 lh2Var3 = a82.a;
        lh2 lh2Var4 = new lh2();
        lh2Var4.h(fd3Var, j3);
        return lh2Var4;
    }

    @Override // defpackage.fe3
    public final int i() {
        return this.d;
    }

    @Override // defpackage.fe3
    public final bd3 j() {
        return (bd3) this.b.get(o(this.d, false));
    }

    @Override // defpackage.fe3
    public final sq0 k() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return sq0.d;
        }
        if (i > i2) {
            return sq0.c;
        }
        return ((bd3) this.b.get(i / 2)).b();
    }

    @Override // defpackage.fe3
    public final void l(le1 le1Var) {
        int iN = n(d().a);
        int iN2 = n((k() == sq0.c ? e() : j()).a);
        int i = iN + 1;
        if (i >= iN2) {
            return;
        }
        while (i < iN2) {
            le1Var.invoke(this.b.get(i));
            i++;
        }
    }

    public final int n(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(ud2.o("Invalid selectableId: ", j), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i, boolean z) {
        int iOrdinal = k().ordinal();
        boolean z2 = z;
        if (iOrdinal == 0) {
            z2 = !z ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                u41.e();
                return 0;
            }
        }
        return (i - (!z2)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(k());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bd3 bd3Var = (bd3) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(bd3Var);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
