package defpackage;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class vl3 extends yx {
    public final long a;

    public vl3(long j) {
        this.a = j;
    }

    @Override // defpackage.yx
    public final void a(float f, long j, ks2 ks2Var) {
        bc bcVar = (bc) ks2Var;
        bcVar.d(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = re0.b(re0.d(jB) * f, jB);
        }
        bcVar.f(jB);
        if (((Shader) bcVar.h) != null) {
            bcVar.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vl3) {
            return re0.c(this.a, ((vl3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) re0.i(this.a)) + ')';
    }
}
