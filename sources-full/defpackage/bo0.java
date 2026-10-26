package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends ww1 implements oe1 {
    public final /* synthetic */ mo0 c;
    public final /* synthetic */ c d;
    public final /* synthetic */ je1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo0(mo0 mo0Var, c cVar, je1 je1Var) {
        super(3);
        this.c = mo0Var;
        this.d = cVar;
        this.h = je1Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((wn0) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(wn0 wn0Var, ck0 ck0Var, int i) {
        if ((i & 6) == 0) {
            i |= ((kk0) ck0Var).h(wn0Var) ? 4 : 2;
        }
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 19) != 18)) {
            kk0Var.V();
            return;
        }
        String str = (String) this.c.invoke((Object) kk0Var, (Object) 0);
        if (mo3.C0(str)) {
            so1.c("Label must not be blank");
        }
        ko0.ContextMenuItem(str, true, wn0Var, this.d, null, this.h, kk0Var, (i << 6) & 896, 0);
    }
}
