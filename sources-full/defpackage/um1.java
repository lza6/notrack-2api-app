package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class um1 {
    public final float a;
    public final String b;

    public um1(String str, float f) {
        this.a = f;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dimension{value=");
        sb.append(this.a);
        sb.append(", unit='");
        return fq2.r(sb, this.b, "'}");
    }
}
