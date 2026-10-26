package androidx.compose.ui.platform;

import android.content.Context;
import defpackage.le1;
import defpackage.vw0;
import defpackage.ww0;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1 extends ww1 implements le1 {
    final /* synthetic */ AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 $callbacks;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1(Context context, AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
        super(1);
        this.$context = context;
        this.$callbacks = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
    }

    @Override // defpackage.le1
    public final vw0 invoke(ww0 ww0Var) {
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        final Context context = this.$context;
        final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = this.$callbacks;
        return new vw0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1
            @Override // defpackage.vw0
            public void dispose() {
                context.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
            }
        };
    }
}
