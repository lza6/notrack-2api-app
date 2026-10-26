package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gb3 {
    public static /* synthetic */ ScrollCaptureTarget b(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }
}
