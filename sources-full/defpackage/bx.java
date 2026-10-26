package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class bx extends ww1 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ c d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(c cVar, a8 a8Var, boolean z, oe1 oe1Var, int i, int i2) {
        super(2);
        this.d = cVar;
        this.n = a8Var;
        this.h = z;
        this.o = oe1Var;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(ni3 ni3Var, c cVar, ii3 ii3Var, boolean z, int i, int i2) {
        super(2);
        this.n = ni3Var;
        this.d = cVar;
        this.o = ii3Var;
        this.h = z;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.m;
                c cVar = this.d;
                boolean z = this.h;
                cx.BoxWithConstraints(cVar, (a8) obj4, z, (oe1) obj3, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.m;
                c cVar2 = this.d;
                ((ni3) obj4).Track((sj3) null, cVar2, (ii3) obj3, this.h, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
