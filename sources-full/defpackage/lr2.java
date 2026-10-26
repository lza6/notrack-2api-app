package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum lr2 implements xq1 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int c;

    lr2(int i) {
        this.c = i;
    }

    public static lr2 a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.c;
        }
        u41.k("Can't get the number of an unknown enum value.");
        return 0;
    }
}
