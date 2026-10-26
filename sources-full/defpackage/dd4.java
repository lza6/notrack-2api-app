package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.ui.graphics.layer.a;

/* JADX INFO: loaded from: classes.dex */
public final class dd4 extends View {
    public static final wv0 s = new wv0(3);
    public final qz0 c;
    public final b10 d;
    public final a10 h;
    public boolean l;
    public Outline m;
    public boolean n;
    public wu0 o;
    public dx1 p;
    public le1 q;
    public gg1 r;

    public dd4(qz0 qz0Var, b10 b10Var, a10 a10Var) {
        super(qz0Var.getContext());
        this.c = qz0Var;
        this.d = b10Var;
        this.h = a10Var;
        setOutlineProvider(s);
        this.n = true;
        this.o = jr1.b;
        this.p = dx1.c;
        a.a.getClass();
        this.q = sx.M;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b10 b10Var = this.d;
        o9 o9Var = b10Var.a;
        Canvas canvas2 = o9Var.a;
        o9Var.a = canvas;
        wu0 wu0Var = this.o;
        dx1 dx1Var = this.p;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        gg1 gg1Var = this.r;
        le1 le1Var = this.q;
        a10 a10Var = this.h;
        ci4 ci4Var = a10Var.d;
        z00 z00Var = ((a10) ci4Var.l).c;
        wu0 wu0Var2 = z00Var.a;
        dx1 dx1Var2 = z00Var.b;
        y00 y00VarY = ci4Var.y();
        ci4 ci4Var2 = a10Var.d;
        long jC = ci4Var2.C();
        gg1 gg1Var2 = (gg1) ci4Var2.h;
        ci4Var2.K(wu0Var);
        ci4Var2.M(dx1Var);
        ci4Var2.J(o9Var);
        ci4Var2.N(jFloatToRawIntBits);
        ci4Var2.h = gg1Var;
        o9Var.l();
        try {
            le1Var.invoke(a10Var);
            o9Var.i();
            ci4Var2.K(wu0Var2);
            ci4Var2.M(dx1Var2);
            ci4Var2.J(y00VarY);
            ci4Var2.N(jC);
            ci4Var2.h = gg1Var2;
            b10Var.a.a = canvas2;
            this.l = false;
        } catch (Throwable th) {
            o9Var.i();
            ci4Var2.K(wu0Var2);
            ci4Var2.M(dx1Var2);
            ci4Var2.J(y00VarY);
            ci4Var2.N(jC);
            ci4Var2.h = gg1Var2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.n;
    }

    public final b10 getCanvasHolder() {
        return this.d;
    }

    public final View getOwnerView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.l) {
            return;
        }
        this.l = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.n != z) {
            this.n = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.l = z;
    }
}
