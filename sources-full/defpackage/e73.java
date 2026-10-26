package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e73 extends View {
    public static final int[] n = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] o = new int[0];
    public i94 c;
    public Boolean d;
    public Long h;
    public m3 l;
    public je1 m;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.l;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.h;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? n : o;
            i94 i94Var = this.c;
            if (i94Var != null) {
                i94Var.setState(iArr);
            }
        } else {
            m3 m3Var = new m3(11, this);
            this.l = m3Var;
            postDelayed(m3Var, 50L);
        }
        this.h = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(e73 e73Var) {
        i94 i94Var = e73Var.c;
        if (i94Var != null) {
            i94Var.setState(o);
        }
        e73Var.l = null;
    }

    public final void b(ry2 ry2Var, boolean z, long j, int i, long j2, float f, je1 je1Var) {
        if (this.c == null || !Boolean.valueOf(z).equals(this.d)) {
            i94 i94Var = new i94(z);
            setBackground(i94Var);
            this.c = i94Var;
            this.d = Boolean.valueOf(z);
        }
        i94 i94Var2 = this.c;
        i94Var2.getClass();
        this.m = je1Var;
        Integer num = i94Var2.h;
        if (num == null || num.intValue() != i) {
            i94Var2.h = Integer.valueOf(i);
            h94.a.a(i94Var2, i);
        }
        e(j, j2, f);
        if (z) {
            i94Var2.setHotspot(ln2.f(ry2Var.a), ln2.g(ry2Var.a));
        } else {
            i94Var2.setHotspot(i94Var2.getBounds().centerX(), i94Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.m = null;
        m3 m3Var = this.l;
        if (m3Var != null) {
            removeCallbacks(m3Var);
            m3 m3Var2 = this.l;
            m3Var2.getClass();
            m3Var2.run();
        } else {
            i94 i94Var = this.c;
            if (i94Var != null) {
                i94Var.setState(o);
            }
        }
        i94 i94Var2 = this.c;
        if (i94Var2 == null) {
            return;
        }
        i94Var2.setVisible(false, false);
        unscheduleDrawable(i94Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j, long j2, float f) {
        i94 i94Var = this.c;
        if (i94Var == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = re0.b(f, j2);
        re0 re0Var = i94Var.d;
        if (!(re0Var == null ? false : re0.c(re0Var.a, jB))) {
            i94Var.d = new re0(jB);
            i94Var.setColor(ColorStateList.valueOf(gb2.X(jB)));
        }
        Rect rect = new Rect(0, 0, gb2.R(bi3.d(j)), gb2.R(bi3.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        i94Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        je1 je1Var = this.m;
        if (je1Var != null) {
            je1Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
