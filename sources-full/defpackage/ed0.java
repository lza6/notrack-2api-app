package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ed0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ l43 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed0(l43 l43Var, int i) {
        super(1);
        this.c = i;
        this.d = l43Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.c;
        l43 l43Var = this.d;
        switch (i) {
            case 0:
                i64 i64Var = (i64) obj;
                if (!l43Var.c) {
                    i64Var.getClass();
                    z = ((tb3) i64Var).c;
                }
                l43Var.c = z;
                return Boolean.valueOf(!z);
            case 1:
                if (!((wi1) obj).h) {
                    return h64.c;
                }
                l43Var.c = false;
                return h64.h;
            default:
                if (((bd3) obj).f.a.a.d.length() > 0) {
                    l43Var.c = false;
                }
                return w84.a;
        }
    }
}
