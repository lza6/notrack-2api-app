package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class jo0 extends ww1 implements ne1 {
    public final /* synthetic */ wn0 c;
    public final /* synthetic */ c d;
    public final /* synthetic */ le1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(wn0 wn0Var, c cVar, le1 le1Var) {
        super(2);
        this.c = wn0Var;
        this.d = cVar;
        this.h = le1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        le1 le1Var = this.h;
        wn0 wn0Var = this.c;
        ko0.ContextMenuColumn(wn0Var, this.d, zg0.rememberComposableLambda(1156688164, true, new io0(le1Var, wn0Var), kk0Var, 54), kk0Var, 384, 0);
    }
}
