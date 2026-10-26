package defpackage;

import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class id3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id3(int i, int i2, Object obj) {
        super(0);
        this.c = i2;
        this.h = obj;
        this.d = i;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        int i2 = this.d;
        Object obj = this.h;
        switch (i) {
            case 0:
                return Integer.valueOf(((bd3) obj).f.b.d(i2));
            default:
                nu3 nu3Var = ((nu3) obj).B.a;
                if (i2 == 6) {
                    ((va1) ((pa1) gm4.t(nu3Var, CompositionLocalsKt.getLocalFocusManager()))).f(1);
                } else if (i2 == 5) {
                    ((va1) ((pa1) gm4.t(nu3Var, CompositionLocalsKt.getLocalFocusManager()))).f(2);
                } else if (i2 == 7) {
                    nu3Var.C0().hide();
                }
                return Boolean.TRUE;
        }
    }
}
