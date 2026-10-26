package defpackage;

import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class ju3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ nu3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju3(boolean z, nu3 nu3Var, int i) {
        super(1);
        this.c = i;
        this.d = z;
        this.h = nu3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        int i2 = 0;
        nu3 nu3Var = this.h;
        boolean z = this.d;
        switch (i) {
            case 0:
                hg hgVar = (hg) obj;
                if (!z) {
                    return Boolean.FALSE;
                }
                nu3Var.h.g(hgVar);
                ft2 ft2Var = nu3Var.F;
                Boolean bool = Boolean.TRUE;
                ft2Var.setValue(bool);
                py.F(nu3Var.getCoroutineScope(), null, null, new iu3(nu3Var, null, i2), 3);
                return bool;
            case 1:
                hg hgVar2 = (hg) obj;
                if (!z) {
                    return Boolean.FALSE;
                }
                nu3Var.h.g(hgVar2);
                return Boolean.TRUE;
            default:
                hg hgVar3 = (hg) obj;
                if (!z) {
                    return Boolean.FALSE;
                }
                c.h(nu3Var.h, hgVar3, false, 12);
                return Boolean.TRUE;
        }
    }
}
