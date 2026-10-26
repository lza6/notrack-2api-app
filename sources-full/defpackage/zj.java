package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class zj extends Spinner {
    public static final int[] q = {R.attr.spinnerMode};
    public final bi c;
    public final Context d;
    public final pj h;
    public SpinnerAdapter l;
    public final boolean m;
    public final yj n;
    public int o;
    public final Rect p;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public zj(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, ai.notrack.app.R.attr.spinnerStyle);
        this.p = new Rect();
        h04.a(this, getContext());
        int[] iArr = g23.u;
        iy2 iy2VarL = iy2.l(context, attributeSet, iArr, ai.notrack.app.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        this.c = new bi(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.d = new ro0(context, resourceId);
        } else {
            this.d = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q, ai.notrack.app.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        sj sjVar = new sj(this);
                        this.n = sjVar;
                        sjVar.h = typedArray.getString(2);
                    } else if (i == 1) {
                        wj wjVar = new wj(this, this.d, attributeSet);
                        iy2 iy2VarL2 = iy2.l(this.d, attributeSet, iArr, ai.notrack.app.R.attr.spinnerStyle);
                        this.o = ((TypedArray) iy2VarL2.h).getLayoutDimension(3, -2);
                        wjVar.e(iy2VarL2.e(1));
                        wjVar.J = typedArray.getString(2);
                        iy2VarL2.n();
                        this.n = wjVar;
                        this.h = new pj(this, this, wjVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(ai.notrack.app.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    iy2VarL.n();
                    this.m = true;
                    spinnerAdapter = this.l;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.l = null;
                    }
                    this.c.e(attributeSet, ai.notrack.app.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            sj sjVar2 = new sj(this);
            this.n = sjVar2;
            sjVar2.h = typedArray.getString(2);
        } else if (i == 1) {
            wj wjVar2 = new wj(this, this.d, attributeSet);
            iy2 iy2VarL3 = iy2.l(this.d, attributeSet, iArr, ai.notrack.app.R.attr.spinnerStyle);
            this.o = ((TypedArray) iy2VarL3.h).getLayoutDimension(3, -2);
            wjVar2.e(iy2VarL3.e(1));
            wjVar2.J = typedArray.getString(2);
            iy2VarL3.n();
            this.n = wjVar2;
            this.h = new pj(this, this, wjVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(ai.notrack.app.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        iy2VarL.n();
        this.m = true;
        spinnerAdapter = this.l;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.l = null;
        }
        this.c.e(attributeSet, ai.notrack.app.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.p;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bi biVar = this.c;
        if (biVar != null) {
            biVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        yj yjVar = this.n;
        return yjVar != null ? yjVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        yj yjVar = this.n;
        return yjVar != null ? yjVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.n != null ? this.o : super.getDropDownWidth();
    }

    public final yj getInternalPopup() {
        return this.n;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        yj yjVar = this.n;
        return yjVar != null ? yjVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        yj yjVar = this.n;
        return yjVar != null ? yjVar.n() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yj yjVar = this.n;
        if (yjVar == null || !yjVar.a()) {
            return;
        }
        yjVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.n == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        xj xjVar = (xj) parcelable;
        super.onRestoreInstanceState(xjVar.getSuperState());
        if (!xjVar.c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new qj(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        xj xjVar = new xj(super.onSaveInstanceState());
        yj yjVar = this.n;
        xjVar.c = yjVar != null && yjVar.a();
        return xjVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pj pjVar = this.h;
        if (pjVar == null || !pjVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        yj yjVar = this.n;
        if (yjVar == null) {
            return super.performClick();
        }
        if (yjVar.a()) {
            return true;
        }
        yjVar.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.m) {
            this.l = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        yj yjVar = this.n;
        if (yjVar != null) {
            Context context = this.d;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            tj tjVar = new tj();
            tjVar.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                tjVar.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                rj.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            yjVar.o(tjVar);
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        yj yjVar = this.n;
        if (yjVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            yjVar.j(i);
            yjVar.k(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        yj yjVar = this.n;
        if (yjVar != null) {
            yjVar.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.n != null) {
            this.o = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        yj yjVar = this.n;
        if (yjVar != null) {
            yjVar.e(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(y64.y(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        yj yjVar = this.n;
        if (yjVar != null) {
            yjVar.d(charSequence);
        } else {
            super.setPrompt(charSequence);
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
}
