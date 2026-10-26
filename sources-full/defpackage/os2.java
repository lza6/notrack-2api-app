package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class os2 {
    private static final ym1 loadVectorResource(Resources.Theme theme, Resources resources, int i, int i2, ck0 ck0Var, int i3) throws XmlPullParserException, IOException {
        bn1 bn1Var = (bn1) ((kk0) ck0Var).l(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        an1 an1Var = new an1(theme, i);
        WeakReference weakReference = (WeakReference) bn1Var.a.get(an1Var);
        zm1 zm1VarA = weakReference != null ? (zm1) weakReference.get() : null;
        if (zm1VarA == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!kr1.n(xml.getName(), "vector")) {
                u41.k("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            zm1VarA = wb4.a(theme, resources, xml, i2);
            bn1Var.a.put(an1Var, new WeakReference(zm1VarA));
        }
        return zm1VarA.a;
    }

    public static final ms2 painterResource(int i, ck0 ck0Var, int i2) {
        TypedValue typedValue;
        boolean z;
        kk0 kk0Var = (kk0) ck0Var;
        Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
        kk0Var.l(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = context.getResources();
        v53 v53Var = (v53) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalResourceIdCache());
        synchronized (v53Var) {
            typedValue = (TypedValue) v53Var.a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                dh2 dh2Var = v53Var.a;
                int iD = dh2Var.d(i);
                Object[] objArr = dh2Var.c;
                Object obj = objArr[iD];
                dh2Var.b[iD] = i;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && mo3.x0(charSequence, ".xml")) {
            kk0Var.a0(-803043333);
            rb4 rb4VarRememberVectorPainter = ub4.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i, typedValue.changingConfigurations, kk0Var, (i2 << 6) & 896), kk0Var, 0);
            kk0Var.r(false);
            return rb4VarRememberVectorPainter;
        }
        kk0Var.a0(-802887899);
        Resources.Theme theme = context.getTheme();
        boolean zH = kk0Var.h(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !kk0Var.f(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zH2 = kk0Var.h(theme) | zH | z;
        Object objP = kk0Var.P();
        if (zH2 || objP == Composer$Companion.getEmpty()) {
            try {
                int i3 = bm1.a;
                Drawable drawable = resources.getDrawable(i, null);
                drawable.getClass();
                objP = new ib(((BitmapDrawable) drawable).getBitmap());
                kk0Var.l0(objP);
            } catch (Exception e) {
                throw new eg0("Error attempting to load resource: " + ((Object) charSequence), e);
            }
        }
        hv hvVar = new hv((bm1) objP);
        kk0Var.r(false);
        return hvVar;
    }
}
