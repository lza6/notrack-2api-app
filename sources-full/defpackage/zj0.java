package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class zj0 implements ScrollCaptureCallback {
    public final ze3 a;
    public final mq1 b;
    public final ib3 c;
    public final AndroidComposeView d;
    public final qo0 e;
    public final ui1 f;

    public zj0(ze3 ze3Var, mq1 mq1Var, qo0 qo0Var, ib3 ib3Var, AndroidComposeView androidComposeView) {
        this.a = ze3Var;
        this.b = mq1Var;
        this.c = ib3Var;
        this.d = androidComposeView;
        this.e = new qo0(qo0Var.c.plus(gw0.d));
        this.f = new ui1(mq1Var.b(), new yj0(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(zj0 zj0Var, ScrollCaptureSession scrollCaptureSession, mq1 mq1Var, uo0 uo0Var) {
        xj0 xj0Var;
        int i;
        int i2;
        zj0 zj0Var2;
        int i3;
        ScrollCaptureSession scrollCaptureSessionG;
        int i4;
        int iX;
        int iX2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (uo0Var instanceof xj0) {
            xj0Var = (xj0) uo0Var;
            int i7 = xj0Var.p;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                xj0Var.p = i7 - Integer.MIN_VALUE;
            } else {
                xj0Var = new xj0(zj0Var, uo0Var);
            }
        } else {
            xj0Var = new xj0(zj0Var, uo0Var);
        }
        Object obj = xj0Var.n;
        int i8 = xj0Var.p;
        hq0 hq0Var = hq0.c;
        if (i8 == 0) {
            g13.O(obj);
            i = mq1Var.b;
            i2 = mq1Var.d;
            ui1 ui1Var = zj0Var.f;
            xj0Var.c = zj0Var;
            xj0Var.d = scrollCaptureSession;
            xj0Var.h = mq1Var;
            xj0Var.l = i;
            xj0Var.m = i2;
            xj0Var.p = 1;
            int i9 = ui1Var.a;
            if (i > i2) {
                u41.h(ud2.l(i, i2, "Expected min=", " ≤ max="));
                return null;
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                u41.h(ud2.l(i10, i9, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = ui1Var.b;
            Object obj2 = w84.a;
            if (f < f2 || i2 > i9 + f2) {
                Object objB = ui1Var.b((f < f2 ? i : i2 - i9) - f2, xj0Var);
                if (objB != hq0Var) {
                    objB = obj2;
                }
                if (objB == hq0Var) {
                    obj2 = objB;
                }
            }
            if (obj2 != hq0Var) {
            }
            return hq0Var;
        }
        if (i8 == 1) {
            int i11 = xj0Var.m;
            int i12 = xj0Var.l;
            mq1Var = xj0Var.h;
            ScrollCaptureSession scrollCaptureSessionG2 = s9.g(xj0Var.d);
            zj0 zj0Var3 = xj0Var.c;
            g13.O(obj);
            i = i12;
            scrollCaptureSession = scrollCaptureSessionG2;
            i2 = i11;
            zj0Var = zj0Var3;
        } else {
            if (i8 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = xj0Var.m;
            i4 = xj0Var.l;
            mq1Var = xj0Var.h;
            scrollCaptureSessionG = s9.g(xj0Var.d);
            zj0Var2 = xj0Var.c;
            g13.O(obj);
        }
        ui1 ui1Var2 = zj0Var2.f;
        iX = py.x(i4 - gb2.R(ui1Var2.b), 0, ui1Var2.a);
        ui1 ui1Var3 = zj0Var2.f;
        iX2 = py.x(i3 - gb2.R(ui1Var3.b), 0, ui1Var3.a);
        i5 = mq1Var.a;
        i6 = mq1Var.c;
        if (iX == iX2) {
            return mq1.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionG.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iX);
            mq1 mq1Var2 = zj0Var2.b;
            canvasLockHardwareCanvas.translate(-mq1Var2.a, -mq1Var2.b);
            zj0Var2.d.getRootView().draw(canvasLockHardwareCanvas);
            int iR = gb2.R(zj0Var2.f.b);
            return new mq1(i5, iX + iR, i6, iX2 + iR);
        } finally {
            scrollCaptureSessionG.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        sx sxVar = sx.o;
        xj0Var.c = zj0Var;
        xj0Var.d = scrollCaptureSession;
        xj0Var.h = mq1Var;
        xj0Var.l = i;
        xj0Var.m = i2;
        xj0Var.p = 2;
        if (yo4.z(xj0Var.getContext()).withFrameNanos(sxVar, xj0Var) != hq0Var) {
            zj0Var2 = zj0Var;
            i3 = i2;
            scrollCaptureSessionG = scrollCaptureSession;
            i4 = i;
            ui1 ui1Var4 = zj0Var2.f;
            iX = py.x(i4 - gb2.R(ui1Var4.b), 0, ui1Var4.a);
            ui1 ui1Var5 = zj0Var2.f;
            iX2 = py.x(i3 - gb2.R(ui1Var5.b), 0, ui1Var5.a);
            i5 = mq1Var.a;
            i6 = mq1Var.c;
            if (iX == iX2) {
                return mq1.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionG.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iX);
            mq1 mq1Var3 = zj0Var2.b;
            canvasLockHardwareCanvas.translate(-mq1Var3.a, -mq1Var3.b);
            zj0Var2.d.getRootView().draw(canvasLockHardwareCanvas);
            int iR2 = gb2.R(zj0Var2.f.b);
            return new mq1(i5, iX + iR2, i6, iX2 + iR2);
        }
        return hq0Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        py.F(this.e, cm2.c, null, new k(this, runnable, null, 13), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        ym3 ym3VarF = py.F(this.e, null, null, new qb(this, scrollCaptureSession, rect, consumer, null, 9), 3);
        ym3VarF.A(new e8(11, cancellationSignal));
        cancellationSignal.setOnCancelListener(new ak0(0, ym3VarF));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(xr0.v0(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
