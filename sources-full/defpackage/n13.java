package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum n13 {
    HTTP_1_0(0),
    HTTP_1_1(1),
    SPDY_3(2),
    HTTP_2(3),
    H2_PRIOR_KNOWLEDGE(4),
    QUIC(5);

    public final String c;

    n13(int i) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
