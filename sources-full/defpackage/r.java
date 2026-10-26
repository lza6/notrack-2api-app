package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends ju0 implements hx2, cv1, xe3, i64 {
    public static final bg1 A = new bg1(19);
    public gh2 h;
    public ao1 l;
    public String m;
    public n73 n;
    public boolean o;
    public je1 p;
    public final gb1 q;
    public sq3 r;
    public iu0 s;
    public ry2 t;
    public xi1 u;
    public final lh2 v;
    public long w;
    public gh2 x;
    public boolean y;
    public final bg1 z;

    public r(gh2 gh2Var, ao1 ao1Var, boolean z, String str, n73 n73Var, je1 je1Var) {
        this.h = gh2Var;
        this.l = ao1Var;
        this.m = str;
        this.n = n73Var;
        this.o = z;
        this.p = je1Var;
        l lVar = new l(1, this, r.class, "onFocusChange", "onFocusChange(Z)V", 0, 0);
        boolean z2 = false;
        this.q = new gb1(gh2Var, 0, lVar);
        lh2 lh2Var = a82.a;
        this.v = new lh2();
        this.w = 0L;
        gh2 gh2Var2 = this.h;
        this.x = gh2Var2;
        if (gh2Var2 == null && this.l != null) {
            z2 = true;
        }
        this.y = z2;
        this.z = A;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[LOOP:0: B:13:0x0031->B:23:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[EDGE_INSN: B:27:0x0073->B:24:0x0073 BREAK  A[LOOP:0: B:13:0x0031->B:23:0x0070], SYNTHETIC] */
    public final void A0() {
        gh2 gh2Var = this.h;
        lh2 lh2Var = this.v;
        if (gh2Var != null) {
            ry2 ry2Var = this.t;
            if (ry2Var != null) {
                ((hh2) gh2Var).b(new qy2(ry2Var));
            }
            xi1 xi1Var = this.u;
            if (xi1Var != null) {
                ((hh2) gh2Var).b(new yi1(xi1Var));
            }
            Object[] objArr = lh2Var.c;
            long[] jArr = lh2Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((hh2) gh2Var).b(new qy2((ry2) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.t = null;
        this.u = null;
        lh2Var.a();
    }

    public final void B0() {
        ao1 ao1Var;
        if (this.s == null && (ao1Var = this.l) != null) {
            if (this.h == null) {
                this.h = new hh2();
            }
            this.q.A0(this.h);
            gh2 gh2Var = this.h;
            gh2Var.getClass();
            iu0 iu0VarA = ao1Var.a(gh2Var);
            v0(iu0VarA);
            this.s = iu0VarA;
        }
    }

    public void C0() {
    }

    @Override // defpackage.hx2
    public final void D(yw2 yw2Var, zw2 zw2Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.w = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        B0();
        int i = 0;
        so0 so0Var = null;
        if (this.o && zw2Var == zw2.d) {
            int i2 = yw2Var.d;
            if (i2 == 4) {
                py.F(getCoroutineScope(), null, null, new p(this, so0Var, i), 3);
            } else if (i2 == 5) {
                py.F(getCoroutineScope(), null, null, new p(this, so0Var, 1), 3);
            }
        }
        if (this.r == null) {
            q qVar = new q(i, this);
            yw2 yw2Var2 = oq3.a;
            sq3 sq3Var = new sq3(null, null, null, qVar);
            v0(sq3Var);
            this.r = sq3Var;
        }
        sq3 sq3Var2 = this.r;
        if (sq3Var2 != null) {
            sq3Var2.D(yw2Var, zw2Var, j);
        }
    }

    public abstract boolean D0(KeyEvent keyEvent);

    public abstract void E0(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    public final void F0(gh2 gh2Var, ao1 ao1Var, boolean z, String str, n73 n73Var, je1 je1Var) {
        boolean z2;
        boolean z3;
        iu0 iu0Var;
        boolean z4 = false;
        if (kr1.n(this.x, gh2Var)) {
            z2 = false;
        } else {
            A0();
            this.x = gh2Var;
            this.h = gh2Var;
            z2 = true;
        }
        if (!kr1.n(this.l, ao1Var)) {
            this.l = ao1Var;
            z2 = true;
        }
        boolean z5 = this.o;
        gb1 gb1Var = this.q;
        if (z5 != z) {
            if (z) {
                v0(gb1Var);
            } else {
                w0(gb1Var);
                A0();
            }
            y64.M(this).D();
            this.o = z;
        }
        if (!kr1.n(this.m, str)) {
            this.m = str;
            y64.M(this).D();
        }
        if (!kr1.n(this.n, n73Var)) {
            this.n = n73Var;
            y64.M(this).D();
        }
        this.p = je1Var;
        boolean z6 = this.y;
        gh2 gh2Var2 = this.x;
        if (z6 != (gh2Var2 == null && this.l != null)) {
            if (gh2Var2 == null && this.l != null) {
                z4 = true;
            }
            this.y = z4;
            z3 = (z4 || this.s != null) ? z2 : true;
        }
        if (z3 && ((iu0Var = this.s) != null || !this.y)) {
            if (iu0Var != null) {
                w0(iu0Var);
            }
            this.s = null;
            B0();
        }
        gb1Var.A0(this.h);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cv1
    public final boolean R(KeyEvent keyEvent) {
        boolean z;
        B0();
        long jY = av1.y(keyEvent);
        boolean z2 = this.o;
        int i = 2;
        so0 so0Var = null;
        lh2 lh2Var = this.v;
        int i2 = 1;
        if (z2 && av1.A(keyEvent) == 2 && a.j(keyEvent)) {
            if (lh2Var.b(jY)) {
                z = false;
            } else {
                ry2 ry2Var = new ry2(this.w);
                lh2Var.h(ry2Var, jY);
                if (this.h != null) {
                    py.F(getCoroutineScope(), null, null, new o(this, ry2Var, so0Var, i2), 3);
                }
                z = true;
            }
            if (D0(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.o && av1.A(keyEvent) == 1 && a.j(keyEvent)) {
            ry2 ry2Var2 = (ry2) lh2Var.g(jY);
            if (ry2Var2 != null) {
                if (this.h != null) {
                    py.F(getCoroutineScope(), null, null, new o(this, ry2Var2, so0Var, i), 3);
                }
                E0(keyEvent);
            }
            if (ry2Var2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        n73 n73Var = this.n;
        if (n73Var != null) {
            ef3.j(gf3Var, n73Var.a);
        }
        String str = this.m;
        j jVar = new j(0, this);
        pu1[] pu1VarArr = ef3.a;
        ((ue3) gf3Var).j(te3.b, new z0(str, jVar));
        if (this.o) {
            this.q.applySemantics(gf3Var);
        } else {
            ef3.c(gf3Var);
        }
        y0(gf3Var);
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.xe3
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // defpackage.hx2
    public final void h0() {
        xi1 xi1Var;
        gh2 gh2Var = this.h;
        if (gh2Var != null && (xi1Var = this.u) != null) {
            ((hh2) gh2Var).b(new yi1(xi1Var));
        }
        this.u = null;
        sq3 sq3Var = this.r;
        if (sq3Var != null) {
            sq3Var.h0();
        }
    }

    @Override // defpackage.cv1
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.i64
    public final Object o() {
        return this.z;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        if (!this.y) {
            B0();
        }
        if (this.o) {
            v0(this.q);
        }
    }

    @Override // defpackage.of2
    public final void onDetach() {
        A0();
        if (this.x == null) {
            this.h = null;
        }
        iu0 iu0Var = this.s;
        if (iu0Var != null) {
            w0(iu0Var);
        }
        this.s = null;
    }

    public void y0(gf3 gf3Var) {
    }

    public abstract Object z0(ix2 ix2Var, so0 so0Var);
}
