package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class if2 {
    public final tc3 a = tc3.c;
    public final boolean b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof if2) {
            return this.a == ((if2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
