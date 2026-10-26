package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mo0 extends ww1 implements ne1 {
    public final /* synthetic */ st3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(st3 st3Var) {
        super(2);
        this.c = st3Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ck0) obj, ((Number) obj2).intValue());
    }

    public final String invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1744780674);
        String strResolvedString = this.c.resolvedString(kk0Var, 0);
        kk0Var.r(false);
        return strResolvedString;
    }
}
