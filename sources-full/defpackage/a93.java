package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a93 implements a53 {
    public x93 c;
    public g93 d;
    public String h;
    public Object l;
    public Object[] m;
    public f93 n;
    public final i43 o = new i43(1, this);

    public a93(x93 x93Var, g93 g93Var, String str, Object obj, Object[] objArr) {
        this.c = x93Var;
        this.d = g93Var;
        this.h = str;
        this.l = obj;
        this.m = objArr;
    }

    @Override // defpackage.a53
    public final void a() {
        c();
    }

    @Override // defpackage.a53
    public final void b() {
        f93 f93Var = this.n;
        if (f93Var != null) {
            ((iy2) f93Var).q();
        }
    }

    public final void c() {
        String strA;
        g93 g93Var = this.d;
        if (this.n != null) {
            j93.i(this.n, ") is not null", "entry(");
            return;
        }
        if (g93Var != null) {
            i43 i43Var = this.o;
            Object objInvoke = i43Var.invoke();
            if (objInvoke == null || g93Var.canBeSaved(objInvoke)) {
                this.n = g93Var.registerProvider(this.h, i43Var);
                return;
            }
            if (objInvoke instanceof zk3) {
                zk3 zk3Var = (zk3) objInvoke;
                if (zk3Var.a() == t73.t || zk3Var.a() == t73.A || zk3Var.a() == t73.x) {
                    strA = "MutableState containing " + zk3Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = d53.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // defpackage.a53
    public final void d() {
        f93 f93Var = this.n;
        if (f93Var != null) {
            ((iy2) f93Var).q();
        }
    }
}
