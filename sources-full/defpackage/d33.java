package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class d33 {
    public final Context a;
    public final nm1 b;
    public final yq3 c;
    public final yq3 d;
    public final yq3 e;
    public final vg0 f;

    public d33(Context context, nm1 nm1Var, yq3 yq3Var, yq3 yq3Var2, yq3 yq3Var3, vg0 vg0Var) {
        this.a = context;
        this.b = nm1Var;
        this.c = yq3Var;
        this.d = yq3Var2;
        this.e = yq3Var3;
        this.f = vg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d33) {
            d33 d33Var = (d33) obj;
            return kr1.n(this.a, d33Var.a) && this.b.equals(d33Var.b) && this.c == d33Var.c && this.d == d33Var.d && this.e == d33Var.e && this.f == d33Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((u41.d.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + u41.d + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
