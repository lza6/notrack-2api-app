package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s02 implements xb2 {
    public final n02 c;
    public final jp3 d;
    public final q02 h;
    public final dh2 l;

    public s02(n02 n02Var, jp3 jp3Var) {
        this.c = n02Var;
        this.d = jp3Var;
        this.h = (q02) n02Var.b.invoke();
        dh2 dh2Var = hq1.a;
        this.l = new dh2();
    }

    @Override // defpackage.wu0
    public final int C(long j) {
        return this.d.C(j);
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        return this.d.E(j);
    }

    @Override // defpackage.wu0
    public final int O(float f) {
        return this.d.O(f);
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
    public final List a(long j, int i) {
        dh2 dh2Var = this.l;
        List list = (List) dh2Var.b(i);
        if (list != null) {
            return list;
        }
        q02 q02Var = this.h;
        Object objB = q02Var.b(i);
        List listB0 = this.d.b0(objB, this.c.a(objB, i, q02Var.c(i)));
        int size = listB0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((qb2) listB0.get(i2)).c(j));
        }
        dh2Var.h(i, arrayList);
        return arrayList;
    }

    @Override // defpackage.wu0
    public final long c0(long j) {
        return this.d.c0(j);
    }

    @Override // defpackage.wu0
    public final float f0(long j) {
        return this.d.f0(j);
    }

    @Override // defpackage.xb2
    public final wb2 g0(int i, int i2, Map map, le1 le1Var) {
        return this.d.g0(i, i2, map, le1Var);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.d.getDensity();
    }

    @Override // defpackage.er1
    public final dx1 getLayoutDirection() {
        return this.d.getLayoutDirection();
    }

    @Override // defpackage.wu0
    public final long k0(float f) {
        return this.d.k0(f);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.d.l();
    }

    @Override // defpackage.wu0
    public final float q0(int i) {
        return this.d.q0(i);
    }

    @Override // defpackage.er1
    public final boolean r() {
        return this.d.r();
    }

    @Override // defpackage.wu0
    public final float r0(float f) {
        return this.d.r0(f);
    }

    @Override // defpackage.xb2
    public final wb2 s(int i, int i2, Map map, le1 le1Var) {
        return this.d.s(i, i2, map, le1Var);
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return this.d.t(f);
    }

    @Override // defpackage.wu0
    public final long u(long j) {
        return this.d.u(j);
    }

    @Override // defpackage.wu0
    public final float w(float f) {
        return this.d.w(f);
    }
}
