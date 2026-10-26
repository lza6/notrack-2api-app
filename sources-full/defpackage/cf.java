package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class cf extends uo0 {
    public ef c;
    public Drawable d;
    public /* synthetic */ Object h;
    public final /* synthetic */ ef l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(ef efVar, uo0 uo0Var) {
        super(uo0Var);
        this.l = efVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
