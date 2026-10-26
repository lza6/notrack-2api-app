package defpackage;

import notrack.ai.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n80 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;

    public /* synthetic */ n80(int i, mi2 mi2Var) {
        this.c = i;
        this.d = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.d;
        switch (i) {
            case 0:
                mi2Var.setValue(Boolean.FALSE);
                return w84Var;
            case 1:
                mi2Var.setValue(Boolean.valueOf(!((Boolean) mi2Var.getValue()).booleanValue()));
                return w84Var;
            case 2:
                mi2Var.setValue(Boolean.TRUE);
                return w84Var;
            case 3:
                mi2Var.setValue(Boolean.FALSE);
                return w84Var;
            case 4:
                mi2Var.setValue(null);
                return w84Var;
            case 5:
                mi2Var.setValue(Boolean.FALSE);
                return w84Var;
            case 6:
                mi2Var.setValue(Boolean.FALSE);
                return w84Var;
            case 7:
                Boolean bool = (Boolean) mi2Var.getValue();
                bool.booleanValue();
                return bool;
            default:
                int i2 = MainActivity.L;
                mi2Var.setValue(Boolean.FALSE);
                return w84Var;
        }
    }
}
