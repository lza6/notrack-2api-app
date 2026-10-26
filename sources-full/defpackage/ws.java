package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ws extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws(int i, mi2 mi2Var) {
        super(1);
        this.c = i;
        this.d = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.d;
        switch (i) {
            case 0:
                mt3 mt3Var = (mt3) obj;
                mi2Var.setValue(mt3Var.c ? mt3Var.b : mt3Var.a);
                break;
            case 1:
                List list = (List) obj;
                if (mi2Var != null) {
                    mi2Var.setValue(list);
                }
                break;
            default:
                mi2Var.setValue((fd3) obj);
                break;
        }
        return w84Var;
    }
}
