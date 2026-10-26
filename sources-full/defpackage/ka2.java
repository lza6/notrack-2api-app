package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class ka2 extends f0 {
    public final /* synthetic */ ne1 a;
    public final /* synthetic */ le1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ uz3 d;
    public final /* synthetic */ le1 e;

    public ka2(ne1 ne1Var, le1 le1Var, long j, uz3 uz3Var, le1 le1Var2) {
        this.a = ne1Var;
        this.b = le1Var;
        this.c = j;
        this.d = uz3Var;
        this.e = le1Var2;
    }

    @Override // defpackage.f0
    public final void b(jr0 jr0Var) {
        jr0Var.getClass();
        le1 le1Var = this.b;
        if (le1Var != null) {
            le1Var.invoke(jr0Var);
        }
    }

    @Override // defpackage.f0
    public final void d(jr0 jr0Var, SpannableStringBuilder spannableStringBuilder) {
        jr0Var.getClass();
        ne1 ne1Var = this.a;
        if (ne1Var != null) {
            ne1Var.invoke(jr0Var, spannableStringBuilder);
        }
    }

    @Override // defpackage.f0
    public final void f(pa2 pa2Var) {
        le1 le1Var = this.e;
        if (le1Var == null) {
            return;
        }
        pa2Var.d = new f4(4, le1Var);
    }

    @Override // defpackage.f0
    public final void i(va2 va2Var) {
        long j = re0.h;
        long j2 = this.c;
        if (re0.c(j2, j)) {
            va2Var.j = 1;
        } else {
            va2Var.j = gb2.X(j2);
        }
        va2Var.e = (int) yz3.c(this.d.a.b);
    }
}
