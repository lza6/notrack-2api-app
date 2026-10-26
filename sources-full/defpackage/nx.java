package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx extends of2 {
    public kx c;

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        kx kxVar = this.c;
        if (kxVar instanceof mx) {
            ((mx) kxVar).a.l(this);
        }
        if (kxVar instanceof mx) {
            ((mx) kxVar).a.c(this);
        }
        this.c = kxVar;
    }

    @Override // defpackage.of2
    public final void onDetach() {
        kx kxVar = this.c;
        if (kxVar instanceof mx) {
            ((mx) kxVar).a.l(this);
        }
    }
}
