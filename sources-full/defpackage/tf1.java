package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class tf1 extends ju0 implements rz0 {
    public final /* synthetic */ int h = 1;
    public final bb l;
    public final g11 m;
    public Object n;

    public tf1(sq3 sq3Var, bb bbVar, g11 g11Var) {
        this.l = bbVar;
        this.m = g11Var;
        v0(sq3Var);
    }

    public tf1(sq3 sq3Var, bb bbVar, g11 g11Var, hs2 hs2Var) {
        this.l = bbVar;
        this.m = g11Var;
        this.n = hs2Var;
        v0(sq3Var);
    }

    public static boolean y0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean z0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode A0() {
        RenderNode renderNode = (RenderNode) this.n;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeT = h53.t();
        this.n = renderNodeT;
        return renderNodeT;
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        boolean zZ0;
        long j;
        char c;
        boolean z;
        boolean zY0;
        int i = this.h;
        bb bbVar = this.l;
        g11 g11Var = this.m;
        switch (i) {
            case 0:
                hs2 hs2Var = (hs2) this.n;
                a10 a10Var = wx1Var.c;
                bbVar.k(a10Var.b());
                if (bi3.e(a10Var.b())) {
                    wx1Var.a();
                    return;
                }
                wx1Var.a();
                bbVar.d.getValue();
                Canvas canvasA = p9.a(a10Var.d.y());
                if (g11.f(g11Var.f)) {
                    zZ0 = z0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(wx1Var.w(hs2Var.a(wx1Var.getLayoutDirection())))) & 4294967295L), g11Var.c(), canvasA);
                } else {
                    zZ0 = false;
                }
                if (g11.f(g11Var.d)) {
                    EdgeEffect edgeEffectE = g11Var.e();
                    zZ0 = z0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wx1Var.w(hs2Var.d()))) & 4294967295L), edgeEffectE, canvasA) || zZ0;
                }
                if (g11.f(g11Var.g)) {
                    EdgeEffect edgeEffectD = g11Var.d();
                    zZ0 = z0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wx1Var.w(hs2Var.b(wx1Var.getLayoutDirection())) + (-((float) gb2.R(Float.intBitsToFloat((int) (a10Var.b() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zZ0;
                }
                if (g11.f(g11Var.e)) {
                    EdgeEffect edgeEffectB = g11Var.b();
                    float fW = wx1Var.w(hs2Var.c());
                    zZ0 = z0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (a10Var.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (a10Var.b() & 4294967295L))) + fW)) & 4294967295L), edgeEffectB, canvasA) || zZ0;
                }
                if (zZ0) {
                    bbVar.f();
                    return;
                }
                return;
            default:
                a10 a10Var2 = wx1Var.c;
                bbVar.k(a10Var2.b());
                Canvas canvasA2 = p9.a(a10Var2.d.y());
                bbVar.d.getValue();
                if (bi3.e(a10Var2.b())) {
                    wx1Var.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = g11Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = g11Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = g11Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = g11Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = g11Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = g11Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = g11Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = g11Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    wx1Var.a();
                    return;
                }
                float fW2 = wx1Var.w(30.0f);
                boolean z2 = g11.f(g11Var.d) || g11.g(g11Var.h) || g11.f(g11Var.e) || g11.g(g11Var.i);
                boolean z3 = g11.f(g11Var.f) || g11.g(g11Var.j) || g11.f(g11Var.g) || g11.g(g11Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    A0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        A0().setPosition(0, 0, (gb2.R(fW2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            wx1Var.a();
                            return;
                        }
                        A0().setPosition(0, 0, canvasA2.getWidth(), (gb2.R(fW2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = A0().beginRecording();
                boolean zG = g11.g(g11Var.j);
                nq2 nq2Var = nq2.d;
                if (zG) {
                    EdgeEffect edgeEffectA = g11Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = g11Var.a(nq2Var);
                        g11Var.j = edgeEffectA;
                    }
                    y0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (g11.f(g11Var.f)) {
                    EdgeEffect edgeEffectC = g11Var.c();
                    zY0 = y0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (g11.g(g11Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (bbVar.e() & j));
                        EdgeEffect edgeEffectA2 = g11Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = g11Var.a(nq2Var);
                            g11Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fB = i2 >= 31 ? pg.b(edgeEffectC) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            pg.d(edgeEffectA2, fB, f);
                        } else {
                            edgeEffectA2.onPull(fB, f);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zY0 = false;
                }
                boolean zG2 = g11.g(g11Var.h);
                nq2 nq2Var2 = nq2.c;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = g11Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = g11Var.a(nq2Var2);
                        g11Var.h = edgeEffectA3;
                    }
                    y0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (g11.f(g11Var.d)) {
                    EdgeEffect edgeEffectE2 = g11Var.e();
                    zY0 = y0(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zY0;
                    if (g11.g(g11Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bbVar.e() >> c));
                        EdgeEffect edgeEffectA4 = g11Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = g11Var.a(nq2Var2);
                            g11Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fB2 = i3 >= 31 ? pg.b(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            pg.d(edgeEffectA4, fB2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                        }
                    }
                }
                if (g11.g(g11Var.k)) {
                    EdgeEffect edgeEffectA5 = g11Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = g11Var.a(nq2Var);
                        g11Var.k = edgeEffectA5;
                    }
                    y0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (g11.f(g11Var.g)) {
                    EdgeEffect edgeEffectD2 = g11Var.d();
                    zY0 = y0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zY0;
                    if (g11.g(g11Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bbVar.e() & j));
                        EdgeEffect edgeEffectA6 = g11Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = g11Var.a(nq2Var);
                            g11Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fB3 = i4 >= 31 ? pg.b(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            pg.d(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                }
                if (g11.g(g11Var.i)) {
                    EdgeEffect edgeEffectA7 = g11Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = g11Var.a(nq2Var2);
                        g11Var.i = edgeEffectA7;
                    }
                    y0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (g11.f(g11Var.e)) {
                    EdgeEffect edgeEffectB2 = g11Var.b();
                    boolean z4 = y0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zY0;
                    if (g11.g(g11Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (bbVar.e() >> c));
                        EdgeEffect edgeEffectA8 = g11Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = g11Var.a(nq2Var2);
                            g11Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fB4 = i5 >= 31 ? pg.b(edgeEffectB2) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            pg.d(edgeEffectA8, fB4, f2);
                        } else {
                            edgeEffectA8.onPull(fB4, f2);
                        }
                    }
                    zY0 = z4;
                }
                if (zY0) {
                    bbVar.f();
                }
                float f3 = z ? 0.0f : fW2;
                float f4 = z2 ? 0.0f : fW2;
                dx1 layoutDirection = wx1Var.getLayoutDirection();
                o9 o9Var = new o9();
                o9Var.a = recordingCanvasBeginRecording;
                long jB = a10Var2.b();
                ci4 ci4Var = a10Var2.d;
                z00 z00Var = ((a10) ci4Var.l).c;
                wu0 wu0Var = z00Var.a;
                dx1 dx1Var = z00Var.b;
                y00 y00VarY = ci4Var.y();
                long jC = a10Var2.d.C();
                ci4 ci4Var2 = a10Var2.d;
                gg1 gg1Var = (gg1) ci4Var2.h;
                ci4Var2.K(wx1Var);
                ci4Var2.M(layoutDirection);
                ci4Var2.J(o9Var);
                ci4Var2.N(jB);
                ci4Var2.h = null;
                o9Var.l();
                try {
                    ((jb) a10Var2.d.d).B(f3, f4);
                    try {
                        wx1Var.a();
                        float f5 = -f3;
                        float f6 = -f4;
                        ((jb) a10Var2.d.d).B(f5, f6);
                        o9Var.i();
                        ci4 ci4Var3 = a10Var2.d;
                        ci4Var3.K(wu0Var);
                        ci4Var3.M(dx1Var);
                        ci4Var3.J(y00VarY);
                        ci4Var3.N(jC);
                        ci4Var3.h = gg1Var;
                        A0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f5, f6);
                        canvasA2.drawRenderNode(A0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((jb) a10Var2.d.d).B(-f3, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    o9Var.i();
                    ci4 ci4Var4 = a10Var2.d;
                    ci4Var4.K(wu0Var);
                    ci4Var4.M(dx1Var);
                    ci4Var4.J(y00VarY);
                    ci4Var4.N(jC);
                    ci4Var4.h = gg1Var;
                    throw th2;
                }
        }
    }
}
