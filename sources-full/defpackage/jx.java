package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class jx {
    public final oi2 a;

    public jx(int i) {
        switch (i) {
            case 1:
                this.a = new oi2(0, new d02[16]);
                break;
            default:
                this.a = new oi2(0, new in0[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        oi2 oi2Var = this.a;
        int i = oi2Var.h;
        r00[] r00VarArr = new r00[i];
        for (int i2 = 0; i2 < i; i2++) {
            r00VarArr[i2] = ((in0) oi2Var.c[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            r00VarArr[i3].g(cancellationException);
        }
        if (oi2Var.h == 0) {
            return;
        }
        so1.c("uncancelled requests present");
    }

    public void b() {
        oi2 oi2Var = this.a;
        lq1 lq1VarX = py.X(0, oi2Var.h);
        int i = lq1VarX.c;
        int i2 = lq1VarX.d;
        if (i <= i2) {
            while (true) {
                ((in0) oi2Var.c[i]).b.resumeWith(w84.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        oi2Var.i();
    }
}
