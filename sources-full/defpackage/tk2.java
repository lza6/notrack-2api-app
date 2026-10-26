package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class tk2 implements s61 {
    public final yq3 a;
    public final yq3 b;
    public final bi4 c;

    public tk2(b72 b72Var) {
        b72 b72Var2 = new b72(3);
        sk2 sk2Var = sk2.c;
        this.a = new yq3(b72Var);
        this.b = yo4.I(b72Var2);
        bi4 bi4Var = new bi4();
        bi4Var.c = sk2Var;
        bi4Var.d = bg1.C;
        this.c = bi4Var;
    }

    @Override // defpackage.s61
    public final t61 a(Object obj, jq2 jq2Var, g33 g33Var) {
        da4 da4Var = (da4) obj;
        if (!kr1.n(da4Var.c, "http") && !kr1.n(da4Var.c, "https")) {
            return null;
        }
        String str = da4Var.a;
        yq3 yq3Var = this.a;
        yq3 yq3Var2 = new yq3(new wl(15, g33Var));
        yq3 yq3Var3 = this.b;
        bi4 bi4Var = this.c;
        Context context = jq2Var.a;
        Object obj2 = bi4Var.d;
        bg1 bg1Var = bg1.C;
        if (obj2 == bg1Var) {
            synchronized (bi4Var) {
                obj2 = bi4Var.d;
                if (obj2 == bg1Var) {
                    le1 le1Var = (le1) bi4Var.c;
                    le1Var.getClass();
                    Object objInvoke = le1Var.invoke(context);
                    bi4Var.d = objInvoke;
                    bi4Var.c = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new xk2(str, jq2Var, yq3Var, yq3Var2, yq3Var3, (tl0) obj2);
    }
}
