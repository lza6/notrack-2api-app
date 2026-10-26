package defpackage;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final class z22 {
    public final ft2 A;
    public lv0 a;
    public final v33 b;
    public final SoftwareKeyboardController c;
    public final fp1 d;
    public py3 e;
    public final ft2 f;
    public final ft2 g;
    public cx1 h;
    public final ft2 i;
    public hg j;
    public final ft2 k;
    public final ft2 l;
    public final ft2 m;
    public final ft2 n;
    public final ft2 o;
    public boolean p;
    public final ft2 q;
    public final uv1 r;
    public final ft2 s;
    public final ft2 t;
    public le1 u;
    public final ip0 v;
    public final ip0 w;
    public final bc x;
    public long y;
    public final ft2 z;

    public z22(lv0 lv0Var, v33 v33Var, SoftwareKeyboardController softwareKeyboardController) {
        this.a = lv0Var;
        this.b = v33Var;
        this.c = softwareKeyboardController;
        fp1 fp1Var = new fp1();
        hg hgVar = ig.a;
        long j = jz3.b;
        ey3 ey3Var = new ey3(hgVar, j, (jz3) null);
        fp1Var.c = ey3Var;
        fp1Var.d = new o11(hgVar, ey3Var.b);
        this.d = fp1Var;
        Boolean bool = Boolean.FALSE;
        this.f = cl3.d(bool);
        this.g = cl3.d(new rx0(0.0f));
        this.i = cl3.d(null);
        this.k = cl3.d(ch1.c);
        this.l = cl3.d(bool);
        this.m = cl3.d(bool);
        this.n = cl3.d(bool);
        this.o = cl3.d(bool);
        this.p = true;
        this.q = cl3.d(Boolean.TRUE);
        this.r = new uv1(softwareKeyboardController);
        this.s = cl3.d(bool);
        this.t = cl3.d(bool);
        this.u = fl1.x;
        this.v = new ip0(this, 3);
        this.w = new ip0(this, 2);
        this.x = vl0.f();
        this.y = re0.i;
        this.z = cl3.d(new jz3(j));
        this.A = cl3.d(new jz3(j));
    }

    public final ch1 a() {
        return (ch1) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final cx1 c() {
        cx1 cx1Var = this.h;
        if (cx1Var == null || !cx1Var.z()) {
            return null;
        }
        return cx1Var;
    }

    public final yy3 d() {
        return (yy3) this.i.getValue();
    }

    public final void e(long j) {
        this.A.setValue(new jz3(j));
    }

    public final void f(long j) {
        this.z.setValue(new jz3(j));
    }
}
