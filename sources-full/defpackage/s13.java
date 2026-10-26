package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s13 {
    public final vk0 a;
    public final boolean b;
    public final bl3 c;
    public final mi2 d;
    public final le1 e;
    public final boolean f;
    public final Object g;
    public boolean h = true;

    public s13(vk0 vk0Var, Object obj, boolean z, bl3 bl3Var, mi2 mi2Var, le1 le1Var, boolean z2) {
        this.a = vk0Var;
        this.b = z;
        this.c = bl3Var;
        this.d = mi2Var;
        this.e = le1Var;
        this.f = z2;
        this.g = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        mi2 mi2Var = this.d;
        if (mi2Var != null) {
            return mi2Var.getValue();
        }
        Object obj = this.g;
        if (obj != null) {
            return obj;
        }
        mk0.d("Unexpected form of a provided value");
        u41.p();
        return null;
    }
}
