package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ff3 {
    public final String a;
    public final ne1 b;
    public boolean c;

    public /* synthetic */ ff3(String str) {
        this(str, bf3.x);
    }

    public ff3(String str, ne1 ne1Var) {
        this.a = str;
        this.b = ne1Var;
    }

    public ff3(String str, boolean z, ne1 ne1Var) {
        this(str, ne1Var);
        this.c = z;
    }

    public final void a(gf3 gf3Var, Object obj) {
        ((ue3) gf3Var).j(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }
}
