package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum mv1 implements xq1 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int c;

    mv1(int i) {
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
