package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface ny extends wl3, ReadableByteChannel {
    long B(my myVar);

    void F(long j);

    boolean G(long j, lz lzVar);

    long M();

    String N(Charset charset);

    InputStream P();

    lz g(long j);

    boolean j(long j);

    String n();

    byte[] o();

    u23 peek();

    dy q();

    boolean r();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    int t(iq2 iq2Var);

    String v();

    String z(long j);
}
