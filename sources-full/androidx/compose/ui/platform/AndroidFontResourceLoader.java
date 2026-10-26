package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import defpackage.cv0;
import defpackage.ib1;
import defpackage.jb1;

/* JADX INFO: loaded from: classes.dex */
@cv0
public final class AndroidFontResourceLoader implements ib1 {
    public static final int $stable = 8;
    private final Context context;

    public AndroidFontResourceLoader(Context context) {
        this.context = context;
    }

    @cv0
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public Typeface m49load(jb1 jb1Var) {
        throw new IllegalArgumentException("Unknown font type: " + jb1Var);
    }
}
