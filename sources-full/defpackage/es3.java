package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class es3 extends of2 {
    public boolean c;

    @Override // defpackage.of2
    public final void onAttach() {
        this.c = true;
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.c = false;
    }

    public final String toString() {
        return "<tail>";
    }
}
