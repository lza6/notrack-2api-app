package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.b3;
import defpackage.c3;
import defpackage.g23;
import defpackage.gc2;
import defpackage.h3;
import defpackage.hc2;
import defpackage.kk;
import defpackage.mc2;
import defpackage.od2;
import defpackage.xp1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends kk implements od2, View.OnClickListener, h3 {
    public mc2 p;
    public CharSequence q;
    public Drawable r;
    public gc2 s;
    public b3 t;
    public c3 u;
    public boolean v;
    public boolean w;
    public final int x;
    public int y;
    public final int z;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.v = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g23.c, i, 0);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.z = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.y = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.od2
    public final void a(mc2 mc2Var) {
        this.p = mc2Var;
        setIcon(mc2Var.getIcon());
        setTitle(mc2Var.getTitleCondensed());
        setId(mc2Var.a);
        setVisibility(mc2Var.isVisible() ? 0 : 8);
        setEnabled(mc2Var.isEnabled());
        if (mc2Var.hasSubMenu() && this.t == null) {
            this.t = new b3(this);
        }
    }

    @Override // defpackage.h3
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.h3
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.p.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.od2
    public mc2 getItemData() {
        return this.p;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.q);
        if (this.r != null && ((this.p.y & 4) != 4 || (!this.v && !this.w))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.q : null);
        CharSequence charSequence = this.p.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.p.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.p.r;
        if (TextUtils.isEmpty(charSequence2)) {
            xp1.F(this, z3 ? null : this.p.e);
        } else {
            xp1.F(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gc2 gc2Var = this.s;
        if (gc2Var != null) {
            gc2Var.a(this.p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v = g();
        h();
    }

    @Override // defpackage.kk, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.y) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.x;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.r == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.r.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var;
        if (this.p.hasSubMenu() && (b3Var = this.t) != null && b3Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.w != z) {
            this.w = z;
            mc2 mc2Var = this.p;
            if (mc2Var != null) {
                hc2 hc2Var = mc2Var.n;
                hc2Var.k = true;
                hc2Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.r = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.z;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(gc2 gc2Var) {
        this.s = gc2Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.y = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(c3 c3Var) {
        this.u = c3Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.q = charSequence;
        h();
    }
}
