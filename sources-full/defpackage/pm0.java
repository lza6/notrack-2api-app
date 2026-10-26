package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm0 implements k81 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ pm0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    @Override // defpackage.k81
    public final Object a(l81 l81Var, so0 so0Var) {
        a91 a91Var;
        Object obj;
        y yVar;
        p83 p83Var;
        int i = this.c;
        so0 so0Var2 = null;
        hq0 hq0Var = hq0.c;
        Object obj2 = this.d;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                Object objA = ((t81) obj2).a(new om0(l81Var, 0), so0Var);
                return objA == hq0Var ? objA : w84Var;
            case 1:
                Object objA2 = ((k81) obj2).a(new ha0(new o43(), 2, l81Var), so0Var);
                return objA2 == hq0Var ? objA2 : w84Var;
            case 2:
                if (so0Var instanceof a91) {
                    a91Var = (a91) so0Var;
                    int i2 = a91Var.d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        a91Var.d = i2 - Integer.MIN_VALUE;
                    } else {
                        a91Var = new a91(this, so0Var);
                    }
                } else {
                    a91Var = new a91(this, so0Var);
                }
                Object obj3 = a91Var.c;
                int i3 = a91Var.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = a91Var.l;
                    try {
                        g13.O(obj3);
                    } catch (d e) {
                        e = e;
                        if (e.c != obj) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    g13.O(obj3);
                    Object obj4 = new Object();
                    try {
                        s8 s8Var = new s8(new o43(), l81Var, obj4, 4);
                        a91Var.l = obj4;
                        a91Var.d = 1;
                        if (((pm0) obj2).a(s8Var, a91Var) == hq0Var) {
                            return hq0Var;
                        }
                    } catch (d e2) {
                        e = e2;
                        obj = obj4;
                        if (e.c != obj) {
                            throw e;
                        }
                    }
                }
                return w84Var;
            case 3:
                if (so0Var instanceof y) {
                    yVar = (y) so0Var;
                    int i4 = yVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        yVar.l = i4 - Integer.MIN_VALUE;
                    } else {
                        yVar = new y(this, so0Var);
                    }
                } else {
                    yVar = new y(this, so0Var);
                }
                Object obj5 = yVar.d;
                int i5 = yVar.l;
                if (i5 != 0) {
                    if (i5 != 1) {
                        u41.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p83Var = yVar.c;
                    try {
                        g13.O(obj5);
                        p83Var.releaseIntercepted();
                        return w84Var;
                    } catch (Throwable th) {
                        th = th;
                        p83Var.releaseIntercepted();
                        throw th;
                    }
                }
                g13.O(obj5);
                p83 p83Var2 = new p83(l81Var, yVar.getContext());
                try {
                    yVar.c = p83Var2;
                    yVar.l = 1;
                    Object objInvoke = ((ne1) obj2).invoke(p83Var2, yVar);
                    if (objInvoke != hq0Var) {
                        objInvoke = w84Var;
                    }
                    if (objInvoke == hq0Var) {
                        return hq0Var;
                    }
                    p83Var = p83Var2;
                    p83Var.releaseIntercepted();
                    return w84Var;
                } catch (Throwable th2) {
                    th = th2;
                    p83Var = p83Var2;
                    p83Var.releaseIntercepted();
                    throw th;
                }
            default:
                k81[] k81VarArr = (k81[]) obj2;
                pf0 pf0Var = new pf0(k81VarArr, new i43(19, k81VarArr), new z8(3, so0Var2), l81Var, null);
                n81 n81Var = new n81(so0Var, so0Var.getContext());
                Object objC0 = vl0.c0(n81Var, true, n81Var, pf0Var);
                if (objC0 != hq0Var) {
                    objC0 = w84Var;
                }
                return objC0 == hq0Var ? objC0 : w84Var;
        }
    }
}
