package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import app.template.extension.BuildConfig;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f13 {
    public Serializable a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public f13(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.a = str;
        this.d = str2;
        this.e = oh3.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            m51.t();
            throw null;
        }
    }

    public static boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static f13 d(String str, mz mzVar, wu1 wu1Var, lr2 lr2Var, Integer num) throws GeneralSecurityException {
        if (lr2Var == lr2.RAW) {
            if (num != null) {
                m51.v("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            m51.v("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        f13 f13Var = new f13();
        f13Var.a = str;
        f13Var.b = ja4.b(str);
        f13Var.c = mzVar;
        f13Var.d = wu1Var;
        f13Var.e = lr2Var;
        f13Var.f = num;
        return f13Var;
    }

    public static ColorStateList e(Context context, int i) {
        int iC = h04.c(context, R.attr.colorControlHighlight);
        int iB = h04.b(context, R.attr.colorButtonNormal);
        int[] iArr = h04.b;
        int[] iArr2 = h04.d;
        int iC2 = hf0.c(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, h04.c, h04.f}, new int[]{iB, iC2, hf0.c(iC, i), i});
    }

    public static LayerDrawable f(x53 x53Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = x53Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = x53Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void h(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = bj.b;
        }
        PorterDuff.Mode mode2 = bj.b;
        synchronized (bj.class) {
            porterDuffColorFilterF = x53.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.e;
        if (map != null) {
            map.put(str, str2);
        } else {
            u41.r("Property \"autoMetadata\" has not been set");
        }
    }

    public mo c() {
        String strConcat = ((String) this.a) == null ? " transportName" : BuildConfig.VERSION_NAME;
        if (((g31) this.b) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.c) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.e) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new mo((String) this.a, (Integer) this.f, (g31) this.b, ((Long) this.c).longValue(), ((Long) this.d).longValue(), (HashMap) this.e);
        }
        u41.r("Missing required properties:".concat(strConcat));
        return null;
    }

    public ColorStateList g(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return y64.x(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return y64.x(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, h04.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return e(context, h04.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return y64.x(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.b, i)) {
                return h04.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.e, i)) {
                return y64.x(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f, i)) {
                return y64.x(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return y64.x(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = h04.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = h04.b;
            iArr2[0] = h04.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = h04.e;
            iArr2[1] = h04.c(context, R.attr.colorControlActivated);
            iArr[2] = h04.f;
            iArr2[2] = h04.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = h04.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = h04.e;
            iArr2[1] = h04.c(context, R.attr.colorControlActivated);
            iArr[2] = h04.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
