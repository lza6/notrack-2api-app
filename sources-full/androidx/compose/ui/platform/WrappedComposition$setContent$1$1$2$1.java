package androidx.compose.ui.platform;

import defpackage.g13;
import defpackage.gq0;
import defpackage.hq0;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", l = {137}, m = "invokeSuspend")
public final class WrappedComposition$setContent$1$1$2$1 extends mq3 implements ne1 {
    int label;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1$1$2$1(WrappedComposition wrappedComposition, so0 so0Var) {
        super(2, so0Var);
        this.this$0 = wrappedComposition;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new WrappedComposition$setContent$1$1$2$1(this.this$0, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(gq0 gq0Var, so0 so0Var) {
        return ((WrappedComposition$setContent$1$1$2$1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            g13.O(obj);
            AndroidComposeView owner = this.this$0.getOwner();
            this.label = 1;
            Object objBoundsUpdatesContentCaptureEventLoop = owner.boundsUpdatesContentCaptureEventLoop(this);
            hq0 hq0Var = hq0.c;
            if (objBoundsUpdatesContentCaptureEventLoop == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
        }
        return w84.a;
    }
}
