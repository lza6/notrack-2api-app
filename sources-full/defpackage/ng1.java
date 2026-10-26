package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.a;

/* JADX INFO: loaded from: classes.dex */
public final class ng1 implements a {
    public static final mg1 y = new mg1();
    public final qz0 b;
    public final long c;
    public final b10 d;
    public final dd4 e;
    public final Resources f;
    public final Rect g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final long n;
    public final int o;
    public int p;
    public float q;
    public boolean r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public float x;

    public ng1(qz0 qz0Var, long j) {
        b10 b10Var = new b10();
        a10 a10Var = new a10();
        this.b = qz0Var;
        this.c = j;
        this.d = b10Var;
        dd4 dd4Var = new dd4(qz0Var, b10Var, a10Var);
        this.e = dd4Var;
        this.f = qz0Var.getResources();
        this.g = new Rect();
        qz0Var.addView(dd4Var);
        dd4Var.setClipBounds(null);
        this.j = 0L;
        this.n = View.generateViewId();
        this.o = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 1.0f;
        this.t = 1.0f;
        long j2 = re0.b;
        this.v = j2;
        this.w = j2;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void a() {
        this.e.setRotationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long b() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void c(float f) {
        this.u = f;
        this.e.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void d() {
        this.e.setTranslationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void discardDisplayList() {
        this.b.removeViewInLayout(this.e);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void e() {
        this.e.setRotationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long f() {
        return this.w;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void g(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.e.setOutlineAmbientShadowColor(gb2.X(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getAlpha() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getCameraDistance() {
        return this.e.getCameraDistance() / this.f.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getRotationX() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getRotationY() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getRotationZ() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getScaleX() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getScaleY() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getTranslationX() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getTranslationY() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void h(Outline outline, long j) {
        dd4 dd4Var = this.e;
        dd4Var.m = outline;
        dd4Var.invalidateOutline();
        if ((this.m || dd4Var.getClipToOutline()) && outline != null) {
            dd4Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void i() {
        this.e.setTranslationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void j(y00 y00Var) {
        Rect rect;
        boolean z = this.k;
        dd4 dd4Var = this.e;
        if (z) {
            if ((this.m || dd4Var.getClipToOutline()) && !this.l) {
                rect = this.g;
                rect.left = 0;
                rect.top = 0;
                rect.right = dd4Var.getWidth();
                rect.bottom = dd4Var.getHeight();
            } else {
                rect = null;
            }
            dd4Var.setClipBounds(rect);
        }
        Canvas canvas = p9.a;
        if (((o9) y00Var).a.isHardwareAccelerated()) {
            this.b.a(y00Var, dd4Var, dd4Var.getDrawingTime());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void k(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.e.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int l() {
        return this.p;
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
    @Override // androidx.compose.ui.graphics.layer.a
    public final void m(wu0 wu0Var, dx1 dx1Var, gg1 gg1Var, e8 e8Var) {
        dd4 dd4Var = this.e;
        ViewParent parent = dd4Var.getParent();
        qz0 qz0Var = this.b;
        if (parent == null) {
            qz0Var.addView(dd4Var);
        }
        dd4Var.o = wu0Var;
        dd4Var.p = dx1Var;
        dd4Var.q = e8Var;
        dd4Var.r = gg1Var;
        if (dd4Var.isAttachedToWindow()) {
            dd4Var.setVisibility(4);
            dd4Var.setVisibility(0);
            try {
                b10 b10Var = this.d;
                mg1 mg1Var = y;
                o9 o9Var = b10Var.a;
                Canvas canvas = o9Var.a;
                o9Var.a = mg1Var;
                qz0Var.a(o9Var, dd4Var, dd4Var.getDrawingTime());
                b10Var.a.a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void n(int i) {
        this.p = i;
        dd4 dd4Var = this.e;
        boolean z = true;
        if (i == 1 || this.o != 3) {
            dd4Var.setLayerType(2, null);
            dd4Var.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i == 1) {
            dd4Var.setLayerType(2, null);
        } else if (i == 2) {
            dd4Var.setLayerType(0, null);
            z = false;
        } else {
            dd4Var.setLayerType(0, null);
        }
        dd4Var.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void o(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.e.setOutlineSpotShadowColor(gb2.X(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long p() {
        return this.c;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final Matrix q() {
        return this.e.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void r(int i, int i2, long j) {
        boolean zA = qq1.a(this.j, j);
        dd4 dd4Var = this.e;
        if (zA) {
            int i3 = this.h;
            if (i3 != i) {
                dd4Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                dd4Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || dd4Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            dd4Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.r) {
                dd4Var.setPivotX(i5 / 2.0f);
                dd4Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float s() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setAlpha(float f) {
        this.q = f;
        this.e.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setCameraDistance(float f) {
        this.e.setCameraDistance(f * this.f.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setRotationZ(float f) {
        this.x = f;
        this.e.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setScaleX(float f) {
        this.s = f;
        this.e.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setScaleY(float f) {
        this.t = f;
        this.e.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int t() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void u(long j) {
        long j2 = 9223372034707292159L & j;
        dd4 dd4Var = this.e;
        if (j2 != 9205357640488583168L) {
            this.r = false;
            dd4Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            dd4Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                dd4Var.resetPivot();
                return;
            }
            this.r = true;
            dd4Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            dd4Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long v() {
        return this.v;
    }
}
