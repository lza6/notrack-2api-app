package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jp implements le1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ String d;
    public final /* synthetic */ mi2 h;
    public final /* synthetic */ mi2 l;
    public final /* synthetic */ mi2 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ jp(gq0 gq0Var, Context context, String str, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3) {
        this.n = gq0Var;
        this.o = context;
        this.d = str;
        this.h = mi2Var;
        this.l = mi2Var2;
        this.m = mi2Var3;
    }

    public /* synthetic */ jp(String str, String str2, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4) {
        this.d = str;
        this.n = str2;
        this.h = mi2Var;
        this.l = mi2Var2;
        this.m = mi2Var3;
        this.o = mi2Var4;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                gq0 gq0Var = (gq0) obj3;
                Context context = (Context) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    py.F(gq0Var, null, null, new ve(context, uri, this.d, this.h, this.l, this.m, (so0) null), 3);
                }
                return w84Var;
            default:
                String str = (String) obj3;
                mi2 mi2Var = (mi2) obj2;
                vq vqVar = (vq) obj;
                vqVar.getClass();
                this.h.setValue(Boolean.FALSE);
                boolean z = vqVar instanceof tq;
                mi2 mi2Var2 = this.m;
                if (z) {
                    this.l.setValue(((tq) vqVar).a.getRef());
                    mi2Var2.setValue(null);
                    return w84Var;
                }
                if (vqVar instanceof uq) {
                    mi2Var2.setValue(null);
                    return w84Var;
                }
                if (vqVar instanceof rq) {
                    if (((rq) vqVar).a.equals("too_large")) {
                        str = this.d;
                    }
                    mi2Var.setValue(str);
                    return w84Var;
                }
                if (vqVar instanceof sq) {
                    mi2Var.setValue(str);
                    return w84Var;
                }
                u41.e();
                return null;
        }
    }
}
