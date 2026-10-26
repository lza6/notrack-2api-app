package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum wu1 implements xq1 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public final int c;

    wu1(int i) {
        this.c = i;
    }
}
