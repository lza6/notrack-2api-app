package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends uo0 {
    public ks0 c;
    public kn4 d;
    public LinkedHashMap h;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ kn4 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt1(kn4 kn4Var, wr wrVar) {
        super(wrVar);
        this.n = kn4Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return kn4.a(this.n, null, this);
    }
}
