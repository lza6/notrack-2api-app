package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ se1 d;
    public final /* synthetic */ int h;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ en(int i, int i2, int i3, se1 se1Var, Object obj, Object obj2) {
        this.c = i3;
        this.m = obj;
        this.d = se1Var;
        this.n = obj2;
        this.h = i;
        this.l = i2;
    }

    public /* synthetic */ en(String str, int i, String str2, je1 je1Var, int i2) {
        this.c = 3;
        this.m = str;
        this.h = i;
        this.n = str2;
        this.d = je1Var;
        this.l = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        int i2 = this.h;
        w84 w84Var = w84.a;
        se1 se1Var = this.d;
        Object obj3 = this.n;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fn.AttachmentChip((hn) obj4, (je1) se1Var, (je1) obj3, (ck0) obj, sf3.V(i2 | 1), this.l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                q10.CarriedPill((r10) obj4, (je1) se1Var, (c) obj3, (ck0) obj, sf3.V(i2 | 1), this.l);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wa0.P0((String) obj4, (le1) se1Var, (c) obj3, (ck0) obj, this.h, this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                qz3.a((String) obj4, this.h, (String) obj3, (je1) se1Var, (ck0) obj, this.l);
                break;
        }
        return w84Var;
    }
}
