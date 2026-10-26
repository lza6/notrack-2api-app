package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ s(zi2 zi2Var, yi2 yi2Var) {
        this.c = 6;
        this.d = zi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return obj == ((t) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                uu2 uu2Var = (uu2) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == uu2Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != uu2Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                n63 n63Var = (n63) obj;
                n63Var.getClass();
                n63Var.e(((Number) ((gn3) obj2).getValue()).floatValue());
                return w84Var;
            case 3:
                ((wu0) obj).getClass();
                return new iq1(((long) gb2.R(((bt2) ((ah2) obj2)).f())) << 32);
            case 4:
                ((vv1) obj).getClass();
                ((je1) obj2).invoke();
                return w84Var;
            case 5:
                ((lw0) obj2).t = true;
                return w84Var;
            case 6:
                ((zi2) obj2).i(null);
                return w84Var;
            case 7:
                wc0 wc0Var = (wc0) obj;
                wc0Var.getClass();
                List list = ((fn2) obj2).b;
                list.getClass();
                wc0Var.b = list;
                return w84Var;
            case 8:
                xw2 xw2Var = (xw2) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return xw2Var.e[iIntValue] + ": " + xw2Var.i(iIntValue).b();
            case 9:
                ir3 ir3Var = (ir3) obj2;
                wk wkVar = (wk) obj;
                if (wkVar.a == 2 && wkVar.a(ct4.a(0).a()) != null) {
                    np4 np4VarV = ir3Var.V();
                    e4 e4Var = (e4) ir3Var.c;
                    ct4 ct4VarA = ct4.a(0).a();
                    np4VarV.getClass();
                    np4.b(wkVar, e4Var, ct4VarA);
                }
                return w84Var;
            default:
                vf3 vf3Var = (vf3) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return vf3Var.f[iIntValue2] + ": " + vf3Var.g[iIntValue2].b();
        }
    }
}
