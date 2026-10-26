package defpackage;

import androidx.compose.ui.platform.SubcompositionKt;
import java.util.List;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class iy1 implements vj0 {
    public final ux1 c;
    public qk0 d;
    public lp3 h;
    public int l;
    public int m;
    public final fi2 n;
    public final fi2 o;
    public final cy1 p;
    public final zx1 q;
    public final fi2 r;
    public final kp3 s;
    public final fi2 t;
    public final oi2 u;
    public int v;
    public int w;
    public final String x;

    public iy1(ux1 ux1Var, lp3 lp3Var) {
        this.c = ux1Var;
        this.h = lp3Var;
        long[] jArr = qa3.a;
        this.n = new fi2();
        this.o = new fi2();
        this.p = new cy1(this);
        this.q = new zx1(this);
        this.r = new fi2();
        this.s = new kp3();
        this.t = new fi2();
        this.u = new oi2(0, new Object[16]);
        this.x = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static m63 i(m63 m63Var, ux1 ux1Var, boolean z, qk0 qk0Var, yg0 yg0Var) {
        if (m63Var == null || ((tk0) m63Var).B) {
            m63Var = SubcompositionKt.createSubcomposition(ux1Var, qk0Var);
        }
        if (!z) {
            ((tk0) m63Var).m(yg0Var);
            return m63Var;
        }
        tk0 tk0Var = (tk0) m63Var;
        kk0 kk0Var = tk0Var.A;
        kk0Var.y = 100;
        kk0Var.x = true;
        tk0Var.m(yg0Var);
        if (kk0Var.E || kk0Var.y != 100) {
            zx2.a("Cannot disable reuse from root if it was caused by other groups");
        }
        kk0Var.y = -1;
        kk0Var.x = false;
        return m63Var;
    }

    public final void a(int i) {
        boolean z;
        boolean z2 = false;
        this.v = 0;
        List listO = this.c.o();
        th2 th2Var = (th2) listO;
        int i2 = (((oi2) th2Var.d).h - this.w) - 1;
        if (i <= i2) {
            this.s.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.n.g((ux1) th2Var.get(i3));
                    objG.getClass();
                    ((wh2) this.s.d).a(((ay1) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.h.d(this.s);
            pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
            le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
            pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
            z = false;
            while (i2 >= i) {
                try {
                    ux1 ux1Var = (ux1) ((th2) listO).get(i2);
                    Object objG2 = this.n.g(ux1Var);
                    objG2.getClass();
                    ay1 ay1Var = (ay1) objG2;
                    Object obj = ay1Var.a;
                    if (((wh2) this.s.d).c(obj)) {
                        this.v++;
                        if (((Boolean) ay1Var.f.getValue()).booleanValue()) {
                            yx1 yx1Var = ux1Var.O;
                            ub2 ub2Var = yx1Var.p;
                            sx1 sx1Var = sx1.h;
                            ub2Var.t = sx1Var;
                            s82 s82Var = yx1Var.q;
                            if (s82Var != null) {
                                s82Var.r = sx1Var;
                            }
                            ay1Var.f.setValue(Boolean.FALSE);
                            z = true;
                        }
                    } else {
                        ux1 ux1Var2 = this.c;
                        ux1Var2.y = true;
                        this.n.j(ux1Var);
                        m63 m63Var = ay1Var.c;
                        if (m63Var != null) {
                            ((tk0) m63Var).dispose();
                        }
                        this.c.N(i2, 1);
                        ux1Var2.y = false;
                    }
                    this.o.j(obj);
                    i2--;
                } catch (Throwable th) {
                    Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                    throw th;
                }
            }
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (vk3.b) {
                gi2 gi2Var = vk3.i.h;
                if (gi2Var != null && gi2Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                vk3.a();
            }
        }
        b();
    }

    public final void b() {
        int i = ((oi2) ((th2) this.c.o()).d).h;
        fi2 fi2Var = this.n;
        if (fi2Var.e != i) {
            po1.a("Inconsistency between the count of nodes tracked by the state (" + fi2Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.v) - this.w < 0) {
            StringBuilder sbS = ud2.s("Incorrect state. Total children ", ". Reusable children ", i);
            sbS.append(this.v);
            sbS.append(". Precomposed children ");
            sbS.append(this.w);
            po1.a(sbS.toString());
        }
        fi2 fi2Var2 = this.r;
        if (fi2Var2.e == this.w) {
            return;
        }
        po1.a("Incorrect state. Precomposed children " + this.w + ". Map size " + fi2Var2.e);
    }

    public final void c(boolean z) {
        this.w = 0;
        this.r.a();
        List listO = this.c.o();
        int i = ((oi2) ((th2) listO).d).h;
        if (this.v != i) {
            this.v = i;
            pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
            le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
            pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    ux1 ux1Var = (ux1) ((th2) listO).get(i2);
                    ay1 ay1Var = (ay1) this.n.g(ux1Var);
                    if (ay1Var != null && ((Boolean) ay1Var.f.getValue()).booleanValue()) {
                        yx1 yx1Var = ux1Var.O;
                        ub2 ub2Var = yx1Var.p;
                        sx1 sx1Var = sx1.h;
                        ub2Var.t = sx1Var;
                        s82 s82Var = yx1Var.q;
                        if (s82Var != null) {
                            s82Var.r = sx1Var;
                        }
                        if (z) {
                            m63 m63Var = ay1Var.c;
                            if (m63Var != null) {
                                ((tk0) m63Var).n();
                            }
                            ay1Var.f = cl3.d(Boolean.FALSE);
                        } else {
                            ay1Var.f.setValue(Boolean.FALSE);
                        }
                        ay1Var.a = fp3.a;
                    }
                } catch (Throwable th) {
                    Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                    throw th;
                }
            }
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            this.o.a();
        }
        b();
    }

    @Override // defpackage.vj0
    public final void d() {
        c(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0014->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[EDGE_INSN: B:21:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0051], SYNTHETIC] */
    @Override // defpackage.vj0
    public final void e() {
        m63 m63Var;
        ux1 ux1Var = this.c;
        ux1Var.y = true;
        fi2 fi2Var = this.n;
        Object[] objArr = fi2Var.c;
        long[] jArr = fi2Var.a;
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
                        if ((255 & j) < 128 && (m63Var = ((ay1) objArr[(i << 3) + i3]).c) != null) {
                            ((tk0) m63Var).dispose();
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
        ux1Var.M();
        ux1Var.y = false;
        fi2Var.a();
        this.o.a();
        this.w = 0;
        this.v = 0;
        this.r.a();
        b();
    }

    public final gp3 f(Object obj, ne1 ne1Var) {
        ux1 ux1Var = this.c;
        if (!ux1Var.F()) {
            return new fy1();
        }
        b();
        if (!this.o.c(obj)) {
            this.t.j(obj);
            fi2 fi2Var = this.r;
            Object objG = fi2Var.g(obj);
            if (objG == null) {
                objG = j(obj);
                if (objG != null) {
                    int iK = ((oi2) ((th2) ux1Var.o()).d).k(objG);
                    int i = ((oi2) ((th2) ux1Var.o()).d).h;
                    ux1Var.y = true;
                    ux1Var.J(iK, i, 1);
                    ux1Var.y = false;
                    this.w++;
                } else {
                    int i2 = ((oi2) ((th2) ux1Var.o()).d).h;
                    ux1 ux1Var2 = new ux1(2);
                    ux1Var.y = true;
                    ux1Var.z(ux1Var2, i2);
                    ux1Var.y = false;
                    this.w++;
                    objG = ux1Var2;
                }
                fi2Var.l(obj, objG);
            }
            h((ux1) objG, obj, ne1Var);
        }
        return new gy1(this, obj);
    }

    @Override // defpackage.vj0
    public final void g() {
        c(true);
    }

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
    public final void h(ux1 ux1Var, Object obj, ne1 ne1Var) {
        fi2 fi2Var = this.n;
        Object objG = fi2Var.g(ux1Var);
        Object obj2 = objG;
        if (objG == null) {
            yg0 yg0Var = nj0.a;
            ay1 ay1Var = new ay1();
            ay1Var.a = obj;
            ay1Var.b = yg0Var;
            ay1Var.c = null;
            ay1Var.f = cl3.d(Boolean.TRUE);
            fi2Var.l(ux1Var, ay1Var);
            obj2 = ay1Var;
        }
        ay1 ay1Var2 = (ay1) obj2;
        m63 m63Var = ay1Var2.c;
        boolean hasInvalidations = m63Var != null ? ((tk0) m63Var).getHasInvalidations() : true;
        if (ay1Var2.b != ne1Var || hasInvalidations || ay1Var2.d) {
            ay1Var2.b = ne1Var;
            pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
            le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
            pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                ux1 ux1Var2 = this.c;
                ux1Var2.y = true;
                ne1 ne1Var2 = ay1Var2.b;
                m63 m63Var2 = ay1Var2.c;
                qk0 qk0Var = this.d;
                if (qk0Var == null) {
                    po1.c("parent composition reference not set");
                    throw new eg0();
                }
                ay1Var2.c = i(m63Var2, ux1Var, ay1Var2.e, qk0Var, new yg0(-1750409193, new hy1(ay1Var2, ne1Var2), true));
                ay1Var2.e = false;
                ux1Var2.y = false;
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                ay1Var2.d = false;
            } catch (Throwable th) {
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                throw th;
            }
        }
    }

    public final ux1 j(Object obj) {
        fi2 fi2Var;
        int i;
        if (this.v == 0) {
            return null;
        }
        ux1 ux1Var = this.c;
        th2 th2Var = (th2) ux1Var.o();
        int i2 = ((oi2) th2Var.d).h - this.w;
        int i3 = i2 - this.v;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            fi2Var = this.n;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = fi2Var.g((ux1) th2Var.get(i5));
            objG.getClass();
            if (kr1.n(((ay1) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = fi2Var.g((ux1) th2Var.get(i4));
                objG2.getClass();
                ay1 ay1Var = (ay1) objG2;
                Object obj2 = ay1Var.a;
                if (obj2 == fp3.a || this.h.e(obj, obj2)) {
                    ay1Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            ux1Var.y = true;
            ux1Var.J(i5, i3, 1);
            ux1Var.y = false;
        }
        this.v--;
        ux1 ux1Var2 = (ux1) th2Var.get(i3);
        Object objG3 = fi2Var.g(ux1Var2);
        objG3.getClass();
        ay1 ay1Var2 = (ay1) objG3;
        ay1Var2.f = cl3.d(Boolean.TRUE);
        ay1Var2.e = true;
        ay1Var2.d = true;
        return ux1Var2;
    }
}
