package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hx0 extends i {
    public final /* synthetic */ int a;
    public final kv b;

    public hx0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new d04();
                break;
            default:
                this.b = new gx0();
                break;
        }
    }

    private final void i(CharSequence charSequence) {
    }

    @Override // defpackage.i
    public void a(CharSequence charSequence) {
        int i = this.a;
    }

    @Override // defpackage.i
    public boolean b(kv kvVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(kvVar);
        }
    }

    @Override // defpackage.i
    public final kv e() {
        int i = this.a;
        kv kvVar = this.b;
        switch (i) {
            case 0:
                return (gx0) kvVar;
            default:
                return (d04) kvVar;
        }
    }

    @Override // defpackage.i
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // defpackage.i
    public final lv h(ix0 ix0Var) {
        switch (this.a) {
            case 0:
                return lv.a(ix0Var.b);
            default:
                return null;
        }
    }
}
