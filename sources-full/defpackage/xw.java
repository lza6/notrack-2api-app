package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xw extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(1);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
        this.o = obj6;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float f;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.h;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                int i2 = 0;
                mv2 mv2Var = (mv2) obj;
                nv2[] nv2VarArr = (nv2[]) obj7;
                List list = (List) obj6;
                xb2 xb2Var = (xb2) obj5;
                o43 o43Var = (o43) obj4;
                o43 o43Var2 = (o43) obj3;
                yw ywVar = (yw) obj2;
                int length = nv2VarArr.length;
                int i3 = 0;
                while (i3 < length) {
                    nv2 nv2Var = nv2VarArr[i3];
                    nv2Var.getClass();
                    vw.a(mv2Var, nv2Var, (qb2) list.get(i2), xb2Var.getLayoutDirection(), o43Var.c, o43Var2.c, ywVar.a);
                    i3++;
                    i2++;
                }
                break;
            case 1:
                tz0 tz0Var = (tz0) obj;
                float fFloor = (float) Math.floor(tz0Var.w(2.0f));
                long j = ((re0) ((gn3) obj7).getValue()).a;
                long j2 = ((re0) ((gn3) obj6).getValue()).a;
                float fW = tz0Var.w(2.0f);
                float f2 = fFloor / 2.0f;
                vo3 vo3Var = new vo3(0, fFloor, 0, 0.0f, 30);
                float fD = bi3.d(tz0Var.b());
                boolean zC = re0.c(j, j2);
                b71 b71Var = b71.a;
                if (zC) {
                    tz0Var.v(j, (226 & 2) != 0 ? 0L : 0L, vl0.g(fD, fD), p23.a(fW), (226 & 16) != 0 ? b71.a : b71Var);
                    f = fFloor;
                } else {
                    float f3 = fD - (2.0f * fFloor);
                    f = fFloor;
                    tz0Var.v(j, (226 & 2) != 0 ? 0L : y64.b(fFloor, fFloor), vl0.g(f3, f3), p23.a(Math.max(0.0f, fW - fFloor)), (226 & 16) != 0 ? b71.a : b71Var);
                    float f4 = fD - f;
                    tz0Var.v(j2, (226 & 2) != 0 ? 0L : y64.b(f2, f2), vl0.g(f4, f4), p23.a(fW - f2), (226 & 16) != 0 ? b71.a : vo3Var);
                }
                long j3 = ((re0) ((gn3) obj5).getValue()).a;
                float fFloatValue = ((Number) ((gn3) obj4).getValue()).floatValue();
                float fFloatValue2 = ((Number) ((gn3) obj3).getValue()).floatValue();
                ib0 ib0Var = (ib0) obj2;
                vo3 vo3Var2 = new vo3(2, f, 0, 0.0f, 26);
                float fD2 = bi3.d(tz0Var.b());
                float F = g13.F(0.4f, 0.5f, fFloatValue2);
                float F2 = g13.F(0.7f, 0.5f, fFloatValue2);
                float F3 = g13.F(0.5f, 0.5f, fFloatValue2);
                float F4 = g13.F(0.3f, 0.5f, fFloatValue2);
                ib0Var.a.e();
                ic icVar = ib0Var.a;
                Path path = icVar.a;
                Path path2 = icVar.a;
                path.moveTo(0.2f * fD2, F3 * fD2);
                path2.lineTo(F * fD2, F2 * fD2);
                path2.lineTo(0.8f * fD2, fD2 * F4);
                jc jcVar = ib0Var.b;
                jcVar.a.setPath(icVar != null ? icVar.a : null, false);
                ic icVar2 = ib0Var.c;
                icVar2.e();
                jcVar.a(0.0f, jcVar.a.getLength() * fFloatValue, icVar2);
                tz0.H(tz0Var, ib0Var.c, j3, vo3Var2, 52);
                break;
            default:
                hh3 hh3Var = (hh3) obj7;
                String str = (String) obj5;
                String str2 = (String) obj4;
                gq0 gq0Var = (gq0) obj2;
                gh1 gh1Var = new gh1((je1) obj3, 2);
                pu1[] pu1VarArr = ef3.a;
                ue3 ue3Var = (ue3) ((gf3) obj);
                ue3Var.j(te3.u, new z0((String) obj6, gh1Var));
                ji4 ji4Var = hh3Var.c;
                ih3 ih3Var = (ih3) ((ft2) ji4Var.g).getValue();
                ih3 ih3Var2 = ih3.h;
                if (ih3Var == ih3Var2) {
                    ue3Var.j(te3.s, new z0(str, new oh(hh3Var, gq0Var, hh3Var, 8)));
                } else if (ji4Var.f().a.containsKey(ih3Var2)) {
                    ue3Var.j(te3.t, new z0(str2, new c9(hh3Var, 17, gq0Var)));
                }
                break;
        }
        return w84Var;
    }
}
