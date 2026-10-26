package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class wv2 implements lh1 {
    public final AndroidComposeView a;

    public wv2(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // defpackage.lh1
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E */
    public final void mo63x70bb4fce(int i) {
        AndroidComposeView androidComposeView = this.a;
        if (i == 16) {
            androidComposeView.performHapticFeedback(16);
            return;
        }
        if (i == 6) {
            androidComposeView.performHapticFeedback(6);
            return;
        }
        if (i == 13) {
            androidComposeView.performHapticFeedback(13);
            return;
        }
        if (i == 23) {
            androidComposeView.performHapticFeedback(23);
            return;
        }
        if (i == 0) {
            androidComposeView.performHapticFeedback(0);
            return;
        }
        if (i == 17) {
            androidComposeView.performHapticFeedback(17);
            return;
        }
        if (i == 27) {
            androidComposeView.performHapticFeedback(27);
            return;
        }
        if (i == 26) {
            androidComposeView.performHapticFeedback(26);
            return;
        }
        if (i == 9) {
            androidComposeView.performHapticFeedback(9);
            return;
        }
        if (i == 22) {
            androidComposeView.performHapticFeedback(22);
        } else if (i == 21) {
            androidComposeView.performHapticFeedback(21);
        } else if (i == 1) {
            androidComposeView.performHapticFeedback(1);
        }
    }
}
