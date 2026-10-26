package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iw {
    public final float a;
    public final vl3 b;

    public iw(float f, vl3 vl3Var) {
        this.a = f;
        this.b = vl3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw)) {
            return false;
        }
        iw iwVar = (iw) obj;
        return rx0.a(this.a, iwVar.a) && this.b.equals(iwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) rx0.b(this.a)) + ", brush=" + this.b + ')';
    }
}
