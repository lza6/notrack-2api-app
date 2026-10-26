package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s21 extends ds3 {
    public final /* synthetic */ int a;

    public /* synthetic */ s21(int i) {
        this.a = i;
    }

    public s21(qn0 qn0Var) {
        this.a = 2;
    }

    @Override // defpackage.ds3
    public final void a(ir3 ir3Var, gb2 gb2Var, x0 x0Var) {
        int i;
        dm3 dm3VarJ;
        um1 um1VarI;
        um1 um1VarI2;
        dm3 dm3VarJ2;
        Object t21Var;
        if (x0Var.l()) {
            ds3.c(ir3Var, gb2Var, x0Var.j());
        }
        pa2 pa2Var = (pa2) ir3Var.c;
        ua2 ua2Var = (ua2) ir3Var.d;
        Object objA = null;
        switch (this.a) {
            case 0:
                dm3 dm3VarJ3 = pa2Var.g.j(r21.class);
                if (dm3VarJ3 != null) {
                    objA = dm3VarJ3.a(pa2Var, ua2Var);
                }
                t21Var = objA;
                break;
            case 1:
                dm3 dm3VarJ4 = pa2Var.g.j(vh1.class);
                if (dm3VarJ4 != null) {
                    try {
                        i = Integer.parseInt(((String) x0Var.h).substring(1));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        i = 0;
                    }
                    if (i >= 1 && i <= 6) {
                        yo4.e.b(ua2Var, Integer.valueOf(i));
                        objA = dm3VarJ4.a(pa2Var, ua2Var);
                    }
                }
                t21Var = objA;
                break;
            case 2:
                String str = (String) x0Var.e().get("src");
                if (!TextUtils.isEmpty(str) && (dm3VarJ = pa2Var.g.j(zl1.class)) != null) {
                    pa2Var.e.getClass();
                    Map mapE = x0Var.e();
                    String str2 = (String) mapE.get("style");
                    if (TextUtils.isEmpty(str2)) {
                        um1VarI = null;
                        um1VarI2 = null;
                    } else {
                        xq0 xq0Var = new xq0(new yq0(str2));
                        um1VarI = null;
                        um1VarI2 = null;
                        while (xq0Var.hasNext()) {
                            mi4 mi4Var = (mi4) xq0Var.next();
                            String str3 = (String) mi4Var.d;
                            if ("width".equals(str3)) {
                                um1VarI = qn0.i((String) mi4Var.h);
                            } else if ("height".equals(str3)) {
                                um1VarI2 = qn0.i((String) mi4Var.h);
                            }
                            if (um1VarI == null || um1VarI2 == null) {
                            }
                        }
                    }
                    if (um1VarI == null || um1VarI2 == null) {
                        if (um1VarI == null) {
                            um1VarI = qn0.i((String) mapE.get("width"));
                        }
                        if (um1VarI2 == null) {
                            um1VarI2 = qn0.i((String) mapE.get("height"));
                        }
                        if (um1VarI != null || um1VarI2 != null) {
                            objA = new vm1(um1VarI, um1VarI2);
                        }
                    } else {
                        objA = new vm1(um1VarI, um1VarI2);
                    }
                    gm4.e.b(ua2Var, str);
                    gm4.g.b(ua2Var, objA);
                    gm4.f.b(ua2Var, Boolean.FALSE);
                    objA = dm3VarJ.a(pa2Var, ua2Var);
                }
                t21Var = objA;
                break;
            case 3:
                String str4 = (String) x0Var.e().get("href");
                if (!TextUtils.isEmpty(str4) && (dm3VarJ2 = pa2Var.g.j(j42.class)) != null) {
                    yo4.f.b(ua2Var, str4);
                    objA = dm3VarJ2.a(pa2Var, ua2Var);
                }
                t21Var = objA;
                break;
            case 4:
                dm3 dm3VarJ5 = pa2Var.g.j(yo3.class);
                if (dm3VarJ5 != null) {
                    objA = dm3VarJ5.a(pa2Var, ua2Var);
                }
                t21Var = objA;
                break;
            case 5:
                t21Var = new t21(2);
                break;
            default:
                t21Var = new t21(3);
                break;
        }
        if (t21Var != null) {
            jm3.c((jm3) ir3Var.h, t21Var, x0Var.c, x0Var.d);
        }
    }

    @Override // defpackage.ds3
    public final Collection b() {
        switch (this.a) {
            case 0:
                return Arrays.asList("i", "em", "cite", "dfn");
            case 1:
                return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
            case 2:
                return Collections.singleton("img");
            case 3:
                return Collections.singleton("a");
            case 4:
                return Arrays.asList("b", "strong");
            case 5:
                return Collections.singleton("sub");
            default:
                return Collections.singleton("sup");
        }
    }
}
