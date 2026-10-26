package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class yu extends on {
    public final WeakReference a;

    public yu(av avVar) {
        this.a = new WeakReference(avVar);
    }

    @Override // defpackage.on
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((av) weakReference.get()).m || !((av) weakReference.get()).l) {
            return;
        }
        ((av) weakReference.get()).f(new gu(i, charSequence));
    }

    @Override // defpackage.on
    public final void b(uu uuVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((av) weakReference.get()).l) {
            return;
        }
        int i = -1;
        if (uuVar.b == -1) {
            vu vuVar = uuVar.a;
            int iE = ((av) weakReference.get()).e();
            if ((iE & 32767) != 0 && !xr0.g0(iE)) {
                i = 2;
            }
            uuVar = new uu(vuVar, i);
        }
        av avVar = (av) weakReference.get();
        if (avVar.q == null) {
            avVar.q = new ih2();
        }
        av.j(avVar.q, uuVar);
    }
}
