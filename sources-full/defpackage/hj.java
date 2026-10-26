package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class hj extends ImageView {
    public final bi c;
    public final gj d;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z04.a(context);
        this.h = false;
        h04.a(this, getContext());
        bi biVar = new bi(this);
        this.c = biVar;
        biVar.e(attributeSet, i);
        gj gjVar = new gj(this);
        this.d = gjVar;
        gjVar.l(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bi biVar = this.c;
        if (biVar != null) {
            biVar.a();
        }
        gj gjVar = this.d;
        if (gjVar != null) {
            gjVar.d();
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

    public ColorStateList getSupportImageTintList() {
        ol0 ol0Var;
        gj gjVar = this.d;
        if (gjVar == null || (ol0Var = (ol0) gjVar.d) == null) {
            return null;
        }
        return (ColorStateList) ol0Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ol0 ol0Var;
        gj gjVar = this.d;
        if (gjVar == null || (ol0Var = (ol0) gjVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) ol0Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.d.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        gj gjVar = this.d;
        if (gjVar != null) {
            gjVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        gj gjVar = this.d;
        if (gjVar != null && drawable != null && !this.h) {
            gjVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (gjVar != null) {
            gjVar.d();
            if (this.h) {
                return;
            }
            ImageView imageView = (ImageView) gjVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(gjVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        gj gjVar = this.d;
        if (gjVar != null) {
            ImageView imageView = (ImageView) gjVar.c;
            if (i != 0) {
                Drawable drawableY = y64.y(imageView.getContext(), i);
                if (drawableY != null) {
                    b01.a(drawableY);
                }
                imageView.setImageDrawable(drawableY);
            } else {
                imageView.setImageDrawable(null);
            }
            gjVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        gj gjVar = this.d;
        if (gjVar != null) {
            gjVar.d();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        gj gjVar = this.d;
        if (gjVar != null) {
            if (((ol0) gjVar.d) == null) {
                gjVar.d = new ol0();
            }
            ol0 ol0Var = (ol0) gjVar.d;
            ol0Var.c = colorStateList;
            ol0Var.b = true;
            gjVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        gj gjVar = this.d;
        if (gjVar != null) {
            if (((ol0) gjVar.d) == null) {
                gjVar.d = new ol0();
            }
            ol0 ol0Var = (ol0) gjVar.d;
            ol0Var.d = mode;
            ol0Var.a = true;
            gjVar.d();
        }
    }
}
