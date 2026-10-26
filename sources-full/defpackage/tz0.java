package defpackage;

import android.graphics.Paint;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public interface tz0 extends wu0 {
    static void B(wx1 wx1Var, yx yxVar, long j, long j2, long j3, uz0 uz0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        wx1Var.e(yxVar, j4, (i & 4) != 0 ? u0(wx1Var.c.b(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? b71.a : uz0Var);
    }

    static /* synthetic */ void H(tz0 tz0Var, nt2 nt2Var, long j, vo3 vo3Var, int i) {
        uz0 uz0Var = vo3Var;
        if ((i & 8) != 0) {
            uz0Var = b71.a;
        }
        tz0Var.Z(nt2Var, j, uz0Var);
    }

    static /* synthetic */ void K(tz0 tz0Var, long j, float f, long j2, vo3 vo3Var, int i) {
        if ((i & 4) != 0) {
            j2 = tz0Var.W();
        }
        long j3 = j2;
        uz0 uz0Var = vo3Var;
        if ((i & 16) != 0) {
            uz0Var = b71.a;
        }
        tz0Var.j0(j, f, j3, uz0Var);
    }

    static void T(wx1 wx1Var, yx yxVar, long j, long j2, float f, uz0 uz0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        wx1Var.d(yxVar, j3, (i & 4) != 0 ? u0(wx1Var.c.b(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? b71.a : uz0Var, (i & 64) != 0 ? 3 : 6);
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
    static void V(wx1 wx1Var, yx yxVar, long j, long j2, float f, float f2, int i) {
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        a10 a10Var = wx1Var.c;
        y00 y00Var = a10Var.c.c;
        bc bcVarF = a10Var.l;
        if (bcVarF == null) {
            bcVarF = vl0.f();
            bcVarF.m(1);
            a10Var.l = bcVarF;
        }
        Paint paint = (Paint) bcVarF.d;
        if (yxVar != null) {
            yxVar.a(f2, a10Var.b(), bcVarF);
        } else if (paint.getAlpha() / 255.0f != f2) {
            bcVarF.d(f2);
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
        if (bcVarF.b() != 0) {
            bcVarF.j(0);
        }
        if (bcVarF.c() != 0) {
            bcVarF.k(0);
        }
        if (!paint.isFilterBitmap()) {
            bcVarF.h(1);
        }
        y00Var.a(j, j2, bcVarF);
    }

    static void d0(tz0 tz0Var, bm1 bm1Var, long j, long j2, long j3, float f, te0 te0Var, int i, int i2) {
        tz0Var.k(bm1Var, 0L, j, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? j : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & Uuid.SIZE_BITS) != 0 ? null : te0Var, (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 1 : i);
    }

    static /* synthetic */ void f(tz0 tz0Var, long j, long j2, long j3, float f, te0 te0Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        tz0Var.a0(j, j4, (i & 4) != 0 ? u0(tz0Var.b(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 32) != 0 ? null : te0Var, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void h(tz0 tz0Var, nt2 nt2Var, yx yxVar, float f, vo3 vo3Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        uz0 uz0Var = vo3Var;
        if ((i & 8) != 0) {
            uz0Var = b71.a;
        }
        tz0Var.t0(nt2Var, yxVar, f2, uz0Var, (i & 32) != 0 ? 3 : 0);
    }

    static long u0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    ci4 A();

    void I(ng3 ng3Var, float f, long j);

    void S(long j, long j2, long j3, float f, int i);

    default long W() {
        return vl0.I(A().C());
    }

    void Z(nt2 nt2Var, long j, uz0 uz0Var);

    void a0(long j, long j2, long j3, float f, te0 te0Var, int i);

    default long b() {
        return A().C();
    }

    dx1 getLayoutDirection();

    void j0(long j, float f, long j2, uz0 uz0Var);

    void k(bm1 bm1Var, long j, long j2, long j3, long j4, float f, te0 te0Var, int i);

    void s0(long j, float f, float f2, long j2, long j3, uz0 uz0Var);

    void t0(nt2 nt2Var, yx yxVar, float f, uz0 uz0Var, int i);

    void v(long j, long j2, long j3, long j4, uz0 uz0Var);
}
