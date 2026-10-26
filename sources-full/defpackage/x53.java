package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x53 {
    public static x53 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public f13 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final w53 h = new w53(6);

    public static synchronized x53 c() {
        try {
            if (g == null) {
                g = new x53();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        w53 w53Var = h;
        w53Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) w53Var.a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        lm3 lm3Var = (lm3) this.a.get(context);
        if (lm3Var == null) {
            lm3Var = new lm3(0);
            this.a.put(context, lm3Var);
        }
        int i2 = lm3Var.h;
        if (i2 != 0 && i <= lm3Var.c[i2 - 1]) {
            lm3Var.c(i, colorStateList);
            return;
        }
        if (i2 >= lm3Var.c.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            lm3Var.c = Arrays.copyOf(lm3Var.c, i6);
            lm3Var.d = Arrays.copyOf(lm3Var.d, i6);
        }
        lm3Var.c[i2] = i;
        lm3Var.d[i2] = colorStateList;
        lm3Var.h = i2 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawableF;
        Object obj;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            j82 j82Var = (j82) this.b.get(context);
            layerDrawableF = null;
            if (j82Var != null) {
                int iH = gm4.h(j82Var.d, j82Var.l, j);
                if (iH < 0 || (obj = j82Var.h[iH]) == xr0.c) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        j82Var.d(j);
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableF = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableF = f13.f(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableF = f13.f(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableF = f13.f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableF == null) {
            return layerDrawableF;
        }
        layerDrawableF.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableF.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableF;
                }
                j82 j82Var2 = (j82) this.b.get(context);
                if (j82Var2 == null) {
                    j82Var2 = new j82();
                    this.b.put(context, j82Var2);
                }
                j82Var2.c(new WeakReference(constantState2), j);
                return layerDrawableF;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                b01.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        lm3 lm3Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListG = null;
        colorStateList = (weakHashMap == null || (lm3Var = (lm3) weakHashMap.get(context)) == null) ? null : (ColorStateList) lm3Var.b(i);
        if (colorStateList == null) {
            f13 f13Var = this.e;
            if (f13Var != null) {
                colorStateListG = f13Var.g(context, i);
            }
            if (colorStateListG != null) {
                a(context, i, colorStateListG);
            }
            colorStateList = colorStateListG;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        f13 f13Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (f13Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = h04.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = bj.b;
                f13.h(drawableFindDrawableByLayerId, iC, mode2);
                f13.h(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h04.c(context, R.attr.colorControlNormal), mode2);
                f13.h(layerDrawable.findDrawableByLayerId(android.R.id.progress), h04.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = h04.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = bj.b;
                f13.h(drawableFindDrawableByLayerId2, iB, mode3);
                f13.h(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h04.c(context, R.attr.colorControlActivated), mode3);
                f13.h(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h04.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        f13 f13Var2 = this.e;
        boolean z3 = false;
        if (f13Var2 != null) {
            PorterDuff.Mode mode4 = bj.b;
            if (f13.b((int[]) f13Var2.a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (f13.b((int[]) f13Var2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zB = f13.b((int[]) f13Var2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zB) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = h04.c(context, i2);
                synchronized (bj.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterF);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
