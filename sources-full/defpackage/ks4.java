package defpackage;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class ks4 extends ck4 implements IInterface {
    public final d5 e;
    public final us3 f;
    public final /* synthetic */ ts4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks4(ts4 ts4Var, d5 d5Var, us3 us3Var) {
        super(3);
        this.g = ts4Var;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.e = d5Var;
        this.f = us3Var;
    }

    public void i(Bundle bundle) {
        this.g.a.c(this.f);
        this.e.f("onCompleteUpdate", new Object[0]);
    }

    public void j(Bundle bundle) {
        this.g.a.c(this.f);
        this.e.f("onRequestInfo", new Object[0]);
    }
}
