package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 {
    public final ft2 a = cl3.d(eo0.a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ho0) {
            return kr1.n((go0) ((ho0) obj).a.getValue(), (go0) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((go0) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((go0) this.a.getValue()) + ')';
    }
}
