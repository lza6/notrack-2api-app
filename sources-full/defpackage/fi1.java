package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 {
    public final cx1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final vh2 f = new vh2();
    public final bm2 g = new bm2();
    public final lh2 h = new lh2(10);

    public fi1(cx1 cx1Var) {
        this.a = cx1Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    public final void a(long j, List list, boolean z) {
        long[] jArr;
        ol2 ol2Var;
        Object objE;
        Object obj;
        lh2 lh2Var = this.h;
        lh2Var.a();
        int size = list.size();
        bm2 bm2Var = this.g;
        bm2 bm2Var2 = bm2Var;
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            of2 of2Var = (of2) list.get(i);
            if (of2Var.isAttached()) {
                of2Var.setDetachedListener$ui_release(new c9(this, 11, of2Var));
                if (z2) {
                    oi2 oi2Var = bm2Var2.a;
                    Object[] objArr = oi2Var.c;
                    int i2 = oi2Var.h;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (kr1.n(((ol2) obj).c, of2Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    ol2Var = (ol2) obj;
                    if (ol2Var != null) {
                        ol2Var.i = true;
                        ol2Var.d.b(j);
                        Object objE2 = lh2Var.e(j);
                        if (objE2 == null) {
                            objE2 = new vh2();
                            lh2Var.h(objE2, j);
                        }
                        ((vh2) objE2).g(ol2Var);
                    } else {
                        z2 = false;
                        ol2Var = new ol2(of2Var);
                        ol2Var.d.b(j);
                        objE = lh2Var.e(j);
                        if (objE == null) {
                            objE = new vh2();
                            lh2Var.h(objE, j);
                        }
                        ((vh2) objE).g(ol2Var);
                        bm2Var2.a.c(ol2Var);
                    }
                } else {
                    ol2Var = new ol2(of2Var);
                    ol2Var.d.b(j);
                    objE = lh2Var.e(j);
                    if (objE == null) {
                        objE = new vh2();
                        lh2Var.h(objE, j);
                    }
                    ((vh2) objE).g(ol2Var);
                    bm2Var2.a.c(ol2Var);
                }
                bm2Var2 = ol2Var;
            }
        }
        if (!z) {
            return;
        }
        long[] jArr2 = lh2Var.b;
        Object[] objArr2 = lh2Var.c;
        long[] jArr3 = lh2Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j2 = jArr3[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j2) < 128) {
                        int i8 = (i4 << 3) + i7;
                        long j3 = jArr2[i8];
                        vh2 vh2Var = (vh2) objArr2[i8];
                        oi2 oi2Var2 = bm2Var.a;
                        Object[] objArr3 = oi2Var2.c;
                        int i9 = oi2Var2.h;
                        int i10 = 0;
                        while (i10 < i9) {
                            ((ol2) objArr3[i10]).f(j3, vh2Var);
                            i10++;
                            jArr2 = jArr2;
                        }
                    }
                    j2 >>= i5;
                    i7++;
                    i5 = i5;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i6 != i5) {
                    return;
                }
            } else {
                jArr = jArr2;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            jArr2 = jArr;
        }
    }

    public final boolean b(cr1 cr1Var, boolean z) {
        j82 j82Var = (j82) cr1Var.b;
        cx1 cx1Var = this.a;
        bm2 bm2Var = this.g;
        boolean zA = bm2Var.a(j82Var, cx1Var, cr1Var, z);
        oi2 oi2Var = bm2Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((ol2) objArr[i2]).e(cr1Var, z) || z3;
        }
        Object[] objArr2 = oi2Var.c;
        int i3 = oi2Var.h;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((ol2) objArr2[i4]).d(cr1Var) || z4;
        }
        bm2Var.b(cr1Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            vh2 vh2Var = this.f;
            int i5 = vh2Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((of2) vh2Var.b(i6));
            }
            vh2Var.i();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            bm2Var.a.i();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        bm2 bm2Var = this.g;
        oi2 oi2Var = bm2Var.a;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ol2) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            bm2Var.a.i();
        }
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
    public final void d(of2 of2Var) {
        if (this.b) {
            this.e = true;
            this.f.g(of2Var);
            return;
        }
        bm2 bm2Var = this.g;
        vh2 vh2Var = bm2Var.b;
        vh2Var.i();
        vh2Var.g(bm2Var);
        while (true) {
            int i = vh2Var.b;
            if (i == 0) {
                return;
            }
            bm2 bm2Var2 = (bm2) vh2Var.k(i - 1);
            int i2 = 0;
            while (true) {
                oi2 oi2Var = bm2Var2.a;
                if (i2 < oi2Var.h) {
                    ol2 ol2Var = (ol2) oi2Var.c[i2];
                    if (kr1.n(ol2Var.c, of2Var)) {
                        bm2Var2.a.l(ol2Var);
                        ol2Var.c();
                    } else {
                        vh2Var.g(ol2Var);
                        i2++;
                    }
                }
            }
        }
    }
}
