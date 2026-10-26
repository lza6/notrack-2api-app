package defpackage;

import java.io.IOException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class tj1 implements wl3 {
    public final uc1 c;
    public boolean d;
    public final /* synthetic */ yj1 h;

    public tj1(yj1 yj1Var) {
        this.h = yj1Var;
        this.c = new uc1(yj1Var.c.b());
    }

    public final void a() {
        yj1 yj1Var = this.h;
        int i = yj1Var.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + yj1Var.e);
        }
        uc1 uc1Var = this.c;
        c cVar = uc1Var.e;
        uc1Var.e = c.d;
        cVar.a();
        cVar.b();
        yj1Var.e = 6;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.c;
    }

    @Override // defpackage.wl3
    public long y(dy dyVar, long j) throws IOException {
        yj1 yj1Var = this.h;
        dyVar.getClass();
        try {
            return yj1Var.c.y(dyVar, j);
        } catch (IOException e) {
            yj1Var.b.k();
            a();
            throw e;
        }
    }
}
