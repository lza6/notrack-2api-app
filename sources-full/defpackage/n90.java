package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class n90 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n90(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((mi2) obj).setValue(null);
                break;
            case 1:
                ((mi2) obj).setValue(null);
                break;
            default:
                hb0 hb0Var = (hb0) obj;
                py.F(id4.a(hb0Var), null, null, new za0(hb0Var, "click", hb0Var.n, null, 0), 3);
                hb0Var.X(new a50("busy_line".concat(!mo3.C0(hb0Var.n) ? fq2.m("_", hb0Var.n) : BuildConfig.VERSION_NAME)));
                break;
        }
        return w84Var;
    }
}
