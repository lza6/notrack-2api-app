package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dr1 {
    public final int a;
    public final int b;
    public final i02 c;

    public dr1(int i, int i2, i02 i02Var) {
        this.a = i;
        this.b = i2;
        this.c = i02Var;
        if (i < 0) {
            so1.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        so1.a("size should be > 0");
    }
}
