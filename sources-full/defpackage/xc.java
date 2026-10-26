package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xc extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nv2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc(nv2 nv2Var, int i) {
        super(1);
        this.c = i;
        this.d = nv2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        nv2 nv2Var = this.d;
        switch (i) {
            case 0:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
            case 1:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 2:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 3:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 4:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
            case 5:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 6:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 7:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
            case 8:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 9:
                mv2 mv2Var = (mv2) obj;
                if (mv2Var.b() == dx1.c || mv2Var.c() == 0) {
                    mv2.a(mv2Var, nv2Var);
                    nv2Var.i0(iq1.c(0L, nv2Var.m), 0.0f, null);
                } else {
                    long jC = ((long) (mv2Var.c() - nv2Var.c)) << 32;
                    mv2.a(mv2Var, nv2Var);
                    nv2Var.i0(iq1.c(jC, nv2Var.m), 0.0f, null);
                }
                break;
            case 10:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 11:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
            case 12:
                mv2.g((mv2) obj, nv2Var, 0, 0);
                break;
            case 13:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
            case 14:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 15:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
            case 16:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            case 17:
                mv2.d((mv2) obj, nv2Var, 0, 0);
                break;
            default:
                mv2.f((mv2) obj, nv2Var, 0, 0);
                break;
        }
        return w84Var;
    }
}
