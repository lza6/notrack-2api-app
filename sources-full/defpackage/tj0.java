package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class tj0 extends View.DragShadowBuilder {
    public final xu0 a;
    public final long b;
    public final le1 c;

    public tj0(xu0 xu0Var, long j, le1 le1Var) {
        this.a = xu0Var;
        this.b = j;
        this.c = le1Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        a10 a10Var = new a10();
        Canvas canvas2 = p9.a;
        o9 o9Var = new o9();
        o9Var.a = canvas;
        z00 z00Var = a10Var.c;
        wu0 wu0Var = z00Var.a;
        dx1 dx1Var = z00Var.b;
        y00 y00Var = z00Var.c;
        long j = z00Var.d;
        z00Var.a = this.a;
        z00Var.b = dx1.c;
        z00Var.c = o9Var;
        z00Var.d = this.b;
        o9Var.l();
        this.c.invoke(a10Var);
        o9Var.i();
        z00Var.a = wu0Var;
        z00Var.b = dx1Var;
        z00Var.c = y00Var;
        z00Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        xu0 xu0Var = this.a;
        point.set(xu0Var.O(fIntBitsToFloat / xu0Var.getDensity()), xu0Var.O(Float.intBitsToFloat((int) (j & 4294967295L)) / xu0Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
