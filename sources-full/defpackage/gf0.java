package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements hy3 {
    public final long a;

    public gf0(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        qo1.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.hy3
    public final long a() {
        return this.a;
    }

    @Override // defpackage.hy3
    public final yx b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf0) && re0.c(this.a, ((gf0) obj).a);
    }

    @Override // defpackage.hy3
    public final float getAlpha() {
        return re0.d(this.a);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) re0.i(this.a)) + ')';
    }
}
