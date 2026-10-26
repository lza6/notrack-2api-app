package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class ij extends MultiAutoCompleteTextView {
    public static final int[] l = {R.attr.popupBackground};
    public final bi c;
    public final gk d;
    public final fp1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ai.notrack.app.R.attr.autoCompleteTextViewStyle);
        z04.a(context);
        h04.a(this, getContext());
        iy2 iy2VarL = iy2.l(getContext(), attributeSet, l, ai.notrack.app.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) iy2VarL.h).hasValue(0)) {
            setDropDownBackgroundDrawable(iy2VarL.e(0));
        }
        iy2VarL.n();
        bi biVar = new bi(this);
        this.c = biVar;
        biVar.e(attributeSet, ai.notrack.app.R.attr.autoCompleteTextViewStyle);
        gk gkVar = new gk(this);
        this.d = gkVar;
        gkVar.f(attributeSet, ai.notrack.app.R.attr.autoCompleteTextViewStyle);
        gkVar.b();
        fp1 fp1Var = new fp1((EditText) this);
        this.h = fp1Var;
        fp1Var.h(attributeSet, ai.notrack.app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerG = fp1Var.g(keyListener);
        if (keyListenerG == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerG);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p23.O(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.h.i(inputConnectionOnCreateInputConnection, editorInfo);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(y64.y(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.m(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.g(keyListener));
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
}
