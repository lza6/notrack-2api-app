package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o54 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf(o54 o54Var, int i) {
        super(0);
        this.c = i;
        this.d = o54Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        o54 o54Var = this.d;
        switch (i) {
            case 0:
                Object objB = o54Var.b();
                d41 d41Var = d41.h;
                return Boolean.valueOf(objB == d41Var && o54Var.d.getValue() == d41Var);
            default:
                return Long.valueOf(o54Var.a());
        }
    }
}
