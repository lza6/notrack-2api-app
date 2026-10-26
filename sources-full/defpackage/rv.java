package defpackage;

import android.text.style.StrikethroughSpan;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rv implements dm3 {
    public final /* synthetic */ int a;

    public /* synthetic */ rv(int i) {
        this.a = i;
    }

    @Override // defpackage.dm3
    public final Object a(pa2 pa2Var, ua2 ua2Var) {
        switch (this.a) {
            case 0:
                return new qv(pa2Var.a);
            case 1:
                return new td0(pa2Var.a);
            case 2:
                return new yd0(0, pa2Var.a);
            case 3:
                return new t21(0);
            case 4:
                return new xh1(pa2Var.a, ((Integer) yo4.e.a(ua2Var)).intValue());
            case 5:
                va2 va2Var = pa2Var.a;
                String str = (String) gm4.e.a(ua2Var);
                py pyVar = pa2Var.b;
                rn0 rn0Var = pa2Var.f;
                c13 c13Var = gm4.g;
                HashMap map = ua2Var.a;
                em emVar = new em(str, pyVar, rn0Var, (vm1) map.get(c13Var));
                c13 c13Var2 = gm4.f;
                Object obj = Boolean.FALSE;
                Object obj2 = map.get(c13Var2);
                if (obj2 != null) {
                    obj = obj2;
                }
                return new jm(va2Var, emVar, ((Boolean) obj).booleanValue());
            case 6:
                return new q42(pa2Var.a, (String) yo4.f.a(ua2Var), pa2Var.d);
            case 7:
                if (yo0.c == yo4.b.a(ua2Var)) {
                    return new sy(pa2Var.a, ((Integer) yo4.c.a(ua2Var)).intValue());
                }
                return new lq2(pa2Var.a, String.valueOf(yo4.d.a(ua2Var)).concat(". "));
            case 8:
                return new StrikethroughSpan();
            case 9:
                return new t21(1);
            default:
                return new e04(pa2Var.a);
        }
    }
}
