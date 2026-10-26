package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j61 {
    public final o71 a;

    public j61(o71 o71Var) {
        this.a = o71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j61) {
            return Float.compare(0.0f, 0.0f) == 0 && kr1.n(this.a, ((j61) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
