package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class wz1 implements gc3 {
    public static final fp1 w = yo4.J(pe.D, fl1.s);
    public final mz1 a;
    public boolean b;
    public jz1 c;
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
    public final mi2 s;
    public final ft2 t;
    public final ft2 u;
    public final sz0 v;

    public wz1(int i, int i2) {
        this(i, i2, new bt0());
    }

    public wz1(int i, int i2, mz1 mz1Var) {
        this.a = mz1Var;
        this.d = new nz1(i, i2, 0);
        this.e = new ft2(a02.a, t73.t);
        this.f = new hh2();
        this.h = new mt0(new e8(20, this));
        this.i = true;
        this.k = new uz1(this, 0);
        this.l = new yq();
        this.m = new b();
        this.n = new jx(1);
        mz1Var.getClass();
        this.o = new b12(new ta1(i, 2, this));
        this.p = new sz0(this);
        this.q = new y02();
        this.r = g13.u();
        this.s = g13.u();
        Boolean bool = Boolean.FALSE;
        this.t = cl3.d(bool);
        this.u = cl3.d(bool);
        this.v = new sz0(12);
    }

    @Override // defpackage.gc3
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.gc3
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.gc3
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
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
            boolean r0 = r9 instanceof defpackage.vz1
            if (r0 == 0) goto L13
            r0 = r9
            vz1 r0 = (defpackage.vz1) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            vz1 r0 = new vz1
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
            wz1 r6 = r0.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz1.d(ri2, ne1, uo0):java.lang.Object");
    }

    @Override // defpackage.gc3
    public final float e(float f) {
        return this.h.e(f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    public final void f(jz1 jz1Var, boolean z, boolean z2) {
        Object obj;
        int i;
        int i2;
        if (!z && this.b) {
            this.c = jz1Var;
            return;
        }
        if (z) {
            this.b = true;
        }
        float f = this.g;
        float f2 = jz1Var.d;
        List list = jz1Var.l;
        int i3 = jz1Var.b;
        lz1 lz1Var = jz1Var.a;
        this.g = f - f2;
        this.e.setValue(jz1Var);
        this.u.setValue(Boolean.valueOf(((lz1Var != null ? lz1Var.a : 0) == 0 && i3 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(jz1Var.c));
        nz1 nz1Var = this.d;
        if (z2) {
            nz1Var.getClass();
            if (i3 < 0.0f) {
                so1.c("scrollOffset should be non-negative");
            }
            nz1Var.c.h(i3);
        } else {
            nz1Var.getClass();
            if (lz1Var != null) {
                kz1[] kz1VarArr = lz1Var.b;
                kz1 kz1Var = kz1VarArr.length == 0 ? null : kz1VarArr[0];
                if (kz1Var != null) {
                    obj = kz1Var.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            nz1Var.e = obj;
            if (nz1Var.d || jz1Var.o > 0) {
                nz1Var.d = true;
                if (i3 < 0.0f) {
                    so1.c("scrollOffset should be non-negative (" + i3 + ')');
                }
                if (lz1Var != null) {
                    kz1[] kz1VarArr2 = lz1Var.b;
                    kz1 kz1Var2 = kz1VarArr2.length != 0 ? kz1VarArr2[0] : null;
                    if (kz1Var2 != null) {
                        i = kz1Var2.a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                nz1Var.a(i, i3);
            }
            if (this.i) {
                bt0 bt0Var = (bt0) this.a;
                oi2 oi2Var = bt0Var.b;
                if (bt0Var.a != -1) {
                    nq2 nq2Var = jz1Var.q;
                    if (!list.isEmpty()) {
                        boolean z3 = bt0Var.c;
                        nq2 nq2Var2 = nq2.c;
                        if (z3) {
                            kz1 kz1Var3 = (kz1) ke0.E0(list);
                            i2 = (nq2Var == nq2Var2 ? kz1Var3.r : kz1Var3.s) + 1;
                        } else {
                            kz1 kz1Var4 = (kz1) ke0.y0(list);
                            i2 = (nq2Var == nq2Var2 ? kz1Var4.r : kz1Var4.s) - 1;
                        }
                        if (bt0Var.a != i2) {
                            bt0Var.a = -1;
                            Object[] objArr = oi2Var.c;
                            int i4 = oi2Var.h;
                            for (int i5 = 0; i5 < i4; i5++) {
                                ((a12) objArr[i5]).cancel();
                            }
                            oi2Var.i();
                        }
                    }
                }
            }
        }
        if (z) {
            this.v.w(jz1Var.f, jz1Var.i, jz1Var.h);
        }
    }

    public final jz1 g() {
        return (jz1) this.e.getValue();
    }

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
    public final void h(float f, jz1 jz1Var) {
        int i;
        int i2;
        Object obj;
        if (this.i) {
            bt0 bt0Var = (bt0) this.a;
            oi2 oi2Var = bt0Var.b;
            List list = jz1Var.l;
            nq2 nq2Var = jz1Var.q;
            if (list.isEmpty()) {
                return;
            }
            boolean z = f < 0.0f;
            nq2 nq2Var2 = nq2.c;
            if (z) {
                kz1 kz1Var = (kz1) ke0.E0(list);
                i = (nq2Var == nq2Var2 ? kz1Var.r : kz1Var.s) + 1;
                i2 = ((kz1) ke0.E0(list)).a + 1;
            } else {
                kz1 kz1Var2 = (kz1) ke0.y0(list);
                i = (nq2Var == nq2Var2 ? kz1Var2.r : kz1Var2.s) - 1;
                i2 = ((kz1) ke0.y0(list)).a - 1;
            }
            if (i2 < 0 || i2 >= jz1Var.o) {
                return;
            }
            if (i != bt0Var.a && i >= 0) {
                if (bt0Var.c != z) {
                    Object[] objArr = oi2Var.c;
                    int i3 = oi2Var.h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((a12) objArr[i4]).cancel();
                    }
                }
                bt0Var.c = z;
                bt0Var.a = i;
                oi2Var.i();
                sz0 sz0Var = this.p;
                sz0Var.getClass();
                ArrayList arrayList = new ArrayList();
                wz1 wz1Var = (wz1) sz0Var.c;
                pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
                le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
                pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    jz1 jz1Var2 = wz1Var.b ? wz1Var.c : (jz1) wz1Var.e.getValue();
                    if (jz1Var2 != null) {
                        List list2 = (List) jz1Var2.k.invoke(Integer.valueOf(i));
                        int size = list2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            ps2 ps2Var = (ps2) list2.get(i5);
                            b12 b12Var = wz1Var.o;
                            wz1 wz1Var2 = wz1Var;
                            int iIntValue = ((Number) ps2Var.c).intValue();
                            um0 um0Var = (um0) ps2Var.d;
                            int i6 = size;
                            int i7 = i5;
                            long j = um0Var.a;
                            iy2 iy2Var = b12Var.c;
                            if (iy2Var != null) {
                                hy2 hy2Var = new hy2(iy2Var, iIntValue, j, b12Var.b);
                                ((jy2) iy2Var.l).e(hy2Var);
                                obj = hy2Var;
                            } else {
                                obj = u01.a;
                            }
                            arrayList.add(obj);
                            i5 = i7 + 1;
                            wz1Var = wz1Var2;
                            size = i6;
                        }
                    }
                    Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                    oi2Var.f(oi2Var.h, arrayList);
                } catch (Throwable th) {
                    Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
                    throw th;
                }
            }
            if (!z) {
                if (jz1Var.m - rz1.a((kz1) ke0.y0(list), nq2Var) < f) {
                    Object[] objArr2 = oi2Var.c;
                    int i8 = oi2Var.h;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((a12) objArr2[i9]).a();
                    }
                    return;
                }
                return;
            }
            kz1 kz1Var3 = (kz1) ke0.E0(list);
            if (((rz1.a(kz1Var3, nq2Var) + rz1.b(kz1Var3, nq2Var)) + jz1Var.s) - jz1Var.n < (-f)) {
                Object[] objArr3 = oi2Var.c;
                int i10 = oi2Var.h;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((a12) objArr3[i11]).a();
                }
            }
        }
    }
}
