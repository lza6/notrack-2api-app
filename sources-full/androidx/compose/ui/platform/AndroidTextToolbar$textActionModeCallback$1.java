package androidx.compose.ui.platform;

import defpackage.je1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextToolbar$textActionModeCallback$1 extends ww1 implements je1 {
    final /* synthetic */ AndroidTextToolbar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextToolbar$textActionModeCallback$1(AndroidTextToolbar androidTextToolbar) {
        super(0);
        this.this$0 = androidTextToolbar;
    }

    @Override // defpackage.je1
    public /* bridge */ /* synthetic */ Object invoke() {
        m51invoke();
        return w84.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m51invoke() {
        this.this$0.actionMode = null;
    }
}
