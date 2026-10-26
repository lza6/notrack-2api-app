package defpackage;

import io.noties.markwon.ext.tables.a;
import java.util.ArrayList;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class yr3 {
    public final h61 a;
    public ArrayList b;
    public boolean c;
    public int d;

    public yr3(h61 h61Var) {
        this.a = h61Var;
    }

    public static void a(yr3 yr3Var, ir3 ir3Var, gr0 gr0Var) {
        jm3 jm3Var = (jm3) ir3Var.h;
        int iA0 = ir3Var.a0();
        ir3Var.l0(gr0Var);
        if (yr3Var.b != null) {
            StringBuilder sb = jm3Var.c;
            int length = sb.length();
            boolean z = length > 0 && '\n' != sb.charAt(length - 1);
            if (z) {
                jm3Var.a('\n');
            }
            jm3Var.a(Typography.nbsp);
            a aVar = new a(yr3Var.a, yr3Var.b, yr3Var.c, yr3Var.d % 2 == 1);
            yr3Var.d = yr3Var.c ? 0 : yr3Var.d + 1;
            if (z) {
                iA0++;
            }
            ir3Var.h0(iA0, aVar);
            yr3Var.b = null;
        }
    }
}
