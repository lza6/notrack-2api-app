package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw2 {
    public static final fw2 b = new fw2(0, false);
    public final boolean a;

    public fw2(int i, boolean z) {
        this.a = z;
    }

    public fw2(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fw2) {
            return this.a == ((fw2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }
}
