package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class sa extends ww1 implements ne1 {
    public final /* synthetic */ gn3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(gn3 gn3Var) {
        super(2);
        this.c = gn3Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            wa.DialogLayout(we3.b(c.i, false, v1.h), (ne1) this.c.getValue(), kk0Var, 0, 0);
        } else {
            kk0Var.V();
        }
    }
}
