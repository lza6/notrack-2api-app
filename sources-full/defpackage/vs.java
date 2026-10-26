package defpackage;

import androidx.compose.ui.c;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vs extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ c h;
    public final /* synthetic */ uz3 l;
    public final /* synthetic */ le1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs(CharSequence charSequence, c cVar, uz3 uz3Var, le1 le1Var, int i, boolean z, int i2, int i3, Object obj, int i4, int i5, int i6) {
        super(2);
        this.c = i6;
        this.d = charSequence;
        this.h = cVar;
        this.l = uz3Var;
        this.m = le1Var;
        this.n = i;
        this.o = z;
        this.p = i2;
        this.q = i3;
        this.r = obj;
        this.s = i4;
        this.t = i5;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.s;
        Object obj3 = this.r;
        CharSequence charSequence = this.d;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                xe0 xe0Var = (xe0) obj3;
                int iV = sf3.V(i2 | 1);
                int i3 = this.t;
                gt.m200x4738c6f7((String) charSequence, this.h, this.l, this.m, this.n, this.o, this.p, this.q, xe0Var, (rt3) null, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                xe0 xe0Var2 = (xe0) obj3;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.t;
                gt.m202x37471f63((String) charSequence, this.h, this.l, this.m, this.n, this.o, this.p, this.q, xe0Var2, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.t;
                c cVar = this.h;
                uz3 uz3Var = this.l;
                le1 le1Var = this.m;
                int i6 = this.n;
                boolean z = this.o;
                int i7 = this.p;
                int i8 = this.q;
                gt.m201x37471f63((hg) charSequence, cVar, uz3Var, le1Var, i6, z, i7, i8, (Map) obj3, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}
