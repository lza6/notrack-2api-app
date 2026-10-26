package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum qh1 implements xq1 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int c;

    qh1(int i) {
        this.c = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.c;
        }
        u41.k("Can't get the number of an unknown enum value.");
        return 0;
    }
}
