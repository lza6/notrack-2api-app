package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class l02 extends ww1 implements ne1 {
    public final /* synthetic */ n02 c;
    public final /* synthetic */ m02 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l02(n02 n02Var, m02 m02Var) {
        super(2);
        this.c = n02Var;
        this.d = m02Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        m02 m02Var = this.d;
        Object obj = m02Var.a;
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        n02 n02Var = this.c;
        q02 q02Var = (q02) n02Var.b.invoke();
        int iD = m02Var.c;
        if ((iD >= q02Var.a() || !q02Var.b(iD).equals(obj)) && (iD = q02Var.d(obj)) != -1) {
            m02Var.c = iD;
        }
        int i2 = iD;
        if (i2 != -1) {
            kk0Var.a0(-660404355);
            p02.m1799x1e2afaf6(q02Var, n02Var.a, i2, m02Var.a, kk0Var, 0);
            kk0Var.r(false);
        } else {
            kk0Var.a0(-660169871);
            kk0Var.r(false);
        }
        boolean zJ = kk0Var.j(m02Var);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new e8(21, m02Var);
            kk0Var.l0(objP);
        }
        r11.DisposableEffect(obj, (le1) objP, kk0Var, 0);
    }
}
