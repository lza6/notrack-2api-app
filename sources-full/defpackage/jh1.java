package defpackage;

import app.template.extension.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class jh1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o43 d;
    public final /* synthetic */ o43 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh1(o43 o43Var, o43 o43Var2, int i) {
        super(1);
        this.c = i;
        this.d = o43Var;
        this.h = o43Var2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        o43 o43Var = this.h;
        o43 o43Var2 = this.d;
        switch (i) {
            case 0:
                za2 za2Var = (za2) obj;
                if (o43Var2.c == -1) {
                    o43Var2.c = za2Var.b().c;
                }
                o43Var.c = za2Var.b().d + 1;
                break;
            default:
                za2 za2Var2 = (za2) obj;
                if (o43Var2.c == -1) {
                    o43Var2.c = za2Var2.b().c;
                }
                o43Var.c = za2Var2.b().d + 1;
                break;
        }
        return BuildConfig.VERSION_NAME;
    }
}
