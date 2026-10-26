package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class co2 implements OnBackAnimationCallback {
    public final /* synthetic */ le1 a;
    public final /* synthetic */ le1 b;
    public final /* synthetic */ je1 c;
    public final /* synthetic */ je1 d;

    public co2(le1 le1Var, le1 le1Var2, je1 je1Var, je1 je1Var2) {
        this.a = le1Var;
        this.b = le1Var2;
        this.c = je1Var;
        this.d = je1Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new zq(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new zq(backEvent));
    }
}
