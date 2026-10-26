package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx3 extends mq3 implements ne1 {
    public final /* synthetic */ int c = 0;
    public int d;
    public final /* synthetic */ wx3 h;
    public final /* synthetic */ ix2 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx3(ix2 ix2Var, wx3 wx3Var, boolean z, so0 so0Var) {
        super(2, so0Var);
        this.l = ix2Var;
        this.h = wx3Var;
        this.m = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx3(wx3 wx3Var, ix2 ix2Var, boolean z, so0 so0Var) {
        super(2, so0Var);
        this.h = wx3Var;
        this.l = ix2Var;
        this.m = z;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        int i = this.c;
        boolean z = this.m;
        ix2 ix2Var = this.l;
        wx3 wx3Var = this.h;
        switch (i) {
            case 0:
                return new tx3(ix2Var, wx3Var, z, so0Var);
            default:
                return new tx3(wx3Var, ix2Var, z, so0Var);
        }
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = (gq0) obj;
        so0 so0Var = (so0) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((tx3) create(gq0Var, so0Var)).invokeSuspend(w84Var);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.m;
        ix2 ix2Var = this.l;
        wx3 wx3Var = this.h;
        hq0 hq0Var = hq0.c;
        switch (i) {
            case 0:
                int i2 = this.d;
                if (i2 != 0) {
                    if (i2 == 1) {
                        g13.O(obj);
                        return w84Var;
                    }
                    u41.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g13.O(obj);
                wu wuVar = new wu();
                wuVar.b = wx3Var;
                wuVar.a = z;
                ts tsVar = new ts(wx3Var, 5);
                this.d = 1;
                Object objL = p23.l(ix2Var, new my2(wuVar, tsVar, null), this);
                if (objL != hq0Var) {
                    objL = w84Var;
                }
                return objL == hq0Var ? hq0Var : w84Var;
            default:
                int i3 = this.d;
                if (i3 == 0) {
                    g13.O(obj);
                    this.d = 1;
                    return wx3.b(wx3Var, ix2Var, z, this) == hq0Var ? hq0Var : w84Var;
                }
                if (i3 == 1) {
                    g13.O(obj);
                    return w84Var;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
