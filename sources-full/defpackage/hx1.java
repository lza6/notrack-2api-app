package defpackage;

import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hx1 extends ww1 implements ne1 {
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(List list) {
        super(2);
        this.c = list;
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
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ne1 ne1Var = (ne1) list.get(i2);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            a.j.getClass();
            d4 virtualConstructor = ComposeUiNode$Companion.getVirtualConstructor();
            if (kk0Var.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(virtualConstructor);
            } else {
                kk0Var.o0();
            }
            pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ne1Var.invoke(kk0Var, 0);
            kk0Var.r(true);
        }
    }
}
