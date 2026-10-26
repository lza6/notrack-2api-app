package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class io0 extends ww1 implements oe1 {
    public final /* synthetic */ le1 c;
    public final /* synthetic */ wn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(le1 le1Var, wn0 wn0Var) {
        super(3);
        this.c = le1Var;
        this.d = wn0Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((lf0) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(lf0 lf0Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 17) != 16)) {
            kk0Var.V();
            return;
        }
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new co0();
            kk0Var.l0(objP);
        }
        co0 co0Var = (co0) objP;
        co0Var.a.clear();
        this.c.invoke(co0Var);
        co0Var.Content$foundation_release(this.d, kk0Var, 0);
    }
}
