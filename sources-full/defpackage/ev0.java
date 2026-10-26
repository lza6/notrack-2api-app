package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ev0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev0(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(1);
        this.c = i2;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(nv2[] nv2VarArr, f83 f83Var, int i, int[] iArr) {
        super(1);
        this.c = 2;
        this.h = nv2VarArr;
        this.l = f83Var;
        this.d = i;
        this.m = iArr;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.d;
        Object obj2 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                if (obj == ((fv0) obj3)) {
                    u41.r("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof ln3)) {
                    return w84Var;
                }
                rh2 rh2Var = (rh2) obj4;
                int i3 = ((nq1) obj2).a - i2;
                int iD = rh2Var.d(obj);
                rh2Var.h(Math.min(i3, iD >= 0 ? rh2Var.c[iD] : IntCompanionObject.MAX_VALUE), obj);
                return w84Var;
            case 1:
                mv2 mv2Var = (mv2) obj;
                nv2 nv2Var = (nv2) obj4;
                xb2 xb2Var = (xb2) obj3;
                vi1 vi1Var = (vi1) obj2;
                int i4 = vi1Var.d;
                rw3 rw3Var = vi1Var.c;
                f54 f54Var = vi1Var.h;
                yy3 yy3Var = (yy3) vi1Var.l.invoke();
                rw3Var.a(nq2.d, py.j(xb2Var, i4, f54Var, yy3Var != null ? yy3Var.a : null, xb2Var.getLayoutDirection() == dx1.d, nv2Var.c), i2, nv2Var.c);
                mv2.f(mv2Var, nv2Var, Math.round(-rw3Var.a.f()), 0);
                return w84Var;
            case 2:
                mv2 mv2Var2 = (mv2) obj;
                nv2[] nv2VarArr = (nv2[]) obj3;
                f83 f83Var = (f83) obj2;
                int[] iArr = (int[]) obj4;
                int length = nv2VarArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    nv2 nv2Var2 = nv2VarArr[i5];
                    int i7 = i6 + 1;
                    nv2Var2.getClass();
                    Object objI = nv2Var2.i();
                    d83 d83Var = objI instanceof d83 ? (d83) objI : null;
                    qq0 qq0Var = d83Var != null ? d83Var.c : null;
                    mv2.d(mv2Var2, nv2Var2, iArr[i6], qq0Var != null ? qq0Var.m(i2 - nv2Var2.d, dx1.c) : ((xt) f83Var.b).a(0, i2 - nv2Var2.d));
                    i5++;
                    i6 = i7;
                }
                return w84Var;
            default:
                mv2 mv2Var3 = (mv2) obj;
                nv2 nv2Var3 = (nv2) obj4;
                xb2 xb2Var2 = (xb2) obj3;
                mc4 mc4Var = (mc4) obj2;
                int i8 = mc4Var.d;
                rw3 rw3Var2 = mc4Var.c;
                f54 f54Var2 = mc4Var.h;
                yy3 yy3Var2 = (yy3) mc4Var.l.invoke();
                rw3Var2.a(nq2.c, py.j(xb2Var2, i8, f54Var2, yy3Var2 != null ? yy3Var2.a : null, false, nv2Var3.c), i2, nv2Var3.d);
                mv2.f(mv2Var3, nv2Var3, 0, Math.round(-rw3Var2.a.f()));
                return w84Var;
        }
    }
}
