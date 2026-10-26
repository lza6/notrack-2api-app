package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bu2 extends ju2 {
    public final float c;

    public bu2(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu2) && Float.compare(this.c, ((bu2) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return fq2.o(new StringBuilder("RelativeHorizontalTo(dx="), this.c, ')');
    }
}
