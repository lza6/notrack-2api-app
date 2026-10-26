package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class og0 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ qg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og0(qg0 qg0Var, int i) {
        super(0);
        this.c = i;
        this.d = qg0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        int i2 = 1;
        qg0 qg0Var = this.d;
        switch (i) {
            case 0:
                return new v93(qg0Var.getApplication(), qg0Var, qg0Var.getIntent() != null ? qg0Var.getIntent().getExtras() : null);
            case 1:
                qg0Var.reportFullyDrawn();
                return w84.a;
            case 2:
                return new ie1(qg0Var.n, new og0(qg0Var, i2));
            default:
                go2 go2Var = new go2(new fg0(qg0Var, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kr1.n(Looper.myLooper(), Looper.getMainLooper())) {
                        qg0Var.c.a(new jg0(go2Var, qg0Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new ba(qg0Var, 4, go2Var));
                    }
                }
                return go2Var;
        }
    }
}
