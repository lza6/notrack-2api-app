package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vz2 implements mi2, gq0 {
    public final xp0 c;
    public final /* synthetic */ mi2 d;

    public vz2(mi2 mi2Var, xp0 xp0Var) {
        this.c = xp0Var;
        this.d = mi2Var;
    }

    @Override // defpackage.gq0
    public final xp0 getCoroutineContext() {
        return this.c;
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        return this.d.getValue();
    }

    @Override // defpackage.mi2
    public final void setValue(Object obj) {
        this.d.setValue(obj);
    }
}
