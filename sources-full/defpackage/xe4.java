package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class xe4 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ t00 a;

    public xe4(t00 t00Var) {
        this.a = t00Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnCompletionListener(null);
        mediaPlayer.setOnErrorListener(null);
        t00 t00Var = this.a;
        if (t00Var.t() instanceof hm2) {
            t00Var.resumeWith(Boolean.TRUE);
        }
    }
}
