package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends of2 implements ab1 {
    public za1 c;

    @Override // defpackage.of2
    public final void onAttach() {
        super.onAttach();
        this.c.a.c(this);
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.c.a.l(this);
        super.onDetach();
    }
}
