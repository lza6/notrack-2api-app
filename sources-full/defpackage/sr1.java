package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class sr1 extends IOException {
    public boolean c;

    public static sr1 a() {
        return new sr1("Protocol message contained an invalid tag (zero).");
    }

    public static sr1 b() {
        return new sr1("Protocol message had invalid UTF-8.");
    }

    public static rr1 c() {
        return new rr1("Protocol message tag had invalid wire type.");
    }

    public static sr1 d() {
        return new sr1("CodedInputStream encountered a malformed varint.");
    }

    public static sr1 e() {
        return new sr1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static sr1 f() {
        return new sr1("Failed to parse the message.");
    }

    public static sr1 g() {
        return new sr1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
