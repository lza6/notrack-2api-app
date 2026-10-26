package defpackage;

import android.view.ViewGroup;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class mi implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ zi d;

    public /* synthetic */ mi(zi ziVar, int i) {
        this.c = i;
        this.d = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.c;
        zi ziVar = this.d;
        switch (i) {
            case 0:
                if ((ziVar.g0 & 1) != 0) {
                    ziVar.y(0);
                }
                if ((ziVar.g0 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                    ziVar.y(108);
                }
                ziVar.f0 = false;
                ziVar.g0 = 0;
                break;
            default:
                ziVar.D.showAtLocation(ziVar.C, 55, 0, 0);
                pd4 pd4Var = ziVar.F;
                if (pd4Var != null) {
                    pd4Var.b();
                }
                if (ziVar.G && (viewGroup = ziVar.H) != null && viewGroup.isLaidOut()) {
                    ziVar.C.setAlpha(0.0f);
                    pd4 pd4VarA = zc4.a(ziVar.C);
                    pd4VarA.a(1.0f);
                    ziVar.F = pd4VarA;
                    pd4VarA.d(new oi(0, this));
                } else {
                    ziVar.C.setAlpha(1.0f);
                    ziVar.C.setVisibility(0);
                }
                break;
        }
    }
}
