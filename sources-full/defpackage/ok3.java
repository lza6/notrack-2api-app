package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ok3 implements w01 {
    public final int a;

    public ok3(int i) {
        this.a = i;
    }

    @Override // defpackage.wf
    public final zb4 a(w64 w64Var) {
        return new v72(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ok3) && ((ok3) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
