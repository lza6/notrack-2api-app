package androidx.compose.ui.platform;

import defpackage.so0;
import defpackage.uo0;
import defpackage.vr0;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod")
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends uo0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, so0 so0Var) {
        super(so0Var);
        this.this$0 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startInputMethod(null, this);
    }
}
