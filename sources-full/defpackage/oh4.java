package defpackage;

import android.view.View;
import androidx.compose.ui.platform.WindowRecomposerFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh4 implements WindowRecomposerFactory {
    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    public final d43 createRecomposer(View view) {
        return WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
    }
}
