package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sb4 extends ww1 implements ne1 {
    public final /* synthetic */ ob4 c;
    public final /* synthetic */ Map d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb4(ob4 ob4Var, Map map) {
        super(2);
        this.c = ob4Var;
        this.d = map;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            ub4.RenderVectorGroup(this.c, this.d, kk0Var, 0, 0);
        } else {
            kk0Var.V();
        }
    }
}
