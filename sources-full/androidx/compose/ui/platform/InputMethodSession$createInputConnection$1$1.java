package androidx.compose.ui.platform;

import android.view.inputmethod.InputConnection;
import defpackage.kr1;
import defpackage.le1;
import defpackage.of4;
import defpackage.oi2;
import defpackage.vm2;
import defpackage.w84;
import defpackage.wm2;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class InputMethodSession$createInputConnection$1$1 extends ww1 implements le1 {
    final /* synthetic */ InputMethodSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodSession$createInputConnection$1$1(InputMethodSession inputMethodSession) {
        super(1);
        this.this$0 = inputMethodSession;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vm2) obj);
        return w84.a;
    }

    public final void invoke(vm2 vm2Var) {
        wm2 wm2Var = (wm2) vm2Var;
        InputConnection inputConnection = wm2Var.b;
        if (inputConnection != null) {
            inputConnection.closeConnection();
            wm2Var.b = null;
        }
        oi2 oi2Var = this.this$0.connections;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (kr1.n((of4) objArr[i2], wm2Var)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            this.this$0.connections.m(i2);
        }
        if (this.this$0.connections.h == 0) {
            this.this$0.onAllConnectionsClosed.invoke();
        }
    }
}
