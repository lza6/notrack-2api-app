package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c53 extends ww1 implements je1 {
    public final /* synthetic */ a93 c;
    public final /* synthetic */ x93 d;
    public final /* synthetic */ g93 h;
    public final /* synthetic */ String l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c53(a93 a93Var, x93 x93Var, g93 g93Var, String str, Object obj, Object[] objArr) {
        super(0);
        this.c = a93Var;
        this.d = x93Var;
        this.h = g93Var;
        this.l = str;
        this.m = obj;
        this.n = objArr;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        boolean z;
        a93 a93Var = this.c;
        g93 g93Var = a93Var.d;
        g93 g93Var2 = this.h;
        boolean z2 = true;
        if (g93Var != g93Var2) {
            a93Var.d = g93Var2;
            z = true;
        } else {
            z = false;
        }
        String str = a93Var.h;
        String str2 = this.l;
        if (kr1.n(str, str2)) {
            z2 = z;
        } else {
            a93Var.h = str2;
        }
        a93Var.c = this.d;
        a93Var.l = this.m;
        a93Var.m = this.n;
        f93 f93Var = a93Var.n;
        if (f93Var != null && z2) {
            ((iy2) f93Var).q();
            a93Var.n = null;
            a93Var.c();
        }
        return w84.a;
    }
}
