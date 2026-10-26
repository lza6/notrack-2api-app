package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class qa0 implements le1 {
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ qa0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((mi2) this.d).setValue(str);
                break;
            case 1:
                ((t00) this.d).resumeWith(w84Var);
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lx2 lx2Var = (lx2) this.d;
                if (lx2Var != null) {
                    lx2Var.h = zBooleanValue;
                }
                break;
            default:
                MediaPlayer mediaPlayer = (MediaPlayer) this.d;
                try {
                    mediaPlayer.setOnCompletionListener(null);
                    mediaPlayer.setOnErrorListener(null);
                } catch (Exception unused) {
                }
                break;
        }
        return w84Var;
    }
}
