package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x62 extends lb1 {
    public final jb f;

    public x62(jb jbVar) {
        this.f = jbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x62) {
            return this.f == ((x62) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ')';
    }
}
