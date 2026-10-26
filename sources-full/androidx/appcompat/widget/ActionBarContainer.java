package androidx.appcompat.widget;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.g23;
import defpackage.pc3;
import defpackage.t2;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean c;
    public View d;
    public View h;
    public Drawable l;
    public Drawable m;
    public Drawable n;
    public final boolean o;
    public boolean p;
    public final int q;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        setBackground(new t2(0, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g23.a);
        this.l = typedArrayObtainStyledAttributes.getDrawable(0);
        this.m = typedArrayObtainStyledAttributes.getDrawable(2);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.o = true;
            this.n = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.o ? !(this.l != null || this.m != null) : this.n == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful()) {
            this.l.setState(getDrawableState());
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null && drawable2.isStateful()) {
            this.m.setState(getDrawableState());
        }
        Drawable drawable3 = this.n;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.n.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.o) {
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.l == null) {
                z2 = false;
            } else if (this.d.getVisibility() == 0) {
                this.l.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
            } else {
                View view = this.h;
                if (view == null || view.getVisibility() != 0) {
                    this.l.setBounds(0, 0, 0, 0);
                } else {
                    this.l.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                }
            }
            this.p = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.q) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.d == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.l);
        }
        this.l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.d;
            if (view != null) {
                this.l.setBounds(view.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
            }
        }
        boolean z = false;
        if (!this.o ? !(this.l != null || this.m != null) : this.n == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.n);
        }
        this.n = drawable;
        boolean z = this.o;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.n) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.l != null || this.m != null) : this.n == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.m);
        }
        this.m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.p && this.m != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.o ? !(this.l != null || this.m != null) : this.n == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(pc3 pc3Var) {
    }

    public void setTransitioning(boolean z) {
        this.c = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.n;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.l;
        boolean z = this.o;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.m && this.p) {
            return true;
        }
        return (drawable == this.n && z) || super.verifyDrawable(drawable);
    }
}
