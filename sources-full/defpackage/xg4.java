package defpackage;

import android.view.View;
import android.view.Window;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class xg4 extends bh4 {
    public final Window a;

    public xg4(Window window) {
        this.a = window;
    }

    @Override // defpackage.bh4
    public final void b(boolean z) {
        Window window = this.a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }
}
