package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h92 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void NotifPrimerDialog(je1 je1Var, je1 je1Var2, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-43976347);
        if ((i & 6) == 0) {
            i2 = i | (kk0Var2.j(je1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var2.j(je1Var2) ? 32 : 16;
        }
        if (kk0Var2.S(i2 & 1, (i2 & 19) != 18)) {
            kk0Var = kk0Var2;
            i9.m215x93865de1(je1Var2, zg0.rememberComposableLambda(1873568685, true, new g10(je1Var, 6), kk0Var2, 54), null, zg0.rememberComposableLambda(566426287, true, new g10(je1Var2, 7), kk0Var2, 54), null, zi0.c, zi0.d, null, 0L, 0L, 0L, 0L, 0.0f, null, kk0Var, ((i2 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            kk0Var = kk0Var2;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new t40(i, 4, je1Var, je1Var2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 NotifPrimerDialog$lambda$0(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            bz.TextButton(je1Var, null, false, null, null, null, null, null, null, zi0.a, kk0Var, 805306368, 510);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 NotifPrimerDialog$lambda$1(je1 je1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            bz.TextButton(je1Var, null, false, null, null, null, null, null, null, zi0.b, kk0Var, 805306368, 510);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static void c(je1 je1Var, je1 je1Var2, ck0 ck0Var, int i) {
        NotifPrimerDialog(je1Var, je1Var2, ck0Var, sf3.V(i | 1));
    }
}
