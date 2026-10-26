package defpackage;

import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class h54 extends uo0 {
    public /* synthetic */ Object c;
    public final /* synthetic */ c d;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h54(c cVar, uo0 uo0Var) {
        super(uo0Var);
        this.d = cVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.c = obj;
        this.h |= Integer.MIN_VALUE;
        this.d.b(null, this);
        return hq0.c;
    }
}
