package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import androidx.compose.ui.graphics.layer.a;

/* JADX INFO: loaded from: classes.dex */
public final class lg1 implements a {
    public final long b;
    public final b10 c;
    public final a10 d;
    public final RenderNode e;
    public long f;
    public Matrix g;
    public boolean h;
    public float i;
    public final int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;

    public lg1(long j) {
        b10 b10Var = new b10();
        a10 a10Var = new a10();
        this.b = j;
        this.c = b10Var;
        this.d = a10Var;
        RenderNode renderNodeC = kg1.c();
        this.e = renderNodeC;
        this.f = 0L;
        renderNodeC.setClipToBounds(false);
        x(renderNodeC, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j2 = re0.b;
        this.n = j2;
        this.o = j2;
        this.q = 8.0f;
        this.u = 0;
    }

    public static void x(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void a() {
        this.e.setRotationX(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long b() {
        return this.e.getUniqueId();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void c(float f) {
        this.m = f;
        this.e.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void d() {
        this.e.setTranslationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void discardDisplayList() {
        this.e.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void e() {
        this.e.setRotationY(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long f() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void g(long j) {
        this.n = j;
        this.e.setAmbientShadowColor(gb2.X(j));
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getAlpha() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getCameraDistance() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final boolean getHasDisplayList() {
        return this.e.hasDisplayList();
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
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getScaleX() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float getScaleY() {
        return this.l;
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
        ((o9) y00Var).a.drawRenderNode(this.e);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void k(boolean z) {
        this.r = z;
        w();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int l() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void m(wu0 wu0Var, dx1 dx1Var, gg1 gg1Var, e8 e8Var) {
        a10 a10Var = this.d;
        RecordingCanvas recordingCanvasBeginRecording = this.e.beginRecording();
        try {
            b10 b10Var = this.c;
            o9 o9Var = b10Var.a;
            Canvas canvas = o9Var.a;
            o9Var.a = recordingCanvasBeginRecording;
            ci4 ci4Var = a10Var.d;
            ci4Var.K(wu0Var);
            ci4Var.M(dx1Var);
            ci4Var.h = gg1Var;
            ci4Var.N(this.f);
            ci4Var.J(o9Var);
            e8Var.invoke(a10Var);
            b10Var.a.a = canvas;
        } finally {
            this.e.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void n(int i) {
        this.u = i;
        if (i != 1 && this.j == 3) {
            x(this.e, i);
        } else {
            x(this.e, 1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void o(long j) {
        this.o = j;
        this.e.setSpotShadowColor(gb2.X(j));
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
        this.e.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.f = y64.W(j);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float s() {
        return this.m;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setAlpha(float f) {
        this.i = f;
        this.e.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setCameraDistance(float f) {
        this.q = f;
        this.e.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setRotationZ(float f) {
        this.p = f;
        this.e.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setScaleX(float f) {
        this.k = f;
        this.e.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void setScaleY(float f) {
        this.l = f;
        this.e.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int t() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void u(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.e;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.e.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long v() {
        return this.n;
    }

    public final void w() {
        boolean z = this.r;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.s) {
            this.s = z3;
            this.e.setClipToBounds(z3);
        }
        if (z2 != this.t) {
            this.t = z2;
            this.e.setClipToOutline(z2);
        }
    }
}
