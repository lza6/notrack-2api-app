package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 implements wg0 {
    public final int c;
    public final boolean d;
    public Object h;
    public w33 l;
    public ArrayList m;

    public yg0(int i, Object obj, boolean z) {
        this.c = i;
        this.d = z;
        this.h = obj;
    }

    public final Object a(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(this.c);
        g(kk0Var);
        int iA = i | (kk0Var.h(this) ? zg0.a(2, 0) : zg0.a(1, 0));
        Object obj = this.h;
        obj.getClass();
        y64.l(2, obj);
        Object objInvoke = ((ne1) obj).invoke(kk0Var, Integer.valueOf(iA));
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new xg0(2, this, yg0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0));
        }
        return objInvoke;
    }

    @Override // defpackage.pe1
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (ck0) obj3, ((Number) obj4).intValue());
    }

    public final Object c(Object obj, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(this.c);
        g(kk0Var);
        int iA = kk0Var.h(this) ? zg0.a(2, 1) : zg0.a(1, 1);
        Object obj2 = this.h;
        obj2.getClass();
        int i2 = 3;
        y64.l(3, obj2);
        Object objInvoke = ((oe1) obj2).invoke(obj, kk0Var, Integer.valueOf(iA | i));
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, i2, this, obj));
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(this.c);
        g(kk0Var);
        int iA = kk0Var.h(this) ? zg0.a(2, 2) : zg0.a(1, 2);
        Object obj3 = this.h;
        obj3.getClass();
        y64.l(4, obj3);
        Object objB = ((pe1) obj3).b(obj, obj2, kk0Var, Integer.valueOf(iA | i));
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ed(this, obj, obj2, i, 2));
        }
        return objB;
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(this.c);
        g(kk0Var);
        int iA = kk0Var.h(this) ? zg0.a(2, 5) : zg0.a(1, 5);
        Object obj6 = this.h;
        obj6.getClass();
        y64.l(7, obj6);
        Object objF = ((yg0) ((re1) obj6)).f(obj, obj2, obj3, obj4, obj5, kk0Var, Integer.valueOf(i | iA));
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new mf(this, obj, obj2, obj3, obj4, obj5, i, 1));
        }
        return objF;
    }

    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, kk0 kk0Var, Integer num) {
        return e(obj, obj2, obj3, obj4, obj5, kk0Var, num.intValue());
    }

    public final void g(ck0 ck0Var) {
        w33 w33VarC;
        if (!this.d || (w33VarC = ((kk0) ck0Var).C()) == null) {
            return;
        }
        w33VarC.setUsed(true);
        if (zg0.b(this.l, w33VarC)) {
            this.l = w33VarC;
            return;
        }
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.m = arrayList2;
            arrayList2.add(w33VarC);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (zg0.b((v33) arrayList.get(i), w33VarC)) {
                arrayList.set(i, w33VarC);
                return;
            }
        }
        arrayList.add(w33VarC);
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((ck0) obj, ((Number) obj2).intValue());
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return c(obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}
