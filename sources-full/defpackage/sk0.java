package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 {
    public final pk0 a;

    public sk0(pk0 pk0Var) {
        this.a = pk0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sk0) {
            return this.a.equals(((sk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
