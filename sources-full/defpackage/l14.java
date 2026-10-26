package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l14 extends m14 {
    @Override // defpackage.m14, defpackage.n14
    public final /* bridge */ /* synthetic */ n14 a() {
        a();
        return this;
    }

    @Override // defpackage.m14
    /* JADX INFO: renamed from: j */
    public final m14 a() {
        super.a();
        this.j = new kn();
        return this;
    }

    public final String toString() {
        kn knVar = this.j;
        if (knVar == null || knVar.c <= 0) {
            return "<" + h() + ">";
        }
        return "<" + h() + " " + this.j.toString() + ">";
    }
}
