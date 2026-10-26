package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qa extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(hh3 hh3Var, gq0 gq0Var, ue ueVar, je1 je1Var) {
        super(0);
        this.c = 2;
        this.d = hh3Var;
        this.l = gq0Var;
        this.m = ueVar;
        this.h = je1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        int i2 = 0;
        int i3 = 1;
        w84 w84Var = w84.a;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((xv0) obj4).f((je1) obj3, (uv0) obj2, (dx1) obj);
                break;
            case 1:
                eo1 eo1Var = (eo1) obj3;
                if (!kr1.n(obj4, eo1Var.c) || !kr1.n(obj2, eo1Var.d)) {
                    Object obj5 = this.d;
                    eo1Var.c = obj5;
                    Object obj6 = this.l;
                    eo1Var.d = obj6;
                    eo1Var.m = new qs3((do1) obj, eo1Var.h, obj5, obj6, null);
                    eo1Var.q.b.setValue(Boolean.TRUE);
                    eo1Var.n = false;
                    eo1Var.o = true;
                }
                break;
            case 2:
                gq0 gq0Var = (gq0) obj2;
                hh3 hh3Var = (hh3) obj4;
                so0 so0Var = null;
                if (((ih3) ((ft2) hh3Var.c.g).getValue()) != ih3.d) {
                    py.F(gq0Var, null, null, new ve2(hh3Var, so0Var, i3), 3).A(new oy0((je1) obj3, 1));
                } else {
                    r92 r92VarF = hh3Var.c.f();
                    if (!r92VarF.a.containsKey(ih3.h)) {
                        py.F(gq0Var, null, null, new ve2(hh3Var, so0Var, i3), 3).A(new oy0((je1) obj3, 1));
                    } else {
                        py.F(gq0Var, null, null, new ne2((ue) obj, so0Var, i3), 3);
                        py.F(gq0Var, null, null, new ve2(hh3Var, so0Var, i2), 3);
                    }
                }
                break;
            default:
                ((te2) obj4).e((je1) obj3, (if2) obj2, (dx1) obj);
                break;
        }
        return w84Var;
    }
}
