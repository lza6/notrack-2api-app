package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class qw2 extends uo0 {
    public Activity c;
    public uw2 d;
    public String h;
    public ci4 l;
    public ag0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tw2 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw2(tw2 tw2Var, uo0 uo0Var) {
        super(uo0Var);
        this.o = tw2Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(null, null, null, this);
    }
}
