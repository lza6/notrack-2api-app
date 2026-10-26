package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j33 {
    public final pm1 a;
    public final List b;
    public final int c;
    public final pm1 d;
    public final ai3 e;
    public final bg1 f;
    public final boolean g;

    public j33(pm1 pm1Var, List list, int i, pm1 pm1Var2, ai3 ai3Var, bg1 bg1Var, boolean z) {
        this.a = pm1Var;
        this.b = list;
        this.c = i;
        this.d = pm1Var2;
        this.e = ai3Var;
        this.f = bg1Var;
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(uo0 uo0Var) throws Throwable {
        h33 h33Var;
        y31 y31Var;
        if (uo0Var instanceof h33) {
            h33Var = (h33) uo0Var;
            int i = h33Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                h33Var.l = i - Integer.MIN_VALUE;
            } else {
                h33Var = new h33(this, uo0Var);
            }
        } else {
            h33Var = new h33(this, uo0Var);
        }
        Object obj = h33Var.d;
        int i2 = h33Var.l;
        pm1 pm1Var = this.a;
        if (i2 == 0) {
            g13.O(obj);
            List list = this.b;
            int i3 = this.c;
            y31 y31Var2 = (y31) list.get(i3);
            bg1 bg1Var = this.f;
            boolean z = this.g;
            j33 j33Var = new j33(pm1Var, this.b, i3 + 1, this.d, this.e, bg1Var, z);
            h33Var.c = y31Var2;
            h33Var.l = 1;
            Object objD = y31Var2.d(j33Var, h33Var);
            hq0 hq0Var = hq0.c;
            if (objD == hq0Var) {
                return hq0Var;
            }
            obj = objD;
            y31Var = y31Var2;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y31Var = h33Var.c;
            g13.O(obj);
        }
        tm1 tm1Var = (tm1) obj;
        pm1 pm1VarA = tm1Var.a();
        if (pm1VarA.a != pm1Var.a) {
            u41.i(y31Var, "' cannot modify the request's context.", "Interceptor '");
            return null;
        }
        if (pm1VarA.b == tm2.a) {
            u41.i(y31Var, "' cannot set the request's data to null.", "Interceptor '");
            return null;
        }
        if (pm1VarA.c != pm1Var.c) {
            u41.i(y31Var, "' cannot modify the request's target.", "Interceptor '");
            return null;
        }
        if (pm1VarA.q == pm1Var.q) {
            return tm1Var;
        }
        u41.i(y31Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        return null;
    }
}
