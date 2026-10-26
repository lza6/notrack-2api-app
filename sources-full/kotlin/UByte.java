package kotlin;

import app.template.extension.BuildConfig;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0017\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\"\u0010\fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b'\u0010\fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b,\u0010\fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b1\u0010\fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00107J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00107J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00107J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bO\u0010\u0005J\u0010\u0010P\u001a\u00020QH\u0087\b¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\\\u0010\u0005J\u0010\u0010]\u001a\u00020\rH\u0087\b¢\u0006\u0004\b^\u0010SJ\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, d2 = {"Lkotlin/UByte;", BuildConfig.VERSION_NAME, "data", BuildConfig.VERSION_NAME, "constructor-impl", "(B)B", "getData$annotations", "()V", "compareTo", BuildConfig.VERSION_NAME, "other", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(BJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(BB)B", "mod-xj2QHRw", "(BS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-w2LRezQ", "dec", "dec-w2LRezQ", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "and", "and-7apg3OU", "or", "or-7apg3OU", "xor", "xor-7apg3OU", "inv", "inv-w2LRezQ", "toByte", "toByte-impl", "toShort", BuildConfig.VERSION_NAME, "toShort-impl", "(B)S", "toInt", "toInt-impl", "(B)I", "toLong", BuildConfig.VERSION_NAME, "toLong-impl", "(B)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", BuildConfig.VERSION_NAME, "toFloat-impl", "(B)F", "toDouble", BuildConfig.VERSION_NAME, "toDouble-impl", "(B)D", "toString", BuildConfig.VERSION_NAME, "toString-impl", "(B)Ljava/lang/String;", "equals", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
public final class UByte implements Comparable<UByte> {
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    private /* synthetic */ UByte(byte b) {
        this.data = b;
    }

    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m238x98dd4942(byte b, byte b2) {
        return m245xf1229813((byte) (b & b2));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m239boximpl(byte b) {
        return new UByte(b);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m240x5c10f8ab(byte b) {
        return Intrinsics.compare(getData() & MAX_VALUE, b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m241x5c10f8ab(byte b, byte b2) {
        return Intrinsics.compare(b & MAX_VALUE, b2 & MAX_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m242x9d2b343b(byte b, long j) {
        return Long.compare(ULong.m402xf1229813(((long) b) & 255) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m243xe98ef98d(byte b, int i) {
        return Integer.compare(UInt.m323xf1229813(b & MAX_VALUE) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m244xd66e3faf(byte b, short s) {
        return Intrinsics.compare(b & MAX_VALUE, s & UShort.MAX_VALUE);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m245xf1229813(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m246x1408ea70(byte b) {
        return m245xf1229813((byte) (b - 1));
    }

    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m247xfeebf9fc(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m248x4006358c(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m402xf1229813(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m249x8c69fade(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m323xf1229813(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m250x79494100(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m251xca48036e(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).getData();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m252x7eb86a82(byte b, byte b2) {
        return b == b2;
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m253xf21abe50(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m254x3334f9e0(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m402xf1229813(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m255x7f98bf32(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m323xf1229813(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m256x6c780554(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m257x219c3092(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m258x9315624c(byte b) {
        return m245xf1229813((byte) (b + 1));
    }

    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m259x94299f5f(byte b) {
        return m245xf1229813((byte) (~b));
    }

    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m260x3c258edb(byte b, byte b2) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) - UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m261x7d3fca6b(byte b, long j) {
        return ULong.m402xf1229813(ULong.m402xf1229813(((long) b) & 255) - j);
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m262xc9a38fbd(byte b, int i) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) - i);
    }

    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m263xb682d5df(byte b, short s) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) - UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m264x87df1b6d(byte b, byte b2) {
        return m245xf1229813((byte) UByte$$ExternalSyntheticBackport0.m$1(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(b2 & MAX_VALUE)));
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m265xc8f956fd(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m296m(ULong.m402xf1229813(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m266x155d1c4f(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m323xf1229813(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m267x23c6271(byte b, short s) {
        return UShort.m509xf1229813((short) UByte$$ExternalSyntheticBackport0.m$1(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(s & UShort.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m268x3e3d114e(byte b, byte b2) {
        return m245xf1229813((byte) (b | b2));
    }

    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m269xba6dea05(byte b, byte b2) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) + UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m270xfb882595(byte b, long j) {
        return ULong.m402xf1229813(ULong.m402xf1229813(((long) b) & 255) + j);
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m271x47ebeae7(byte b, int i) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) + i);
    }

    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m272x34cb3109(byte b, short s) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) + UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m273xa9706703(byte b, byte b2) {
        return new UIntRange(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(b2 & MAX_VALUE), null);
    }

    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m274x4c2a798c(byte b, byte b2) {
        return URangesKt.m1552x6bf2eb76(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m275x1be01505(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m276x5cfa5095(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m296m(ULong.m402xf1229813(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m277xa95e15e7(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m323xf1229813(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m278x963d5c09(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m323xf1229813(b & MAX_VALUE), UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m279xe83ef7b1(byte b, byte b2) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) * UInt.m323xf1229813(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m280x29593341(byte b, long j) {
        return ULong.m402xf1229813(ULong.m402xf1229813(((long) b) & 255) * j);
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m281x75bcf893(byte b, int i) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) * i);
    }

    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m282x629c3eb5(byte b, short s) {
        return UInt.m323xf1229813(UInt.m323xf1229813(b & MAX_VALUE) * UInt.m323xf1229813(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m283x5de3b38a(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m284x699d1121(byte b) {
        return UnsignedKt.uintToDouble(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m285x4318c7cc(byte b) {
        return (float) UnsignedKt.uintToDouble(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m286x1db450d9(byte b) {
        return b & MAX_VALUE;
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m287xdfc89696(byte b) {
        return ((long) b) & 255;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m288xdd0bb9ac(byte b) {
        return (short) (b & 255);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m289x7003d4e1(byte b) {
        return String.valueOf(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m290x97866fd0(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m291xece71b04(byte b) {
        return UInt.m323xf1229813(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m292xa6c05992(byte b) {
        return ULong.m402xf1229813(((long) b) & 255);
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m293x69239c6(byte b) {
        return UShort.m509xf1229813((short) (b & 255));
    }

    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m294x970dbc6(byte b, byte b2) {
        return m245xf1229813((byte) (b ^ b2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    public boolean equals(Object other) {
        return m251xca48036e(this.data, other);
    }

    public int hashCode() {
        return m257x219c3092(this.data);
    }

    public String toString() {
        return m289x7003d4e1(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }
}
