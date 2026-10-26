package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class in0 {
    public final ox a;
    public final t00 b;

    public in0(ox oxVar, t00 t00Var) {
        this.a = oxVar;
        this.b = t00Var;
    }

    public final String toString() {
        t00 t00Var = this.b;
        if (t00Var.m.get(cq0.c) != null) {
            m51.t();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        yo4.m(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append("(currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(t00Var);
        sb.append(')');
        return sb.toString();
    }
}
