package androidx.compose.ui.platform;

import android.view.View;
import defpackage.lh1;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHapticFeedback implements lh1 {
    public static final int $stable = 8;
    private final View view;

    public DefaultHapticFeedback(View view) {
        this.view = view;
    }

    @Override // defpackage.lh1
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E, reason: not valid java name */
    public void mo63x70bb4fce(int i) {
        if (i == 16) {
            this.view.performHapticFeedback(16);
            return;
        }
        if (i == 6) {
            this.view.performHapticFeedback(6);
            return;
        }
        if (i == 13) {
            this.view.performHapticFeedback(13);
            return;
        }
        if (i == 23) {
            this.view.performHapticFeedback(23);
            return;
        }
        if (i == 0) {
            this.view.performHapticFeedback(0);
            return;
        }
        if (i == 17) {
            this.view.performHapticFeedback(17);
            return;
        }
        if (i == 27) {
            this.view.performHapticFeedback(27);
            return;
        }
        if (i == 26) {
            this.view.performHapticFeedback(26);
            return;
        }
        if (i == 9) {
            this.view.performHapticFeedback(9);
            return;
        }
        if (i == 22) {
            this.view.performHapticFeedback(22);
        } else if (i == 21) {
            this.view.performHapticFeedback(21);
        } else if (i == 1) {
            this.view.performHapticFeedback(1);
        }
    }
}
