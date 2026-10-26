package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tr3 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public tr3(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr3)) {
            return false;
        }
        tr3 tr3Var = (tr3) obj;
        if (this.a.equals(tr3Var.a) && this.b.equals(tr3Var.b) && this.c.equals(tr3Var.c) && kr1.n(this.d, tr3Var.d)) {
            return kr1.n(this.e, tr3Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ud2.j(ud2.i(ud2.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
