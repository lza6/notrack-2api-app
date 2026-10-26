package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class o54 {
    public final c64 a;
    public final o54 b;
    public final String c;
    public final ft2 d = cl3.d(b());
    public final ft2 e = cl3.d(new m54(b(), b()));
    public final dt2 f = new dt2(0);
    public final dt2 g = new dt2(Long.MIN_VALUE);
    public final ft2 h;
    public final ml3 i;
    public final ml3 j;
    public final ft2 k;

    public o54(c64 c64Var, o54 o54Var, String str) {
        this.a = c64Var;
        this.b = o54Var;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.h = cl3.d(bool);
        this.i = new ml3();
        this.j = new ml3();
        this.k = cl3.d(bool);
        cl3.b(new gf(this, 1));
        c64Var.getClass();
    }

    public final long a() {
        ml3 ml3Var = this.i;
        int size = ml3Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((n54) ml3Var.get(i)).r.f());
        }
        ml3 ml3Var2 = this.j;
        int size2 = ml3Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((o54) ml3Var2.get(i2)).a());
        }
        return jMax;
    }

    public final void animateTo$animation_core_release(Object obj, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? kk0Var.h(obj) : kk0Var.j(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(this) ? 32 : 16;
        }
        if (!kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            kk0Var.V();
        } else if (f()) {
            kk0Var.a0(1824284987);
            kk0Var.r(false);
        } else {
            kk0Var.a0(1822801203);
            j(obj);
            if (kr1.n(obj, b()) && this.g.f() == Long.MIN_VALUE && !((Boolean) this.h.getValue()).booleanValue()) {
                kk0Var.a0(1824275067);
                kk0Var.r(false);
            } else {
                kk0Var.a0(1823032494);
                Object objP = kk0Var.P();
                if (objP == Composer$Companion.getEmpty()) {
                    objP = r11.a(x21.c, kk0Var);
                    kk0Var.l0(objP);
                }
                gq0 gq0Var = (gq0) objP;
                int i3 = i2 & 112;
                boolean zJ = kk0Var.j(gq0Var) | (i3 == 32);
                Object objP2 = kk0Var.P();
                if (zJ || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new sg2(gq0Var, 20, this);
                    kk0Var.l0(objP2);
                }
                r11.DisposableEffect(gq0Var, this, (le1) objP2, kk0Var, i3);
                kk0Var.r(false);
            }
            kk0Var.r(false);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 12, this, obj));
        }
    }

    public final Object b() {
        return ((ni2) this.a).b.getValue();
    }

    public final boolean c() {
        ml3 ml3Var = this.i;
        int size = ml3Var.size();
        for (int i = 0; i < size; i++) {
            ((n54) ml3Var.get(i)).getClass();
        }
        ml3 ml3Var2 = this.j;
        int size2 = ml3Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((o54) ml3Var2.get(i2)).c()) {
                return true;
            }
        }
        return false;
    }

    public final long d() {
        o54 o54Var = this.b;
        return o54Var != null ? o54Var.d() : this.f.f();
    }

    public final l54 e() {
        return (l54) this.e.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void g(long j, boolean z) {
        dt2 dt2Var = this.g;
        long jF = dt2Var.f();
        c64 c64Var = this.a;
        if (jF == Long.MIN_VALUE) {
            dt2Var.h(j);
            c64Var.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) c64Var.a.getValue()).booleanValue()) {
            c64Var.a.setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        ml3 ml3Var = this.i;
        int size = ml3Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            n54 n54Var = (n54) ml3Var.get(i);
            ft2 ft2Var = n54Var.m;
            ft2 ft2Var2 = n54Var.m;
            if (!((Boolean) ft2Var.getValue()).booleanValue()) {
                long jC = z ? n54Var.b().c() : j;
                n54Var.p.setValue(n54Var.b().b(jC));
                n54Var.q = n54Var.b().f(jC);
                if (n54Var.b().g(jC)) {
                    ft2Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ft2Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        ml3 ml3Var2 = this.j;
        int size2 = ml3Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o54 o54Var = (o54) ml3Var2.get(i2);
            if (!kr1.n(o54Var.d.getValue(), o54Var.b())) {
                o54Var.g(j, z);
            }
            if (!kr1.n(o54Var.d.getValue(), o54Var.b())) {
                z2 = false;
            }
        }
        if (z2) {
            h();
        }
    }

    public final void h() {
        this.g.h(Long.MIN_VALUE);
        c64 c64Var = this.a;
        if (c64Var instanceof ni2) {
            ((ni2) c64Var).b.setValue(this.d.getValue());
        }
        if (this.b == null) {
            this.f.h(0L);
        }
        c64Var.a.setValue(Boolean.FALSE);
        ml3 ml3Var = this.j;
        int size = ml3Var.size();
        for (int i = 0; i < size; i++) {
            ((o54) ml3Var.get(i)).h();
        }
    }

    public final void i(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        c64 c64Var = this.a;
        c64Var.a.setValue(Boolean.FALSE);
        boolean zF = f();
        ft2 ft2Var = this.d;
        if (!zF || !kr1.n(b(), obj) || !kr1.n(ft2Var.getValue(), obj2)) {
            if (!kr1.n(b(), obj) && (c64Var instanceof ni2)) {
                ((ni2) c64Var).b.setValue(obj);
            }
            ft2Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new m54(obj, obj2));
        }
        ml3 ml3Var = this.j;
        int size = ml3Var.size();
        for (int i = 0; i < size; i++) {
            o54 o54Var = (o54) ml3Var.get(i);
            o54Var.getClass();
            if (o54Var.f()) {
                o54Var.i(o54Var.b(), o54Var.d.getValue());
            }
        }
        ml3 ml3Var2 = this.i;
        int size2 = ml3Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((n54) ml3Var2.get(i2)).c();
        }
    }

    public final void j(Object obj) {
        ft2 ft2Var = this.d;
        if (kr1.n(ft2Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new m54(ft2Var.getValue(), obj));
        if (!kr1.n(b(), ft2Var.getValue())) {
            ((ni2) this.a).b.setValue(ft2Var.getValue());
        }
        ft2Var.setValue(obj);
        if (this.g.f() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        ml3 ml3Var = this.i;
        int size = ml3Var.size();
        for (int i = 0; i < size; i++) {
            ((n54) ml3Var.get(i)).n.h(-2.0f);
        }
    }

    public final String toString() {
        ml3 ml3Var = this.i;
        int size = ml3Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((n54) ml3Var.get(i)) + ", ";
        }
        return str;
    }
}
