package androidx.compose.ui.platform;

import android.view.View;
import defpackage.so0;

/* JADX INFO: loaded from: classes.dex */
public interface PlatformTextInputSession {
    View getView();

    Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, so0 so0Var);
}
