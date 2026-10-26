package defpackage;

import android.os.Trace;
import androidx.compose.ui.layout.ContentScale$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tm extends ms2 implements a53 {
    public static final f2 D = new f2(2);
    public final jn3 A;
    public final jn3 B;
    public final s23 C;
    public te0 p;
    public boolean q;
    public gs1 r;
    public gq0 t;
    public le1 v;
    public xm y;
    public nm z;
    public final ft2 n = cl3.d(null);
    public float o = 1.0f;
    public long s = 9205357640488583168L;
    public le1 u = D;
    public sn0 w = ContentScale$Companion.getFit();
    public int x = 1;

    public tm(nm nmVar) {
        this.z = nmVar;
        this.A = gb2.f(nmVar);
        jn3 jn3VarF = gb2.f(om.a);
        this.B = jn3VarF;
        this.C = new s23(jn3VarF);
    }

    public static final pm1 j(tm tmVar, pm1 pm1Var, boolean z) {
        mm1 mm1VarA = pm1.a(pm1Var);
        mm1VarA.d = new bi4(pm1Var, tmVar);
        om1 om1Var = pm1Var.u;
        if (om1Var.g == null) {
            mm1VarA.n = gi3.e;
        }
        if (om1Var.h == null) {
            sn0 sn0Var = tmVar.w;
            int i = ra4.b;
            mm1VarA.o = (kr1.n(sn0Var, ContentScale$Companion.getFit()) || kr1.n(sn0Var, ContentScale$Companion.getInside())) ? ma3.d : ma3.c;
        }
        if (om1Var.i == null) {
            mm1VarA.p = wx2.d;
        }
        if (z) {
            x21 x21Var = x21.c;
            mm1VarA.h = x21Var;
            mm1VarA.i = x21Var;
            mm1VarA.j = x21Var;
        }
        return mm1VarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0048, please report this as an issue */
    public static final void k(tm tmVar, sm smVar) {
        tm1 tm1Var;
        le1 le1Var;
        Object objA;
        a53 a53Var;
        a53 a53Var2;
        jn3 jn3Var = tmVar.B;
        sm smVar2 = (sm) jn3Var.getValue();
        sm smVar3 = (sm) tmVar.u.invoke(smVar);
        jn3Var.o(smVar3);
        if (!(smVar3 instanceof rm)) {
            if (smVar3 instanceof pm) {
                tm1Var = ((pm) smVar3).b;
            }
            tmVar.n.setValue(smVar3.a());
            if (smVar2.a() != smVar3.a()) {
                objA = smVar2.a();
                if (objA instanceof a53) {
                    a53Var = (a53) objA;
                } else {
                    a53Var = null;
                }
                if (a53Var != null) {
                    a53Var.d();
                }
                Object objA2 = smVar3.a();
                a53Var2 = objA2 instanceof a53 ? (a53) objA2 : null;
                if (a53Var2 != null) {
                    a53Var2.a();
                }
            }
            le1Var = tmVar.v;
            if (le1Var != null) {
                le1Var.invoke(smVar3);
            }
        }
        tm1Var = ((rm) smVar3).b;
        ((fm2) y64.z(tm1Var.a(), sm1.a)).getClass();
        tmVar.n.setValue(smVar3.a());
        if (smVar2.a() != smVar3.a()) {
            objA = smVar2.a();
            if (objA instanceof a53) {
                a53Var = (a53) objA;
            } else {
                a53Var = null;
            }
            if (a53Var != null) {
                a53Var.d();
            }
            Object objA3 = smVar3.a();
            if (objA3 instanceof a53) {
            }
            if (a53Var2 != null) {
                a53Var2.a();
            }
        }
        le1Var = tmVar.v;
        if (le1Var != null) {
            le1Var.invoke(smVar3);
        }
    }

    @Override // defpackage.a53
    public final void a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (ms2) this.n.getValue();
            a53 a53Var = obj instanceof a53 ? (a53) obj : null;
            if (a53Var != null) {
                a53Var.a();
            }
            l();
            this.q = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.a53
    public final void b() {
        gs1 gs1Var = this.r;
        if (gs1Var != null) {
            gs1Var.c(null);
        }
        this.r = null;
        Object obj = (ms2) this.n.getValue();
        a53 a53Var = obj instanceof a53 ? (a53) obj : null;
        if (a53Var != null) {
            a53Var.b();
        }
        this.q = false;
    }

    @Override // defpackage.ms2
    public final boolean c(float f) {
        this.o = f;
        return true;
    }

    @Override // defpackage.a53
    public final void d() {
        gs1 gs1Var = this.r;
        if (gs1Var != null) {
            gs1Var.c(null);
        }
        this.r = null;
        Object obj = (ms2) this.n.getValue();
        a53 a53Var = obj instanceof a53 ? (a53) obj : null;
        if (a53Var != null) {
            a53Var.d();
        }
        this.q = false;
    }

    @Override // defpackage.ms2
    public final boolean e(te0 te0Var) {
        this.p = te0Var;
        return true;
    }

    @Override // defpackage.ms2
    public final long h() {
        ms2 ms2Var = (ms2) this.n.getValue();
        if (ms2Var != null) {
            return ms2Var.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.ms2
    public final void i(tz0 tz0Var) {
        long jB = tz0Var.b();
        if (!bi3.a(this.s, jB)) {
            this.s = jB;
        }
        ms2 ms2Var = (ms2) this.n.getValue();
        if (ms2Var != null) {
            ms2Var.g(tz0Var, tz0Var.b(), this.o, this.p);
        }
    }

    public final void l() {
        nm nmVar = this.z;
        if (nmVar == null) {
            return;
        }
        gq0 gq0Var = this.t;
        if (gq0Var == null) {
            kr1.n0("scope");
            throw null;
        }
        q8 q8Var = new q8((Object) this, (Object) nmVar, (so0) null, 5, false);
        xp0 coroutineContext = gq0Var.getCoroutineContext();
        int i = ra4.b;
        zp0 zp0Var = (zp0) coroutineContext.get(zp0.Key);
        jq0 jq0Var = jq0.l;
        ym3 ym3VarE = (zp0Var == null || zp0Var.equals(sw0.b)) ? py.E(gq0Var, sw0.b, jq0Var, q8Var) : py.E(yo4.a(new zt0(gq0Var.getCoroutineContext())), new au0(zp0Var), jq0Var, q8Var);
        gs1 gs1Var = this.r;
        if (gs1Var != null) {
            gs1Var.c(null);
        }
        this.r = ym3VarE;
    }

    public final void m(nm nmVar) {
        if (kr1.n(this.z, nmVar)) {
            return;
        }
        this.z = nmVar;
        if (nmVar == null) {
            gs1 gs1Var = this.r;
            if (gs1Var != null) {
                gs1Var.c(null);
            }
            this.r = null;
        } else if (this.q) {
            l();
        }
        if (nmVar != null) {
            jn3 jn3Var = this.A;
            jn3Var.getClass();
            jn3Var.p(null, nmVar);
        }
    }
}
