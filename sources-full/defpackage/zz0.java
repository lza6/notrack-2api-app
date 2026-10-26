package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends ms2 implements a53 {
    public final Drawable n;
    public final ft2 o;
    public final ft2 p;
    public final yq3 q;

    public zz0(Drawable drawable) {
        drawable.getClass();
        this.n = drawable;
        this.o = cl3.d(0);
        ly1 ly1Var = a01.a;
        this.p = cl3.d(new bi3((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : vl0.g(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.q = new yq3(new wl(10, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a53
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.q.getValue();
        Drawable drawable = this.n;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.a53
    public final void b() {
        d();
    }

    @Override // defpackage.ms2
    public final boolean c(float f) {
        this.n.setAlpha(py.x(gb2.R(f * 255.0f), 0, KotlinVersion.MAX_COMPONENT_VALUE));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a53
    public final void d() {
        Drawable drawable = this.n;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.ms2
    public final boolean e(te0 te0Var) {
        this.n.setColorFilter(te0Var != null ? te0Var.a : null);
        return true;
    }

    @Override // defpackage.ms2
    public final void f(dx1 dx1Var) {
        int i;
        dx1Var.getClass();
        int iOrdinal = dx1Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                u41.e();
                return;
            }
        } else {
            i = 0;
        }
        this.n.setLayoutDirection(i);
    }

    @Override // defpackage.ms2
    public final long h() {
        return ((bi3) this.p.getValue()).a;
    }

    @Override // defpackage.ms2
    public final void i(tz0 tz0Var) {
        tz0Var.getClass();
        y00 y00VarY = tz0Var.A().y();
        ((Number) this.o.getValue()).intValue();
        try {
            y00VarY.l();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.n;
            if (i < 28 || i >= 31 || !d1.C(drawable)) {
                drawable.setBounds(0, 0, gb2.R(bi3.d(tz0Var.b())), gb2.R(bi3.b(tz0Var.b())));
            } else {
                y00VarY.d(bi3.d(tz0Var.b()) / bi3.d(h()), bi3.b(tz0Var.b()) / bi3.b(h()));
            }
            Canvas canvas = p9.a;
            drawable.draw(((o9) y00VarY).a);
        } finally {
            y00VarY.i();
        }
    }
}
