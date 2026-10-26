package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f40 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;

    public /* synthetic */ f40(le1 le1Var, int i) {
        this.c = i;
        this.d = le1Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                le1Var.invoke("fx");
                break;
            case 1:
                le1Var.invoke("ai");
                break;
            case 2:
                le1Var.invoke("me");
                break;
            case 3:
                le1Var.invoke(BuildConfig.VERSION_NAME);
                break;
            case 4:
                le1Var.invoke(null);
                break;
            case 5:
                le1Var.invoke(Boolean.FALSE);
                break;
            default:
                le1Var.invoke(Boolean.TRUE);
                break;
        }
        return w84Var;
    }
}
