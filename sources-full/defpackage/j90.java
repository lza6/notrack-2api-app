package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j90 extends ww1 implements pe1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ le1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(List list, le1 le1Var) {
        super(4);
        this.c = list;
        this.d = le1Var;
    }

    @Override // defpackage.pe1
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((b02) obj, ((Number) obj2).intValue(), (ck0) obj3, ((Number) obj4).intValue());
        return w84.a;
    }

    public final void invoke(b02 b02Var, int i, ck0 ck0Var, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (((kk0) ck0Var).h(b02Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ((kk0) ck0Var).f(i) ? 32 : 16;
        }
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i3 & 1, (i3 & 147) != 146)) {
            kk0Var.V();
            return;
        }
        hn hnVar = (hn) this.c.get(i);
        kk0Var.a0(-1655463685);
        le1 le1Var = this.d;
        boolean zH = kk0Var.h(le1Var) | kk0Var.h(hnVar);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new h90(le1Var, 0, hnVar);
            kk0Var.l0(objP);
        }
        fn.AttachmentChip(hnVar, (je1) objP, null, kk0Var, 0, 4);
        kk0Var.r(false);
    }
}
