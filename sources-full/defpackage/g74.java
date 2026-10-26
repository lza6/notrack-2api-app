package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g74 extends gm4 {
    public static Font T(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iV = V(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iV2 = V(fontStyle, font2.getStyle());
            if (iV2 < iV) {
                font = font2;
                iV = iV2;
            }
        }
        return font;
    }

    public static FontFamily U(lc1[] lc1VarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (lc1 lc1Var : lc1VarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(lc1Var.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(lc1Var.c).setSlant(lc1Var.d ? 1 : 0).setTtcIndex(lc1Var.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int V(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.gm4
    public final Typeface p(Context context, ac1 ac1Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (bc1 bc1Var : ac1Var.a) {
                try {
                    Font fontBuild = new Font.Builder(resources, bc1Var.f).setWeight(bc1Var.b).setSlant(bc1Var.c ? 1 : 0).setTtcIndex(bc1Var.e).setFontVariationSettings(bc1Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(T(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.gm4
    public final Typeface q(Context context, lc1[] lc1VarArr, int i) {
        try {
            FontFamily fontFamilyU = U(lc1VarArr, context.getContentResolver());
            if (fontFamilyU == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyU).setStyle(T(fontFamilyU, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.gm4
    public final Typeface r(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyU = U((lc1[]) list.get(0), contentResolver);
            if (fontFamilyU == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyU);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyU2 = U((lc1[]) list.get(i2), contentResolver);
                if (fontFamilyU2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyU2);
                }
            }
            return customFallbackBuilder.setStyle(T(fontFamilyU, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.gm4
    public final Typeface s(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
