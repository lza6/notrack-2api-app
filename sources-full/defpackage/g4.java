package defpackage;

import ai.notrack.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class g4 implements vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vw0
    public final void dispose() {
        int i = this.a;
        w84 w84Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                e4 e4Var = ((z3) obj).a;
                if (e4Var != null) {
                    e4Var.b();
                    w84Var = w84.a;
                }
                if (w84Var == null) {
                    u41.r("Launcher has not been initialized");
                    break;
                }
                break;
            case 1:
                xv0 xv0Var = (xv0) obj;
                xv0Var.dismiss();
                xv0Var.o.disposeComposition();
                break;
            case 2:
                rx2 rx2Var = (rx2) obj;
                rx2Var.disposeComposition();
                rx2Var.setTag(R.id.view_tree_lifecycle_owner, null);
                rx2Var.n.removeViewImmediate(rx2Var);
                break;
            case 3:
                ((cr) obj).e();
                break;
            case 4:
                wx3 wx3Var = (wx3) obj;
                wx3Var.s();
                wx3Var.j = null;
                wx3Var.h = null;
                break;
            case 5:
                ((xw3) obj).l();
                break;
            case 6:
                ((m02) obj).d = null;
                break;
            case 7:
                ((b12) obj).c = null;
                break;
            case 8:
                ((w02) obj).f = true;
                break;
            case 9:
                te2 te2Var = (te2) obj;
                te2Var.dismiss();
                te2Var.o.disposeComposition();
                break;
            case 10:
                ((by2) obj).e();
                break;
            case 11:
                le3 le3Var = (le3) obj;
                le3Var.i();
                le3Var.i.setValue(Boolean.FALSE);
                break;
            default:
                ((pk0) obj).dispose();
                break;
        }
    }
}
