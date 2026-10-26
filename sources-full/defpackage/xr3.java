package defpackage;

import app.template.extension.BuildConfig;
import io.noties.markwon.ext.tables.TableRowSpan$Cell;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xr3 implements wa2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr3 b;

    public /* synthetic */ xr3(yr3 yr3Var, int i) {
        this.a = i;
        this.b = yr3Var;
    }

    @Override // defpackage.wa2
    public final void a(ir3 ir3Var, im0 im0Var) {
        gm3 gm3Var;
        int i;
        int i2 = this.a;
        int i3 = 0;
        yr3 yr3Var = this.b;
        switch (i2) {
            case 0:
                qr3 qr3Var = (qr3) im0Var;
                int iA0 = ir3Var.a0();
                ir3Var.l0(qr3Var);
                if (yr3Var.b == null) {
                    yr3Var.b = new ArrayList(2);
                }
                ArrayList arrayList = yr3Var.b;
                pr3 pr3Var = qr3Var.h;
                if (pr3Var != null) {
                    int iOrdinal = pr3Var.ordinal();
                    if (iOrdinal == 1) {
                        i3 = 1;
                    } else if (iOrdinal == 2) {
                        i3 = 2;
                    }
                }
                jm3 jm3Var = (jm3) ir3Var.h;
                StringBuilder sb = jm3Var.c;
                int length = sb.length();
                hm3 hm3Var = new hm3(sb.subSequence(iA0, length));
                Iterator it = jm3Var.d.iterator();
                while (it.hasNext() && (gm3Var = (gm3) it.next()) != null) {
                    int i4 = gm3Var.b;
                    if (i4 >= iA0 && (i = gm3Var.c) <= length) {
                        hm3Var.setSpan(gm3Var.a, i4 - iA0, i - iA0, 33);
                        it.remove();
                    }
                }
                sb.replace(iA0, length, BuildConfig.VERSION_NAME);
                arrayList.add(new TableRowSpan$Cell(i3, hm3Var));
                yr3Var.c = qr3Var.g;
                break;
            case 1:
                yr3.a(yr3Var, ir3Var, (rr3) im0Var);
                break;
            case 2:
                yr3.a(yr3Var, ir3Var, (as3) im0Var);
                break;
            default:
                ir3Var.l0((or3) im0Var);
                yr3Var.d = 0;
                break;
        }
    }
}
