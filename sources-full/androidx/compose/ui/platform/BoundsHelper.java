package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
interface BoundsHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final BoundsHelper getInstance() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return BoundsHelperApi30Impl.INSTANCE;
            }
            if (i >= 29) {
                return BoundsHelperApi29Impl.INSTANCE;
            }
            return i >= 28 ? BoundsHelperApi28Impl.INSTANCE : BoundsHelperApi24Impl.INSTANCE;
        }
    }

    Rect currentWindowBounds(Activity activity);
}
