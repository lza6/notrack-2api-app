package androidx.compose.ui.platform;

import defpackage.le1;
import defpackage.vw0;
import defpackage.ww0;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1 extends ww1 implements le1 {
    final /* synthetic */ DisposableSaveableStateRegistry $saveableStateRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1(DisposableSaveableStateRegistry disposableSaveableStateRegistry) {
        super(1);
        this.$saveableStateRegistry = disposableSaveableStateRegistry;
    }

    @Override // defpackage.le1
    public final vw0 invoke(ww0 ww0Var) {
        final DisposableSaveableStateRegistry disposableSaveableStateRegistry = this.$saveableStateRegistry;
        return new vw0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1
            @Override // defpackage.vw0
            public void dispose() {
                disposableSaveableStateRegistry.dispose();
            }
        };
    }
}
