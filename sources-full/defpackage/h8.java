package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h8 {
    public int a;

    public h8(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return fq2.q(sb, this.a, " }");
    }
}
