package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import notrack.ai.data.api.ChatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class db0 extends mq3 implements oe1 {
    public /* synthetic */ Throwable c;
    public final /* synthetic */ hb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(hb0 hb0Var, so0 so0Var) {
        super(3, so0Var);
        this.d = hb0Var;
    }

    @Override // defpackage.oe1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        db0 db0Var = new db0(this.d, (so0) obj3);
        db0Var.c = (Throwable) obj2;
        w84 w84Var = w84.a;
        db0Var.invokeSuspend(w84Var);
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.c;
        g13.O(obj);
        if (th instanceof CancellationException) {
            throw th;
        }
        Log.w("NoTrack", "chat stream failed", th);
        hb0 hb0Var = this.d;
        hb0Var.I(new ChatEvent.Error("offline:".concat(hb0Var.b.k(th, false)), null, null, null));
        return w84.a;
    }
}
