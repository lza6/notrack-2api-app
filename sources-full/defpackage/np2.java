package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class np2 extends eq2 {
    public static final np2 c = new np2(0, 3, 1);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        yj3 yj3Var = (yj3) ce0Var.c(1);
        h8 h8Var = (h8) ce0Var.c(0);
        u71 u71Var = (u71) ce0Var.c(2);
        bk3 bk3VarJ = yj3Var.j();
        try {
            if (!u71Var.l.Q()) {
                mk0.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            u71Var.k.P(xkVar, bk3VarJ, z43Var);
            bk3VarJ.e(true);
            bk3Var.d();
            h8Var.getClass();
            bk3Var.y(yj3Var, yj3Var.b(h8Var));
            bk3Var.j();
        } catch (Throwable th) {
            bk3VarJ.e(false);
            throw th;
        }
    }
}
