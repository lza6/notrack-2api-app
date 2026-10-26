package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q62 extends r62 {
    public final or0 a = or0.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q62.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((q62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (q62.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
