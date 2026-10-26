package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ai2 extends di2 implements ou1 {
    @Override // defpackage.b00
    public du1 computeReflected() {
        r43.a.getClass();
        return this;
    }

    @Override // defpackage.ou1
    public Object getDelegate() {
        return ((ai2) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ mu1 getGetter() {
        mo3getGetter();
        return null;
    }

    @Override // defpackage.ou1
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public nu1 mo3getGetter() {
        ((ai2) getReflected()).mo3getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ ju1 getSetter() {
        m4getSetter();
        return null;
    }

    /* JADX INFO: renamed from: getSetter, reason: collision with other method in class */
    public ku1 m4getSetter() {
        ((ai2) getReflected()).m4getSetter();
        return null;
    }

    @Override // defpackage.je1
    public Object invoke() {
        return get();
    }
}
