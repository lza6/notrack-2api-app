package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface ViewRootForInspector {

    public static final class DefaultImpls {
        @Deprecated
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getSubCompositionView();
        }

        @Deprecated
        public static View getViewRoot(ViewRootForInspector viewRootForInspector) {
            return ViewRootForInspector.super.getViewRoot();
        }
    }

    default AbstractComposeView getSubCompositionView() {
        return null;
    }

    default View getViewRoot() {
        return null;
    }
}
