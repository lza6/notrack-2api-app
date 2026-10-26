package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class a10 implements tz0 {
    public final z00 c;
    public final ci4 d;
    public bc h;
    public bc l;

    public a10() {
        xu0 xu0Var = jr1.b;
        z00 z00Var = new z00();
        z00Var.a = xu0Var;
        z00Var.b = dx1.c;
        z00Var.c = w21.a;
        z00Var.d = 0L;
        this.c = z00Var;
        this.d = new ci4(this);
    }

    public static ks2 a(a10 a10Var, long j, uz0 uz0Var, float f, te0 te0Var, int i) {
        ks2 ks2VarE = a10Var.e(uz0Var);
        if (f != 1.0f) {
            j = re0.b(re0.d(j) * f, j);
        }
        bc bcVar = (bc) ks2VarE;
        Paint paint = (Paint) bcVar.d;
        if (!re0.c(gb2.b(paint.getColor()), j)) {
            bcVar.f(j);
        }
        if (((Shader) bcVar.h) != null) {
            bcVar.i(null);
        }
        if (!kr1.n((te0) bcVar.l, te0Var)) {
            bcVar.g(te0Var);
        }
        if (bcVar.c != i) {
            bcVar.e(i);
        }
        if (paint.isFilterBitmap()) {
            return ks2VarE;
        }
        bcVar.h(1);
        return ks2VarE;
    }

    @Override // defpackage.tz0
    public final ci4 A() {
        return this.d;
    }

    @Override // defpackage.tz0
    public final void I(ng3 ng3Var, float f, long j) {
        this.c.c.j(f, j, c(ng3Var, b71.a, 1.0f, null, 3, 1));
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
    @Override // defpackage.tz0
    public final void S(long j, long j2, long j3, float f, int i) {
        y00 y00Var = this.c.c;
        bc bcVarF = this.l;
        if (bcVarF == null) {
            bcVarF = vl0.f();
            bcVarF.m(1);
            this.l = bcVarF;
        }
        Paint paint = (Paint) bcVarF.d;
        if (!re0.c(gb2.b(paint.getColor()), j)) {
            bcVarF.f(j);
        }
        if (((Shader) bcVarF.h) != null) {
            bcVarF.i(null);
        }
        if (!kr1.n((te0) bcVarF.l, null)) {
            bcVarF.g(null);
        }
        if (bcVarF.c != 3) {
            bcVarF.e(3);
        }
        if (paint.getStrokeWidth() != f) {
            bcVarF.l(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (bcVarF.b() != i) {
            bcVarF.j(i);
        }
        if (bcVarF.c() != 0) {
            bcVarF.k(0);
        }
        if (!paint.isFilterBitmap()) {
            bcVarF.h(1);
        }
        y00Var.a(j2, j3, bcVarF);
    }

    @Override // defpackage.tz0
    public final void Z(nt2 nt2Var, long j, uz0 uz0Var) {
        this.c.c.c(nt2Var, a(this, j, uz0Var, 1.0f, null, 3));
    }

    @Override // defpackage.tz0
    public final void a0(long j, long j2, long j3, float f, te0 te0Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.c.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, b71.a, f, te0Var, i));
    }

    public final ks2 c(yx yxVar, uz0 uz0Var, float f, te0 te0Var, int i, int i2) {
        ks2 ks2VarE = e(uz0Var);
        if (yxVar != null) {
            yxVar.a(f, b(), ks2VarE);
        } else {
            bc bcVar = (bc) ks2VarE;
            Paint paint = (Paint) bcVar.d;
            if (((Shader) bcVar.h) != null) {
                bcVar.i(null);
            }
            long jB = gb2.b(paint.getColor());
            long j = re0.b;
            if (!re0.c(jB, j)) {
                bcVar.f(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                bcVar.d(f);
            }
        }
        bc bcVar2 = (bc) ks2VarE;
        if (!kr1.n((te0) bcVar2.l, te0Var)) {
            bcVar2.g(te0Var);
        }
        if (bcVar2.c != i) {
            bcVar2.e(i);
        }
        if (((Paint) bcVar2.d).isFilterBitmap() == i2) {
            return ks2VarE;
        }
        bcVar2.h(i2);
        return ks2VarE;
    }

    public final void d(bm1 bm1Var, jv jvVar) {
        this.c.c.h(bm1Var, c(null, b71.a, 1.0f, jvVar, 3, 1));
    }

    public final ks2 e(uz0 uz0Var) {
        if (kr1.n(uz0Var, b71.a)) {
            bc bcVar = this.h;
            if (bcVar != null) {
                return bcVar;
            }
            bc bcVarF = vl0.f();
            bcVarF.m(0);
            this.h = bcVarF;
            return bcVarF;
        }
        if (!(uz0Var instanceof vo3)) {
            u41.e();
            return null;
        }
        bc bcVarF2 = this.l;
        if (bcVarF2 == null) {
            bcVarF2 = vl0.f();
            bcVarF2.m(1);
            this.l = bcVarF2;
        }
        Paint paint = (Paint) bcVarF2.d;
        float strokeWidth = paint.getStrokeWidth();
        vo3 vo3Var = (vo3) uz0Var;
        float f = vo3Var.a;
        if (strokeWidth != f) {
            bcVarF2.l(f);
        }
        int iB = bcVarF2.b();
        int i = vo3Var.c;
        if (iB != i) {
            bcVarF2.j(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = vo3Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iC = bcVarF2.c();
        int i2 = vo3Var.d;
        if (iC == i2) {
            return bcVarF2;
        }
        bcVarF2.k(i2);
        return bcVarF2;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c.a.getDensity();
    }

    @Override // defpackage.tz0
    public final dx1 getLayoutDirection() {
        return this.c.b;
    }

    @Override // defpackage.tz0
    public final void j0(long j, float f, long j2, uz0 uz0Var) {
        this.c.c.j(f, j2, a(this, j, uz0Var, 1.0f, null, 3));
    }

    @Override // defpackage.tz0
    public final void k(bm1 bm1Var, long j, long j2, long j3, long j4, float f, te0 te0Var, int i) {
        this.c.c.p(bm1Var, j, j2, j3, j4, c(null, b71.a, f, te0Var, 3, i));
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.c.a.l();
    }

    @Override // defpackage.tz0
    public final void s0(long j, float f, float f2, long j2, long j3, uz0 uz0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.c.c.m(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, uz0Var, 1.0f, null, 3));
    }

    @Override // defpackage.tz0
    public final void t0(nt2 nt2Var, yx yxVar, float f, uz0 uz0Var, int i) {
        this.c.c.c(nt2Var, c(yxVar, uz0Var, f, null, i, 1));
    }

    @Override // defpackage.tz0
    public final void v(long j, long j2, long j3, long j4, uz0 uz0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.c.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, uz0Var, 1.0f, null, 3));
    }
}
