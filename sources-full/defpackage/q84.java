package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q84 {
    public bi4 a;
    public bi4 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    public final void a(ey3 ey3Var) {
        bi4 bi4Var;
        hg hgVar = ey3Var.a;
        this.e = false;
        bi4 bi4Var2 = this.a;
        if (ey3Var.equals(bi4Var2 != null ? (ey3) bi4Var2.d : null)) {
            return;
        }
        String str = hgVar.d;
        bi4 bi4Var3 = this.a;
        boolean zN = kr1.n(str, bi4Var3 != null ? ((ey3) bi4Var3.d).a.d : null);
        bi4 bi4Var4 = this.a;
        if (zN) {
            if (bi4Var4 == null) {
                return;
            }
            bi4Var4.d = ey3Var;
            return;
        }
        this.a = new bi4(bi4Var4, ey3Var);
        this.b = null;
        int length = hgVar.d.length() + this.c;
        this.c = length;
        if (length > 100000) {
            bi4 bi4Var5 = this.a;
            if ((bi4Var5 != null ? (bi4) bi4Var5.c : null) == null) {
                return;
            }
            while (true) {
                if (bi4Var5 == null) {
                    bi4Var = null;
                } else {
                    bi4 bi4Var6 = (bi4) bi4Var5.c;
                    if (bi4Var6 != null) {
                        bi4Var = (bi4) bi4Var6.c;
                    } else {
                        bi4Var = null;
                    }
                }
                if (bi4Var == null) {
                    break;
                } else {
                    bi4Var5 = (bi4) bi4Var5.c;
                }
            }
            if (bi4Var5 == null) {
                return;
            }
            bi4Var5.c = null;
        }
    }
}
