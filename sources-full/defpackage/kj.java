package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: loaded from: classes.dex */
public final class kj extends RadioButton {
    public final gi c;
    public final bi d;
    public final gk h;
    public ej l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        z04.a(context);
        h04.a(this, getContext());
        gi giVar = new gi(this);
        this.c = giVar;
        giVar.c(attributeSet, R.attr.radioButtonStyle);
        bi biVar = new bi(this);
        this.d = biVar;
        biVar.e(attributeSet, R.attr.radioButtonStyle);
        gk gkVar = new gk(this);
        this.h = gkVar;
        gkVar.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private ej getEmojiTextViewHelper() {
        if (this.l == null) {
            this.l = new ej(this);
        }
        return this.l;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bi biVar = this.d;
        if (biVar != null) {
            biVar.a();
        }
        gk gkVar = this.h;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        bi biVar = this.d;
        if (biVar != null) {
            return biVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        bi biVar = this.d;
        if (biVar != null) {
            return biVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        gi giVar = this.c;
        if (giVar != null) {
            return giVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        gi giVar = this.c;
        if (giVar != null) {
            return giVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bi biVar = this.d;
        if (biVar != null) {
            biVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bi biVar = this.d;
        if (biVar != null) {
            biVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(y64.y(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        gi giVar = this.c;
        if (giVar != null) {
            if (giVar.e) {
                giVar.e = false;
            } else {
                giVar.e = true;
                giVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gk gkVar = this.h;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gk gkVar = this.h;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vl0) getEmojiTextViewHelper().b.c).M(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        bi biVar = this.d;
        if (biVar != null) {
            biVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        bi biVar = this.d;
        if (biVar != null) {
            biVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        gi giVar = this.c;
        if (giVar != null) {
            giVar.a = colorStateList;
            giVar.c = true;
            giVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        gi giVar = this.c;
        if (giVar != null) {
            giVar.b = mode;
            giVar.d = true;
            giVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        gk gkVar = this.h;
        gkVar.k(colorStateList);
        gkVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        gk gkVar = this.h;
        gkVar.l(mode);
        gkVar.b();
    }
}
