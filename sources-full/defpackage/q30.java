package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class q30 {
    public static final Charset a;
    public static final Charset b;
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        charsetForName2.getClass();
        b = charsetForName2;
    }
}
