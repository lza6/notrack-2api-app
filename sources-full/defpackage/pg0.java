package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ReportFragment$Companion;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class pg0 extends Activity implements n32, zu1 {
    public final p32 c = new p32(this);

    @Override // defpackage.zu1
    public final boolean c(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (av1.n(decorView, keyEvent)) {
            return true;
        }
        return av1.o(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (av1.n(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = a.d;
        ReportFragment$Companion.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        p32 p32Var = this.c;
        p32Var.d("setCurrentState");
        p32Var.f(g32.h);
        super.onSaveInstanceState(bundle);
    }
}
