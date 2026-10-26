package defpackage;

import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte[] a;

    static {
        lz lzVar = lz.l;
        a = Path$Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").c;
        Path$Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
