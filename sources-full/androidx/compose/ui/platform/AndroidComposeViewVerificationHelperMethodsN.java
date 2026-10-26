package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import defpackage.kr1;
import defpackage.nc;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final void setPointerIcon(View view, androidx.compose.ui.input.pointer.a aVar) {
        PointerIcon androidPointerIcon = toAndroidPointerIcon(view.getContext(), aVar);
        if (kr1.n(view.getPointerIcon(), androidPointerIcon)) {
            return;
        }
        view.setPointerIcon(androidPointerIcon);
    }

    public final PointerIcon toAndroidPointerIcon(Context context, androidx.compose.ui.input.pointer.a aVar) {
        return aVar instanceof nc ? PointerIcon.getSystemIcon(context, ((nc) aVar).b) : PointerIcon.getSystemIcon(context, 1000);
    }
}
