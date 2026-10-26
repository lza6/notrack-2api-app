package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import defpackage.je1;
import defpackage.le1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$snapshotObserver$1 extends ww1 implements le1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((je1) obj);
        return w84.a;
    }

    public final void invoke(final je1 je1Var) {
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            je1Var.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.a
                @Override // java.lang.Runnable
                public final void run() {
                    je1Var.invoke();
                }
            });
        }
    }
}
