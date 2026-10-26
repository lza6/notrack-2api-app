package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class oj extends bv0 {
    public final nj m;
    public Drawable n;
    public ColorStateList o;
    public PorterDuff.Mode p;
    public boolean q;
    public boolean r;

    public oj(nj njVar) {
        super(njVar);
        this.o = null;
        this.p = null;
        this.q = false;
        this.r = false;
        this.m = njVar;
    }

    @Override // defpackage.bv0
    public final void C(AttributeSet attributeSet, int i) {
        super.C(attributeSet, R.attr.seekBarStyle);
        nj njVar = this.m;
        Context context = njVar.getContext();
        int[] iArr = g23.g;
        iy2 iy2VarL = iy2.l(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        zc4.g(njVar, njVar.getContext(), iArr, attributeSet, (TypedArray) iy2VarL.h, R.attr.seekBarStyle);
        Drawable drawableG = iy2VarL.g(0);
        if (drawableG != null) {
            njVar.setThumb(drawableG);
        }
        Drawable drawableE = iy2VarL.e(1);
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.n = drawableE;
        if (drawableE != null) {
            drawableE.setCallback(njVar);
            drawableE.setLayoutDirection(njVar.getLayoutDirection());
            if (drawableE.isStateful()) {
                drawableE.setState(njVar.getDrawableState());
            }
            H();
        }
        njVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.p = b01.b(typedArray.getInt(3, -1), this.p);
            this.r = true;
        }
        if (typedArray.hasValue(2)) {
            this.o = iy2VarL.d(2);
            this.q = true;
        }
        iy2VarL.n();
        H();
    }

    public final void H() {
        Drawable drawable = this.n;
        if (drawable != null) {
            if (this.q || this.r) {
                Drawable drawableMutate = drawable.mutate();
                this.n = drawableMutate;
                if (this.q) {
                    drawableMutate.setTintList(this.o);
                }
                if (this.r) {
                    this.n.setTintMode(this.p);
                }
                if (this.n.isStateful()) {
                    this.n.setState(this.m.getDrawableState());
                }
            }
        }
    }

    public final void I(Canvas canvas) {
        if (this.n != null) {
            nj njVar = this.m;
            int max = njVar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.n.getIntrinsicWidth();
                int intrinsicHeight = this.n.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.n.setBounds(-i, -i2, i, i2);
                float width = ((njVar.getWidth() - njVar.getPaddingLeft()) - njVar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(njVar.getPaddingLeft(), njVar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.n.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
