package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nq1 {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int iHashCode = hashCode();
        yo4.m(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
