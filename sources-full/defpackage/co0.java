package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class co0 {
    public final ml3 a = new ml3();

    public static void a(co0 co0Var, mo0 mo0Var, je1 je1Var) {
        co0Var.a.add(new yg0(262103052, new bo0(mo0Var, c.i, je1Var), true));
    }

    public final void Content$foundation_release(wn0 wn0Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1320309496);
        int i2 = (i & 6) == 0 ? (kk0Var.h(wn0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(this) ? 32 : 16;
        }
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            ml3 ml3Var = this.a;
            int size = ml3Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((oe1) ml3Var.get(i3)).invoke(wn0Var, kk0Var, Integer.valueOf(i2 & 14));
            }
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 7, this, wn0Var));
        }
    }
}
