package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class du {
    public final /* synthetic */ int a;
    public int b;
    public String c;

    public du(int i, String str, Object[] objArr) {
        this.a = 1;
        this.c = String.format(str, objArr);
        this.b = i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b + ": " + this.c;
            default:
                return super.toString();
        }
    }
}
