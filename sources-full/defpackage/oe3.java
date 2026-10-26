package defpackage;

import android.os.Build;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class oe3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wu0 d;
    public final /* synthetic */ mi2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe3(wu0 wu0Var, mi2 mi2Var, int i) {
        super(1);
        this.c = i;
        this.d = wu0Var;
        this.h = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        aw2 aw2Var = ew2.a;
        cw2 cw2Var = cw2.a;
        mi2 mi2Var = this.h;
        wu0 wu0Var = this.d;
        switch (i) {
            case 0:
                long j = ((ux0) obj).a;
                int iO = wu0Var.O(ux0.b(j));
                mi2Var.setValue(new qq1((((long) wu0Var.O(ux0.a(j))) & 4294967295L) | (((long) iO) << 32)));
                return w84Var;
            case 1:
                Modifier$Companion modifier$Companion = c.i;
                oy0 oy0Var = new oy0((je1) obj, 6);
                oe3 oe3Var = new oe3(wu0Var, mi2Var, 0);
                if (!b92.a()) {
                    j93.k("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    aw2Var = cw2Var;
                }
                return b92.b(modifier$Companion, oy0Var, oe3Var, aw2Var);
            case 2:
                long j2 = ((ux0) obj).a;
                int iO2 = wu0Var.O(ux0.b(j2));
                mi2Var.setValue(new qq1((((long) wu0Var.O(ux0.a(j2))) & 4294967295L) | (((long) iO2) << 32)));
                return w84Var;
            default:
                Modifier$Companion modifier$Companion2 = c.i;
                oy0 oy0Var2 = new oy0((je1) obj, 7);
                oe3 oe3Var2 = new oe3(wu0Var, mi2Var, 2);
                if (!b92.a()) {
                    j93.k("Magnifier is only supported on API level 28 and higher.");
                    return null;
                }
                if (Build.VERSION.SDK_INT == 28) {
                    aw2Var = cw2Var;
                }
                return b92.b(modifier$Companion2, oy0Var2, oe3Var2, aw2Var);
        }
    }
}
