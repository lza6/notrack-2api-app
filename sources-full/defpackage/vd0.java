package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vd0 extends wd0 {
    public final String a;

    public vd0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd0) && kr1.n(this.a, ((vd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("Text(md=", this.a, ")");
    }
}
