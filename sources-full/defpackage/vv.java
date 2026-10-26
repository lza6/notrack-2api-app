package defpackage;

import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* JADX INFO: loaded from: classes.dex */
public final class vv extends ds3 {
    public final /* synthetic */ int a;

    public /* synthetic */ vv(int i) {
        this.a = i;
    }

    @Override // defpackage.ds3
    public final void a(ir3 ir3Var, gb2 gb2Var, x0 x0Var) {
        switch (this.a) {
            case 0:
                if (x0Var.l()) {
                    ds3.c(ir3Var, gb2Var, x0Var.j());
                }
                pa2 pa2Var = (pa2) ir3Var.c;
                dm3 dm3VarJ = pa2Var.g.j(nv.class);
                if (dm3VarJ != null) {
                    jm3.c((jm3) ir3Var.h, dm3VarJ.a(pa2Var, (ua2) ir3Var.d), x0Var.c, x0Var.d);
                }
                break;
            case 1:
                c13 c13Var = yo4.b;
                if (x0Var.l()) {
                    rj1 rj1VarJ = x0Var.j();
                    boolean zEquals = "ol".equals((String) rj1VarJ.h);
                    boolean zEquals2 = "ul".equals((String) rj1VarJ.h);
                    if (zEquals || zEquals2) {
                        pa2 pa2Var2 = (pa2) ir3Var.c;
                        ua2 ua2Var = (ua2) ir3Var.d;
                        dm3 dm3VarJ2 = pa2Var2.g.j(h52.class);
                        int i = 0;
                        rj1 rj1Var = rj1VarJ;
                        while (true) {
                            rj1Var = rj1Var.m;
                            if (rj1Var == null) {
                                ArrayList arrayList = rj1VarJ.n;
                                int i2 = 1;
                                for (rj1 rj1Var2 : arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList)) {
                                    ds3.c(ir3Var, gb2Var, rj1Var2);
                                    if (dm3VarJ2 != null && "li".equals((String) rj1Var2.h)) {
                                        if (zEquals) {
                                            c13Var.b(ua2Var, yo0.d);
                                            yo4.d.b(ua2Var, Integer.valueOf(i2));
                                            i2++;
                                        } else {
                                            c13Var.b(ua2Var, yo0.c);
                                            yo4.c.b(ua2Var, Integer.valueOf(i));
                                        }
                                        jm3.c((jm3) ir3Var.h, dm3VarJ2.a(pa2Var2, ua2Var), rj1Var2.c, rj1Var2.d);
                                    }
                                }
                                break;
                            } else {
                                String str = (String) rj1Var.h;
                                if ("ul".equals(str) || "ol".equals(str)) {
                                    i++;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (x0Var.l()) {
                    ds3.c(ir3Var, gb2Var, x0Var.j());
                }
                jm3 jm3Var = (jm3) ir3Var.h;
                pa2 pa2Var3 = (pa2) ir3Var.c;
                dm3 dm3VarJ3 = pa2Var3.g.j(fo3.class);
                jm3.c(jm3Var, dm3VarJ3 == null ? null : dm3VarJ3.a(pa2Var3, (ua2) ir3Var.d), x0Var.c, x0Var.d);
                break;
            default:
                if (x0Var.l()) {
                    ds3.c(ir3Var, gb2Var, x0Var.j());
                }
                jm3.c((jm3) ir3Var.h, new UnderlineSpan(), x0Var.c, x0Var.d);
                break;
        }
    }

    @Override // defpackage.ds3
    public final Collection b() {
        switch (this.a) {
            case 0:
                return Collections.singleton("blockquote");
            case 1:
                return Arrays.asList("ol", "ul");
            case 2:
                return Arrays.asList("s", TeXSymbolParser.DELIMITER_ATTR);
            default:
                return Arrays.asList("u", "ins");
        }
    }
}
