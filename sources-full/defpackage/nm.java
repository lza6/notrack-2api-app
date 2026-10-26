package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nm {
    public final im1 a;
    public final pm1 b;
    public final mm c;

    public nm(im1 im1Var, pm1 pm1Var, mm mmVar) {
        this.a = im1Var;
        this.b = pm1Var;
        this.c = mmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm)) {
            return false;
        }
        nm nmVar = (nm) obj;
        if (!kr1.n(this.a, nmVar.a)) {
            return false;
        }
        mm mmVar = nmVar.c;
        mm mmVar2 = this.c;
        return kr1.n(mmVar2, mmVar) && mmVar2.a(this.b, nmVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mm mmVar = this.c;
        return mmVar.b(this.b) + ((mmVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
