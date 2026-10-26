package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class zg4 extends bh4 {
    public final WindowInsetsController a;
    public final Window b;

    public zg4(Window window) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // defpackage.bh4
    public final void a(boolean z) {
        Window window = this.b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.a.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.bh4
    public final void b(boolean z) {
        Window window = this.b;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
            this.a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.a.setSystemBarsAppearance(0, 8);
    }
}
