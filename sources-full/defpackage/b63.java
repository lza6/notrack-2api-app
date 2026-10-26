package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b63 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, bk bkVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            t82 t82Var = b74.b;
            Typeface typeface = (Typeface) t82Var.a(b74.b(resources, i, string, i3, i2));
            int i4 = 11;
            if (typeface != null) {
                if (bkVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ba(bkVar, i4, typeface));
                }
                typefaceA = typeface;
            } else {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        zb1 zb1VarH = g13.H(resources.getXml(i), resources);
                        if (zb1VarH == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bkVar != null) {
                                bkVar.c(-3);
                            }
                        } else {
                            typefaceA = b74.a(context, zb1VarH, resources, i, string, typedValue.assetCookie, i2, bkVar, z);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceS = b74.a.s(context, resources, i, string, i2);
                        if (typefaceS != null) {
                            t82Var.b(b74.b(resources, i, string, i5, i2), typefaceS);
                        }
                        if (bkVar != null) {
                            if (typefaceS != null) {
                                new Handler(Looper.getMainLooper()).post(new ba(bkVar, i4, typefaceS));
                            } else {
                                bkVar.c(-3);
                            }
                        }
                        typefaceA = typefaceS;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (bkVar != null) {
                        bkVar.c(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (bkVar != null) {
                        bkVar.c(-3);
                    }
                }
            }
        } else if (bkVar != null) {
            bkVar.c(-3);
        }
        if (typefaceA != null || bkVar != null) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
