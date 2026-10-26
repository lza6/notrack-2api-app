package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zu implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public zu(av avVar) {
        this.d = new WeakReference(avVar);
    }

    public zu(k71 k71Var) {
        this.d = k71Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((av) weakReference.get()).i(true);
                }
                break;
            default:
                ((k71) obj).u0.i(true);
                break;
        }
    }
}
