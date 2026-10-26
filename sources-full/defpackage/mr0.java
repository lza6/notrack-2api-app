package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class mr0 {
    public static final boolean _isSystemInDarkTheme(ck0 ck0Var, int i) {
        return (((Configuration) ((kk0) ck0Var).l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32;
    }
}
