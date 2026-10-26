package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iu2 extends ju2 {
    public final float c;

    public iu2(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu2) && Float.compare(this.c, ((iu2) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return fq2.o(new StringBuilder("VerticalTo(y="), this.c, ')');
    }
}
