package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class ye4 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ t00 a;

    public ye4(t00 t00Var) {
        this.a = t00Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mediaPlayer.setOnCompletionListener(null);
        mediaPlayer.setOnErrorListener(null);
        t00 t00Var = this.a;
        if (!(t00Var.t() instanceof hm2)) {
            return true;
        }
        t00Var.resumeWith(Boolean.FALSE);
        return true;
    }
}
