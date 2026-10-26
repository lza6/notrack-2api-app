package ru.noties.jlatexmath;

import android.content.Context;
import android.graphics.Typeface;
import defpackage.m51;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class JLatexMathAndroid {
    private static final String BASE = "org/scilab/forge/jlatexmath/";
    private static Context sContext;

    private JLatexMathAndroid() {
    }

    private static Context context() {
        Context context = sContext;
        if (context != null) {
            return context;
        }
        m51.x("Please call `#init(Context)` method to initialize jLatexMath");
        return null;
    }

    public static InputStream getResourceAsStream(String str) {
        try {
            return context().getAssets().open(BASE + str);
        } catch (IOException e) {
            m51.n(e);
            return null;
        }
    }

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    public static Typeface loadTypeface(String str) {
        return Typeface.createFromAsset(context().getAssets(), BASE + str);
    }
}
