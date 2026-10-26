package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface my extends zh3, WritableByteChannel {
    my E(int i, byte[] bArr);

    my H(String str);

    my I(long j);

    my e(lz lzVar);

    my f(long j);

    @Override // defpackage.zh3, java.io.Flushable
    void flush();

    my write(byte[] bArr);

    my writeByte(int i);

    my writeInt(int i);

    my writeShort(int i);
}
