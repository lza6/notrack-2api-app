package androidx.compose.ui.platform;

import android.view.View;
import defpackage.d43;
import defpackage.oh4;

/* JADX INFO: loaded from: classes.dex */
public interface WindowRecomposerFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowRecomposerFactory LifecycleAware = new oh4();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d43 LifecycleAware$lambda$0(View view) {
            return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
        }

        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }
    }

    d43 createRecomposer(View view);
}
