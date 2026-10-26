package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u11 extends yo4 {
    public final /* synthetic */ zt n;

    public u11(zt ztVar) {
        super(12);
        this.n = ztVar;
    }

    @Override // defpackage.yo4
    public final void L(Throwable th) {
        ((y11) this.n.a).f(th);
    }

    @Override // defpackage.yo4
    public final void M(ir3 ir3Var) {
        zt ztVar = this.n;
        ztVar.c = ir3Var;
        ir3 ir3Var2 = (ir3) ztVar.c;
        y11 y11Var = (y11) ztVar.a;
        ztVar.b = new ci4(ir3Var2, y11Var.g, y11Var.i, Build.VERSION.SDK_INT >= 34 ? d21.a() : py.C());
        y11 y11Var2 = (y11) ztVar.a;
        ArrayList arrayList = new ArrayList();
        y11Var2.a.writeLock().lock();
        try {
            y11Var2.c = 1;
            arrayList.addAll(y11Var2.b);
            y11Var2.b.clear();
            y11Var2.a.writeLock().unlock();
            y11Var2.d.post(new w11(arrayList, y11Var2.c, null));
        } catch (Throwable th) {
            y11Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
