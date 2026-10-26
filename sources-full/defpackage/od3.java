package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od3(le3 le3Var, int i) {
        super(1);
        this.c = i;
        this.d = le3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        ed3 ed3Var;
        ed3 ed3Var2;
        boolean z;
        int i = this.c;
        w84 w84Var = w84.a;
        le3 le3Var = this.d;
        switch (i) {
            case 0:
                return new g4(11, le3Var);
            case 1:
                if (le3Var.a.a().b(((Number) obj).longValue())) {
                    le3Var.n();
                    le3Var.p();
                }
                return w84Var;
            case 2:
                if (le3Var.a.a().b(((Number) obj).longValue())) {
                    le3Var.i();
                    le3Var.m(null);
                }
                return w84Var;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                fd3 fd3VarE = le3Var.e();
                if (fd3VarE != null && (ed3Var2 = fd3VarE.a) != null && jLongValue == ed3Var2.c) {
                    le3Var.n.setValue(null);
                }
                fd3 fd3VarE2 = le3Var.e();
                if (fd3VarE2 != null && (ed3Var = fd3VarE2.b) != null && jLongValue == ed3Var.c) {
                    le3Var.o.setValue(null);
                }
                if (le3Var.a.a().b(jLongValue)) {
                    le3Var.p();
                }
                return w84Var;
            case 4:
                cx1 cx1Var = (cx1) obj;
                le3Var.k = cx1Var;
                if (((Boolean) le3Var.i.getValue()).booleanValue() && le3Var.e() != null) {
                    ln2 ln2Var = cx1Var != null ? new ln2(cx1Var.g(0L)) : null;
                    if (!kr1.n(le3Var.j, ln2Var)) {
                        le3Var.j = ln2Var;
                        le3Var.n();
                        le3Var.p();
                    }
                }
                return w84Var;
            case 5:
                cb1 cb1Var = (cb1) obj;
                ft2 ft2Var = le3Var.i;
                if (!cb1Var.a() && ((Boolean) ft2Var.getValue()).booleanValue()) {
                    le3Var.i();
                }
                ft2Var.setValue(Boolean.valueOf(cb1Var.a()));
                return w84Var;
            case 6:
                le3Var.l(((Boolean) obj).booleanValue());
                return w84Var;
            case 7:
                if (iv1.a.s(((yu1) obj).a) == uu1.COPY) {
                    le3Var.b();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                le3Var.m((fd3) obj);
                return w84Var;
        }
    }
}
