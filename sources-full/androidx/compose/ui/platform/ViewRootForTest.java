package androidx.compose.ui.platform;

import android.view.KeyEvent;
import android.view.View;
import defpackage.af3;
import defpackage.le1;
import defpackage.ly3;
import defpackage.r73;
import defpackage.wu0;

/* JADX INFO: loaded from: classes.dex */
public interface ViewRootForTest extends r73 {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static le1 onViewCreatedCallback;

        private Companion() {
        }

        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        public final le1 getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(le1 le1Var) {
            onViewCreatedCallback = le1Var;
        }
    }

    /* bridge */ /* synthetic */ default void forceAccessibilityForTesting(boolean z) {
    }

    /* synthetic */ wu0 getDensity();

    boolean getHasPendingMeasureOrLayout();

    /* synthetic */ af3 getSemanticsOwner();

    /* synthetic */ ly3 getTextInputService();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    /* bridge */ /* synthetic */ default void measureAndLayoutForTest() {
    }

    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    /* synthetic */ boolean mo30xcbe9678f(KeyEvent keyEvent);

    /* bridge */ /* synthetic */ default void setAccessibilityEventBatchIntervalMillis(long j) {
    }
}
