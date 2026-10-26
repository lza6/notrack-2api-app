package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class z11 implements et0 {
    public final /* synthetic */ h32 c;

    public z11(EmojiCompatInitializer emojiCompatInitializer, h32 h32Var) {
        this.c = h32Var;
    }

    @Override // defpackage.et0
    public final void onResume(n32 n32Var) {
        (Build.VERSION.SDK_INT >= 28 ? gl0.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j00(), 500L);
        this.c.b(this);
    }
}
