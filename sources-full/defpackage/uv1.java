package defpackage;

import androidx.compose.ui.platform.SoftwareKeyboardController;

/* JADX INFO: loaded from: classes.dex */
public final class uv1 implements vv1 {
    public final SoftwareKeyboardController a;
    public wv1 b;
    public pa1 c;

    public uv1(SoftwareKeyboardController softwareKeyboardController) {
        this.a = softwareKeyboardController;
    }

    public final wv1 a() {
        wv1 wv1Var = this.b;
        if (wv1Var != null) {
            return wv1Var;
        }
        kr1.n0("keyboardActions");
        throw null;
    }
}
