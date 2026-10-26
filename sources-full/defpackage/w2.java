package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class w2 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ ActionBarOverlayLayout d;

    public /* synthetic */ w2(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.c = i;
        this.d = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        switch (i) {
            case 0:
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.E = actionBarOverlayLayout.l.animate().translationY(0.0f).setListener(actionBarOverlayLayout.F);
                break;
            default:
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.E = actionBarOverlayLayout.l.animate().translationY(-actionBarOverlayLayout.l.getHeight()).setListener(actionBarOverlayLayout.F);
                break;
        }
    }
}
