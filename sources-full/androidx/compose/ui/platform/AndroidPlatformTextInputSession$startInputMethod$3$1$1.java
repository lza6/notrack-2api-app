package androidx.compose.ui.platform;

import defpackage.le1;
import defpackage.ly3;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends ww1 implements le1 {
    final /* synthetic */ InputMethodSession $methodSession;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.$methodSession = inputMethodSession;
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return w84.a;
    }

    public final void invoke(Throwable th) {
        this.$methodSession.dispose();
        ly3 ly3Var = this.this$0.textInputService;
        ly3Var.b.set(null);
        ly3Var.a.g();
    }
}
