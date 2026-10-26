package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn implements i13 {
    public final int a;

    public bn(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return i13.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i13)) {
            return false;
        }
        i13 i13Var = (i13) obj;
        return this.a == i13Var.tag() && h13.c.equals(i13Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (h13.c.hashCode() ^ 2041407134);
    }

    @Override // defpackage.i13
    public final h13 intEncoding() {
        return h13.c;
    }

    @Override // defpackage.i13
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + h13.c + ')';
    }
}
