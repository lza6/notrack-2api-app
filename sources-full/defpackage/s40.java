package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s40 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int h;

    public /* synthetic */ s40(int i, int i2, Object obj) {
        this.c = i2;
        this.d = obj;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w40.h((String) obj3, (ck0) obj, i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                w40.n((String) obj3, (ck0) obj, i2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ja2.d((String) obj3, (ck0) obj, i2);
                break;
            default:
                ((Integer) obj2).getClass();
                wa0.P((List) obj3, (ck0) obj, i2);
                break;
        }
        return w84Var;
    }
}
