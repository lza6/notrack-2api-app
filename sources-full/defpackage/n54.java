package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n54 implements gn3 {
    public final w64 c;
    public final ft2 d;
    public final ft2 h;
    public final ft2 l;
    public final ft2 m;
    public final bt2 n;
    public boolean o;
    public final ft2 p;
    public cg q;
    public final dt2 r;
    public boolean s;
    public final tm3 t;
    public final /* synthetic */ o54 u;

    public n54(o54 o54Var, Object obj, cg cgVar, w64 w64Var) {
        this.u = o54Var;
        this.c = w64Var;
        ft2 ft2VarD = cl3.d(obj);
        this.d = ft2VarD;
        Object objInvoke = null;
        ft2 ft2VarD2 = cl3.d(kr1.l0(7, null));
        this.h = ft2VarD2;
        this.l = cl3.d(new qs3((o71) ft2VarD2.getValue(), w64Var, obj, ft2VarD.getValue(), cgVar));
        this.m = cl3.d(Boolean.TRUE);
        this.n = new bt2(-1.0f);
        this.p = cl3.d(obj);
        this.q = cgVar;
        this.r = new dt2(b().c());
        Float f = (Float) ae4.b.get(w64Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            cg cgVar2 = (cg) ((x64) w64Var).a.invoke(obj);
            int iB = cgVar2.b();
            for (int i = 0; i < iB; i++) {
                cgVar2.e(fFloatValue, i);
            }
            objInvoke = ((x64) this.c).b.invoke(cgVar2);
        }
        this.t = kr1.l0(3, objInvoke);
    }

    public final qs3 b() {
        return (qs3) this.l.getValue();
    }

    public final void c() {
        if (this.n.f() == -1.0f) {
            this.s = true;
            boolean zN = kr1.n(b().c, b().d);
            ft2 ft2Var = this.p;
            if (zN) {
                ft2Var.setValue(b().c);
            } else {
                ft2Var.setValue(b().b(0L));
                this.q = b().f(0L);
            }
        }
    }

    public final void d(Object obj, boolean z) {
        ft2 ft2Var = this.d;
        boolean zN = kr1.n(null, ft2Var.getValue());
        dt2 dt2Var = this.r;
        ft2 ft2Var2 = this.l;
        o71 o71Var = this.t;
        if (zN) {
            ft2Var2.setValue(new qs3(o71Var, this.c, obj, obj, this.q.c()));
            this.o = true;
            dt2Var.h(b().c());
            return;
        }
        ft2 ft2Var3 = this.h;
        if (!z || this.s || (((o71) ft2Var3.getValue()) instanceof tm3)) {
            o71Var = (o71) ft2Var3.getValue();
        }
        o54 o54Var = this.u;
        long jD = o54Var.d();
        ft2 ft2Var4 = o54Var.h;
        long jMax = 0;
        ft2Var2.setValue(new qs3(jD <= 0 ? o71Var : new bn3(o71Var, o54Var.d()), this.c, obj, ft2Var.getValue(), this.q));
        dt2Var.h(b().c());
        this.o = false;
        ft2Var4.setValue(Boolean.TRUE);
        if (o54Var.f()) {
            ml3 ml3Var = o54Var.i;
            int size = ml3Var.size();
            for (int i = 0; i < size; i++) {
                n54 n54Var = (n54) ml3Var.get(i);
                jMax = Math.max(jMax, n54Var.r.f());
                n54Var.c();
            }
            ft2Var4.setValue(Boolean.FALSE);
        }
    }

    public final void e(Object obj, Object obj2, o71 o71Var) {
        this.d.setValue(obj2);
        this.h.setValue(o71Var);
        if (kr1.n(b().d, obj) && kr1.n(b().c, obj2)) {
            return;
        }
        d(obj, false);
    }

    public final void f(Object obj, o71 o71Var) {
        if (this.o && kr1.n(obj, null)) {
            return;
        }
        ft2 ft2Var = this.d;
        boolean zN = kr1.n(ft2Var.getValue(), obj);
        bt2 bt2Var = this.n;
        if (zN && bt2Var.f() == -1.0f) {
            return;
        }
        ft2Var.setValue(obj);
        this.h.setValue(o71Var);
        float f = bt2Var.f();
        ft2 ft2Var2 = this.p;
        Object value = f == -3.0f ? obj : ft2Var2.getValue();
        ft2 ft2Var3 = this.m;
        d(value, !((Boolean) ft2Var3.getValue()).booleanValue());
        ft2Var3.setValue(Boolean.valueOf(bt2Var.f() == -3.0f));
        if (bt2Var.f() >= 0.0f) {
            ft2Var2.setValue(b().b((long) (bt2Var.f() * b().c())));
        } else if (bt2Var.f() == -3.0f) {
            ft2Var2.setValue(obj);
        }
        this.o = false;
        bt2Var.h(-1.0f);
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return this.p.getValue();
    }

    public final String toString() {
        return "current value: " + this.p.getValue() + ", target: " + this.d.getValue() + ", spec: " + ((o71) this.h.getValue());
    }
}
