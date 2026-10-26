package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class pe2 implements OnBackAnimationCallback {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ ue b;
    public final /* synthetic */ je1 c;

    public pe2(je1 je1Var, ue ueVar, gq0 gq0Var) {
        this.a = gq0Var;
        this.b = ueVar;
        this.c = je1Var;
    }

    public final void onBackCancelled() {
        py.F(this.a, null, null, new ne2(this.b, null, 0), 3);
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        py.F(this.a, null, null, new oe2(this.b, backEvent, null, 0), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        py.F(this.a, null, null, new oe2(this.b, backEvent, null, 1), 3);
    }
}
