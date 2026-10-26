package defpackage;

import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cd extends f73 implements a53, d73 {
    public final boolean h;
    public final float l;
    public final gn3 m;
    public final gn3 n;
    public final ViewGroup o;
    public c73 p;
    public final ft2 q;
    public final ft2 r;
    public long s;
    public int t;
    public final j u;

    public cd(boolean z, float f, gn3 gn3Var, gn3 gn3Var2, ViewGroup viewGroup) {
        super(z, gn3Var2);
        this.h = z;
        this.l = f;
        this.m = gn3Var;
        this.n = gn3Var2;
        this.o = viewGroup;
        this.q = cl3.d(null);
        this.r = cl3.d(Boolean.TRUE);
        this.s = 0L;
        this.t = -1;
        this.u = new j(1, this);
    }

    @Override // defpackage.a53
    public final void a() {
    }

    @Override // defpackage.a53
    public final void b() {
        c73 c73Var = this.p;
        if (c73Var != null) {
            i0();
            mi4 mi4Var = c73Var.l;
            e73 e73Var = (e73) ((LinkedHashMap) mi4Var.d).get(this);
            if (e73Var != null) {
                e73Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) mi4Var.d;
                e73 e73Var2 = (e73) linkedHashMap.get(this);
                if (e73Var2 != null) {
                }
                linkedHashMap.remove(this);
                c73Var.h.add(e73Var);
            }
        }
    }

    @Override // defpackage.wn1
    public final void c(wx1 wx1Var) {
        a10 a10Var = wx1Var.c;
        this.s = a10Var.b();
        float f = this.l;
        this.t = Float.isNaN(f) ? gb2.R(p23.B(wx1Var, this.h, a10Var.b())) : a10Var.O(f);
        long j = ((re0) this.m.getValue()).a;
        float f2 = ((w63) this.n.getValue()).d;
        wx1Var.a();
        this.d.b(wx1Var, Float.isNaN(f) ? p23.B(wx1Var, this.c, a10Var.b()) : wx1Var.w(f), j);
        y00 y00VarY = a10Var.d.y();
        ((Boolean) this.r.getValue()).booleanValue();
        e73 e73Var = (e73) this.q.getValue();
        if (e73Var != null) {
            e73Var.e(a10Var.b(), j, f2);
            e73Var.draw(p9.a(y00VarY));
        }
    }

    @Override // defpackage.a53
    public final void d() {
        c73 c73Var = this.p;
        if (c73Var != null) {
            i0();
            mi4 mi4Var = c73Var.l;
            e73 e73Var = (e73) ((LinkedHashMap) mi4Var.d).get(this);
            if (e73Var != null) {
                e73Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) mi4Var.d;
                e73 e73Var2 = (e73) linkedHashMap.get(this);
                if (e73Var2 != null) {
                }
                linkedHashMap.remove(this);
                c73Var.h.add(e73Var);
            }
        }
    }

    @Override // defpackage.d73
    public final void i0() {
        this.q.setValue(null);
    }
}
