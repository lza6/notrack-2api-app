package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class kk extends TextView {
    public final bi c;
    public final gk d;
    public final fy2 h;
    public ej l;
    public boolean m;
    public jb n;
    public Future o;

    public kk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z04.a(context);
        this.m = false;
        this.n = null;
        h04.a(this, getContext());
        bi biVar = new bi(this);
        this.c = biVar;
        biVar.e(attributeSet, i);
        gk gkVar = new gk(this);
        this.d = gkVar;
        gkVar.f(attributeSet, i);
        gkVar.b();
        fy2 fy2Var = new fy2();
        fy2Var.c = this;
        this.h = fy2Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private ej getEmojiTextViewHelper() {
        if (this.l == null) {
            this.l = new ej(this);
        }
        return this.l;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public hk getSuperCaller() {
        if (this.n == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.n = new jk(this);
            } else if (i >= 28) {
                this.n = new ik(this);
            } else if (i >= 26) {
                this.n = new jb(8, this);
            }
        }
        return this.n;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.o;
        if (future != null) {
            try {
                this.o = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                yo4.B(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
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

    public xx2 getTextMetricsParamsCompat() {
        return yo4.B(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.d.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            kr1.i0(editorInfo, getText());
        }
        p23.O(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.o;
        if (future != null) {
            try {
                this.o = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                yo4.B(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? y64.y(context, i) : null, i2 != 0 ? y64.y(context, i2) : null, i3 != 0 ? y64.y(context, i3) : null, i4 != 0 ? y64.y(context, i4) : null);
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? y64.y(context, i) : null, i2 != 0 ? y64.y(context, i2) : null, i3 != 0 ? y64.y(context, i3) : null, i4 != 0 ? y64.y(context, i4) : null);
        gk gkVar = this.d;
        if (gkVar != null) {
            gkVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((vl0) getEmojiTextViewHelper().b.c).M(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i);
        } else {
            yo4.S(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            yo4.V(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        yo4.W(this, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().p(i, f);
        } else if (i2 >= 34) {
            m1.h(this, i, f);
        } else {
            yo4.W(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(yx2 yx2Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        yo4.B(this);
        throw null;
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

    public void setTextFuture(Future<yx2> future) {
        this.o = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(xx2 xx2Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = xx2Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(xx2Var.a);
        setBreakStrategy(xx2Var.c);
        setHyphenationFrequency(xx2Var.d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.m) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            gm4 gm4Var = b74.a;
            if (context == null) {
                u41.k("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.m = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.m = false;
        }
    }
}
