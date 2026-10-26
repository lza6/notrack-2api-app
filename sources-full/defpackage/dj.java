package defpackage;

import ai.notrack.app.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class dj extends EditText implements po2 {
    public final bi c;
    public final gk d;
    public final fy2 h;
    public final b04 l;
    public final fp1 m;
    public cj n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        z04.a(context);
        h04.a(this, getContext());
        bi biVar = new bi(this);
        this.c = biVar;
        biVar.e(attributeSet, R.attr.editTextStyle);
        gk gkVar = new gk(this);
        this.d = gkVar;
        gkVar.f(attributeSet, R.attr.editTextStyle);
        gkVar.b();
        fy2 fy2Var = new fy2();
        fy2Var.c = this;
        this.h = fy2Var;
        this.l = new b04();
        fp1 fp1Var = new fp1((EditText) this);
        this.m = fp1Var;
        fp1Var.h(attributeSet, R.attr.editTextStyle);
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

    private cj getSuperCaller() {
        if (this.n == null) {
            this.n = new cj(this);
        }
        return this.n;
    }

    @Override // defpackage.po2
    public final nn0 a(nn0 nn0Var) {
        this.l.getClass();
        return b04.a(this, nn0Var);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        fy2 fy2Var;
        if (Build.VERSION.SDK_INT >= 28 || (fy2Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) fy2Var.d;
        return textClassifier == null ? ak.a((TextView) fy2Var.c) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrD;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.d.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            kr1.i0(editorInfo, getText());
        }
        p23.O(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrD = zc4.d(this)) != null) {
            kr1.h0(editorInfo, strArrD);
            inputConnectionOnCreateInputConnection = av1.l(inputConnectionOnCreateInputConnection, editorInfo, new f4(3, this));
        }
        return this.m.i(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && zc4.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = mj.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ln0 ln0Var;
        kn0 kn0Var;
        int i2;
        jb jbVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || zc4.d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                jbVar = new jb(primaryClip, 1);
            } else {
                ln0Var = new ln0();
                ln0Var.d = primaryClip;
                ln0Var.h = 1;
            }
            if (i == 16908322) {
                kn0Var = ln0Var;
                kn0Var = jbVar;
                i2 = 0;
            } else {
                kn0Var = ln0Var;
                kn0Var = jbVar;
                i2 = 1;
            }
            kn0Var.s(i2);
            zc4.f(this, kn0Var.build());
        }
        return true;
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yo4.c0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.m.m(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.m.g(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        fy2 fy2Var;
        if (Build.VERSION.SDK_INT >= 28 || (fy2Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            fy2Var.d = textClassifier;
        }
    }
}
