package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class re extends ww1 implements je1 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ qk0 h;
    public final /* synthetic */ g93 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ View n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(Context context, le1 le1Var, qk0 qk0Var, g93 g93Var, int i, View view) {
        super(0);
        this.c = context;
        this.d = le1Var;
        this.h = qk0Var;
        this.l = g93Var;
        this.m = i;
        this.n = view;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        KeyEvent.Callback callback = this.n;
        callback.getClass();
        return new bd4(this.c, this.d, this.h, this.l, this.m, (yr2) callback).getLayoutNode();
    }
}
