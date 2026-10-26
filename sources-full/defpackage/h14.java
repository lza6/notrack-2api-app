package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h14 extends n14 {
    public final StringBuilder b;

    public h14() {
        super(4);
        this.b = new StringBuilder();
    }

    @Override // defpackage.n14
    public final n14 a() {
        n14.b(this.b);
        return this;
    }

    public final String toString() {
        return "<!--" + this.b.toString() + "-->";
    }
}
