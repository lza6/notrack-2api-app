package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wm implements xm {
    public static final wm a = new wm();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(im1 im1Var, pm1 pm1Var, uo0 uo0Var) {
        vm vmVar;
        if (uo0Var instanceof vm) {
            vmVar = (vm) uo0Var;
            int i = vmVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmVar.l = i - Integer.MIN_VALUE;
            } else {
                vmVar = new vm(this, uo0Var);
            }
        } else {
            vmVar = new vm(this, uo0Var);
        }
        Object objB = vmVar.d;
        int i2 = vmVar.l;
        if (i2 == 0) {
            g13.O(objB);
            vmVar.c = pm1Var;
            vmVar.l = 1;
            objB = ((g33) im1Var).b(pm1Var, vmVar);
            hq0 hq0Var = hq0.c;
            if (objB == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pm1Var = vmVar.c;
            g13.O(objB);
        }
        tm1 tm1Var = (tm1) objB;
        if (tm1Var instanceof np3) {
            np3 np3Var = (np3) tm1Var;
            return new rm(gm4.e(np3Var.a, pm1Var.a, 1), np3Var);
        }
        if (!(tm1Var instanceof s41)) {
            u41.e();
            return null;
        }
        s41 s41Var = (s41) tm1Var;
        am1 am1Var = s41Var.a;
        return new pm(am1Var != null ? gm4.e(am1Var, pm1Var.a, 1) : null, s41Var);
    }
}
