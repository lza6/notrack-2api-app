package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import app.template.extension.BuildConfig;
import io.noties.markwon.ext.tables.a;

/* JADX INFO: loaded from: classes.dex */
public final class jr0 extends kk {
    public boolean A;
    public Integer p;
    public boolean q;
    public boolean r;
    public int s;
    public je1 t;
    public boolean u;
    public final int v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(Context context) {
        super(context, null, R.attr.textViewStyle);
        context.getClass();
        this.s = -1;
        this.u = true;
        this.v = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public static float h(Layout layout) {
        Float fValueOf;
        kq1 kq1Var = (kq1) py.X(0, layout.getLineCount()).iterator();
        if (kq1Var.h) {
            float lineWidth = layout.getLineWidth(kq1Var.nextInt());
            while (kq1Var.h) {
                lineWidth = Math.max(lineWidth, layout.getLineWidth(kq1Var.nextInt()));
            }
            fValueOf = Float.valueOf(lineWidth);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getSelectionStart() < 0 || getSelectionEnd() < 0) {
            CharSequence text = getText();
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable != null) {
                Selection.setSelection(spannable, spannable.length());
            }
        } else if (getSelectionStart() != getSelectionEnd() && motionEvent != null && motionEvent.getActionMasked() == 0) {
            CharSequence text2 = getText();
            setText((CharSequence) null);
            setText(text2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        Integer num = this.p;
        return num != null ? num.intValue() : super.getCompoundPaddingRight();
    }

    public final boolean getWrapMultilineTextWidth() {
        return this.r;
    }

    public final void i() {
        setText(BuildConfig.VERSION_NAME);
        CharSequence text = getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            Object[] spans = spannable.getSpans(0, text.length(), Object.class);
            spans.getClass();
            for (Object obj : spans) {
                spannable.removeSpan(obj);
            }
        }
        this.s = -1;
    }

    public final boolean j(Layout layout) {
        Spanned spannableString;
        if (layout != null && layout.getLineCount() > 1 && this.r) {
            if (getText() instanceof Spannable) {
                CharSequence text = getText();
                text.getClass();
                spannableString = (Spannable) text;
            } else {
                spannableString = new SpannableString(getText());
            }
            for (Object obj : spannableString.getSpans(0, getText().length(), Object.class)) {
                if (!(obj instanceof a) && !(obj instanceof cs3) && !(obj instanceof td0) && !(obj instanceof qv)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kk, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        hr0 hr0Var;
        int i;
        canvas.getClass();
        if (!j(getLayout())) {
            super.onDraw(canvas);
            return;
        }
        int width = getLayout().getWidth();
        Layout layout = getLayout();
        layout.getClass();
        int iCeil = (int) Math.ceil(h(layout));
        if (width == iCeil) {
            super.onDraw(canvas);
            return;
        }
        Layout.Alignment alignment = getLayout().getAlignment();
        int i2 = alignment == null ? -1 : ir0.a[alignment.ordinal()];
        if (i2 != 1) {
            hr0Var = hr0.h;
            hr0 hr0Var2 = hr0.c;
            if (i2 == 2 ? getLayoutDirection() == 0 : !(i2 == 3 && getLayoutDirection() == 0)) {
                hr0Var = hr0Var2;
            }
        } else {
            hr0Var = hr0.d;
        }
        int iOrdinal = hr0Var.ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? 0 : (width - iCeil) * (-1);
        } else {
            i = ((width - iCeil) * (-1)) / 2;
        }
        e8 e8Var = new e8(12, this);
        this.p = Integer.valueOf(i);
        int iSave = canvas.save();
        canvas.translate(i, 0.0f);
        try {
            e8Var.invoke(canvas);
            this.p = null;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.kk, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.s != size && size > 0) {
            this.s = size;
            invalidate();
            requestLayout();
        } else if (j(getLayout())) {
            Layout layout = getLayout();
            layout.getClass();
            setMeasuredDimension(size - (getLayout().getWidth() - ((int) Math.ceil(h(layout)))), getMeasuredHeight());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.w = motionEvent.getX();
            this.x = motionEvent.getY();
            this.y = false;
            this.z = false;
            this.A = false;
        } else if (actionMasked == 2 && !this.y) {
            float fAbs = Math.abs(motionEvent.getX() - this.w);
            float fAbs2 = Math.abs(motionEvent.getY() - this.x);
            float f = this.v;
            this.y = fAbs > f || fAbs2 > f;
        }
        if (this.u && (motionEvent.getAction() == 1 || motionEvent.getAction() == 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = getScrollX() + totalPaddingLeft;
            int scrollY = getScrollY() + totalPaddingTop;
            Layout layout = getLayout();
            if (layout == null) {
                clickableSpanArr = new ClickableSpan[0];
            } else if (scrollY < 0 || scrollY >= layout.getHeight()) {
                clickableSpanArr = new ClickableSpan[0];
            } else {
                int lineForVertical = layout.getLineForVertical(scrollY);
                if (lineForVertical < 0 || lineForVertical >= layout.getLineCount()) {
                    clickableSpanArr = new ClickableSpan[0];
                } else {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
                    CharSequence text = getText();
                    Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                    if (spannable == null) {
                        clickableSpanArr = new ClickableSpan[0];
                    } else {
                        Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        spans.getClass();
                        clickableSpanArr = (ClickableSpan[]) spans;
                    }
                }
            }
            if (clickableSpanArr.length != 0) {
                if (motionEvent.getAction() == 1) {
                    clickableSpanArr[0].onClick(this);
                }
                return true;
            }
        }
        if (!this.q) {
            return false;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 || this.z || this.y || getSelectionStart() != getSelectionEnd() || this.A) {
            return zOnTouchEvent;
        }
        performClick();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.A = true;
        boolean zPerformClick = super.performClick();
        je1 je1Var = this.t;
        if (je1Var != null) {
            je1Var.invoke();
        }
        return zPerformClick || this.t != null;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        this.z = true;
        return super.performLongClick();
    }

    public final void setLinkClicksEnabled(boolean z) {
        this.u = z;
    }

    public final void setOnBlockClickListener(je1 je1Var) {
        this.t = je1Var;
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z) {
        super.setTextIsSelectable(z);
        this.q = z;
    }

    public final void setWrapMultilineTextWidth(boolean z) {
        this.r = z;
    }
}
