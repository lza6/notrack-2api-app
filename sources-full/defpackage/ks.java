package defpackage;

import androidx.compose.ui.platform.TextToolbar;

/* JADX INFO: loaded from: classes.dex */
public final class ks extends uo0 {
    public gq0 c;
    public wx3 d;
    public wx3 h;
    public ms l;
    public h43 m;
    public TextToolbar n;
    public /* synthetic */ Object o;
    public final /* synthetic */ os p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(os osVar, so0 so0Var) {
        super(so0Var);
        this.p = osVar;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, this);
    }
}
