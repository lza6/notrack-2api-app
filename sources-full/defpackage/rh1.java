package defpackage;

import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 {
    public static final lz d;
    public static final lz e;
    public static final lz f;
    public static final lz g;
    public static final lz h;
    public static final lz i;
    public final lz a;
    public final lz b;
    public final int c;

    static {
        lz lzVar = lz.l;
        d = Path$Companion.encodeUtf8(":");
        e = Path$Companion.encodeUtf8(":status");
        f = Path$Companion.encodeUtf8(":method");
        g = Path$Companion.encodeUtf8(":path");
        h = Path$Companion.encodeUtf8(":scheme");
        i = Path$Companion.encodeUtf8(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rh1(String str, String str2) {
        this(Path$Companion.encodeUtf8(str), Path$Companion.encodeUtf8(str2));
        str.getClass();
        str2.getClass();
        lz lzVar = lz.l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rh1(lz lzVar, String str) {
        this(lzVar, Path$Companion.encodeUtf8(str));
        lzVar.getClass();
        str.getClass();
        lz lzVar2 = lz.l;
    }

    public rh1(lz lzVar, lz lzVar2) {
        lzVar.getClass();
        lzVar2.getClass();
        this.a = lzVar;
        this.b = lzVar2;
        this.c = lzVar2.c() + lzVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh1)) {
            return false;
        }
        rh1 rh1Var = (rh1) obj;
        return kr1.n(this.a, rh1Var.a) && kr1.n(this.b, rh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.p() + ": " + this.b.p();
    }
}
