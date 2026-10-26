package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class rl3 extends f0 {
    public final /* synthetic */ int a;

    public /* synthetic */ rl3(int i) {
        this.a = i;
    }

    @Override // defpackage.f0
    public void g(ir3 ir3Var) {
        switch (this.a) {
            case 1:
                ir3Var.L(Collections.singleton(new ho3(0)));
                break;
            case 2:
                ir3Var.L(py.R(new ho3(1)));
                break;
        }
    }

    @Override // defpackage.f0
    public void h(ua2 ua2Var) {
        switch (this.a) {
            case 1:
                ua2Var.b(fo3.class, new rv(8));
                break;
            case 2:
                ua2Var.b(zq3.class, new rv(2));
                break;
        }
    }

    @Override // defpackage.f0
    public final void j(ua2 ua2Var) {
        switch (this.a) {
            case 0:
                ua2Var.a(sl3.class, new aa2(15));
                break;
            case 1:
                ua2Var.a(fo3.class, new aa2(16));
                break;
            default:
                ua2Var.a(zq3.class, aa2.k);
                break;
        }
    }
}
