package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class um3 implements so0, iq0 {
    public final so0 c;
    public final xp0 d;

    public um3(so0 so0Var, xp0 xp0Var) {
        this.c = so0Var;
        this.d = xp0Var;
    }

    @Override // defpackage.iq0
    public final iq0 getCallerFrame() {
        so0 so0Var = this.c;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.d;
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        this.c.resumeWith(obj);
    }
}
