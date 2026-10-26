package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class pu implements Runnable {
    public final /* synthetic */ int c;
    public final WeakReference d;

    public pu(av avVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                this.d = new WeakReference(avVar);
                break;
            default:
                this.d = new WeakReference(avVar);
                break;
        }
    }

    public pu(qu quVar) {
        this.c = 0;
        this.d = new WeakReference(quVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        WeakReference weakReference = this.d;
        switch (i) {
            case 0:
                if (weakReference.get() != null) {
                    ((qu) weakReference.get()).S();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((av) weakReference.get()).n = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((av) weakReference.get()).o = false;
                }
                break;
        }
    }
}
