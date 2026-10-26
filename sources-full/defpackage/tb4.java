package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tb4 extends ww1 implements ne1 {
    public final /* synthetic */ pe1 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb4(pe1 pe1Var, long j) {
        super(2);
        this.c = pe1Var;
        this.d = j;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
        } else {
            long j = this.d;
            this.c.b(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))), kk0Var, 0);
        }
    }
}
