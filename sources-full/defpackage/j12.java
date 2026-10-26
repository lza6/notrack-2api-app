package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j12 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ l12 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j12(l12 l12Var, int i) {
        super(1);
        this.c = i;
        this.d = l12Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        l12 l12Var = this.d;
        switch (i) {
            case 0:
                q02 q02Var = (q02) l12Var.c.invoke();
                int iA = q02Var.a();
                int i2 = 0;
                while (i2 < iA) {
                    if (q02Var.b(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Number) obj).intValue();
                q02 q02Var2 = (q02) l12Var.c.invoke();
                if (iIntValue < 0 || iIntValue >= q02Var2.a()) {
                    StringBuilder sbS = ud2.s("Can't scroll to index ", ", it is out of bounds [0, ", iIntValue);
                    sbS.append(q02Var2.a());
                    sbS.append(')');
                    so1.a(sbS.toString());
                }
                py.F(l12Var.getCoroutineScope(), null, null, new k12(l12Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
