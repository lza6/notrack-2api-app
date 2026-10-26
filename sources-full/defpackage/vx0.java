package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vx0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx0) && rx0.a(10.0f, 10.0f) && rx0.a(40.0f, 40.0f) && rx0.a(10.0f, 10.0f) && rx0.a(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fq2.d(40.0f, fq2.d(10.0f, fq2.d(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) rx0.b(10.0f)) + ", top=" + ((Object) rx0.b(40.0f)) + ", end=" + ((Object) rx0.b(10.0f)) + ", bottom=" + ((Object) rx0.b(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
