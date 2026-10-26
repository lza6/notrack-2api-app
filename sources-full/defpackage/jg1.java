package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class jg1 implements a {
    public static final AtomicBoolean x = new AtomicBoolean(true);
    public final long b;
    public final b10 c;
    public final a10 d;
    public final RenderNode e;
    public long f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public final int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;

    public jg1(AndroidComposeView androidComposeView, long j, b10 b10Var, a10 a10Var) {
        this.b = j;
        this.c = b10Var;
        this.d = a10Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.e = renderNodeCreate;
        this.f = 0L;
        this.i = 0L;
        if (x.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                j53.c(renderNodeCreate, j53.a(renderNodeCreate));
                j53.d(renderNodeCreate, j53.b(renderNodeCreate));
            }
            i53.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        x(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j2 = re0.b;
        this.q = j2;
        this.r = j2;
        this.t = 8.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void a() {
        this.e.setRotationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long b() {
        return 0L;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void c(float f) {
        this.p = f;
        this.e.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void d() {
        this.e.setTranslationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void discardDisplayList() {
        i53.a(this.e);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void e() {
        this.e.setRotationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long f() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void g(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            j53.c(this.e, gb2.X(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getAlpha() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getCameraDistance() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final boolean getHasDisplayList() {
        return this.e.isValid();
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
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getScaleX() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getScaleY() {
        return this.o;
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
        this.i = j;
        this.e.setOutline(outline);
        this.h = outline != null;
        w();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void i() {
        this.e.setTranslationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void j(y00 y00Var) {
        Canvas canvas = p9.a;
        DisplayListCanvas displayListCanvas = ((o9) y00Var).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.e);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void k(boolean z) {
        this.u = z;
        w();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int l() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void m(wu0 wu0Var, dx1 dx1Var, gg1 gg1Var, e8 e8Var) {
        Canvas canvasStart = this.e.start(Math.max((int) (this.f >> 32), (int) (this.i >> 32)), Math.max((int) (this.f & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            o9 o9Var = this.c.a;
            Canvas canvas = o9Var.a;
            o9Var.a = canvasStart;
            a10 a10Var = this.d;
            ci4 ci4Var = a10Var.d;
            long jW = y64.W(this.f);
            z00 z00Var = ((a10) ci4Var.l).c;
            wu0 wu0Var2 = z00Var.a;
            dx1 dx1Var2 = z00Var.b;
            y00 y00VarY = ci4Var.y();
            long jC = ci4Var.C();
            gg1 gg1Var2 = (gg1) ci4Var.h;
            ci4Var.K(wu0Var);
            ci4Var.M(dx1Var);
            ci4Var.J(o9Var);
            ci4Var.N(jW);
            ci4Var.h = gg1Var;
            o9Var.l();
            try {
                e8Var.invoke(a10Var);
                o9Var.i();
                ci4Var.K(wu0Var2);
                ci4Var.M(dx1Var2);
                ci4Var.J(y00VarY);
                ci4Var.N(jC);
                ci4Var.h = gg1Var2;
                o9Var.a = canvas;
                this.e.end(canvasStart);
            } catch (Throwable th) {
                o9Var.i();
                ci4 ci4Var2 = a10Var.d;
                ci4Var2.K(wu0Var2);
                ci4Var2.M(dx1Var2);
                ci4Var2.J(y00VarY);
                ci4Var2.N(jC);
                ci4Var2.h = gg1Var2;
                throw th;
            }
        } catch (Throwable th2) {
            this.e.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void n(int i) {
        this.j = i;
        if (i != 1 && this.k == 3) {
            x(i);
        } else {
            x(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void o(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            j53.d(this.e, gb2.X(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long p() {
        return this.b;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final Matrix q() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.e.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void r(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.e.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (qq1.a(this.f, j)) {
            return;
        }
        if (this.m) {
            this.e.setPivotX(i3 / 2.0f);
            this.e.setPivotY(i4 / 2.0f);
        }
        this.f = j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float s() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setAlpha(float f) {
        this.l = f;
        this.e.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setCameraDistance(float f) {
        this.t = f;
        this.e.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setRotationZ(float f) {
        this.s = f;
        this.e.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setScaleX(float f) {
        this.n = f;
        this.e.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setScaleY(float f) {
        this.o = f;
        this.e.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int t() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void u(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.e.setPivotX(((int) (this.f >> 32)) / 2.0f);
            this.e.setPivotY(((int) (4294967295L & this.f)) / 2.0f);
        } else {
            this.m = false;
            this.e.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.e.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long v() {
        return this.q;
    }

    public final void w() {
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.v) {
            this.v = z3;
            this.e.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            this.e.setClipToOutline(z2);
        }
    }

    public final void x(int i) {
        RenderNode renderNode = this.e;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }
}
