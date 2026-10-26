package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ym {
    public final Object a;
    public final mm b;
    public final im1 c;

    public ym(Object obj, mm mmVar, im1 im1Var) {
        this.a = obj;
        this.b = mmVar;
        this.c = im1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym)) {
            return false;
        }
        ym ymVar = (ym) obj;
        mm mmVar = ymVar.b;
        mm mmVar2 = this.b;
        return kr1.n(mmVar2, mmVar) && mmVar2.a(this.a, ymVar.a) && kr1.n(this.c, ymVar.c);
    }

    public final int hashCode() {
        mm mmVar = this.b;
        return this.c.hashCode() + ((mmVar.b(this.a) + (mmVar.hashCode() * 31)) * 31);
    }
}
