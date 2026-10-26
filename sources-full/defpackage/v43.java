package defpackage;

import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public enum v43 {
    IGNORE_CASE(2),
    MULTILINE(8),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(Uuid.SIZE_BITS);

    public final int c;

    v43(int i) {
        this.c = i;
    }
}
