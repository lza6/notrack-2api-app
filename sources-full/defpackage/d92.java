package defpackage;

import kotlin.io.ConstantsKt;
import notrack.ai.MainActivity;
import notrack.ai.ui.components.HtmlPreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final class d92 extends mq3 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ MainActivity d;
    public final /* synthetic */ gn3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d92(MainActivity mainActivity, gn3 gn3Var, so0 so0Var, int i) {
        super(2, so0Var);
        this.c = i;
        this.d = mainActivity;
        this.h = gn3Var;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        gn3 gn3Var = this.h;
        MainActivity mainActivity = this.d;
        switch (i) {
            case 0:
                return new d92(mainActivity, gn3Var, so0Var, 0);
            default:
                return new d92(mainActivity, gn3Var, so0Var, 1);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                ((d92) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
            default:
                ((d92) create(gq0Var, so0Var)).invokeSuspend(w84Var);
                break;
        }
        return w84Var;
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.c) {
            case 0:
                g13.O(obj);
                String str = HtmlPreviewActivity.D;
                gn3 gn3Var = this.h;
                int i = MainActivity.L;
                HtmlPreviewActivity.I = ((xa0) gn3Var.getValue()).o;
                HtmlPreviewActivity.H = ((xa0) this.h.getValue()).k;
                boolean z = ((xa0) this.h.getValue()).o;
                MainActivity mainActivity = this.d;
                if (z) {
                    mainActivity.getWindow().addFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
                } else {
                    mainActivity.getWindow().clearFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
                }
                break;
            default:
                g13.O(obj);
                gn3 gn3Var2 = this.h;
                int i2 = MainActivity.L;
                if (((xa0) gn3Var2.getValue()).p && ((xa0) gn3Var2.getValue()).q) {
                    MainActivity mainActivity2 = this.d;
                    MainActivity.x(mainActivity2, mainActivity2.y());
                }
                break;
        }
        return w84.a;
    }
}
