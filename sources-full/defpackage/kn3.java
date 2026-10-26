package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class kn3 extends y0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.y0
    public final boolean a(x0 x0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(gb2.e);
        return true;
    }

    @Override // defpackage.y0
    public final so0[] b(x0 x0Var) {
        this.a.set(null);
        return xr0.a;
    }
}
