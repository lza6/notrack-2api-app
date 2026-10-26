package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class em extends Drawable {
    public final String a;
    public final py b;
    public final vm1 c;
    public final rn0 d;
    public final Drawable e;
    public Drawable f;
    public dm g;
    public int h;
    public float i;
    public boolean j;
    public boolean k = false;

    public em(String str, py pyVar, rn0 rn0Var, vm1 vm1Var) {
        this.a = str;
        this.b = pyVar;
        this.d = rn0Var;
        this.c = vm1Var;
        pyVar.K(this);
        this.e = null;
    }

    public final boolean a() {
        return this.f != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public final void b() {
        Rect rect;
        int iT;
        Rect rect2;
        if (this.h == 0) {
            this.j = true;
            Drawable drawable = this.f;
            if (drawable != null) {
                rect2 = drawable.getBounds();
                if (rect2.isEmpty()) {
                    rect2 = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    if (rect2.isEmpty()) {
                        rect2 = new Rect(0, 0, 1, 1);
                    }
                }
            } else {
                rect2 = new Rect(0, 0, 1, 1);
            }
            setBounds(rect2);
            return;
        }
        this.j = false;
        this.d.getClass();
        Rect bounds = this.f.getBounds();
        int i = this.h;
        float f = this.i;
        vm1 vm1Var = this.c;
        if (vm1Var == null) {
            int iWidth = bounds.width();
            if (iWidth > i) {
                bounds = new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
            }
        } else {
            um1 um1Var = vm1Var.a;
            um1 um1Var2 = vm1Var.b;
            float fWidth = bounds.width() / bounds.height();
            if (um1Var != null) {
                if ("%".equals(um1Var.b)) {
                    iT = (int) (((um1Var.a / 100.0f) * i) + 0.5f);
                } else {
                    iT = rn0.t(um1Var, f);
                }
                rect = new Rect(0, 0, iT, (um1Var2 == null || "%".equals(um1Var2.b)) ? (int) ((iT / fWidth) + 0.5f) : rn0.t(um1Var2, f));
            } else if (um1Var2 != null && !"%".equals(um1Var2.b)) {
                int iT2 = rn0.t(um1Var2, f);
                rect = new Rect(0, 0, (int) ((iT2 * fWidth) + 0.5f), iT2);
            }
            bounds = rect;
        }
        this.f.setBounds(bounds);
        this.f.setCallback(this.g);
        setBounds(bounds);
        invalidateSelf();
    }

    public final void c(Drawable.Callback callback) {
        this.g = callback == null ? null : new dm(this, callback);
        setCallback(callback);
        dm dmVar = this.g;
        Drawable drawable = this.f;
        py pyVar = this.b;
        if (dmVar == null) {
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean zIsRunning = animatable.isRunning();
                    this.k = zIsRunning;
                    if (zIsRunning) {
                        animatable.stop();
                    }
                }
            }
            pyVar.r(this);
            return;
        }
        if (drawable != null && drawable.getCallback() == null) {
            this.f.setCallback(this.g);
        }
        Drawable drawable2 = this.f;
        boolean z = drawable2 == null || drawable2 == this.e;
        if (drawable2 != null) {
            drawable2.setCallback(this.g);
            Object obj2 = this.f;
            if ((obj2 instanceof Animatable) && this.k) {
                ((Animatable) obj2).start();
            }
        }
        if (z) {
            pyVar.I(this);
        }
    }

    public final void d(Drawable drawable) {
        this.k = false;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (a()) {
            this.f.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (a()) {
            return this.f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (a()) {
            return this.f.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (a()) {
            return this.f.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.a + "', imageSize=" + this.c + ", result=" + this.f + ", canvasWidth=" + this.h + ", textSize=" + this.i + ", waitingForDimensions=" + this.j + '}';
    }
}
