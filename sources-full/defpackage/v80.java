package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v80 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ za1 h;
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;
    public final /* synthetic */ je1 n;
    public final /* synthetic */ mi2 o;
    public final /* synthetic */ je1 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ je1 r;
    public final /* synthetic */ je1 s;
    public final /* synthetic */ List t;
    public final /* synthetic */ je1 u;

    public /* synthetic */ v80(le1 le1Var, za1 za1Var, String str, int i, je1 je1Var, mi2 mi2Var, je1 je1Var2, boolean z, je1 je1Var3, je1 je1Var4, List list, je1 je1Var5, int i2) {
        this.c = i2;
        this.d = le1Var;
        this.h = za1Var;
        this.l = str;
        this.m = i;
        this.n = je1Var;
        this.o = mi2Var;
        this.p = je1Var2;
        this.q = z;
        this.r = je1Var3;
        this.s = je1Var4;
        this.t = list;
        this.u = je1Var5;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return wa0.ExpandedComposer$lambda$626(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (ck0) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return wa0.ExpandedComposer$lambda$626$lambda$624(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (ck0) obj, iIntValue2);
        }
    }
}
