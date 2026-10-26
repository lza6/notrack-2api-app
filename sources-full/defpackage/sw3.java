package defpackage;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;

/* JADX INFO: loaded from: classes.dex */
public final class sw3 extends mq3 implements ne1 {
    public int c;
    public final /* synthetic */ xw3 d;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw3(xw3 xw3Var, boolean z, so0 so0Var) {
        super(2, so0Var);
        this.d = xw3Var;
        this.h = z;
    }

    @Override // defpackage.wr
    public final so0 create(Object obj, so0 so0Var) {
        return new sw3(this.d, this.h, so0Var);
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        return ((sw3) create((gq0) obj, (so0) obj2)).invokeSuspend(w84.a);
    }

    @Override // defpackage.wr
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        xw3 xw3Var = this.d;
        if (i == 0) {
            g13.O(obj);
            if (!jz3.c(xw3Var.k().b)) {
                Clipboard clipboard = xw3Var.h;
                if (clipboard != null) {
                    ClipEntry clipEntryG = xp1.G(vl0.R(xw3Var.k()));
                    this.c = 1;
                    Object clipEntry = clipboard.setClipEntry(clipEntryG, this);
                    hq0 hq0Var = hq0.c;
                    if (clipEntry == hq0Var) {
                        return hq0Var;
                    }
                }
            }
            return w84Var;
        }
        if (i != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g13.O(obj);
        if (this.h) {
            int iE = jz3.e(xw3Var.k().b);
            xw3Var.c.invoke(xw3.c(xw3Var.k().a, p23.d(iE, iE)));
            xw3Var.o(ch1.c);
            return w84Var;
        }
        return w84Var;
    }
}
