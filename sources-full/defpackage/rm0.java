package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rm0 {
    public static final String a = v72.h("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(sh1 sh1Var, hi4 hi4Var, uo0 uo0Var) {
        qm0 qm0Var;
        if (uo0Var instanceof qm0) {
            qm0Var = (qm0) uo0Var;
            int i = qm0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm0Var.d = i - Integer.MIN_VALUE;
            } else {
                qm0Var = new qm0(uo0Var);
            }
        } else {
            qm0Var = new qm0(uo0Var);
        }
        Object objB = qm0Var.c;
        int i2 = qm0Var.d;
        so0 so0Var = null;
        if (i2 == 0) {
            g13.O(objB);
            pm0 pm0Var = new pm0(0, new t81(sh1Var.e(hi4Var), new fp(hi4Var, so0Var, 2), 3));
            qm0Var.d = 1;
            objB = sf3.B(pm0Var, qm0Var);
            hq0 hq0Var = hq0.c;
            if (objB == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(objB);
        }
        return new Integer(((an0) objB).a);
    }
}
