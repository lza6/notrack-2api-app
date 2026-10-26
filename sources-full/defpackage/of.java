package defpackage;

import androidx.compose.animation.b;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class of extends ww1 implements oe1 {
    public final /* synthetic */ pf c;
    public final /* synthetic */ l41 d;
    public final /* synthetic */ y51 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(pf pfVar, l41 l41Var, y51 y51Var) {
        super(3);
        this.c = pfVar;
        this.d = l41Var;
        this.h = y51Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1840112047);
        c cVarThen = cVar.then(b.createModifier(((qf) this.c).a, this.d, this.h, null, "animateEnterExit", kk0Var, 0, 4));
        kk0Var.r(false);
        return cVarThen;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
