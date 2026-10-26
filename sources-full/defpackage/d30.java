package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d30 implements l81 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ d30(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) throws Throwable {
        c30 c30Var;
        int i = this.c;
        Object obj2 = this.m;
        boolean z = true;
        Object obj3 = this.h;
        Object obj4 = this.l;
        w84 w84Var = w84.a;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                if (so0Var instanceof c30) {
                    c30Var = (c30) so0Var;
                    int i2 = c30Var.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c30Var.m = i2 - Integer.MIN_VALUE;
                    } else {
                        c30Var = new c30(this, so0Var);
                    }
                } else {
                    c30Var = new c30(this, so0Var);
                }
                Object obj6 = c30Var.h;
                int i3 = c30Var.m;
                if (i3 == 0) {
                    g13.O(obj6);
                    gs1 gs1Var = (gs1) ((q43) obj5).c;
                    if (gs1Var != null) {
                        gs1Var.c(new sb0("Child of the scoped flow was cancelled"));
                        c30Var.c = this;
                        c30Var.d = obj;
                        c30Var.m = 1;
                        Object objK = gs1Var.K(c30Var);
                        hq0 hq0Var = hq0.c;
                        if (objK == hq0Var) {
                            return hq0Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c30Var.d;
                    this = c30Var.c;
                    g13.O(obj6);
                }
                ((q43) this.d).c = py.F((gq0) this.h, null, jq0.l, new b30((e30) this.l, (l81) this.m, obj, null), 1);
                return w84Var;
            case 1:
                xw3 xw3Var = (xw3) obj4;
                z22 z22Var = (z22) obj5;
                if (((Boolean) obj).booleanValue() && z22Var.b()) {
                    qp0.d((ly3) obj3, z22Var, xw3Var.k(), (in1) obj2, xw3Var.b);
                } else {
                    qp0.c(z22Var);
                }
                return w84Var;
            default:
                tq1 tq1Var = (tq1) obj;
                o43 o43Var = (o43) obj4;
                o43 o43Var2 = (o43) obj3;
                o43 o43Var3 = (o43) obj5;
                if (tq1Var instanceof ry2) {
                    o43Var3.c++;
                } else if ((tq1Var instanceof sy2) || (tq1Var instanceof qy2)) {
                    o43Var3.c--;
                } else if (tq1Var instanceof xi1) {
                    o43Var2.c++;
                } else if (tq1Var instanceof yi1) {
                    o43Var2.c--;
                } else if (tq1Var instanceof ja1) {
                    o43Var.c++;
                } else if (tq1Var instanceof ka1) {
                    o43Var.c--;
                }
                boolean z2 = false;
                boolean z3 = o43Var3.c > 0;
                boolean z4 = o43Var2.c > 0;
                boolean z5 = o43Var.c > 0;
                ns0 ns0Var = (ns0) obj2;
                if (ns0Var.d != z3) {
                    ns0Var.d = z3;
                    z2 = true;
                }
                if (ns0Var.h != z4) {
                    ns0Var.h = z4;
                    z2 = true;
                }
                if (ns0Var.l != z5) {
                    ns0Var.l = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    kr1.O(ns0Var);
                }
                return w84Var;
        }
    }
}
