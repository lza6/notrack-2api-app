package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j42 extends im0 {
    public final String g;
    public final String h;

    public j42(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.im0
    public final void a(ce4 ce4Var) {
        ce4Var.D(this);
    }

    @Override // defpackage.im0
    public final String j() {
        return "destination=" + this.g + ", title=" + this.h;
    }
}
