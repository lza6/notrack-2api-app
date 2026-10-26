package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o62 extends r62 {
    public final or0 a = or0.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o62.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (o62.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
