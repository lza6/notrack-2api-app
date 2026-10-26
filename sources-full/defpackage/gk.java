package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gk {
    public final TextView a;
    public ol0 b;
    public ol0 c;
    public ol0 d;
    public ol0 e;
    public ol0 f;
    public ol0 g;
    public ol0 h;
    public final pk i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public gk(TextView textView) {
        this.a = textView;
        this.i = new pk(textView);
    }

    public static ol0 c(Context context, bj bjVar, int i) {
        ColorStateList colorStateListG;
        synchronized (bjVar) {
            colorStateListG = bjVar.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        ol0 ol0Var = new ol0();
        ol0Var.b = true;
        ol0Var.c = colorStateListG;
        return ol0Var;
    }

    public final void a(Drawable drawable, ol0 ol0Var) {
        if (drawable == null || ol0Var == null) {
            return;
        }
        bj.d(drawable, ol0Var, this.a.getDrawableState());
    }

    public final void b() {
        ol0 ol0Var = this.b;
        TextView textView = this.a;
        if (ol0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        ol0 ol0Var = this.h;
        if (ol0Var != null) {
            return (ColorStateList) ol0Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        ol0 ol0Var = this.h;
        if (ol0Var != null) {
            return (PorterDuff.Mode) ol0Var.d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:231:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:233:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:236:0x03af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        bj bjVarA = bj.a();
        int[] iArr = g23.h;
        iy2 iy2VarL = iy2.l(context, attributeSet, iArr, i);
        zc4.g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) iy2VarL.h, i);
        TypedArray typedArray = (TypedArray) iy2VarL.h;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, bjVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, bjVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, bjVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, bjVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, bjVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, bjVarA, typedArray.getResourceId(6, 0));
        }
        iy2VarL.n();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = g23.v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            iy2 iy2Var = new iy2(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, iy2Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            iy2Var.n();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        iy2 iy2Var2 = new iy2(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, iy2Var2);
        iy2Var2.n();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            ek.d(textView, string);
        }
        if (string2 != null) {
            dk.b(textView, dk.a(string2));
        }
        pk pkVar = this.i;
        Context context2 = pkVar.j;
        int[] iArr3 = g23.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = pkVar.i;
        zc4.g(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            pkVar.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                pkVar.f = pk.b(iArr4);
                pkVar.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!pkVar.j()) {
            pkVar.a = 0;
        } else if (pkVar.a == 1) {
            if (!pkVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                pkVar.k(dimension2, f, dimension);
            }
            pkVar.h();
        }
        if (yd4.c && pkVar.a != 0) {
            int[] iArr5 = pkVar.f;
            if (iArr5.length > 0) {
                if (ek.a(textView) != -1.0f) {
                    ek.b(textView, Math.round(pkVar.d), Math.round(pkVar.e), Math.round(pkVar.c), 0);
                } else {
                    ek.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? bjVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? bjVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? bjVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? bjVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? bjVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? bjVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = y64.x(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(b01.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i7 = typedValuePeekValue.data;
                int i8 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                yo4.S(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                yo4.V(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    yo4.W(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    m1.h(textView, i3, dimensionPixelSize);
                } else {
                    yo4.W(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            yo4.S(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            yo4.V(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                yo4.W(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                m1.h(textView, i3, dimensionPixelSize);
            } else {
                yo4.W(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, g23.v);
        iy2 iy2Var = new iy2(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, iy2Var);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            ek.d(textView, string);
        }
        iy2Var.n();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        pk pkVar = this.i;
        if (pkVar.j()) {
            DisplayMetrics displayMetrics = pkVar.j.getResources().getDisplayMetrics();
            pkVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (pkVar.h()) {
                pkVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        pk pkVar = this.i;
        if (pkVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = pkVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                pkVar.f = pk.b(iArrCopyOf);
                if (!pkVar.i()) {
                    u41.j(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                pkVar.g = false;
            }
            if (pkVar.h()) {
                pkVar.a();
            }
        }
    }

    public final void j(int i) {
        pk pkVar = this.i;
        if (pkVar.j()) {
            if (i == 0) {
                pkVar.a = 0;
                pkVar.d = -1.0f;
                pkVar.e = -1.0f;
                pkVar.c = -1.0f;
                pkVar.f = new int[0];
                pkVar.b = false;
                return;
            }
            if (i != 1) {
                u41.k(ud2.m(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = pkVar.j.getResources().getDisplayMetrics();
            pkVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (pkVar.h()) {
                pkVar.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new ol0();
        }
        ol0 ol0Var = this.h;
        ol0Var.c = colorStateList;
        ol0Var.b = colorStateList != null;
        this.b = ol0Var;
        this.c = ol0Var;
        this.d = ol0Var;
        this.e = ol0Var;
        this.f = ol0Var;
        this.g = ol0Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new ol0();
        }
        ol0 ol0Var = this.h;
        ol0Var.d = mode;
        ol0Var.a = mode != null;
        this.b = ol0Var;
        this.c = ol0Var;
        this.d = ol0Var;
        this.e = ol0Var;
        this.f = ol0Var;
        this.g = ol0Var;
    }

    public final void m(Context context, iy2 iy2Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) iy2Var.h;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = iy2Var.h(i5, this.j, new bk(this, i6, i7, new WeakReference(this.a)));
                if (typefaceH != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceH;
                    } else {
                        this.l = fk.a(Typeface.create(typefaceH, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = fk.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
