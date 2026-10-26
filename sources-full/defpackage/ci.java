package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class ci extends Button {
    public final bi c;
    public final gk d;
    public ej h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        z04.a(context);
        h04.a(this, getContext());
        bi biVar = new bi(this);
        this.c = biVar;
        biVar.e(attributeSet, R.attr.buttonStyle);
        gk gkVar = new gk(this);
        this.d = gkVar;
        gkVar.f(attributeSet, R.attr.buttonStyle);
        gkVar.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private ej getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new ej(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bi biVar = this.c;
        if (biVar != null) {
            biVar.a();
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (yd4.c) {
            return super.getAutoSizeMaxTextSize();
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            return Math.round(gkVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (yd4.c) {
            return super.getAutoSizeMinTextSize();
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            return Math.round(gkVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (yd4.c) {
            return super.getAutoSizeStepGranularity();
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            return Math.round(gkVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (yd4.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        gk gkVar = this.d;
        return gkVar != null ? gkVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (yd4.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            return gkVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yo4.Z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        bi biVar = this.c;
        if (biVar != null) {
            return biVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        bi biVar = this.c;
        if (biVar != null) {
            return biVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gk gkVar = this.d;
        if (gkVar == null || yd4.c) {
            return;
        }
        gkVar.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        gk gkVar = this.d;
        if (gkVar != null) {
            pk pkVar = gkVar.i;
            if (yd4.c || !pkVar.f()) {
                return;
            }
            pkVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (yd4.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (yd4.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (yd4.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bi biVar = this.c;
        if (biVar != null) {
            biVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bi biVar = this.c;
        if (biVar != null) {
            biVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yo4.c0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vl0) getEmojiTextViewHelper().b.c).M(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        bi biVar = this.c;
        if (biVar != null) {
            biVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        bi biVar = this.c;
        if (biVar != null) {
            biVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gk gkVar = this.d;
        gkVar.k(colorStateList);
        gkVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gk gkVar = this.d;
        gkVar.l(mode);
        gkVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = yd4.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        gk gkVar = this.d;
        if (gkVar != null) {
            pk pkVar = gkVar.i;
            if (z || pkVar.f()) {
                return;
            }
            pkVar.g(f, i);
        }
    }
}
