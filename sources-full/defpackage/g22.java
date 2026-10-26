package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class g22 implements gc3 {
    public static final fp1 w = yo4.J(pe.F, fl1.w);
    public final b22 a;
    public boolean b;
    public z12 c;
    public final nz1 d;
    public final ft2 e;
    public final hh2 f;
    public float g;
    public final mt0 h;
    public final boolean i;
    public ux1 j;
    public final uz1 k;
    public final yq l;
    public final b m;
    public final jx n;
    public final b12 o;
    public final sz0 p;
    public final y02 q;
    public final mi2 r;
    public final ft2 s;
    public final ft2 t;
    public final mi2 u;
    public final sz0 v;

    public g22(int i, int i2) {
        dt0 dt0Var = new dt0();
        dt0Var.a = -1;
        this(i, i2, dt0Var);
    }

    public g22(int i, int i2, b22 b22Var) {
        this.a = b22Var;
        this.d = new nz1(i, i2, 1);
        this.e = new ft2(h22.a, t73.t);
        this.f = new hh2();
        this.h = new mt0(new e8(26, this));
        this.i = true;
        this.k = new uz1(this, 1);
        this.l = new yq();
        this.m = new b();
        this.n = new jx(1);
        b22Var.getClass();
        this.o = new b12(new ta1(i, 3, this));
        this.p = new sz0(this);
        this.q = new y02();
        this.r = g13.u();
        Boolean bool = Boolean.FALSE;
        this.s = cl3.d(bool);
        this.t = cl3.d(bool);
        this.u = g13.u();
        this.v = new sz0(12);
    }

    @Override // defpackage.gc3
    public final boolean a() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.gc3
    public final boolean c() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.d(r7, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ri2 r7, defpackage.ne1 r8, defpackage.uo0 r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.f22
            if (r0 == 0) goto L13
            r0 = r9
            f22 r0 = (defpackage.f22) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            f22 r0 = new f22
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.l
            int r1 = r0.n
            r2 = 2
            r3 = 1
            r4 = 0
            hq0 r5 = defpackage.hq0.c
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.g13.O(r9)
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u41.r(r6)
            return r4
        L31:
            mq3 r6 = r0.h
            r8 = r6
            ne1 r8 = (defpackage.ne1) r8
            ri2 r7 = r0.d
            g22 r6 = r0.c
            defpackage.g13.O(r9)
            goto L55
        L3e:
            defpackage.g13.O(r9)
            r0.c = r6
            r0.d = r7
            r9 = r8
            mq3 r9 = (defpackage.mq3) r9
            r0.h = r9
            r0.n = r3
            yq r9 = r6.l
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r5) goto L55
            goto L65
        L55:
            mt0 r6 = r6.h
            r0.c = r4
            r0.d = r4
            r0.h = r4
            r0.n = r2
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L66
        L65:
            return r5
        L66:
            w84 r6 = defpackage.w84.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g22.d(ri2, ne1, uo0):java.lang.Object");
    }

    @Override // defpackage.gc3
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(z12 z12Var, boolean z, boolean z2) {
        if (!z && this.b) {
            this.c = z12Var;
            return;
        }
        if (z) {
            this.b = true;
        }
        a22 a22Var = z12Var.a;
        List list = z12Var.k;
        int i = z12Var.b;
        this.t.setValue(Boolean.valueOf(((a22Var != null ? a22Var.a : 0) == 0 && i == 0) ? false : true));
        this.s.setValue(Boolean.valueOf(z12Var.c));
        this.g -= z12Var.d;
        this.e.setValue(z12Var);
        nz1 nz1Var = this.d;
        if (z2) {
            nz1Var.getClass();
            if (i < 0.0f) {
                so1.c("scrollOffset should be non-negative");
            }
            nz1Var.c.h(i);
        } else {
            nz1Var.getClass();
            nz1Var.e = a22Var != null ? a22Var.j : null;
            if (nz1Var.d || z12Var.n > 0) {
                nz1Var.d = true;
                if (i < 0.0f) {
                    so1.c("scrollOffset should be non-negative");
                }
                nz1Var.a(a22Var != null ? a22Var.a : 0, i);
            }
            if (this.i) {
                dt0 dt0Var = (dt0) this.a;
                if (dt0Var.a != -1 && !list.isEmpty()) {
                    if (dt0Var.a != (dt0Var.c ? ((a22) ke0.E0(list)).a + 1 : ((a22) ke0.y0(list)).a - 1)) {
                        dt0Var.a = -1;
                        a12 a12Var = dt0Var.b;
                        if (a12Var != null) {
                            a12Var.cancel();
                        }
                        dt0Var.b = null;
                    }
                }
            }
        }
        if (z) {
            this.v.w(z12Var.f, z12Var.i, z12Var.h);
        }
    }

    public final z12 g() {
        return (z12) this.e.getValue();
    }

    public final void h(float f, z12 z12Var) {
        a12 a12Var;
        a12 a12Var2;
        a12 a12Var3;
        a12 a12Var4;
        if (this.i) {
            dt0 dt0Var = (dt0) this.a;
            dt0Var.getClass();
            List list = z12Var.k;
            if (list.isEmpty()) {
                return;
            }
            boolean z = f < 0.0f;
            int i = z ? ((a22) ke0.E0(list)).a + 1 : ((a22) ke0.y0(list)).a - 1;
            if (i < 0 || i >= z12Var.n) {
                return;
            }
            if (i != dt0Var.a) {
                if (dt0Var.c != z && (a12Var4 = dt0Var.b) != null) {
                    a12Var4.cancel();
                }
                dt0Var.c = z;
                dt0Var.a = i;
                g22 g22Var = (g22) this.p.c;
                pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
                le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
                pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    long j = ((z12) g22Var.e.getValue()).j;
                    Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                    b12 b12Var = g22Var.o;
                    iy2 iy2Var = b12Var.c;
                    if (iy2Var != null) {
                        hy2 hy2Var = new hy2(iy2Var, i, j, b12Var.b);
                        ((jy2) iy2Var.l).e(hy2Var);
                        a12Var3 = hy2Var;
                    } else {
                        a12Var3 = u01.a;
                    }
                    dt0Var.b = a12Var3;
                } catch (Throwable th) {
                    Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                    throw th;
                }
            }
            if (!z) {
                if (z12Var.l - ((a22) ke0.y0(list)).m >= f || (a12Var = dt0Var.b) == null) {
                    return;
                }
                a12Var.a();
                return;
            }
            a22 a22Var = (a22) ke0.E0(list);
            if (((a22Var.m + a22Var.n) + z12Var.r) - z12Var.m >= (-f) || (a12Var2 = dt0Var.b) == null) {
                return;
            }
            a12Var2.a();
        }
    }

    public final Object i(int i, int i2, so0 so0Var) throws Throwable {
        Object objD = d(ri2.c, new ja0(this, i, i2, null), (uo0) so0Var);
        return objD == hq0.c ? objD : w84.a;
    }

    public final void j(int i, int i2, boolean z) {
        nz1 nz1Var = this.d;
        if (nz1Var.b.f() != i || nz1Var.c.f() != i2) {
            b bVar = this.m;
            bVar.d();
            bVar.b = null;
        }
        nz1Var.a(i, i2);
        nz1Var.e = null;
        if (!z) {
            this.r.setValue(w84.a);
            return;
        }
        ux1 ux1Var = this.j;
        if (ux1Var != null) {
            ux1Var.k();
        }
    }
}
