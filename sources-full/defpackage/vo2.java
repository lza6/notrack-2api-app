package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo2 {
    public final String a;

    public vo2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo2) && this.a.equals(((vo2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ud2.r(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
