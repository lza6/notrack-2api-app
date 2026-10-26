package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dw {
    public ib a = null;
    public o9 b = null;
    public a10 c = null;
    public ic d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return kr1.n(this.a, dwVar.a) && kr1.n(this.b, dwVar.b) && kr1.n(this.c, dwVar.c) && kr1.n(this.d, dwVar.d);
    }

    public final int hashCode() {
        ib ibVar = this.a;
        int iHashCode = (ibVar == null ? 0 : ibVar.hashCode()) * 31;
        o9 o9Var = this.b;
        int iHashCode2 = (iHashCode + (o9Var == null ? 0 : o9Var.hashCode())) * 31;
        a10 a10Var = this.c;
        int iHashCode3 = (iHashCode2 + (a10Var == null ? 0 : a10Var.hashCode())) * 31;
        ic icVar = this.d;
        return iHashCode3 + (icVar != null ? icVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
