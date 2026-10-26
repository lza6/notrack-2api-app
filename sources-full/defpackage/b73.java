package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b73 {
    public final long a = re0.i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b73) {
            return re0.c(this.a, ((b73) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) re0.i(this.a)) + ", rippleAlpha=null)";
    }
}
