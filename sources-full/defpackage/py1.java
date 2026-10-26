package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class py1 implements h02 {
    public final wz1 a;

    public py1(wz1 wz1Var) {
        this.a = wz1Var;
    }

    @Override // defpackage.h02
    public final int a() {
        return this.a.g().o;
    }

    @Override // defpackage.h02
    public final int b() {
        return ((kz1) ke0.E0(this.a.g().l)).a;
    }

    @Override // defpackage.h02
    public final boolean c() {
        return !this.a.g().l.isEmpty();
    }

    @Override // defpackage.h02
    public final int d() {
        int i;
        wz1 wz1Var = this.a;
        if (wz1Var.g().l.isEmpty()) {
            return 0;
        }
        jz1 jz1VarG = wz1Var.g();
        nq2 nq2Var = jz1VarG.q;
        nq2 nq2Var2 = nq2.c;
        int iE = (int) (nq2Var == nq2Var2 ? jz1VarG.e() & 4294967295L : jz1VarG.e() >> 32);
        jz1 jz1VarG2 = wz1Var.g();
        nq2 nq2Var3 = jz1VarG2.q;
        List list = jz1VarG2.l;
        boolean z = nq2Var3 == nq2Var2;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < list.size()) {
            kz1 kz1Var = (kz1) list.get(i2);
            int i5 = z ? kz1Var.r : kz1Var.s;
            if (i5 == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < list.size()) {
                    kz1 kz1Var2 = (kz1) list.get(i2);
                    if ((z ? kz1Var2.r : kz1Var2.s) != i5) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z ? ((kz1) list.get(i2)).p & 4294967295L : ((kz1) list.get(i2)).p >> 32));
                    i2++;
                }
                i3 += iMax;
                i4++;
            }
        }
        int i6 = (i3 / i4) + jz1VarG2.s;
        if (i6 != 0 && (i = iE / i6) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.h02
    public final int e() {
        return this.a.d.b.f();
    }
}
