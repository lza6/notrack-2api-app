package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tm3 implements o71 {
    public final float a;
    public final float b;
    public final Object c;

    public tm3(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ tm3(Object obj) {
        this(1.0f, 1500.0f, obj);
    }

    @Override // defpackage.wf
    public final xb4 a(w64 w64Var) {
        Object obj = this.c;
        return new sk3(this.a, this.b, obj == null ? null : (cg) ((x64) w64Var).a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tm3) {
            tm3 tm3Var = (tm3) obj;
            if (tm3Var.a == this.a && tm3Var.b == this.b && kr1.n(tm3Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + fq2.d(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
