package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.g13;
import defpackage.gq0;
import defpackage.mq3;
import defpackage.ne1;
import defpackage.so0;
import defpackage.u41;
import defpackage.vr0;
import defpackage.w84;

/* JADX INFO: loaded from: classes.dex */
@vr0(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends mq3 implements ne1 {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(so0 so0Var) {
        super(2, so0Var);
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(gq0 gq0Var, so0 so0Var) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(gq0Var, so0Var)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label == 0) {
            g13.O(obj);
            return Choreographer.getInstance();
        }
        u41.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
