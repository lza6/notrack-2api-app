package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cf4 extends uo0 {
    public int c;
    public int d;
    public int h;
    public int l;
    public int m;
    public String n;
    public String o;
    public q43 p;
    public m43 q;
    public List r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ef4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf4(ef4 ef4Var, uo0 uo0Var) {
        super(uo0Var);
        this.u = ef4Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return ef4.a(this.u, 0, null, 0, null, this);
    }
}
