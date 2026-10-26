package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jk0 extends ww1 implements ne1 {
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk0(Object obj) {
        super(2);
        this.c = obj;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            throw null;
        }
        kk0Var.V();
    }
}
