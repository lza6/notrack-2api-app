package io.noties.markwon.ext.tables;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import defpackage.av1;
import defpackage.bs3;
import defpackage.bv0;
import defpackage.cs3;
import defpackage.em;
import defpackage.h61;
import defpackage.im;
import defpackage.jm;
import defpackage.y64;
import defpackage.yz0;
import defpackage.zy3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ReplacementSpan {
    public final h61 c;
    private final List<TableRowSpan$Cell> cells;
    public final ArrayList d;
    public final boolean l;
    public final boolean m;
    public int p;
    public int q;
    public bv0 r;
    public final Rect n = new Rect();
    public final Paint o = new Paint(1);
    public final TextPaint h = new TextPaint();

    public a(h61 h61Var, ArrayList arrayList, boolean z, boolean z2) {
        this.c = h61Var;
        this.cells = arrayList;
        this.d = new ArrayList(arrayList.size());
        this.l = z;
        this.m = z2;
    }

    public final void a(int i, int i2, TableRowSpan$Cell tableRowSpan$Cell) {
        bs3 bs3Var = new bs3(this, i, i2, tableRowSpan$Cell);
        CharSequence charSequence = tableRowSpan$Cell.text;
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(tableRowSpan$Cell.text);
        int i3 = tableRowSpan$Cell.alignment;
        int i4 = 1;
        StaticLayout staticLayout = new StaticLayout(spannableString, this.h, i2, i3 != 1 ? i3 != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        zy3[] zy3VarArr = (zy3[]) spannableString.getSpans(0, spannableString.length(), zy3.class);
        if (zy3VarArr != null) {
            for (zy3 zy3Var : zy3VarArr) {
                spannableString.removeSpan(zy3Var);
            }
        }
        spannableString.setSpan(new zy3(staticLayout), 0, spannableString.length(), 18);
        jm[] jmVarArr = (jm[]) spannableString.getSpans(0, spannableString.length(), jm.class);
        if (jmVarArr != null && jmVarArr.length > 0) {
            for (jm jmVar : jmVarArr) {
                em emVar = jmVar.d;
                if (emVar.getCallback() == null) {
                    emVar.c(new yz0(i4, bs3Var));
                }
            }
        }
        this.d.add(i, staticLayout);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        boolean z;
        bv0 bv0Var;
        int iP = av1.P(canvas, charSequence);
        int i6 = this.p;
        float f3 = 0.5f;
        boolean z2 = this.l;
        ArrayList arrayList = this.d;
        h61 h61Var = this.c;
        if (i6 != iP) {
            this.p = iP;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.h;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            f2 = 1.0f;
            int size = ((int) (((this.p * 1.0f) / this.cells.size()) + 0.5f)) - (h61Var.a * 2);
            arrayList.clear();
            int size2 = this.cells.size();
            int i7 = 0;
            while (i7 < size2) {
                a(i7, size, this.cells.get(i7));
                i7++;
                f3 = f3;
            }
        } else {
            f2 = 1.0f;
        }
        float f4 = f3;
        int i8 = h61Var.a;
        int size3 = arrayList.size();
        int i9 = this.p;
        int i10 = (int) (((i9 * f2) / size3) + f4);
        int i11 = i10 - (i9 / size3);
        Paint paint2 = this.o;
        if (!z2 && this.m) {
            paint2.setColor(y64.h(paint2.getColor(), 22));
            paint2.setStyle(Paint.Style.FILL);
        } else {
            paint2.setColor(0);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.n;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.p, i5 - i3);
                canvas.translate(f, i3);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        paint2.set(paint);
        paint2.setColor(y64.h(paint2.getColor(), 75));
        paint2.setStyle(Paint.Style.FILL);
        int strokeWidth = h61Var.b;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + f4);
        }
        boolean z4 = strokeWidth > 0;
        int i12 = i5 - i3;
        int i13 = (i12 - this.q) / 4;
        if (z4) {
            cs3[] cs3VarArr = (cs3[]) ((Spanned) charSequence).getSpans(i, i2, cs3.class);
            if (cs3VarArr == null || cs3VarArr.length <= 0 || !av1.I(charSequence, cs3VarArr[0], i)) {
                z = false;
            } else {
                rect.set((int) f, i3, this.p, i3 + strokeWidth);
                canvas.drawRect(rect, paint2);
                z = true;
            }
            rect.set((int) f, i5 - strokeWidth, this.p, i5);
            canvas.drawRect(rect, paint2);
        } else {
            z = false;
        }
        int i14 = strokeWidth / 2;
        int i15 = z ? strokeWidth : 0;
        int i16 = i12 - strokeWidth;
        int i17 = 0;
        int height = 0;
        while (i17 < size3) {
            ArrayList arrayList2 = arrayList;
            Layout layout = (Layout) arrayList2.get(i17);
            int iSave2 = canvas.save();
            int i18 = size3;
            try {
                canvas.translate(f + (i17 * i10), i3);
                if (z4) {
                    if (i17 == 0) {
                        rect.set(0, i15, strokeWidth, i16);
                    } else {
                        rect.set(-i14, i15, i14, i16);
                    }
                    canvas.drawRect(rect, paint2);
                    if (i17 == i18 - 1) {
                        rect.set((i10 - strokeWidth) - i11, i15, i10 - i11, i16);
                        canvas.drawRect(rect, paint2);
                    }
                }
                int i19 = i8;
                int i20 = i15;
                canvas.translate(i19, i19 + i13);
                layout.draw(canvas);
                if (layout.getHeight() > height) {
                    height = layout.getHeight();
                }
                canvas.restoreToCount(iSave2);
                i17++;
                i15 = i20;
                i8 = i19;
                size3 = i18;
                arrayList = arrayList2;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        }
        if (this.q == height || (bv0Var = this.r) == null) {
            return;
        }
        TextView textView = (TextView) bv0Var.h;
        im imVar = (im) bv0Var.d;
        textView.removeCallbacks(imVar);
        textView.post(imVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.d;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                int height = ((Layout) obj).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.q = i3;
            int i5 = -((this.c.a * 2) + i3);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = 0;
        }
        return this.p;
    }
}
