package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r81 implements k81 {
    public final /* synthetic */ x20 c;
    public final /* synthetic */ xn2 d;

    public r81(x20 x20Var, xn2 xn2Var) {
        this.c = x20Var;
        this.d = xn2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.k81
    public final Object a(l81 l81Var, so0 so0Var) throws Throwable {
        q81 q81Var;
        p83 p83Var;
        p83 p83Var2;
        if (so0Var instanceof q81) {
            q81Var = (q81) so0Var;
            int i = q81Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q81Var.d = i - Integer.MIN_VALUE;
            } else {
                q81Var = new q81(this, so0Var);
            }
        } else {
            q81Var = new q81(this, so0Var);
        }
        Object obj = q81Var.c;
        int i2 = q81Var.d;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        try {
            try {
                if (i2 == 0) {
                    g13.O(obj);
                    x20 x20Var = this.c;
                    q81Var.l = this;
                    q81Var.m = l81Var;
                    q81Var.d = 1;
                    if (x20Var.a(l81Var, q81Var) != hq0Var) {
                    }
                    return hq0Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) q81Var.l;
                        g13.O(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p83Var2 = (p83) q81Var.l;
                    try {
                        g13.O(obj);
                        p83Var2.releaseIntercepted();
                        return w84Var;
                    } catch (Throwable th2) {
                        th = th2;
                        p83Var2.releaseIntercepted();
                        throw th;
                    }
                }
                l81Var = q81Var.m;
                this = (r81) q81Var.l;
                g13.O(obj);
                xn2 xn2Var = this.d;
                q81Var.l = p83Var;
                q81Var.m = null;
                q81Var.d = 3;
                xn2Var.invoke(p83Var, null, q81Var);
                if (w84Var != hq0Var) {
                    p83Var2 = p83Var;
                    p83Var2.releaseIntercepted();
                    return w84Var;
                }
            } catch (Throwable th3) {
                th = th3;
                p83Var2 = p83Var;
                p83Var2.releaseIntercepted();
                throw th;
            }
            p83Var = new p83(l81Var, q81Var.getContext());
        } catch (Throwable th4) {
            r81 r81Var = this;
            p04 p04Var = new p04(th4);
            xn2 xn2Var2 = r81Var.d;
            q81Var.l = th4;
            q81Var.m = null;
            q81Var.d = 2;
            if (yo4.f(p04Var, xn2Var2, th4, q81Var) != hq0Var) {
                throw th4;
            }
        }
        return hq0Var;
    }
}
