package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cs2 implements tc0 {
    public final Class c;

    public cs2(Class cls) {
        cls.getClass();
        this.c = cls;
    }

    @Override // defpackage.tc0
    public final Class a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cs2) {
            return kr1.n(this.c, ((cs2) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c + " (Kotlin reflection is not available)";
    }
}
