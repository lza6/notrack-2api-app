package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ur3 implements Comparable {
    public final int c;
    public final int d;
    public final String h;
    public final String l;

    public ur3(int i, int i2, String str, String str2) {
        this.c = i;
        this.d = i2;
        this.h = str;
        this.l = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ur3 ur3Var = (ur3) obj;
        ur3Var.getClass();
        int i = this.c - ur3Var.c;
        return i == 0 ? this.d - ur3Var.d : i;
    }
}
