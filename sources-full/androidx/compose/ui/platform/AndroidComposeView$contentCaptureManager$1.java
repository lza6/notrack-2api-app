package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import defpackage.je1;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends we1 implements je1 {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, 1, AndroidComposeView_androidKt.class, obj, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;");
    }

    @Override // defpackage.je1
    public final ContentCaptureSessionCompat invoke() {
        return AndroidComposeView_androidKt.getContentCaptureSessionCompat((View) this.receiver);
    }
}
